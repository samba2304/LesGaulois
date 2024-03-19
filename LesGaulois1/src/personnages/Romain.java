package personnages;

//Modifier 29 fev 13:20

public class Romain extends Personnage {
	Equipement[] equipements;
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		super(nom, force);
		assert nbEquipements <= 2 : "Max 2 equipements";
		equipements = new Equipement[2];
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public String prendreParole() {
		return "Le romain " + getNom() + " : ";
	}

	public void sEquiper(Equipement equipment) {
		Equipement equip2 = equipment;
		switch (nbEquipements) {
		case 1:
			if (equipements[0] == equip2) {
				System.out.println("Le soldat Minus possede deja " + equip2);
				break;
			} else {
				nbEquipements++;
				System.out.println("Le soldat Minus s'equipe avec un " + equip2);
				equipements[0] = equipment;
				break;
			}
		case 2:
			System.out.println("Le soldat Minus est déjà bien protégé !");
			break;
		default:
			nbEquipements++;
			System.out.println("Le soldat Minus s'equipe avec un " + equip2);
			equipements[0] = equipment;
			break;

		}
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + getForce() + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipements != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipements;) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.Bouclier))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipements];
		System.out.println("L'équipement de " + getNom() + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipements; i++)
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		return equipementEjecte;
	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// Precondition
		assert getForce() > 0;
		int oldForce = getForce();
		forceCoup = calculResistanceEquipement(forceCoup);
		setForce(forceCoup);
		if (getForce() > 0) {
			parler("Aïe");
		} 
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert getForce() < oldForce;
		return equipementEjecte;
	}

	public static void main(String[] args) {
		Romain julius;
		julius = new Romain("Julius", 6);
		System.out.println(julius.prendreParole());
		julius.parler("HAHAH");
		julius.sEquiper(Equipement.Casque);
		julius.sEquiper(Equipement.Casque);
		julius.sEquiper(Equipement.Bouclier);
		julius.sEquiper(Equipement.Bouclier);
		julius.sEquiper(Equipement.Casque);

	}

}

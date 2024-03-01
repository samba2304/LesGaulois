package personnages;

//Modifier 29 fev 13:20

public class Romain {
	private String nom;
	private int force;
	Equipement[] equipements;
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		assert force > 0 : "la force d’un Romain est toujours positive";
		assert nbEquipements <= 2 : "Max 2 equipements";
		this.nom = nom;
		this.force = force;
		equipements = new Equipement[2];

		}
	

	public int getForce() {
		return force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void sEquiper(Equipement equipment) {
		Equipement equip2 = equipment;
		switch (nbEquipements) {
		case 1:
			if (equipements[0] == equip2) {
				System.out.println("Le soldat Minus possede deja " + equip2);
				break;
			}
			else {
				nbEquipements++;
				System.out.println( "Le soldat Minus s'equipe avec un " + equip2);
				equipements[0] = equipment;
				break;
			}
		case 2:
			System.out.println( "Le soldat Minus est déjà bien protégé !");
			break;
		default:
			nbEquipements++;
			System.out.println( "Le soldat Minus s'equipe avec un " + equip2);
			equipements[0] = equipment;
			break;

		}
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "la force d’un Romain est toujours positive";
		int force1 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force1 > force : "la force n'a pas diminue";

	}

	public static void main(String[] args) {
		Romain julius;
		julius = new Romain("Julius",6 );
		System.out.println(julius.prendreParole());
		julius.parler("HAHAH");
		julius.sEquiper(Equipement.Casque);
		julius.sEquiper(Equipement.Casque);
		julius.sEquiper(Equipement.Bouclier);
		julius.sEquiper(Equipement.Bouclier);
		julius.sEquiper(Equipement.Casque);

	}

}

package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\" " + texte + " \" ");

	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbTrophees++) {
		this.trophees[nbTrophees] = trophees[i];
		}
		return;
		}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";

	}

	public void boirepotion(int forcepotion) {
		effetPotion = forcepotion;
		System.out.println(
				prendreParole() + "Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée. ");
	}

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Hello");
		Romain cesar;
		cesar = new Romain("Cesar", 22);
		System.out.println(cesar.getForce());
		asterix.frapper(cesar);
		System.out.println(cesar.getForce());
		asterix.boirepotion(120);
	}

}

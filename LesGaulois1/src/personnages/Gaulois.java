package personnages;

public class Gaulois extends Personnage {
	private int effetPotion;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	private String prendreParole() {
		return "Le gaulois " + getNom() + " : ";
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\" " + texte + " \" ");

	}

	public void frapper(Romain romain) {
		System.out.println(getNom() + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((getForce() / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbTrophees++) {
		this.trophees[nbTrophees] = trophees[i];
		}
		}

	@Override
	public String toString() {
		return "Gaulois [nom=" + getNom() + ", force=" + getForce() + ", effetPotion=" + effetPotion + "]";

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

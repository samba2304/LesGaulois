package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\" " + texte + " \" ");

	}

	public String prendreParole() {
		return "Le gaulois " + nom + " : ";

	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";

	}

	public void boirepotion(int forcepotion) {
		// TODO Auto-generated method stub
		effetPotion = forcepotion;
		System.out.println(prendreParole() +"Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée. ");
	}

	public static void main(String[] args) {
		// créer un main permettant de tester la classe Gaulois
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

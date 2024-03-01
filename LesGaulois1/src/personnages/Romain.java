package personnages;

//Modifier 29 fev 13:20

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		assert force>0 : "la force d’un Romain est toujours positive";
		this.nom = nom;
		this.force = force;
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

	public void recevoirCoup(int forceCoup) {
		assert force>0 : "la force d’un Romain est toujours positive";
		int force1=force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force1>force : "la force n'a pas diminue";

	}

	public static void main(String[] args) {
		Romain julius;
		julius = new Romain("Jules", 6);
		System.out.println(julius.prendreParole());
		julius.parler("HAHAH");
		julius.recevoirCoup(12);
		System.out.println(julius.getForce());
	}

}

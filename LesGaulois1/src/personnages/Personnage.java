package personnages;

public class Personnage {
	private String nom;
	private int force;

	public Personnage(String nom, int force) {
		assert force > 0;
		this.nom = nom;
		this.force = force;
		}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force -= force;
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", force=" + force + "]";
	}

}

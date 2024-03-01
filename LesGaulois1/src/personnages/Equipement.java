package personnages;

public enum Equipement {
	Casque("Casque"), Bouclier("Bouclier");

	private String nom;

	private Equipement(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}

	public String toString() {
		return nom;
	}
	
	public void afficherEq() {
		// TODO Auto-generated method stub
		
	}

}

package personnages;

public enum Equipement {
	Casque("Casque"), Bouclier("Bouclier");

	private String nom;

	private Equipement(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
	
	public void afficherEq() {		
	}

}

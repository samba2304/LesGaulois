package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMax;

	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.nbVillageoisMax = nbVillageoisMax;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public void ajouterHabitant(Gaulois gaulois) {
		// TODO Auto-generated method stub
		if (nbVillageois > nbVillageoisMax) {
			System.out.println("Village au complet");
		} else {
			villageois[nbVillageois] = gaulois;
			System.out.println("Village ajoute");
			nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		// TODO Auto-generated method stub
		return villageois[numeroVillageois];
	}
	
	public String getChef() {
		return chef.getNom();
	}

	public void afficherVillageois() {
		// TODO Auto-generated method stub
		System.out.println("Dans le villageois du chef "+getChef()+" vivent les legendaires gaulois:  ");
		for (int i = 0; i < villageois.length; i++) {
			if (trouverHabitant(i)==null) {
				break;
			}
			System.out.println("- "+trouverHabitant(i).getNom());
		}
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village;
		village =new Village("Village des Irreductibles",30);
		Gaulois asterix;
		asterix = new Gaulois("asterix", 10);
		Gaulois obelix;
		obelix = new Gaulois("obelix", 25);
		Chef abra;
		abra = new Chef("Abra", 6, village);
		village.setChef(abra);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);

		village.afficherVillageois();
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Type mismatch: cannot convert from int to Gaulois
	}
}

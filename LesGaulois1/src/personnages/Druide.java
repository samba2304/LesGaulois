package personnages;

import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	public String getNom() {
		return nom;
	}

	public String superpotion() {
		if (forcePotion > 7) {
			return prendreParole() + "J'ai prepare une super potion de force " + forcePotion;

		} else {
			return prendreParole() + "Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "
					+ forcePotion;
		}

	}

	public int preparerPotion() {
		// TODO Auto-generated method stub
		Random objet = new Random();
		forcePotion = objet.nextInt(effetPotionMin, effetPotionMax);
		return forcePotion;
	}

	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public static void main(String[] args) {
		Druide paranomix;
		paranomix = new Druide("Paranomix", 5, 10);
		paranomix.preparerPotion();
		System.out.println(paranomix.superpotion());
	}
}

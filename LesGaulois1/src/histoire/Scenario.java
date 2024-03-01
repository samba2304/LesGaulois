package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	
	public static void main(String[] args) {
		Druide panoromix;
		panoromix=new Druide("Panoromix", 5, 10);
		Gaulois asterix,obelix;
		asterix=new Gaulois("Asterix", 6);
		obelix=new Gaulois("Obelix", 25);
		Romain minus;
		minus= new Romain("Minus",6,4);
		panoromix.prendreParole();
		panoromix.parler("Je vais aller préparer une petite potion...");
		panoromix.preparerPotion();
		panoromix.superpotion();
		panoromix.booster(obelix);
		obelix.prendreParole();
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoromix.booster(asterix);
		asterix.prendreParole();
		asterix.parler("Bonjour");
		minus.prendreParole();
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);	
		System.out.println(minus.getForce());

}
}

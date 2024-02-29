package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	
	public static void main(String[] args) {
		Gaulois asterix;
		asterix=new Gaulois("Asterix", 8);
		Romain minus;
		minus= new Romain("Minus",6);
		asterix.prendreParole();
		asterix.parler("Bonjour tous");
		minus.prendreParole();
		minus.parler(" UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.prendreParole();
		asterix.frapper(minus);
		minus.prendreParole();
		asterix.frapper(minus);
	}

}

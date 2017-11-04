package appli;

import carte.Carte;

public class Appli {

	public static void main(String[] args) {
		Carte carte = new Carte();
		carte.generateMap(20, 20);
		carte.afficherCarte();
	}

}

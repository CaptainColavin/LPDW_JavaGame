package carte;

import elements.Element;

public class Carte {
	Element[][] carte;
	int longueur, hauteur;

	public Carte() {
		this.longueur = 20;
		this.hauteur = 20;
		this.carte = generateMap(longueur, hauteur);
	}

	public Element[][] generateMap(int L, int H) {
		Element[][] generated = new Element[L][H];

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < H; j++) {
				generated[i][j] = new Element(i, j, "0");
			}
		}
		return generated;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public void afficherCarte() {
		for (int i = 0; i < this.getLongueur(); i++) {
			for (int j = 0; j < this.getHauteur(); j++) {
				System.out.print(this.carte[i][j].getRepresentedBy());
			}
			System.out.println();
		}
	}
}

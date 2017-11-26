package carte;

import java.util.ArrayList;
import java.util.Random;

import elements.Arbre;
import elements.Cadenas;
import elements.Clef;
import elements.Element;
import elements.Fleur;
import elements.Herbe;
import elements.Joueur;
import elements.Monstre;
import elements.Or;
import elements.Piege;
import elements.Rocher;

public class Carte {
	Element[][] carte;
	int longueur, hauteur;
	Random random = new Random();

	public Carte() {
		this.longueur = 20;
		this.hauteur = 20;
		this.carte = null;
	}
	
	public void afficherCarte() {
		for (int i = 0; i < this.getLongueur(); i++) {
			for (int j = 0; j < this.getHauteur(); j++) {
				System.out.print(this.carte[i][j].getRepresentedBy());
			}
			System.out.println();
		}
	}

	public static ArrayList<Element> generateElementSet(int nbfleur, int nbArbre, int nbRocher, int nbClef, int nbLock, int nbGold, int nbTrap, int nbMonstre, int nbHerbe) {
		ArrayList<Element> elementSet = new ArrayList<>();
		for (int i = 0; i < nbfleur ; i++) {
			elementSet.add(new Fleur(0, 0));
		}
		for (int i = 0; i < nbArbre ; i++) {
			elementSet.add(new Arbre(0, 0));
		}
		for (int i = 0; i < nbRocher ; i++) {
			elementSet.add(new Rocher(0, 0));
		}
		for (int i = 0; i < nbClef ; i++) {
			elementSet.add(new Clef(0, 0));
		}
		for (int i = 0; i < nbLock ; i++) {
			elementSet.add(new Cadenas(0, 0));
		}
		for (int i = 0; i < nbGold ; i++) {
			elementSet.add(new Or(0, 0));
		}
		for (int i = 0; i < nbTrap ; i++) {
			elementSet.add(new Piege(0, 0));
		}
		for (int i = 0; i < nbMonstre ; i++) {
			elementSet.add(new Monstre(0, 0));
		}
		for (int i = 0; i < nbHerbe ; i++) {
			elementSet.add(new Herbe(0, 0));
		}
		return elementSet;
	}

	public Element[][] generateMap(int L, int H, ArrayList<Element> set) {
		Element[][] generated = new Element[L][H];
		Random random = new Random();
		int nombreAleatoire;

		for (int i = 0; i < L; i++) {
			for (int j = 0; j < H; j++) {
				if (i == 0 && j == 0) {
					generated[i][j] = new Joueur();
				} else {
					nombreAleatoire = random.nextInt(set.size());
					generated[i][j] = set.get(nombreAleatoire);
					set.remove(nombreAleatoire);
				} 
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

	public Element[][] getCarte() {
		return carte;
	}

	public void setCarte(Element[][] carte) {
		this.carte = carte;
	}

	public String getElement(int m, Joueur player) {
		switch (m) {
		case 8: 
			
			if(!(player.getX() == 0)) {
				return this.carte[player.getX() - 1][player.getY()].getRepresentedBy();
			}		
			return null;
		case 2:
			
			if(!(player.getX() == this.getHauteur())) {
				return this.carte[player.getX() + 1][player.getY()].getRepresentedBy();
			}		
			return null;
			
			
			
			
		case 4:
			if(!(player.getX() == 0)) {
				return this.carte[player.getX()][player.getY() - 1].getRepresentedBy();
			}		
			return null;
			
		case 6:
			if(!(player.getX() == this.getLongueur())) {
				return this.carte[player.getX()][player.getY() + 1].getRepresentedBy();
			}		
			return null;
		case 0: 
			//TODO GERER FIN DU JEU
			break;
		
		default:
			System.out.println("Ce mouvement n'est pas valide");
		}
		return null;
	}

	

	
}

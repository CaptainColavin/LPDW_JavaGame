package appli;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import carte.Carte;
import elements.Element;
import elements.Joueur;

public class Appli {
	
	static int Nbfleur = 5, NbArbre= 5, NbRocher = 10, NbClef = 3 , NbLock = NbClef, NbGold = 20, NbTrap = 10, NbMonstre = 15, nbHerbe = 329, nextElement, gameStatus = 1;

	
	public static void main(String[] args) throws IOException {
		
		
		

		
		ArrayList<Element> set = Carte.generateElementSet(Nbfleur,NbArbre,NbRocher,NbClef,NbLock,NbGold,NbTrap,NbMonstre, nbHerbe);
		Carte carte = new Carte();
		carte.setCarte(carte.generateMap(20, 20, set));
		Fenetre fen = new Fenetre(carte.getCarte());
		carte.afficherCarte();
		Joueur player = (Joueur) carte.getCarte()[0][0];
		int mouvement;
		
		
		while(gameStatus == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("Deplacer vous");
			mouvement = sc.nextInt();
			if(mouvement == 0) {
				System.out.println("Vous avez abandonné...");
				gameStatus = -1;
				break;
			}
			nextElement = Integer.parseInt(carte.getElement(mouvement, player)); //on veut la valeur de l'objet sur la case suivant le déplacement
			if(nextElement != 9) {
				if(!(nextElement == 2 ||  nextElement == 3 || (nextElement == 6 && player.getKey() < 1))) {
					switch(nextElement) {
						case 0: 
							break;
						case 1: 
							break;
						case 4: 
							//Le joueur recupere une clé
							player.setKey(player.getKey() + 1);
							break;
						case 5: 
							//Le joueur recupere une piece d'or
							player.setGold(player.getGold() + 1);
							break;
						case 6: 
							//Le joueur passe un cadenas
							player.setKey(player.getKey() - 1);
							break;
						case 7:
							//le joueur perd un PV
							player.setVie(player.getVie() - 1);
							break;
						case 8:
							//le joueur perd deux PV
							player.setVie(player.getVie() - 2);
							break;
						default: break;
					}				
					carte.setCarte(player.move(mouvement, carte.getCarte())); // on deplace le joueur
					if(player.getVie() <= 0) {
						System.err.println("GAME OVER !!");
						gameStatus = -1;
					}else if(player.getGold() == 10) {
						System.out.println("C'est gagné !");
						gameStatus = -1;
					}
				}else {
					System.err.println("Un obstacle vous bloque la route !!");
				}
		}
			
			System.out.println();
			System.out.println("------------------------------------------------------------------------");
			System.out.println();
			carte.afficherCarte();
			player.afficherInfos();
		}
		
		
		
	}

	
}

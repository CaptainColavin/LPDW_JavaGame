package appli;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import carte.Carte;
import elements.Element;
import elements.Joueur;

public class Appli {
	
	static int Nbfleur = 5, NbArbre= 5, NbRocher = 10, NbClef = 3 , NbLock = NbClef, NbGold = 20, NbTrap = 10, NbMonstre = 15, nbHerbe = 329;
	
	public static void main(String[] args) throws IOException {
		ArrayList<Element> set = Carte.generateElementSet(Nbfleur,NbArbre,NbRocher,NbClef,NbLock,NbGold,NbTrap,NbMonstre, nbHerbe);
		Carte carte = new Carte();
		carte.setCarte(carte.generateMap(20, 20, set));
		carte.afficherCarte();
		Joueur player = (Joueur) carte.getCarte()[0][0];
		
		int mouvement;
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Deplacer vous");
			mouvement = sc.nextInt();
			carte.getElement(mouvement, player); //on veut la valeur de l'objet sur la case suivant le déplacement
			System.out.println(" TESSSSSST"+carte.getElement(mouvement, player));
			carte.setCarte(player.move(mouvement, carte.getCarte())); // on deplace le joueur
			carte.afficherCarte();
		}
		
	}

	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	   }  
	
}

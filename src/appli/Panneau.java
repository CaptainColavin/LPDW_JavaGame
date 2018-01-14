package appli;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import carte.Carte;
import elements.Element;

public class Panneau extends JPanel {
	static int Nbfleur = 5, NbArbre= 5, NbRocher = 10, NbClef = 3 , NbLock = NbClef, NbGold = 20, NbTrap = 10, NbMonstre = 15, nbHerbe = 329, nextElement, gameStatus = 1;


	public void paintComponent(Graphics g) {
		
		int x1 = this.getWidth() / 4;
		int y1 = this.getHeight() / 4;
		g.drawOval(x1, y1, this.getWidth() / 2, this.getHeight() / 2);
		Image element = null;
		try {
			
			ArrayList<Element> set = Carte.generateElementSet(Nbfleur,NbArbre,NbRocher,NbClef,NbLock,NbGold,NbTrap,NbMonstre, nbHerbe);
			Carte carte = new Carte();
			carte.setCarte(carte.generateMap(20, 20, set));
			
			for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {
					element = ImageIO.read(new File(carte.getCarte()[i][j].getElement()));
					g.drawImage(element, i*35, j*35, this);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
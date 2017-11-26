package elements;

public class Joueur extends Element {
	int gold, key;

	public Joueur() {
		super(0, 0, "x");
		this.gold = 0;
		this.key = 0;
	}

	public Element[][] move(int m, Element[][] carte) {
		switch (m) {
		case 8: 
			if(!(this.getX() == 0)) {
				//je met la valeur de la carte a jour
				carte[this.getX()-1][this.getY()] = this;
				//Je met la valeur du joueur à jour
				this.setX(this.getX()-1);
			}
			//retourner la carte modifiée
		
			return carte;
		case 2:
			
			
			if(!(this.getX() == 20)) {
				//je met la valeur de la carte a jour
				carte[this.getX()+1][this.getY()] = this;
				//Je met la valeur du joueur à jour
				this.setX(this.getX()+1);
			}		
			
			return carte;
		case 4:

		
			if(!(this.getY() == 0)) {
				
				//je met la valeur de la carte a jour
				carte[this.getX()][this.getY()-1] = this;
				//Je met la valeur du joueur à jour
				this.setY(this.getY()-1);
			}		
			
			
			return carte;
		case 6:
			if(!(this.getY() == 20)) {

				//je met la valeur de la carte a jour
				carte[this.getX()][this.getY()] = this;
				//Je met la valeur du joueur à jour
				this.setY(this.getY()+1);
			}		
			return carte;
		case 0: 
			
			break;
		
		default:
			System.out.println("Ce mouvement n'est pas valide");
			return carte;
			
			
		}
		return null;
	}

}

package elements;

public class Joueur extends Element {
	int gold, key,vie;

	public Joueur() {
		super(0, 0, "x");
		this.vie = 10;
		this.gold = 0;
		this.key = 0;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public Element[][] move(int m, Element[][] carte) {
		switch (m) {
		case 8: 
			if(!(this.getX() - 1 <= 0)) {
				//je met la valeur de la carte a jour
				carte[this.getX()][this.getY()] = new Herbe(this.getX(), this.getY());
				carte[this.getX()-1][this.getY()] = this;
				//Je met la valeur du joueur � jour
				this.setX(this.getX()-1);
			}
			//retourner la carte modifi�e
		
			return carte;
		case 2:
			
			
			if(!(this.getX() + 1 >= 20)) {
				//je met la valeur de la carte a jour
				carte[this.getX()][this.getY()] = new Herbe(this.getX(), this.getY());
				carte[this.getX()+1][this.getY()] = this;
				//Je met la valeur du joueur � jour
				this.setX(this.getX()+1);
			}		
			
			return carte;
		case 4:

		
			if(!(this.getY() - 1 <= 0)) {
				
				//je met la valeur de la carte a jour
				carte[this.getX()][this.getY()] = new Herbe(this.getX(), this.getY());
				carte[this.getX()][this.getY()-1] = this;
				//Je met la valeur du joueur � jour
				this.setY(this.getY()-1);
			}		
			
			
			return carte;
		case 6:
			if(!(this.getY() + 1 >= 20)) {
				//je met la valeur de la carte a jour
				carte[this.getX()][this.getY()] = new Herbe(this.getX(), this.getY());
				carte[this.getX()][this.getY()+1] = this;
				//Je met la valeur du joueur � jour
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

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}

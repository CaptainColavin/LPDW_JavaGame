package elements;

public class Element{
	int x, y;
	String representedBy; 

	public Element(int x, int y, String representedBy) {
		this.x = x;
		this.y = y;
		this.representedBy = representedBy;
	}
	
	public static void reaction(int typeOfElement) {
		
	}

	public String getRepresentedBy() {
		return representedBy;
	}

	public void setRepresentedBy(String representedBy) {
		this.representedBy = representedBy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

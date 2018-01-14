package elements;

public class Element{
	int x, y;
	String representedBy, image; 

	public Element(int x, int y, String representedBy, String image) {
		this.x = x;
		this.y = y;
		this.representedBy = representedBy;
		this.image = image;
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

	public String getElement() {
		return image;
	}
}

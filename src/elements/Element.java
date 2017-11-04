package elements;

public class Element {
	int x, y;
	String representedBy; 

	public Element(int x, int y, String representedBy) {
		this.x = x;
		this.y = y;
		this.representedBy = representedBy;
	}

	public String getRepresentedBy() {
		return representedBy;
	}

	public void setRepresentedBy(String representedBy) {
		this.representedBy = representedBy;
	}

}

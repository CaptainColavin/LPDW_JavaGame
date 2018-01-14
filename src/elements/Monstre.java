package elements;

public class Monstre extends Element {
	int degat;

	public Monstre(int x, int y) {
		super(x, y, "8", "monstre.png");
		this.degat = 2;
	}

}

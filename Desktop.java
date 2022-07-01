package orgsystem;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("size is 16 inch");

	}

	public static void main(String[] arg) {
		Computer model = new Computer();
		Desktop size = new Desktop();
		model.computermodel();
		size.desktopsize();

	}

}

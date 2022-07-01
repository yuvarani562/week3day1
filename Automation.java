package week3.day1;

public class Automation extends Multiplelanguage implements Language, Testtool {

	public void seleniuum() {
		// TODO Auto-generated method stub
		System.out.println(" learn Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("learn java");

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("learn ruby");
	}

	public static void main(String[] arg) {
		Automation automation = new Automation();
		automation.java();
		automation.seleniuum();
		automation.ruby();
		automation.python();

	}

}

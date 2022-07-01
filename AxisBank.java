package week3.day1;

public class AxisBank extends Bankinfo {
	public void deposit() {

		System.out.println("deposit  method is called in Axis Bank");

	}

	public static void main(String[] arg) {

		AxisBank bankDetails = new AxisBank();
		bankDetails.deposit();
		bankDetails.savings();
		bankDetails.fixed();

	}

}

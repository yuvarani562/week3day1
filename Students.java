package week3.day1;

public class Students {

	public static void main(String[] arg) {
		Students studentDetails = new Students();
		studentDetails.getstudentinfo(95886);
		studentDetails.getstudentinfo(95886, "Sathurthika");
		studentDetails.getstudentinfo("Sathurthika562", "9845743140");

		Students studentDetails2 = new Students();
		studentDetails2.getstudentinfo(90846);
		studentDetails2.getstudentinfo(90846, "Yuva");
		studentDetails2.getstudentinfo("Yuvarani7373", "876422468");
	}

	public void getstudentinfo(int id) {
		System.out.println("Student id is" + id);
	}

	public void getstudentinfo(int id, String name) {
		System.out.println("Student id is" + id + " And Name is" + name);

	}

	public void getstudentinfo(String email, String phonenumber) {
		System.out.println("Student email is" + email + " And phonenumber is" + phonenumber);

	}

}

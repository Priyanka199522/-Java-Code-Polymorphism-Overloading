package org.polymorphishm;

public class StudentDetails {

	private void studentName() {
		System.out.println("Student information");
	}
	private void studentName(String Name) {
		System.out.println("StudentName is: "+"name");
	
}private void studentName(float weight) {
	System.out.println("Student weight is: "+weight);
}

	private void studentName(int age) {
		System.out.println("Student Age is: "+age);
	}
	private void studentName(long phonenumber,String email) {

		System.out.println("phone nmber is: "+phonenumber);
	
		System.out.println("email is: "+email);
	}
	private void studentName(String Address,int pincode) {
		System.out.println("address: "+Address );
		System.out.println(" pincode is :"+pincode);
	}

	
	public static void main(String[] args) {
	 StudentDetails S=new StudentDetails();
	 S.studentName();
	 S.studentName("Karish");
	 S.studentName(74676764773L, "ramyapriya@gmail.com");
	 S.studentName("rajapuram" , 6444454);
	}
	
	}
	
package org.polymorphishm;

public class StudentDetails {

	private void studentName() {
		System.out.println("priya");
	}
	private void studentName(String Name) {
		System.out.println("StudentName is: "+"Pushpa");
	
}
	private void studentName(int age) {
		System.out.println("Student Age is: "+24);
	}
	private void studentName(long phonenumber,String email) {

		System.out.println("phone nmber is: "+9466646466l);
	
		System.out.println("email is: "+"priyavictor22@gmail.com");
	}
	private void studentName(String Address,int pincode) {
		System.out.println("address: "+"kakithapuram" );
		System.out.println(" pincode is :"+6275033);
	}

	
	public static void main(String[] args) {
	 StudentDetails S=new StudentDetails();
	 S.studentName();
	 S.studentName("PHUPHA");
	 S.studentName(74676764773L, "ramyapriya@gmail.com");
	 S.studentName("rajapuram" , 6444454);
	}
	
	}
	
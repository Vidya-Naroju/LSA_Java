package java_Homework;

import java.util.Scanner;

public class Parameter2 extends Parameters1{

	public static void main(String[] args) {
		
		
		//creating object for parameter1
				Parameters1 p1=new Parameters1();
				
		Scanner s=new Scanner(System.in);
		System.out.println("please enter userID");
		int ID = s.nextInt();
		System.out.println("please enter username");
		String name=s.next();
		
		//calling methods using parameter1 object
		p1.setuserdetails(ID,name);
		p1.print();

	}

}

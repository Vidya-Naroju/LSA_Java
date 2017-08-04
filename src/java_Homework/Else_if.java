package java_Homework;

import java.util.Scanner;

public class Else_if {

public Else_if() {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("**********Enter the values between 1 to 3**********");
	
		int x=s.nextInt();
		
	if (x==1)
		System.out.println("x value is 1");
	else if(x==2)
		System.out.println("x value is 2");
	else if	(x==3)
		System.out.println("x value is 3");
	else System.out.println("Please enter the numbers between 1 to 3");
		
}
	public static void main(String[] args) {
		
		int x=10;
		Else_if e=new Else_if();
	}

}

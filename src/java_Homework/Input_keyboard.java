package java_Homework;

import java.util.Scanner;

public class Input_keyboard {

	public static void main(String[] args) {
		int ID;
		String Name;
		char Gender;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the user ID : ");
		ID=s.nextInt();
		System.out.println("enter the user Name : ");
		Name=s.next();
		System.out.println("enter the user Gender F/M");
		Gender=s.next().charAt(0);
		System.out.println("*******************User details****************");
		System.out.println("user ID = "+ID);
		System.out.println("user name : "+Name);
		System.out.println("user Gender = "+Gender);

	}

}

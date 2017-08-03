package java_Homework;

import java.util.Scanner;

public class Switch {
public void day_switch(){
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number between 1 to 7 to see the day in a week");
	int day=s.nextInt();

	switch(day){
	case 1:
		System.out.println("day is Monday"); break;
		case 2:
			System.out.println("day is Tuesday");break;
		case 3:
			System.out.println("day is Wednessday");break;
		case 4:
			System.out.println("day is Thursday");break;
		case 5:
			System.out.println("day is Friday ");break;
		case 6:
			System.out.println("day is Saturday");break;
		case 7:
			System.out.println("day is Sunday ");break;
			
		default :
				System.out.println("********please enter the valid input Thank You********");
			
	}
}
	public static void main(String[] args) {
		Switch s=new Switch();
		s.day_switch();

	}

}

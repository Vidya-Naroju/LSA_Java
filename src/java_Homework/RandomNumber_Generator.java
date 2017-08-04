package java_Homework;

import java.util.Random;

public class RandomNumber_Generator {

	public static void main(String[] args) {
		Random ran=new Random();
		
		for (int i = 0; i < 7; i++) {
			System.out.println(ran.nextInt(5));
		}

	}

}

package java_Homework;

import java.util.Random;

public class Array_As_Counter {

	public static void main(String[] args) {
		 
		Random ran=new Random();
		int a[]=new int[7];
		
		// in 11 iterators it may generate any number, it may be any number of combinations
		for (int i = 0; i < 11; i++)
				{
			//here 6 is an argument where the random number generates between 0 to 6
			++a[1+ran.nextInt(6)];
					
				
				System.out.println("b\ta");
				System.out.println("***************************");
				
				//as the length of the array is 7 we can't use more than (a.length)
		for (int j = 1;  j < a.length; j++) {
			
			System.out.println(i+j+"\t"+a[j]);
		}
				}
	}
	
}

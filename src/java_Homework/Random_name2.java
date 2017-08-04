package java_Homework;

import java.util.Random;

public class Random_name2 {

	public static void main(String[] args) {
	

		Random gen = new Random(474587); //put in random seed
		int min = 5;
		int max = 6;

		// we want  random strings 
		for(int i=1; i <= 6; i++){
		 int len = min+gen.nextInt(max-min+1);
		 StringBuilder s = new StringBuilder(len);
		 while(s.length() < len)
		 {
			 
		  //97 is ASCII for character 'a', and 26 is number of alphabets
		  s.append((char)(97+gen.nextInt(26)));     
		 }

		System.out.println(i+"\t"+s.toString());
		}

	}

}

/*program for compound interest
 * Amount=principal*(1+rate)^n
 * A=P(1+R)^n
 * n=day
 */


package java_Homework;

public class Compound_Interest {
	            static double Amount;
				static int principle=1000;
						//rate is taken as 10% per day so 10/100=0.1
				static double rate=0.1;
				
	public static void main(String[] args) {
		for (int day  = 0; day <=20 ; day++) 
		{
			Amount = principle*Math.pow(1+rate,day );
			System.out.println("day "+day+" Compound interest is :"+Amount);
		}

	}

}

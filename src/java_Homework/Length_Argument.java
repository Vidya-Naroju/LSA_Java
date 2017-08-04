package java_Homework;

public class Length_Argument {
 public static float num(float...numbers){
	float total=0;
	 for (float x:numbers){
		 total=total+x;
	 };
	return total/numbers.length;
	 
 }
	public static void main(String[] args) {
		

System.out.println("average : "+num(12,34,45,56));
	}

}

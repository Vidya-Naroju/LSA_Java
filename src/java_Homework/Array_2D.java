package java_Homework;

public class Array_2D {

	public static void main(String[] args) {
		
		int a[][]={{1,2,4,5,4,},{1,3,6,7,8},{1,5,6}};
		for (int i = 0; i < a.length; i++) {
			
			//in order to print the all the numbers in a column we have to use "j<a[i]"
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}System.out.println();
		}
	//	System.out.println("length of array a[i] is :"+i + "/t"+"length of array a[j] is : "+j);
			
		
	}

}

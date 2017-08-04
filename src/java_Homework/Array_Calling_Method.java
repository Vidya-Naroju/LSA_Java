/*here the array values are added to the value 5 and
 *  the new array will be stored in y */

package java_Homework;

public class Array_Calling_Method {

	static int a[]={1,1,2,3,4,5}, sum=0;
	
	public static void total(int x[]){
		for (int i = 0; i < x.length; i++) {
			x[i]+=5;
		}
	}
	
	public static void main(String[] args) {
		total(a);
		//here the values in the array a[] will be changed
		for(int y:a)
		System.out.println(y);
		

	}

}

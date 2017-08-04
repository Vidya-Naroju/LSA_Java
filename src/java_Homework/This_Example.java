/*This keyword
 * if we want to use the values which are inside the method use this keyword  */

package java_Homework;

public class This_Example {
	
static int a=22;
 static String name="laxmi";
static char c='a';

public void set(int a,String name,char c){
	this. a=10;
	this. name="vidya";
	this. c ='g';
	 	 
}
	public static void main(String[] args) {
		
		This_Example t=new This_Example();
	t.set(a,name,c);
		System.out.println(a+"\t"+name+"\t"+c);

	}

}

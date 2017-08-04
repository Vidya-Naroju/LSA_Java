

/*constructors doesnt need to have an object to run the constructors method
 * we can create number number of objects cand can call same method using those objects*/

package java_Homework;

public class Constructors {
	
	int number;
	String college;

	//constructor
public Constructors(int a,String b){
	number=a;
	college=b;
	System.out.println("number is : "+ number +"     "+"college name is : "+college);
}
	public static void main(String[] args) {
		//creating two objects for constructors
	Constructors c=new Constructors(12,"NCET");
	Constructors c1=new Constructors(13,"MVSR");
	

	}

}

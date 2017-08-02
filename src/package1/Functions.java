package package1;

public class Functions {
public static void Testing(){
	System.out.println("SoftwareTesting");
}

public static void Addition(){
	int a=1;
	int b=2;
	int c =3;
	int sum=a+b+c;
	System.out.println(sum);
}

public static void Sum(int a,int b,int c){
	int sum=a+b+c;
	System.out.println(sum);
}
//return the value from the method 
public static int Multiplication(int a,int b){
	int result=a*b;
	return result;
}

public static void main(String args[]){
	Testing();
	Addition();
	Testing();
	Addition();
	Sum(3,2,3);
	Multiplication(5,4);
	
	//storing multiplication value in mul
	int mul=Multiplication(5, 4);
	System.out.println(mul);
			
}
}
	
	
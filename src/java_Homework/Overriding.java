package java_Homework;
/*having same method name with differenr*/
public class Overriding {
public void calculate(int x, int y){
	int mul=x*y;
	System.out.println(mul);
}
public void calculate(int x,int y, int z){
	int add=x+y+z;
	System.out.println(add);
}

public void calculate(int a){
	int inc=a++;
	System.out.println(inc);
}
	public static void main(String[] args) {
		Overriding o=new Overriding();
		o.calculate(1);
		o.calculate(2, 3);
		o.calculate(3,5,3);
	}

}

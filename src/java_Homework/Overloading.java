package java_Homework;

public class Overloading {
public void calculate(int x, int y){
	int sum=x+y;
	System.out.println(sum);
}
	public static void main(String[] args) {
		 Overloading o=new Overloading();
		 o.calculate(3, 7);
		 
	}

}

package java_Homework;

public class To_String1 {
private int year;
private int month;
private int day;

public void calander(int m,int d,int y){
	year=y;
	month= m;
	day=d;
	//when ever we use this it goes and search for tostring method 
	System.out.printf("the constructor for this is %s\n",this);
		}
public  String toString(){
	return String.format("%d/%d/%d",month,day,year	);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		To_String1 s=new To_String1();
		s.calander(2, 12,2012);
		}
	}



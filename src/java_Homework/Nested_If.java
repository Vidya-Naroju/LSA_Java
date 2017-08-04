package java_Homework;

public class Nested_If {
	int feb;
	public Nested_If(){
		if(feb>29){
			System.out.println("its not a non leap year");
			}
		else{
			System.out.println("its a leap year");
		}
		if (feb==31){
			System.out.println("feb do not have 31 days");
				}
		else{
		System.out.println("your statement is correct");
		}
	}

	public static void main(String[] args) {
	int feb=29;
	Nested_If n=new Nested_If();
	}

}

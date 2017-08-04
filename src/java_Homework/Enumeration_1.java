package java_Homework;

public enum Enumeration_1 {
	//constants
bucky(" is nice","31"),
sujan("is a boyfriend","32"),
viddu("is good","28");

private final String desc;
private final String year;

Enumeration_1(String description,String age){
	desc=description;
	year=age;
	
}
public String getdesc()
{
	return desc;
}
public String getage(){
	return year;
}
	public static void main(String[] args) {
		
		for(Enumeration_1 people:Enumeration_1.values())
			System.out.printf("%s\t%s\t%s\n",people,people.getdesc(),people.getage());

	}

}

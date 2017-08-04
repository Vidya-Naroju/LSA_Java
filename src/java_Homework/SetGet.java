package java_Homework;

public class SetGet {

	private int hours;
	private int minutes;
	private int seconds;
	
	public SetGet(){
		this(0,0,0);
	}
	
public SetGet(int h){
		this(h,0,0);
	}
public SetGet(int h,int m){
	this(h,m,0);
}
public SetGet(int h,int m,int s){
	SetTime(h,m,s);	
}
public void SetTime(int h,int m,int s){
	sethours(h);
	setminutes(m);
	setseconds(s);
}
public void sethours(int h){
	hours=((h>=0||h<24)?h:0);
}
public void setminutes(int m) {
	minutes=((m>=0||m<60)?m:0);
}
public void setseconds(int s){
	seconds=((s>=0||s<60)?s:0);
};
public int gethour(){
	return hours;
}
public int getminutes() {
	return minutes;
}
public int getseconds(){
	return seconds;
}
	public String tomilitarystring(){
		return String.format("%02d:%02d:%02d", gethour(),getminutes(),getseconds());
	}
	public static void main(String[] args) {
		
		SetGet s=new SetGet();
		SetGet s1=new SetGet(13);
		SetGet s2=new SetGet(2,3);
		SetGet s3=new SetGet(3,2,43);
System.out.printf("%s\n",s.tomilitarystring());
System.out.printf("%s\n",s1.tomilitarystring());
System.out.printf("%s\n",s2.tomilitarystring());
System.out.printf("%s\n",s3.tomilitarystring());
	}

}

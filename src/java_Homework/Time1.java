package java_Homework;

public class Time1 {
public static int hours, minutes, seconds;
 
public static void clock(int h,int m,int s){
	hours=((h>0&&h<24 )? h : 0);
	minutes=((m>0&&m<60)? m : 0);
	seconds=((s>0&&m<60)? s : 0);
	}

public static String Format(){
	return String.format(("%02d:%02d:%02d"),hours,minutes,seconds);
	
}
public static String settime(){
	return String.format("%d:%02d:%02d %s",(hours==0||hours==12)?12:hours%12,minutes,seconds,(hours>0||hours<12)?"AM":"PM");
	
}
	public static void main(String[] args) {
		
		clock(22,3,5);
		
		System.out.println(Format());
		System.out.println(settime());
	}

}
/*Access specifiers
 * 'Private' will be accessed only in the same class only and not accessible to the other classes of same package 
 * 'public' will accessed in same class or outside of class but it should be within same package*/
 
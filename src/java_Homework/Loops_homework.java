package java_Homework;

public class Loops_homework {
	int a=5, b=3;
	public void whileloop(){
			while(a<=11){
			System.out.println("a"+a);
			a++;
		}}
			public void do_while(){
				do {
					System.out.println(b);
					b++;
				}while(b<10);
	}

			public void if_loop(){
					for( int i=15;i>1;i--){
					System.out.println(i);
					
				}
			}
	public static void main(String[] args) {
		
		Loops_homework  lh=new Loops_homework();
		System.out.println("************while************");
		lh.whileloop();
		System.out.println("***********do while**********");
		lh.do_while();
		System.out.println("***********if loop**********");
		lh.if_loop();

	}

}

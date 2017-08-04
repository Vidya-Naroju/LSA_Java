package package1;

public class Arrays {

	public static void main(String[] args) {
		String Shopping_list[]= new String[5];
		Shopping_list[0]="choclates";
		Shopping_list[1]="cake";
		Shopping_list[2]="chips";
		Shopping_list[3]="coke";
		Shopping_list[4]="beer";
		
		System.out.println("length of the array is ="+Shopping_list.length);
		
		for(int i=0;i<Shopping_list.length;i++){
			System.out.println(i+" "+Shopping_list[i]);
		}
//******************************end of one array logic**********************************************************		
		//Arraylist of fruits
		
		String list[]={"apple","banana","mango","peach","orange"};
		System.out.println("Item no."+"\t"+"LIst of fruits");
		System.out.println("********"+"\t"+"**************");
		for (int j = 0; j < list.length; j++) {
			System.out.println(j +"\t\t"+list[j]);
		}
		
//******************************end of second array logic**********************************************************		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//sum of array values
		int b[]={1,2,3,4,5,6};
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			sum =sum+b[i];
			//to see the sum of each "i" iterator 
			System.out.println(sum);
		}
		System.out.println("sum after the end of closed");
		System.out.println(sum);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
//******************************end of third array logic**********************************************************		
	/*till now we have seen that all arrays values are stored in a array 
	 * but now we gona see storing an array in an identifier
	 * the below program is about adding all the values in an array */
		int total=0;
		for (int x: b) {
			
			total=total+x;
			
		}System.out.println(total);
	//	System.out.println(x);
	 
	}

}

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

	}

}

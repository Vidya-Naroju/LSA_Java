package java_Homework;

public class Parameters1 {
	private String username;
	int userID;
	
	
		public void setuserdetails(int ID,String name )
		{
		System.out.println(ID +"  "+ name);
		}
	
	//return value is stored in the method ,when u call this method using syso it will print the return value
		public String getusername()
		{
		return username;
	    }

		public void print(){
		System.out.println("username through return type is : "+getusername());
		}
	
}

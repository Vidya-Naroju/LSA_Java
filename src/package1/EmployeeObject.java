package package1;

public class EmployeeObject {

	public static void main(String[] args) {
		
		//creating more objects to a single class
		 Employee emp=new Employee();
		 
		//emp.name="sam";
		 emp.ID=123;
		 emp.Salary=40000;
		 emp.doInduction();
		 emp.paySalary();
		 
		 Employee emp1= new Employee();
		 emp1.ID=143;
		 emp1.name="vidya";
		 emp1.Salary=60000;
		 emp1.doInduction();
		 emp1.paySalary();

		 
	}

}

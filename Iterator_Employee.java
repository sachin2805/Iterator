package student;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class EmployeeIntro<T>{
	private T o;

	EmployeeIntro (T o)
	{
		this.o=o;
	}
	
	public T getO() {
		return o;
	}


	@Override
	public String toString() {
		return "-->" + o ;
	}


}
public class Iterator_Employee {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Name : ");
		String a=scan.next();
		System.out.println("Enter the Id : ");
		int b=scan.nextInt();
		System.out.println("Enter the Department : ");
		String c=scan.next();
		System.out.println("Enter the Salary : ");
		int d=scan.nextInt();
		
		List<EmployeeIntro> l=new ArrayList<EmployeeIntro>();
		
		
		l.add(new EmployeeIntro<>(a)); // Strict Defined
		l.add(new EmployeeIntro<>(b)); //Specify the data type
		l.add(new EmployeeIntro<>(c));
		l.add(new EmployeeIntro<>(d));
	
		Iterator<EmployeeIntro> iterator = l.iterator();
			
			System.out.println("[1.NAME 2.ID 3.Department 4.Salary]\n______Employee Details______");
			while (iterator.hasNext()) {
		System.out.println(iterator.next().getO());
	
		}

}
}
/*OUTPUT
Enter the Name : 
Akash
Enter the Id : 
101
Enter the Department : 
Casting
Enter the Salary : 
50000
[1.NAME 2.ID 3.Department 4.Salary]
______Employee Details______
Akash
101
Casting
50000
*/
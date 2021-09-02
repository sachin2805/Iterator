package student;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Student5<T>{
	private T o;

	Student5 (T o)
	{
		this.o=o;
	}
	
	public T getO() {
		return o;
	}


	@Override
	public String toString() {
		return "" + o ;
	}


}
public class Student {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Name : ");
		String a=scan.next();
		System.out.println("Enter the Roll Number : ");
		int b=scan.nextInt();
		System.out.println("Enter the Division : ");
		String c=scan.next();
		System.out.println("Enter the Standerd : ");
		int d=scan.nextInt();
		
		List<Student5> l=new ArrayList<Student5>();
		
		
		l.add(new Student5<>(a)); // Strict Defined
		l.add(new Student5<>(b)); //Specify the data type
		l.add(new Student5<>(c));
		l.add(new Student5<>(d));
	
		Iterator<Student5> iterator = l.iterator();
			
			System.out.println("______Student Details______");
			while (iterator.hasNext()) {
		System.out.println(iterator.next().getO());
		
	
		}

}
}
/*OUTPUT
Enter the Name : 
Sachin
Enter the Roll Number : 
1
Enter the Division : 
A
Enter the Standerd : 
12
______Student Details______
Sachin
1
A
12
*/
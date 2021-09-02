package student;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Company<T>{
	private T o;

	Company (T o)
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
public class CompanyNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the 4 Company name  : ");
		String a=scan.nextLine();
	
		String b=scan.nextLine();
		
		String c=scan.nextLine();
		
		String d=scan.nextLine();
		
	
			
		List<Company> l=new ArrayList<Company>();
		
		
		l.add(new Company<>(a)); // Strict Defined
		l.add(new Company<>(b)); //Specify the data type
		l.add(new Company<>(c));
		l.add(new Company<>(d));
	
		ListIterator<Company> iterator = l.listIterator();
		int i=1;
		while (iterator.hasNext()) {
		
			System.out.println(i+"\t" + iterator.next().getO());
			i++;
		}
	}
}
/*OUTPUT
Enter the 4 Company name  : 
Profound
Tata
Mahindra Motors
Sachin Company
1	Profound
2	Tata
3	Mahindra Motors
4	Sachin Company
*/

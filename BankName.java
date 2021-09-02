package student;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Banklist2<T>{
	private T o;

	Banklist2 (T o)
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
public class BankName {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the 4 bank name  : ");
		String a=scan.nextLine();
	
		String b=scan.nextLine();
		
		String c=scan.nextLine();
		
		String d=scan.nextLine();
		
	
			
		List<Banklist2> l=new ArrayList<Banklist2>();
		
		
		l.add(new Banklist2<>(a)); // Strict Defined
		l.add(new Banklist2<>(b)); //Specify the data type
		l.add(new Banklist2<>(c));
		l.add(new Banklist2<>(d));
	
		Iterator<Banklist2> iterator = l.iterator();
			
			System.out.println("______Bank Name List______");
			while (iterator.hasNext()) {
		System.out.println(iterator.next().getO());
	
		}
	}
}
/*OUTPUT
Enter the 4 bank name  : 
State Bank Of India
ICICI
Maharastra Bank
HDFC
______Bank Name List______
State Bank Of India
ICICI
Maharastra Bank
HDFC
*/

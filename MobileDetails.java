package student;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class MobileInfo<T>{
	private T o;

	MobileInfo (T o)
	{
		this.o=o;
	}
	
	public T getO() {
		return o;
	}


	@Override
	public String toString() {
		return " "+o ;
	}


}
public class MobileDetails  {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Enter the Model : ");
		String a=scan.next();
		System.out.println("Enter the Ram : ");
		int b=scan.nextInt();
		System.out.println("Enter the Colour : ");
		String c=scan.next();
		System.out.println("Enter the Price: ");
		int d=scan.nextInt();
		
	
			
		List<MobileInfo> l=new ArrayList<MobileInfo>();
		
	   l.add(new MobileInfo<>(a));
		l.add(new MobileInfo<>(b)); 
		l.add(new MobileInfo<>(c));
		l.add(new MobileInfo<>(d));
		System.out.println(a);
	
		ListIterator<MobileInfo> iterator = l.listIterator();
		int i=1;
		System.out.println("[1.Name 2.Ram 3.Colour 4.Price]\n----------------------------------------");
		while (iterator.hasNext()) {
		
			System.out.println(i+"\t" + iterator.next().getO());
			i++;
		}
	}
}
/*OUTPUT
Enter the Model : 
Samsung
Enter the Ram : 
8
Enter the Colour : 
Red
Enter the Price: 
15000
Samsung
[1.Name 2.Ram 3.Colour 4.Price]
----------------------------------------
1	Samsung
2	8
3	Red
4	15000
*/
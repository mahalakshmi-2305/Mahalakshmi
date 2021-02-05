import java.util.*;
public class collectionAssisted {

	public static void main(String[] args) {
		//creating ArrayList
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();
		city.add("Banglore");
		city.add("Delhi");
		System.out.println(city);
		
		//creating Vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec=new Vector();
		vec.addElement(15);
		vec.addElement(30);
		System.out.println(vec);
		
		//creating LinkedList
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names=new LinkedList<String>();
		names.add("Maha");
		names.add("Ravi");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
	
		
		//creating Hashset
		System.out.println("\n");
		System.out.println("hashset");
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		System.out.println("set");
		
		//creating linkedHashSet
		
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(11);
		set2.add(12);
		set2.add(13);
		set2.add(14);
		System.out.println(set2);
		
		}	
		
	}

}

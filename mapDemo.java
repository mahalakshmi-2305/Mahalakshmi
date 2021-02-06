import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
		//MAp
		
		//HashMAp
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Maha");
		hm.put(2,"Ravi");
		hm.put(3,"Sankith");
		System.out.println("The elements of Hashmap are");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	    //HashTable
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(4,"yashu");
		ht.put(5,"Bhavya");
		ht.put(6,"Manu");
		ht.put(7,"Hari");
		System.out.println("\n The elements of Hashtable are");
		for(Map.Entry n:ht.entrySet()) {
			System.out.println(n.getKey()+" "+n.getValue());
		}
		
		//TreeMap
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(8,"Nami");
		map.put(9,"Pallu");
		map.put(10,"Jayanthi");
		System.out.println("\n The elements of Treemap are");
		for(Map.Entry l:map.entrySet()) {
			System.out.println(l.getKey()+" "+l.getValue());
		}
		
		

	}

}

package Date2872020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StudentMapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Student> stdList=new HashMap<String, Student>();
		
		stdList.put("Ma Ma",new Student("Ma Ma","09-777234128","5cs-4","Monywa"));
		stdList.put("Mg Mg", new Student("Mg Mg","09-354358760","5cs-95","Monywa"));
		stdList.put("Aung Aung", new Student("Aung Aung","09-987654213","5cs-8","Monywa"));
		stdList.put("Mya Mya", new Student("Mya Mya","09-564211985","5css-83","Monywa"));
		stdList.put("Thida", new Student("Thida","09-564212389","5cs-78","Monywa"));
		
		Set s=stdList.entrySet();
		
		Iterator i=s.iterator();
		char response;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter name:");
			String name=sc.nextLine();
			
		while(i.hasNext()) {
			Map.Entry map=(Map.Entry) i.next();
			String st=(String) map.getKey();
			if(st.toLowerCase().startsWith(name.toLowerCase())) {
			Student obj=(Student) map.getValue();
			System.out.println(obj.show());
			}
		}
		System.out.println();
		
		System.out.println("\nContinue? [y/n]: ");
        response = sc.nextLine().charAt(0);
		}while(response!='n');
	}

}

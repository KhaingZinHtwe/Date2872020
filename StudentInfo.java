package Date2872020;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentInfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char response;
		String data="";
		
		do {
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter phone number:");
		String phone=sc.nextLine();
		
		System.out.println("Enter roll number:");
		String rollNo=sc.nextLine();
		
		System.out.println("Enter your address:");
		String address=sc.nextLine();
		
		File file = new File("StudentInformation.txt");
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file); 
		data+=name+","+phone+","+rollNo+","+address+";\n";
		writer.write(data); 
	    writer.flush();
	    writer.close();
	    
	    HashMap<String,Student> hm=new HashMap<String,Student>();
	   
		Scanner scan=new Scanner(file);
		
		try {
			while (scan.hasNextLine()) {
				scan.useDelimiter(";");
				System.out.println(scan.next());
			} 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println();
		}
	    
	    System.out.println("\nContinue? [y/n]: ");
        response = sc.nextLine().charAt(0);

	}while(response != 'n');
	}

}

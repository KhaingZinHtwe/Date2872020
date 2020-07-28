package Date2872020;

class Student {

	String name,phone,rollNo,address;
	public Student(String n,String p,String r,String add) {
		this.name=n;
		this.phone=p;
		this.rollNo=r;
		this.address=add;
	}
	
	public String show() {
		return "Student Name:\t"+name+"\nPhone number:\t"+phone+"\nRoll No:\t"+rollNo+"\nAddress:\t"+address+"\n";
	}
}

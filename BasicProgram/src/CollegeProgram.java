
public class CollegeProgram {

	public static void main(String[] args) {
		Student123 s1=new Student123();
		Student123.srno = 1;
		s1.name = "Khushi";
		System.out.println(s1.toString());
		s1.show();
		Student123 s2=new Student123();
		Student123.srno = 2;
		s2.name = "Nisha";
		System.out.println(s2.toString());
		s2.show();
	}

}


class Student123{
	static int srno; 	// static variable
	String name;	// instance variable
	
	public void show() {
		int i = 10;		// local variable
		System.out.println("value of i : "+i);
	}

	@Override
	public String toString() {
		return "Student123 [srno=" + srno + ",name=" + name + "]";
	}
	
}

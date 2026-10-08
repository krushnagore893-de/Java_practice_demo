class Student {
	String name ;
	int age ;
	int marks ;
	
}


public class Method_progran_1 {
	public static void main (String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "krushna";
		s1.age = 19;
		s1.marks = 96;
		
		System.out.println("Name --->" + s1.name);
		System.out.println("age ---->" + s1.age);
		System.out.println("marks ---->" + s1.marks);
	}
}

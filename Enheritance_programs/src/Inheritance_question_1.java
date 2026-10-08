// inheritance + encapsulation
class Employee {
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
}

class Devloper extends Employee {
	void code () {
		System.out.println(getName() + "is coding");
	}
}
public class Inheritance_question_1 {
	public static void main (String[] args) {
		
		Developer d1 = new Developer();
		
		d1.setName("krushna");
		d1.code();
	}
}

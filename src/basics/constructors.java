package basics;

public class constructors {
	int id;
	String name;
	String course;

	// parametrizied constructor

	public constructors(int id, String name, String course) {
		// this(id,name,course);
	}

	public void display() {

		System.out.println("id= " + id + "\nname= " + name + "\ncourse = " + course);

	}

	public static void main(String[] args) {
		constructors s1 = new constructors(101, "haritha", "cse");
		s1.display();
	}
}
// 2n program

package encapsulation;

import java.util.Scanner;

public class encapsulationprogram {
	// employ details
	private int id;// getter(read only)
	private String designation;// getter
//	private double salary;// getter
//	private String address;// setter&getter
//	private String phnum;// setter&getter
	private String name;// getter
 //   private String password;

	public encapsulationprogram(int id, String designation,String name) {
		this.id = id;
		this.designation = designation;
		// this.salary = salary;
		// this.address = adress;
		// this.phnum = phum;
		this.name = name;
		// this.password = password;
	}

	public void display() {
		System.out.println("enter employ details");
		System.out.println("id" + id + "\ndesignation" + designation + "\nname" + name);

	}

	public int getid() {
		return id;

	}

	public String getdesignation() {
		return designation;
	}

	public String getname() {
		return name;
	}

}

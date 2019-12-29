package inheritance;

public class inheritancedemo {

	public static void main(String[] args) {
		// parent class obj created
//    parent pobj = new parent();
//		 pobj.methodone();

		// single inheritance

		// parent->child one

		// childone obj created
		childone c1obj = new childone();
		c1obj.methodone();// parent
		c1obj.methodtwo();// subchild

		// multilevel inheritance
		// parent->childone->subchild
//subchild obj created
		subchild scobj = new subchild();
		scobj.methodone(); // parent
		scobj.methodtwo(); // child one
		scobj.methodthree(); // subchild

		// hirarichal inheritance
		// parent-> child two

//child two obj created
		childtwo c2obj = new childtwo();
		c2obj.methodone();// parent
		c2obj.methodfour();// child two

//object creation to child class and object reference to the parent class
		parent pcobj = new childone();
		pcobj.methodone();
		// to access child class method using parent class object reference we have
		// to type cast Parent class object reference to Child class object reference
		childone cobj = (childone) pcobj;
		cobj.methodtwo();
		cobj.methodone();

	}

}

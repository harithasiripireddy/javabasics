package polymorphism;
class bank{
	float getrateofinterest()
	{return 0;}
}

class sbi extends bank{ 
	float getrateofinterest()
	{return 8.4f;}
	
}
class icici extends bank{
	float getrateofinterest()
	{return 9.5f;}
}
public class polymorphisim2 {

	public static void main(String[] args) {
	 bank b = new  sbi();
	 System.out.println("sbi rateofinterest is"+ b.getrateofinterest());
	  b = new icici();
	 System.out.println("icici rate of interest is"+b.getrateofinterest());
	 

	}

}

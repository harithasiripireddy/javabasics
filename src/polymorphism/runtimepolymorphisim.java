package polymorphism;
class Animal{  
void eat()
	{System.out.println("eating");}
}
class dog extends Animal{
	void eat()
		{System.out.println("dog eating rat");}
		}
	class lion extends Animal{
		void eat()
		{System.out.println("lion eating beaf");}
	}
	class runtimepolymorphisim{
	public static void main(String[] args){
		
	Animal a;
	a = new dog();
	a.eat();
	a= new lion();
	a.eat();
	
	}
	}
	



package Assignment;

public class Arrayprogram {
	

	public static void main(String[] args) {
		// intialization a1 array
		int[] a1 = new int[] {1,2,3,4,5};
		
		// create a2 with same lenghth
		int[] a2 = new int [a1.length];
		//copy all elements from one array to another array
		for(int i=0;i<a1.length;i++) {
		  a2[i]=a1[i];
		  }
		//display a1 elements
		System.out.println(" elements of frt array");
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]+"\n");
					
			
		}
		// display a2 elements
		System.out.println(" elements of 2 nd array");
		for( int i= 0;i<a2.length;i++) {
			System.out.println(a2[i]+"");
		}
		
}

}

package basics;

public class twodarray {

	public static void main(String[] args) {
		//declaration 2d array
		int[][] m1 = new int[3][2];
		// values assiging 2d array
		m1[0][0] = 1;
		m1[0][1] = 2;
		m1[1][0] = 3;
		m1[1][1] = 4;
		m1[2][0] = 5;
		m1[2][1] = 6;
		//retraiving the 2d array
		System.out.print(m1[0][0]+ " ");
		System.out.print(m1[0][1]+ "\n ");
		System.out.print(m1[1][0]+ " ");
		System.out.print(m1[1][1]+ "\n ");
		System.out.print(m1[2][0]+ " ");
		System.out.print(m1[2][1]+ " \n");
	   

// 2d array addition

		System.out.println(m1[0][0]+m1[0][1]);
// 2d array subtraction
		System.out.print(m1[1][0]-m1[0][1]+ "\n");
	
	}
}
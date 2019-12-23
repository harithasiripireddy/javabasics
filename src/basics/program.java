package basics;

	public class program {

		int i = 0;
		static int j = 0;

		public void display() {
			i++;
			j++;
			System.out.println("i = "+i+"\tj = "+j);
		}

		public static void main(String[] args) {
			program s1 = new program();
			program s2 = new program();
			program s3 = new program();
			

			s1.display();
			s2.display();
			s3.display();
		}

	}



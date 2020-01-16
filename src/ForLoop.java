public class ForLoop {

	public static void main(String[] args) {
		System.out.println("ok we start th  e program");

		for( int k=1; k<=2;k++) {
			
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		}
		
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

			for (int k = 5; k > i - 1; k--) {
				System.out.print(" ");
			}
		}
		System.out.println("the program has been successfull");
		

	}

}
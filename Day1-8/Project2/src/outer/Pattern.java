package outer;

public class Pattern {
	public static void main(String[] args) {
		/*
		for(int i=0;i<=5;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=5;i>=0;i--) {
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int size = 3;
		for(int i=0;i<=size;i++) {
			for (int j=0;j<=size;j++) {
				if (i==0 || j==0 || i==size || j==size) {
					System.out.print("A ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		*/
		int rows=3;
		for (int i = 1; i <= rows; i++) { // Outer loop for each row
            // Print spaces before stars
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // Print space
            }
            // Print stars for the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Print star
            }
            System.out.println();
		}
		//lower half
		for (int i = rows-1; i > 0; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
	}
}

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of the matrix");
        int matrix = scanner.nextInt();
		
        int counter = 1;

		for(int i=1; i<=matrix; i++) {
            System.out.println();
            for(int j=1; j<=matrix;j++) {
				System.out.print(String.format("%3d ", counter));
				counter++;
			}
		}
    }
}

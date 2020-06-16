import java.util.Scanner;

public class URI_1001 {

	public static void main(String[] args) {
		/*
		 * Read 2 variables, named A and B and make the sum of these two variables, 
		 * assigning its result to the variable X. Print X as shown below. 
		 * Print endline after the result otherwise you will get “Presentation Error”.
		 */
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int x = a + b;
		
		System.out.println("X = " + x);

		sc.close();
	}

}

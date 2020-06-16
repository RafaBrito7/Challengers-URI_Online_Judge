package beginner;

import java.util.Scanner;

public class URI_1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double media = ((nota1 * 3.5) + (nota2 * 7.5))/ 11;
		
		System.out.println("MEDIA = " + String.format("%.5f", media));
		
		sc.close();
	}

}

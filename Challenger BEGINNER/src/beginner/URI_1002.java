package beginner;

import java.util.Scanner;

public class URI_1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * (raio * raio);
		
		System.out.println("A=" + String.format("%.4f", area));

		sc.close();
	}

}

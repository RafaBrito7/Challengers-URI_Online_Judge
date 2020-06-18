package beginner;

import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double salary = sc.nextDouble();
		double totalExtras = sc.nextDouble();
		final double comission = 0.15;
		
		double totalSalary = salary + (totalExtras * comission);
		
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", totalSalary));
		
		sc.close();
		
	}

}

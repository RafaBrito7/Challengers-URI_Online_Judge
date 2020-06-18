package beginner;

import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		double hours = sc.nextDouble();
		double priceHours = sc.nextDouble();
		
		double salary = hours * priceHours;
		
		System.out.println("NUMBER = " + id);
		System.out.println("SALARY = U$ " + String.format("%.2f", salary));
		
		sc.close();
		
	}

}

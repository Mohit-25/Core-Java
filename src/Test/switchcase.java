package Test;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two Numbers");
		System.out.print("A=");
		int a = sc.nextInt();
		System.out.print("B=");
		int b = sc.nextInt();
		System.out.println("Press 1-->Addition");
		System.out.println("Press 2-->Subtraction");
		System.out.println("Press 3-->Multiplication");
		System.out.println("Press 4-->Division");
		int Case = sc.nextInt();
		
		switch (Case) {
			case 1:
				System.out.println(a + b);
				break;
			case 2:
				System.out.println(a - b);
				break;
			case 3:
				System.out.println(a * b);
				break;
			case 4:
				System.out.println(a / b);
				break;
			default:
				System.out.println("Wrong Input-----Try Again");

			}

		

	}

}

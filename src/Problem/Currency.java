package Problem;

import java.util.Scanner;

public class Currency {

	public static int calculate(int num) {
		int sum = 0;
		if (num >= 2000) {
			int i = 0;
			i = num / 2000;
			num = num - i * 2000;
            sum=i;
		}
		if (num >= 500) {
			int i = 0;
			i = num / 500;
			num = num - i * 500;
			sum+=i;
		}
		if (num >= 200) {
			int i = 0;
			i = num / 200;
			num = num - i * 200;
			sum+=i;
		}
		if (num >= 100) {
			int i = 0;
			i = num / 100;
			num = num - i * 100;
			sum+=i;
		}
		if (num >= 50) {
			int i = 0;
			i = num / 50;
			num = num - i * 50;
			sum+=i;
		}
		if (num >= 20) {
			int i = 0;
			i = num / 20;
			num = num - i * 20;
			sum+=i;
		}
		if (num >= 10) {
			int i = 0;
			i = num / 10;
			num = num - i * 10;
			sum+=i;
		}
		if (num >= 5) {
			int i = 0;
			i = num / 5;
			num = num - i * 5;
			sum+=i;
		}
		if (num >= 2) {
			int i = 0;
			i = num / 2;
			num = num - i * 2;
			sum+=i;
		}
		if (num >= 1) {
			int i = 1;

			num = num - 1;
			sum+=i;
		}
	  return sum;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter valid number");
		int num = sc.nextInt();
		int ans=calculate(num);
		System.out.println("Notes="+ans);

	}

}


package homeworktwo;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		double f;
		double max;
		System.out.println("Input the first number");
		a = sc.nextDouble();
		System.out.println("Input the second number");
		b = sc.nextDouble();
		System.out.println("Input the third number");
		c = sc.nextDouble();
		System.out.println("Input the fourth number");
		f = sc.nextDouble();

		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (f > max) {
			max = f;
		}
		System.out.println("The largest number is " + max);
	}
}
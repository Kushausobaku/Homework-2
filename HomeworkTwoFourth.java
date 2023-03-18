package homeworktwo;

import java.util.Scanner;

public class HomeworkTwoFourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("input the first length of the triangle");
		a = sc.nextInt();
		System.out.println("input the second length of the triangle");
		b = sc.nextInt();
		System.out.println("input the third length of the triangle");
		c = sc.nextInt();

		if (a + b > c && c + b > a && a + c > b) {
			System.out.println("this triangle exist");
		} else {
			System.out.println("this triangle is not exist");
		}
	}
}
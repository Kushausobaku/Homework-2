package homeworktwo;

import java.util.Scanner;

public class HomeworkTwoTrird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("imput a year");
		a = sc.nextInt();
		if (a % 4 == 0 && a % 100 != 0) {
			System.out.println("this year is a visokostniy");
		} else {
			if (a % 400 == 0) {
				System.out.println("this year is a visokostniy");
			} else {
				System.out.println("this year is not a visokostniy");
			}
		}
	}
}
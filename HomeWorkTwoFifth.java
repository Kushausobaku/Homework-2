package homeworktwo;

import java.util.Scanner;

public class HomeWorkTwoFifth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1;
		int y1;
		int r = 4;
		System.out.println("Input x1 coordinate");
		x1 = sc.nextInt();
		System.out.println("Input y1 coordinate");
		y1 = sc.nextInt();

		if (x1 * x1 + y1 * y1 <= r * r) {
			System.out.println("those coordinate are inscribed in a circle (" + x1 + "," + y1 + ")");
		} else {
			System.out.println("those coordinate are not inscribed in a circle");
		}
	}
}
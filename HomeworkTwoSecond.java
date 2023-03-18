package homeworktwo;

import java.util.Scanner;

public class HomeworkTwoSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 144;
		int f=4;
		int s=8;
		int t=12;
		int fo=16;
		int fi=20;
		int si=24;
		int se=28;
		int ei=32;
		int ni=36;
		int fe=36;
		int see=72;
		int te=108;
		int foe=144;
		int re;
		int num;
		int noroom=0;
		int feff; //first entrence and the first flor
		System.out.println("Input apartment num");
		num = sc.nextInt();
		
		if (num>144 || num<1) {
			System.out.println("There is no apartments with this number " +num);
		} else {
			if (num<5 && num>0) {
				System.out.println("Your room is on the first floor in the first entrance. Number of your room is " +num);
			}
			if (num<9 && num>4) {
				System.out.println("Your room is on the second floor in the first entrance. Number of your room is " +num);
		}
			if (num<13 && num>8) {
				System.out.println("Your room is on the third floor in the first entrance. Number of your room is " +num);
			}
			if (num<17 && num>12) {
				System.out.println("Your room is on the fourth floor in the first entrance. Number of your room is " +num);
			}
		
		}
	}
	}


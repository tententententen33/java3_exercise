package exercise;

import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
//		int num = 1;
//		while(num > 1) {
//			System.out.println("ww1より大きい");
//		}
//		do {
//			System.out.println("1より大きい");
//		}while(num > 1);
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("1.開始　2.終了");
//			int n = sc.nextInt();
//			if (n == 2) {
//				System.out.println("終了するよー");
//				break;
//			}
//			
//		}
		int number;
		do {
			System.out.println("1.開始　2.終了");
			number = sc.nextInt();
		}while(number != 2);
		
		sc.close();
		
	}
}

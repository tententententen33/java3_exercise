package exercise;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("年齢を入力してください");
			int age = sc.nextInt();
			if (age >= 0 && age <= 10) {
				System.out.println("あなたは子供です");
			} else if (age <= 30) {
				System.out.println("一番楽しい時期です");
			} else if (age <= 60) {
				System.out.println("お仕事お疲れさまでした");
			} else if (age <= 100) {
				System.out.println("楽しい人生でした");
			} else {
				System.out.println("無効な年齢です");
			}
		}
		sc.close();
	}
}

import java.util.Scanner;

public class Hairetu1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("メニュー数を入力してください");
		int num = sc.nextInt();
		
		System.out.println("何の店にしますか？");
		String store = sc.next();
		System.out.println(store + "店ですね");
		
		String[] menuList = new String[num];
		for (int i = 0; i < menuList.length; i++) {
			System.out.println(i + 1 + "つ目の商品名を入力してください。");
			menuList[i] = sc.next();
		}
		System.out.println("----------" + store + "店----------");
		for (int i = 0; i < menuList.length; i++) {
			System.out.println(i + 1 + "番目" + menuList[i]);
		}
		sc.close();
	}

}

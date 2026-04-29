package skillUp;

import java.util.Scanner;

public class UserInterface {
	private PurchaseManager manager;

	public UserInterface(PurchaseManager manager) {
		this.manager = manager;
	}

	public void start() {
		Scanner sc = new Scanner(System.in);

		manager.showProducts();

		System.out.print("購入する商品の番号を選んでください: ");
		int choice = sc.nextInt();

		Product selectedProduct = manager.selectProduct(choice);

		if (selectedProduct == null) {
			System.out.println("その番号の商品はありません。");
			sc.close();
			return;
		}

		System.out.print(selectedProduct.getName() + "を何個購入しますか？: ");
		int count = sc.nextInt();

		boolean result = manager.purchase(selectedProduct, count);

		if (result) {
			int total = selectedProduct.getPrice() * count;
			System.out.println(selectedProduct.getName() + "を" + count + "個購入しました。");
			System.out.println("合計金額: " + total + "円");
			System.out.println("残り在庫: " + selectedProduct.getStock() + "個");
		} else {
			System.out.println("購入できませんでした。");
			System.out.println("購入数または在庫数を確認してください。");
		}

		sc.close();
	}
}
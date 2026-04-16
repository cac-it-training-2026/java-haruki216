package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 550, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];
		int[] stocks = new int[5];

		// TODO: 実装ここから

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {

			System.out.print(itemNames[i] + "の在庫数：＞");
			String str = reader.readLine();
			int stock = Integer.parseInt(str);
			stocks[i] = stock;
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数：＞");
			String str2 = reader.readLine();
			int amount = Integer.parseInt(str2);
			if (amount > stocks[i]) {
				System.err.println("在庫を超えています、もう一度入力してください");
				System.out.print(itemNames[i] + "の購入数：＞");
				str2 = reader.readLine();
				amount = Integer.parseInt(str2);
			}
			amounts[i] = amount;
		}

		int totalPrice = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":購入" + amounts[i] + "個");
			System.out.println("在庫" + stocks[i] + "個");
			totalPrice += prices[i] * amounts[i];
		}
		System.out.println("\n合計金額：" + totalPrice + "円");

	}
}

package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 550, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数：＞");
			String str2 = reader.readLine();
			int amount = Integer.parseInt(str2);
			amounts[i] = amount;
		}
		int totalPrice = 0;

		for (int i = 0; i < 5; i++) {
			totalPrice += prices[i] * amounts[i];
		}

		int offtotal = (int) (totalPrice * 0.9);

		if (totalPrice >= 5000) {
			System.out.println("割引前合計：" + totalPrice + "円");
			System.out.println("割引適用（10％OFF）:" + offtotal + "円");
			System.out.println("税込合計：" + (int) (totalPrice * 1.1) + "円");
		} else {
			System.out.println("割引前合計：" + totalPrice + "円");
			System.out.println("割引なし");
			System.out.println("税込合計：" + (int) (totalPrice * 1.1) + "円");

		}

	}

}

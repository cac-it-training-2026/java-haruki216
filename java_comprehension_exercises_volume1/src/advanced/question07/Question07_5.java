package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		double tax = 1.1;
		double discount = 0.9;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の購入数：＞");
			String str2 = reader.readLine();
			int amount = Integer.parseInt(str2);
			amounts[i] = amount;
		}

		//税込み合計
		int total = 0;
		System.out.println("\n購入内容一覧：");
		for (int i = 0; i < 5; i++) {
			int priceWithTax = (int) (prices[i] * 1.1);
			int subtotal = priceWithTax * amounts[i];
			System.out.println(
					itemNames[i] + ";単価" + prices[i] + "円(税込" + priceWithTax + "円" + "×" + amounts[i] + "個＝" + subtotal
							+ "円");
			total += subtotal;
		}

		if (total >= 5000) {
			int discountedtotal = (int) (total * 0.9);
			System.out.println("税込合計：" + total + "円");
			System.out.println("割引後合計（税込）:" + discountedtotal + "円");
		} else {

			System.out.println("税込合計：" + total + "円");

		}
	}
}
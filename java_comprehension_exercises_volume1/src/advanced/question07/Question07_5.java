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

		int taxtotal = (int) (totalPrice * 1.1);
		int offtotal = (int) (taxtotal * 0.9);

		System.out.println("\n購入内容一覧：");
		for (int i = 0; i < 5; i++) {
			System.out.println(
					itemNames[i] + ";単価" + prices[i] + "円(税込" + (int) (prices[i] * 1.1) + "円" + "×" + amounts[i]
							+ "個＝" + (amounts[i] * (int) (prices[i] * 1.1)) + "円");
		}
		System.out.println("合計(税込):" + (int) (totalPrice * 1.1) + "円");
		System.out.println("割引後合計（税込）:" + offtotal + "円");
	}
}
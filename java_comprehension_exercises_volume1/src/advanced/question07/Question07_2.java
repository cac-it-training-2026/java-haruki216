package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 };

		// TODO: 実装ここから
		int[] amounts = new int[5];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 5; i++) {

			System.out.print(itemNames[i] + "の購入数：＞");
			String str = reader.readLine();
			int amount = Integer.parseInt(str);
			amounts[i] = amount;
		}

		int totalprice = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[i] + ":" + (amounts[i] * prices[i]) + "円");

			totalprice += amounts[i] * prices[i];
		}
		System.out.println("合計金額：" + totalprice);

	}
}

package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] itemNames = new String[5];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.print("商品" + (i + 1) + "を入力してください：＞");
			String str = reader.readLine();
			itemNames[i] = str;
		}

		System.out.println("\n各商品の単価を順に入力してください");
		int[] prices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames[i] + "の単価：＞");
			String strp = reader.readLine();
			int price = Integer.parseInt(strp);
			prices[i] = price;
		}

		System.out.println("登録商品一覧");
		for (int i = 0; i < 5; i++) {
			System.out.println(itemNames[1] + ":" + prices[i] + "円");
		}
	}

}

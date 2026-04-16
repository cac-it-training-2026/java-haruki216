package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装

		int amountBooks = 0;
		int sellFalgs = 0;
		int bookPrice = 200;

		System.out.println("本を売却します。");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			amountBooks++;
			System.out.println("売却する本の冊数を1つ増やしますか？");
			System.out.println("はい：0、いいえ：1＞");
			String sell = reader.readLine();
			sellFalgs = Integer.parseInt(sell);

		} while (sellFalgs == 0);

		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + amountBooks * bookPrice + "円です。");
	}

}

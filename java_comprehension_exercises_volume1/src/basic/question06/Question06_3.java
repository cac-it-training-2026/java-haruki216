package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装

		int amount = 0;
		int price = 100;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("鉛筆を購入しますか？");
		System.out.print("はい：0、いいえ：1＞");
		String buy = reader.readLine();
		int buyFlag = Integer.parseInt(buy);

		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の本数を1つ増やしますか？");
			System.out.print("はい：0、いいえ：1＞");
			buy = reader.readLine();
			buyFlag = Integer.parseInt(buy);

		}
		System.out.println("購入した鉛筆の本数は" + amount + "本です。");
		System.out.println("購入した鉛筆の合計金額は" + amount * price + "です。");

	}

}

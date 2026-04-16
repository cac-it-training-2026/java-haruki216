package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("商品の名前と値段を入力してください。");
		String itemName = reader.readLine();

		String price = reader.readLine();
		int itemPrice = Integer.parseInt(price);

		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の値段は" + itemPrice + "です。");
	}
}

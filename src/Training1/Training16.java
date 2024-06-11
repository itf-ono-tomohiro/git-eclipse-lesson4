package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training16 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-12
		System.out.println("好きな鮨を選択してください。選択は、1：まぐろ　2：えび　3：こはだ　4：サーモン　5：いか　6：貝　7：えんがわ");
		int sushi = Integer.parseInt(br.readLine());	
		
		switch(sushi) {
		case 1:
			System.out.println("小吉");
			break;
		case 2:
			System.out.println("大吉！！！");
			break;
		case 3:
			System.out.println("中吉");
			break;
		case 4:
			System.out.println("吉");
			break;
		case 5:
			System.out.println("末吉");
			break;
		case 6:
			System.out.println("大凶");
			break;
		case 7:
			System.out.println("凶");
			break;
		}
		
	}

}

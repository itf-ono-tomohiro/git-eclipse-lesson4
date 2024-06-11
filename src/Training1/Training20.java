package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training20 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-6
		int victory = 0;
		
		for(int i = 0; i < 10; i++ ) {
			System.out.println("0か1を入力してください");
			int value = Integer.parseInt(br.readLine());
			if (value == 1) {
				victory++;
			}
		}
		
		System.out.println("勝ちの総数は" + victory);
		System.out.println("負けの総数は" + (10 - victory));
		
	}

}

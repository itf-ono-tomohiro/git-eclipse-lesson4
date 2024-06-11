package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training30 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-16
		System.out.println("2以上の数字を入力してください。");
		int value = Integer.parseInt(br.readLine());
		
		for (int n = 2; value > 1; n++) {
			while (value % n == 0 ) {
				System.out.println(n + " ");
				value /= n;
			}
			
		}
		
		
		
		
	}

}

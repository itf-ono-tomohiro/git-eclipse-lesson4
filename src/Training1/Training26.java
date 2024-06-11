package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training26 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-12
		int sum = 0;
		
		while (sum < 100) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
		}
		System.out.println("合計値は" + sum + "です。");
		
		
	}

}

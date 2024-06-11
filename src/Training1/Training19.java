package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training19 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-5
		int sum = 0;
		for(int i = 0; i < 10; i++ ) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
		}
		System.out.println("平均は" + sum/10);
		
	}

}

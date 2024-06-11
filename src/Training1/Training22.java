package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training22 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-8
		int x = 0;
		for(int i = 0; i < 10; i++ ) {
			int y = Integer.parseInt(br.readLine());
			if(x < y) {
				x = y;
			}
		}
		
		System.out.println("最大値は" + x + "です。");
	}

}

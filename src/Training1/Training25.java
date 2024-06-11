package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training25 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-11
		int num = Integer.parseInt(br.readLine());
		
		for (int i = 0,out = 0; i < num; i++) {
			System.out.println(out++);
			
			if (out > 9) {
				out = 0;
			}
		}
		
		
	}

}

package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training24 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-10
		int num = Integer.parseInt(br.readLine());
		
		while(num > 0) {
			System.out.println("*");
			num--;
		}
		
	}

}

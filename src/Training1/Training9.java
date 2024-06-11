package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training9 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-5
		int x = Integer.parseInt(br.readLine());	
		
		
		if( x % 2 == 0) {
			System.out.println( x + "は偶数です。");
		} else {
			System.out.println(x + "は奇数です。");
		} 
		
	}

}

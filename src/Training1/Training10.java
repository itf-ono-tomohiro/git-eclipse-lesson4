package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training10 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-6
		int x = Integer.parseInt(br.readLine());	
		
		
		if( x % 2 == 0) {
			if ( x >= 0) {
				System.out.println( x + "は正の偶数です。");
			} else {
				System.out.println( x + "は負の偶数です。");
			}
			
		} else {
			if ( x >= 0) {
				System.out.println( x + "は正の奇数です。");
			} else {
				System.out.println( x + "は負の奇数です。");
			}
			
		} 
		
	}

}

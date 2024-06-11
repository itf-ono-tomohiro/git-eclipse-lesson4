package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-1
		int x = Integer.parseInt(br.readLine());	
		int y = Integer.parseInt(br.readLine());	
		
		if( x > y) {
			System.out.println(x + "は" + y + "より大きい。");
		} 
		
	}

}

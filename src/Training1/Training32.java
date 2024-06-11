package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training32 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-18
		int sum = 0;
		
		for ( ; ; ) {
			int value = Integer.parseInt(br.readLine());
			
			if(value == 0) {
				break;
			}
			sum += value;
			}
		
		System.out.println("合計は" + sum);
		
	}

}

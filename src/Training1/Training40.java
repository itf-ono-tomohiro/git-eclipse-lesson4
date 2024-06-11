package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training40 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題5-4
		int values[] = new int[10];
		int sum,i;
		
		for ( i = 0,sum = 0; i < 10 && sum <= 100; i++) {
			values[i] = Integer.parseInt(br.readLine());
			sum += values[i];
		}
		
		for (int n = 0; n < i; n++) {
			System.out.println("\n" + values[n]);
		}
		
		
	}
}

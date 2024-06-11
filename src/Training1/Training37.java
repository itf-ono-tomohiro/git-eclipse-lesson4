package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training37 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題5-1
		int[] array = new int[10];
		
		for ( int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(br.readLine());
			System.out.println();
		}
		
		for(int n : array) {
			System.out.println(n*2);
		}
	}
}

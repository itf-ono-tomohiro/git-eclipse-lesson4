package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training44 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題5-8
		int values[] = new int[10];

		//配列に値を代入
		for (int i = 0; i <= 9; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}
		
		//配列を小さい順に並び変える
		for (int i = 0; i <= 9; i++) {
			for(int j = i + 1; j < 10; j++ ) {  
				if(values[i] > values[j]) {
					int t = values[i];
					values[i] = values[j];
					values[j] = t;
				}
			}
		}
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(values[i] + " ");
		}
	}
}

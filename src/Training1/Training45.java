package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Training45 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題5-8(別解)
		int values[] = new int[10];

		//配列に値を代入
		for (int i = 0; i <= 9; i++) {
			values[i] = Integer.parseInt(br.readLine());
		}
		
		//配列を小さい順に並び変える
		Arrays.sort(values);
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(values[i] + " ");
		}
	}
}

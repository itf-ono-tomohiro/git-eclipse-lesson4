package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training39 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題5-3
		int[] array = new int[10];
		
		for ( int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(br.readLine());
			System.out.println();
		}
		
		System.out.print("偶数：");
		for(int i = 0; i < 10; i++) {
			if(array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("");
		System.out.print("奇数：");
		for(int i = 0; i < 10; i++) {
			if(array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
			}
		}
	}
}

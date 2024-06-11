package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training31 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-17
		for (int y = 1; y <= 9; y++) {
			for(int x = 1; x <= 9; x++) {
				System.out.printf("%2d", x*y);
			}
			System.out.println();
			
		}
	}

}

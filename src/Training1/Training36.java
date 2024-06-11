package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training36 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-22
		int n1 = 0;
		int n2 = 1;
		int n3 = n1+ n2;
		
		while( n1 < 1000) {
			System.out.print(n1 + ",");
			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
		}
	}
}

package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training29 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-15
		System.out.println("2以上の数字を入力してください。2");
		int value = Integer.parseInt(br.readLine());
		int n;
		boolean isPrime = true;
		
		for (n = 2; n < value; n++) {
			if((value % n == 0)) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(value + "は、素数です。");
		} else {
			System.out.println(value + "は、素数ではありません。");
		}
		
		
	}

}

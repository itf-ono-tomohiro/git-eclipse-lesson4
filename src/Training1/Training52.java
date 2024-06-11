package Training1;

import java.io.IOException;

//練習問題6-7
public class Training52 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		for (int n = 10000; n < 10100; n++) {
			if(isPrimeNum(n)) {
				System.out.println(n + " ");
			}
		}

	}
	
	static boolean isPrimeNum(int num) {
		if(num <= 3) {
			return true;
		}
		for(int i = 2; i <= (num/2); i++) {
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}

}

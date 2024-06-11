package Training1;

import java.io.IOException;

//練習問題6-7
public class Training53 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		for (int n = 11; n <= 20; n++) {
			System.out.println(Fibonacci(n) + " ");
		}

	}
	
	static int Fibonacci(int n) {
		if( n == 0 ) {
			return 0;
		}else if (n == 1) {
			return 1;
		}else {
			return Fibonacci( n -2 ) + Fibonacci( n-1 );  
		}
	}

}

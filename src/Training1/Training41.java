package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training41 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題5-5
		int value = Integer.parseInt( br.readLine() );

		int binary[] = new int[16];

		/* 10進数の数値を「 0 」になるまで「 2 」で割り算していき、
		*その結果の「余りの数 」を並べることで ある10進数の値を
		*2進数の値へ変換することができる
		*/
		// 配列 binaryに0か1を代入する
		for(int i = 15; i >= 0; i--,value /= 2) {
			binary[i] = value % 2;
		}
		
		for( int i = 0 ; i < 16 ; i++ ) {
			System.out.print( binary[i] );
		}
		    
		
		
	}
}

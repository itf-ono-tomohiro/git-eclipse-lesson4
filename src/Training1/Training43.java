package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training43 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題5-7
		int kuku[][] = new int[9][9];

		// 配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++ )
		{
		    for( int j = 0 ; j < 9 ; j++ )
		        kuku[i][j] = (i+1) * (j+1);
		}

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		System.out.println(kuku[x-1][y-1]);
		   
	}
}

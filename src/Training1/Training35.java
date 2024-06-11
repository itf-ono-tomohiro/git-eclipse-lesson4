package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training35 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-21
		int size = Integer.parseInt(br.readLine());;
		
		
		for ( int i = 0; i < size; i++ ) {
			for (int j = 0; j < size; j++) {
				if( i == j || (size - i - 1) == j) {
					System.out.print("X");
				}else {
					System.out.print( " " );
				}
				System.out.println( "" );
			}
			
		}
		
	}

}

package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題2-5
		int x = Integer.parseInt(br.readLine());	
		int y = Integer.parseInt(br.readLine());	
		
		System.out.println("平均値=" + ((x + y)/2));
		


	}

}

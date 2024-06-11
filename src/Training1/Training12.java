package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training12 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-8
		int score1 = Integer.parseInt(br.readLine());	
		int score2 = Integer.parseInt(br.readLine());	
		
		// ケース1
		if (( score1 >= 60 && score2 >= 60) || ((score1 + score2) >= 130) ) {
			System.out.println("合格");
		} else if (((score1 + score2) >= 100) && (score1 >= 90 || score2 >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}

}

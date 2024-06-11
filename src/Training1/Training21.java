package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training21 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-7
		int giantsScores = 0;
		int tigersScores = 0;
		
		for(int i = 1; i <= 9; i++ ) {
			System.out.println(i + "回表、巨人の攻撃は？");
			int giantsScore = Integer.parseInt(br.readLine());
			giantsScores += giantsScore;
			System.out.println(i + "回裏、阪神の攻撃は？");
			int tigersScore = Integer.parseInt(br.readLine());
			tigersScores += tigersScore;
		}
		
		System.out.println("巨人:" + giantsScores + "点，阪神:" + tigersScores + "点" );
		if (giantsScores > tigersScores) {
			System.out.println("巨人の勝ち");
		} else if(giantsScores < tigersScores) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分けです。");
		}
		
		
	}

}

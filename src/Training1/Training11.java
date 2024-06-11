package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training11 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-7
		int x = Integer.parseInt(br.readLine());	
		
		// ケース1
		if (x >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		// ケース2
		if (x >=80) {
			System.out.println("大変よくできました");
		} else if (x >= 60){
			System.out.println("よくできました。");
		} else {
			System.out.println("ざんねんでした。");
		}
		
		// ケース3
		if (x >=80) {
			System.out.println("優");
		} else if (x >= 70){
			System.out.println("良");
		} else if (x >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

}

package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training4 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題2-6
		System.out.println("あなたの年齢は？");
		int age = Integer.parseInt(br.readLine());	
		
		System.out.println("生まれてから現在まで、およそ" + (age*365) + "日です。");
	}

}

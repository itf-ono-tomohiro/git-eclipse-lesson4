package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training23 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-9
		int maxValue = Integer.parseInt(br.readLine());
		int minValue = maxValue;
		for(int i = 0; i < 10; i++ ) {
			int value = Integer.parseInt(br.readLine());
			if(maxValue < value) {
				maxValue = value;
			} 
			if(minValue > value) {
				minValue = value;
			}
		}
		
		System.out.println("最大値は" + maxValue + "です。");
		System.out.println("最小値は" + minValue + "です。");
	}

}

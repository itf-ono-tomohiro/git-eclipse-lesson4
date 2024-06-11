package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training27 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題4-13
		int strike = 0;
		int ball =0;
		
	
		while(strike < 3 && ball< 4) {
			System.out.println("ストライク=1 or ボール=2 ?");
			
			int judge = Integer.parseInt(br.readLine());
			
			if (judge == 1) {
				strike +=1;
			} else if (judge == 2) {
				ball +=1;
			}
		}
		
		System.out.println(ball + "ボール," + strike + "ストライク");
		
	}

}

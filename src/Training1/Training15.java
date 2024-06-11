package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training15 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-11
		System.out.println("何月の祝日が知りたいですか？");
		int month = Integer.parseInt(br.readLine());	
		
		switch(month) {
		case 1:
			System.out.println("元日、成人の日です。");
			break;
		case 2:
			System.out.println("建国記念の日です。");
			break;
		case 3:
			System.out.println("春分の日です。");
			break;
		case 4:
			System.out.println("昭和の日です。");
			break;
		case 5:
			System.out.println("憲法記念日、みどりの日、こどもの日です。");
			break;
		case 6:
		case 7:
			System.out.println("海の日です。");
			break;
		case 8:
		case 9:
			System.out.println("敬老の日、秋分の日です。");
			break;
		case 10:
			System.out.println("体育の日です。");
			break;
		case 11:
			System.out.println("文化の日、勤労感謝の日です。");
			break;
		case 12:
			System.out.println("天皇誕生日です。");
			break;
		}
		
	}

}

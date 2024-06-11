package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training13 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-9
		System.out.println("曜日を入力してください0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = Integer.parseInt(br.readLine());	
		System.out.println("時間帯を入力してください0=午前、1=午後、2=夜間");
		int time = Integer.parseInt(br.readLine());	
		
		if (day == 0) {
			System.out.println("休診") ;
		} else if (day == 1 || day == 4) {
			System.out.println("病院は開いています。") ;
		} else if (day == 2 || day == 5) {
			if (time == 0) {
				System.out.println("休診") ;
			} else {
				System.out.println("病院は開いています。");
			}
		} else if (day == 3) {
			if (time == 2) {
				System.out.println("休診") ;
			} else {
				System.out.println("病院は開いています。");
			}
		} else {
			if (time == 0) {
				System.out.println("病院は開いています。");
			} else {
				System.out.println("休診") ;
			}
		}
		
		
	}

}

package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		// 練習問題2-1
		String s = br.readLine();
		System.out.println(s);
		
		// 練習問題2-2
		int x = Integer.parseInt(br.readLine());	
		System.out.println(x);
		
		// 練習問題2-3
		int x2 = Integer.parseInt(br.readLine());	
		System.out.println(x2);
		System.out.println(x2 * x2);
		System.out.println(x2 * x2 * x2);
		
		// 練習問題2-4
		int x3 = Integer.parseInt(br.readLine());	
		int y3 = Integer.parseInt(br.readLine());	
		
		System.out.println("和" + (x3 + y3));
		System.out.println("差" + (x3 - y3));
		System.out.println("積" + (x3 * y3));
		System.out.println("商" + (x3 / y3));
		System.out.println("余り" + (x3 % y3));


	}

}

package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//練習問題6-3
public class Training48 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		
		System.out.println(compare(x,compare(y,z)));


	}
	
	static int compare(int n1,int n2) {
		if(n1 > n2) {
			return n1; 
		} else {
			return n2;
		}
	}

}

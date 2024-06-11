package Training1;

import java.io.IOException;

//練習問題6-4
public class Training49 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		triangle(3);
		System.out.println();
		triangle(4);
		System.out.println();
		triangle(5);


	}
	
	static void triangle(int x) {
		for (int i = 0; i < x; i++ ) {
			for(int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
		
	}

}

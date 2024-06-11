package Training1;

import java.io.IOException;

//練習問題6-5
public class Training50 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		triangle(3, '%');
		System.out.println();
		triangle(4,'!');
		System.out.println();
		triangle(5,'$');


	}
	
	static void triangle(int size, char ch) {
		for (int i = 0; i < size; i++ ) {
			for(int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

}

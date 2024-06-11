package Training1;

import java.io.IOException;

//練習問題6-6
public class Training51 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		
		for (int i = 1; i < 10; i++) {
			kuku(i);
			System.out.println();
		}

	}
	
	static void kuku(int x) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%2d", x * i);
		}
		System.out.println();
		
	}

}

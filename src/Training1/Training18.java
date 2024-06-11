package Training1;

public class Training18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 練習問題4-1
		for (int i = 0; i < 10; i++) {
			System.out.println("SPAM");
		}
		
		//練習問題4-2
		for (int i = 1; i < 10; i++) {
			System.out.println(i*3);
		}
		
		//練習問題4-3
		int x = 1;
		for (int i = 1; i <= 8; i++) {
			x *= 2;
			System.out.println("2の" + i + "乗=" + x);
		}
		
		//	練習問題4-4
		int x2 = 1;
		for (int i = 2; i <= 7; i++) {
			x2 *= i;
		}
		System.out.println(x2);
		
	}

}

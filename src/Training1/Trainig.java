package Training1;

public class Trainig {

	public static void main(String[] args) {
		// 練習問題1-1
		System.out.println("Hello World");
		
		//練習問題1-2
		int x = 11;
		System.out.println("x=" + x);
		
		//練習問題1-3
		int x2 = 13;
		int y2 = 17;
		System.out.println("x2=" + x2 + ",y2=" + y2 );
		
		//練習問題1-4
		int x3 = 13 + 17;
		System.out.println("x3=" +x3);
		
		//練習問題1-5
		System.out.println(13*17);
		
		//練習問題1-6
		int x4 = 7;
		x4 *= 3;
		System.out.println("x4=" + x4);
		x4 /= 2;
		System.out.println("x4=" + x4);
		
		// 練習問題1-7
		int x5 = 3;
		int y5 = 7;
		int t;
		
		t = x5;
		x5 = y5;
		y5 = t;
		
		System.out.println("x5=" + x5 + ",y5=" +y5);
		
		// 練習問題1-8
		int x6,y6,z6;
		
		x6 = 19;
		y6 = 23;
		z6 = x6 * y6;
		System.out.println("z6=" + z6);
	
		
		// 練習問題1-9
		int x7 = 10;
		
		System.out.println(x7 * 2);
		System.out.println(x7 * 3);
		System.out.println(x7 * 4);
		
		//練習問題1-10
		int x8 = 10;
		
		System.out.println(x8); 
		System.out.println(x8 * x8);
		System.out.println(x8 * x8 * x8);
		
		// 練習問題1-11
		int x9 = 25;
		
		System.out.println("商:" + x9 / 2 + ",余り:" + x9 % 2 );
		
		//練習問題1-12
		int x10 = 10;
		
		x10++;
		System.out.println(x10);
		x10--;
		x10--;
		x10--;
		System.out.println(x10);
		

	}

}

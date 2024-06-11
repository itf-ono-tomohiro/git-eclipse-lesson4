package Training1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Training17 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		// 練習問題3-13
		System.out.println("何月の日数が知りたいですか？");
		int month = Integer.parseInt(br.readLine());	
		
		switch(month) {
		case 1:
			System.out.println("31日です。");
			break;
		case 2:
			System.out.println("28日です。");
			break;
		case 3:
			System.out.println("31日です。");
			break;
		case 4:
			System.out.println("30日です。");
			break;
		case 5:
			System.out.println("31日です。");
			break;
		case 6:
			System.out.println("30日です。");
			break;
		case 7:
			System.out.println("31日です。");
			break;
		case 8:
			System.out.println("31日です。");
			break;
		case 9:
			System.out.println("30日です。");
			break;
		case 10:
			System.out.println("31日です。");
			break;
		case 11:
			System.out.println("30日です。");
			break;
		case 12:
			System.out.println("31日です。");
			break;
		default:
			System.out.println("入力が間違っています");
			break;
		}
		
		/*　模範解答
		 * BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );

			System.out.println( "何月ですか？" );
			int month = Integer.parseInt( br.readLine() );
			
			switch( month )
			{
			    case 2:
			        System.out.println( "28日です" );
			        break;
			    case 4:
			    case 6:
			    case 9:
			    case 11:
			        System.out.println( "30日です" );
			        break;
			    case 1:
			    case 3:
			    case 5:
			    case 7:
			    case 8:
			    case 10:
			    case 12:
			        System.out.println( "31日です" );
			        break;
			    default:
			        System.out.println( "入力が間違っています" );
			        break;
			}
		 */
		
	}

}

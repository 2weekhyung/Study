/*=========================================
	■■■ 연산자(Operator) ■■■
	- 조건 연산자 == 삼항 연산자
=========================================*/

// 사용자로부터의 임의의 문자 하나를 입력받아
// 알파벳 대문자이면 소문자로...
// 알파벳 소문자이면 대문자로...
// 알파벳이 아닌 기타 문자라면 그 문자를 그대로...
// 출력하는 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 7
// 7 → 7
// 계속하려면 아무 키나 누르세요...

/*
											알파벳 대문자도 소문자도 아닌 상황

알파벳대문자 ? 알파벳소문자로변환 : (알파벳소문자 ? 알파벳대문자로변환 : 있는그대로);
									-------------	------------------	 -----------
------------	-----------------	------------------------------------------------
	1					2								3
*/
import java.io.*;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int i;
		int b;
		char c;

		System.out.print("한 문자 입력 : ");
		i = br.read();
		
		b = (65 <= i && i <= 90) ? (i + 32) : ((97 <= i && i <= 122) ? (i -32) : (i));
		c = (char)b;

		System.out.printf("%c → %c\n", (char)i, c);
		

		char temp;

		System.out.print("한 문자 입력 : ");
		temp = (char)System.in.read();

		//System.out.println("입력받은 값 확인 : " + temp);

		// 대문자? 대문자 아님?
		// temp == 'A' → 65
		// temp == 'B' → 66
		// temp == 'C' → 67
		//	:
		// temp == 'Z' → 90

		//String result = temp >=65 && temp <=90 ? "대문자" : "대문자아님";
		//System.out.println("결과 : " + result);
		
		//String result = temp >='A' && temp <='Z' ? "대문자" : "대문자아님";
		//System.out.println("결과 : " + result);

		//String result = temp >='a' && temp <='z' ? "소문자" : "소문자아님";
		//System.out.println("결과 : " + result);

		// 대문자 → 소문자
		// 'A'(65) → 'a'(97)  ==>> +32
		// 'B'(66) → 'b'(98)  ==>> +32
		// 'C'(67) → 'c'(99)  ==>> +32
		//		:
		// 'Z'(90) → 'z'(122)  ==>> +32

		// 소문자 → 대문자
		// 'a'(97) → 'A'(65)  ==>> -32
		// 'b'(98) → 'B'(66)  ==>> -32
		// 'c'(99) → 'C'(67)  ==>> -32
		//		:
		// 'z'(122) → 'Z'(90)  ==>> -32
		*/

		char ch, result;
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		// result = () ? () : ();
		// result = (입력값대문자) ? (소문자로변환) : (입력값 소문자?) ? (대문자로변환) : (그대로);

		result = (ch>='A'&&ch<='Z') ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);

		// 'Q' (→ 81)
		// result = (81>=65&&ch<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&81<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = ((char)(81+32))
		// result = ((char)(113))
		// result = 'q'

		// 'm' (→ 109)
		// result = (109>=65&&ch<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&ch<=90) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&flase) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (109>='97'&&109<='z') ? ((char)(ch-32)) : (ch);
		// result = (true&&109<=122) ? ((char)(ch-32)) : (ch);
		// result = (true&&true) ? ((char)(ch-32)) : (ch);
		// result = ((char)(109-32))
		// result = ((char)(77))
		// result = 'M';

		// '8' (→ 56)
		// result = (56>='65'&&ch<='Z') ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase&&ch<='Z') ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase) ? ((char)(ch+32)) : (ch>='a'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (56>='97'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase'&&ch<='z') ? ((char)(ch-32)) : (ch);
		// result = (flase) ? ((char)(ch-32)) : (ch);
		// result = (ch);
		// result = '8';

		System.out.println(ch + " → " + result);
		




	}
}

// 실행 결과
/*

한 문자 입력 : 1
1 → 1
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : A
A → a
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : a
a → A
계속하려면 아무 키나 누르십시오 . . .

*/

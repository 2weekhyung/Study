/*=========================================
	■■■ 자바의 기본 프로그래밍 ■■■
	- 변수와 자료형
	- 자바의 기본 입출력 : System.in.read
=========================================*/

/*
『System.in.read()』 메소드는 (입력 대기열로부터) 한 문자만 가져온다.
단, 입력받은 하난의 문자를 문자 그대로 가져오는 것이 아니라
ASCII Code 값(정수 형태)으로 반환하게 된다.
*/

// 실행 예)
// 한 문자 입력 : A
// 한 자리 정수 입력 : 9

// >> 입력한 문자 : A
// >> 입력한 정수 : 9
// 계속하려면 아무 키나 누르세요...


import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{	/*
		// 주요 변수 선언
		char ch;	//-- 문자

		
		// 연산 및 처리
		System.out.print("문자 하나 입력하세요 : ");		// A
		ch = (char)System.in.read();						// 65
		//          -----------------
		//					65


		// 결과 출력
		System.out.println(ch);
		*/

		char ch;		//-- 입력받은 문자를 담을 변수
		int num;		//-- 입력받은 정수를 담을 변수

		// 변수 추가 선언
		//char temp;		//-- 임시로 테스트할 변수

		//연산 및 처리
		// - 사용자에게 안내 메세지 출력

		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		
		// check~!!!
		// ※ 입력 대기열에 남아있는 『\r』 과 『\n』 을 스킵(건너뛰기)
		System.in.skip(2);
		//-- 매개변수(2)에 의해 두 글자를 읽어내지 않고 건너뛴다.(버린다.)

		System.out.print("한 자리 정수 입력 :");
		//num = System.in.read();
		//temp = (char)System.in.read();

		num = System.in.read();
		// 1 → 49
		// 2 → 50
		// 3 → 51
		//   :
		// 9 → 57

		// 입력받은 n의 값을 48만큼 감소시켜라~!!!

		num -= 48;

		System.out.println();

		System.out.println(">> 입력한 문자 : " + ch);
		//System.out.println(">> 입력한 정수 : " + num);
		//System.out.println(">> 입력한 정수 : " + temp);

		System.out.println(">> 입력한 정수 : " + num);
		
		
		
				


	}
}

//실행 결과

/*
한 문자 입력 : A
한 자리 정수 입력 :9

>> 입력한 문자 : A
>> 입력한 정수 : 9
계속하려면 아무 키나 누르십시오 . . .
*/
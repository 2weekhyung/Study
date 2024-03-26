/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- swtitch문 실습
=========================================*/
/*
○ 다중 선택문 이라 하며, switch 문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다

○ 형식 및 구조
	switch(수식)
	{
		case 상수1 : 문장1; [break;]
		case 상수2 : 문장2; [break;]
				:
		[default : 문장n+1; [breakk;]
	}

	switch 문의 『수식』과 case의 『상수』는
	byte, short, int, long 형이어야 한다.
	(+문자 타입 char)
	(+문자열 타입 String)

	case 문 뒤에 『break;』가 없는 형태인 경우
	다음 case 문의 문장을 계속해서(이어서) 수행하게 된다. (→ 기본 모델)
	『break;』가 존재할 경우
	해당 지점에서 수행을 멈춘 후 swtich 문을 빠져나간다. (→ 일반 모델)
*/

// 사용자로부터 1 부터 3 까지의 정수 중 하나를 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두가지 방법으로 구현할 수 있도록 한다.

// ① switch 문의 일반 모델을 사용하여 구현한다.
// ② switch 문의 기본 모델을 사용하되,
//	  『break』를 닥 한번만 사용할 수 있도록 구현한다.

// 실행 예
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나 누르세요.

// 실행 예
// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나 누르세요.

// 실행 예
// 임의의 정수 입력(1~3) : 7
// 입력 오류~!!!
// 계속하려면 아무 키나 누르세요.

import java.io.*;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num;

		System.out.print("임의의 정수 입력(1~3) : ");
		num = Integer.parseInt(br.readLine());


		// ① 일반 모델 break 사용
		
		switch (num)
		{
		case 3: System.out.println("★★★"); break;
		case 2: System.out.println("★★"); break;
		case 1: System.out.println("★"); break;
		default: System.out.println("입력 오류~!!!");

		}

		// ② 기본 모델 사용
		switch (num)
		{
		default: System.out.println("입력 오류~!!!"); break;
		case 3: System.out.println("★★★"); 
		case 2: System.out.println("★★");
		case 1: System.out.println("★");
		
		}
		*/

		int n;
		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// ① 일반 모델 break 사용
		
		/*
		switch (n)
		{
		case 3: System.out.println("★★★"); break;
		case 2: System.out.println("★★"); break;
		case 1: System.out.println("★"); break;
		default: System.out.println("입력 오류~!!!");

		}
		*/
		// ② 기본 모델 사용
		switch (n)
		{
		case 3: System.out.print("★"); 
		case 2: System.out.print("★");
		case 1: System.out.print("★");
			break;
		default: System.out.println("입력 오류~!!!");
		

		
		
		
		
		}
		System.out.println();
		
	}
}

// 실행 결과
/*
임의의 정수 입력(1~3) : 1
★
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(1~3) : 2
★★
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(1~3) : 3
★★★
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력(1~3) : 4
입력 오류~!!!

계속하려면 아무 키나 누르십시오 . . .
*/
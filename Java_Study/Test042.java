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

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 3
// 두 번째 정수 입력 : 17
// 연산자 입력[+ - * l]: =

// >> 3 - 17 = - 14
// 계속하려면 아무키나 ...

import java.io.*;

public class Test042
{
	public static void main(String[] args) throws IOException
	{	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, result=0;

		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 『+ - * /』: ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break; // case가 int 형이 아닌경우 char 형태나, String 형태로 바꿀 수 있다.
		
		case '-': result = a - b; break;

		case '*': result = a * b; break;

		case '/': result = a / b; break;
		
		}

		System.out.printf("\n %d %c %d = %d\n", a, op, b, result);
		*/

		// ①
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int a, b, result;
		int op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 『+ - * /』: ");
		op = System.in.read();
		
		// + → op = 43, - → op = 45, * → op = 42, / → op = 47

		switch (op)
		{
		case 43: result = a + b; break;
		
		case 45: result = a - b; break;

		case 42: result = a * b; break;

		case 47: result = a / b; break;
		
		default: return;		//-- 1. 값의 반환
								//-- 2. 메소드 종료 → main() 메소드 종료 → 프로그램 종료
								//	    종료된 이후의 코드는 상관없이 프로그램 종료(계속하려면 아무키나 누르세요....)
		
		}
		System.out.println();
		System.out.printf("%d %c %d = %d\n", a, op, b, result);
		*/

		/*
		// ②
		int a, b, result;
		char op;

		System.out.print("첫 번쩨 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번쩨 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		
		case '-': result = a - b; break;

		case '*': result = a * b; break;

		case '/': result = a / b; break;

		default : return;
		
		}

		System.out.printf("\n %d %c %d = %d\n", a, op, b, result);
		*/

		// ③
		int a, b, result;
		String op;

		System.out.print("첫 번쩨 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번쩨 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = br.readLine();

		switch (op)
		{
		case "+": result = a + b; break;
		
		case "-": result = a - b; break;

		case "*": result = a * b; break;

		case "/": result = a / b; break;

		default : return;
		
		}

		System.out.printf("\n %d %s %d = %d\n", a, op, b, result);
	}
}

// 실행결과
/*
첫 번째 정수 입력 : 3
두 번째 정수 입력 : 17
연산자 입력 『+ - * /』: -

 3 - 17 = -14
계속하려면 아무 키나 누르십시오 . . .
*/
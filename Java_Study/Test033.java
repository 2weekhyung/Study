/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- if문
	- if ~ else 문 실습
=========================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참(true)일 경우
//    특정 문장을 수해아고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 정수를 입력 받아
// 다음과 같은 판별 결과를 출력하는 프로그램을 구현한다.
// - 2의 배수
// - 3의 배수
// - 2와 3의 배수
// - 2와 3의 배수 아님

// 실행 예)
// 임의의 정수 입력 : 4
// 4 → 2의 배수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 12
// 4 → 2와 3의 배수
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력 : 17
// 4 → 2와 3의 배수 아님
// 계속하려면 아무 키나 누르세요...
import java.io.*;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int num;
		String result = "판정불가";

		System.out.print("임의의 정수 입력: ");
		num = Integer.parseInt(br.readLine());
		
		if (num == 0)
		{
			result = "2와 3의 배수 아님";
		}

		else if (num % 6 == 0)
		{
			result = "2와 3의 배수";
		}
		else if (num % 2 == 0)
		{
			result = "2의 배수";
		}
		else if (num % 3 == 0)
		{
			result = "3의 배수";
		}
		else
		{
			result = "2와 3의 배수 아님";
		}

		System.out.println(num + " → " + result);
		*/
		
		// 주요 변수 선언

		int n;

		// 연산 및 처리
		System.out.print("임의의 정수 입력: ");
		n = Integer.parseInt(br.readLine());

		// 결과 출력
		if (n%2==0 && n%3==0)
		{
			System.out.println(n + " → 2와 3의 배수");
		}
		else if (n%2==0)
		{
			System.out.println(n + " → 2의 배수");
		}
		else if (n%3==0)
		{
			System.out.println(n + " → 3의 배수");
		}
		else if (n%2!=0 || n%3!=0)
		{
			System.out.println(n + " → 2와 3의 배수 아님");
		}
		else
		{
			System.out.println(n + " → 판정 불가");
		}
	}
}
// 실행 결과


/*
임의의 정수 입력: 9
9 → 3의 배수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력: 8
8 → 2의 배수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력: 7
7 → 2와 3의 배수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력: 24
24 → 2와 3의 배수
계속하려면 아무 키나 누르십시오 . . .
*/
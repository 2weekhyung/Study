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

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구련한다.

//실행 예)
//첫 번째 정수 입력 : 753
//두 번째 정수 입력 : 22
//세 번째 정수 입력 : 124
//
// >> 정렬 결과 : 22 124 753
// 계속하려면 아무 키나 누르세요...

/*
	8	21	74
	------
	--		--
		------

	7	25	99
	------
	--		--
		------

	13	25	87
	------
	--		--
		-------

// ① 첫 번째 정수 vs 두 번째 정수 크기 비교
	  → 첫 번째 정수가 두 번째 정수보다 클 경우... 자리 바꿈

   ② 첫 번쨰 정수 vs 세번째 정수 크기 비교
	  → 첫 번째 정수가 세 번쨰 정수보다 클 경우... 자리 바꿈
   
   ③ 두 번쨰 정수 vs 세번째 정수 크기 비교
	  → 두 번째 정수가 세 번쨰 정수보다 클 경우... 자리 바꿈

*/

import java.io.*;

public class Test036
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int num1, num2, num3;

		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		num3 = Integer.parseInt(br.readLine());
		
		
		if (num1 >= num2 && num1 >= num3)
		{
			if (num2 >= num3)
			{
				System.out.printf("\n>> 정렬 결과 : %d %d %d\n", num3, num2, num1);
			}
			else
			{
				System.out.printf("\n>> 정렬 결과 : %d %d %d\n", num2, num3, num1);
			}
		}
		else if (num2 >= num1 && num2 >= num3)
		{
			if (num1 >= num3)
			{
				System.out.printf("\n>> 정렬 결과 : %d %d %d\n", num3, num1, num2);
			}
			else
			{
				System.out.printf("\n>> 정렬 결과 : %d %d %d\n", num1, num3, num2);
			}
		}
		else if (num3 >= num1 && num3 >= num2)
		{
			if (num1 >= num2)
			{
				System.out.printf("\n>> 정렬 결과 : %d %d %d\n", num2, num1, num3);
			}
			else
			{
				System.out.printf("\n>> 정렬 결과 : %d %d %d\n", num1, num2, num3);
			}
		}
		else 
		{
			System.out.println("정렬 불가");
		}
		*/

		int a, b, c;	//-- 사용자가 입력하는 임의의 정수를 담아둘 변수

		System.out.printf("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.printf("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.printf("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		if (a > b)		// 첫 번째 정수가 두 번째 정수보다 클 경우
		{
			// 자리 바꿈
			a=a^b;
			b=b^a;
			a=a^b;
		}
		if (a > c)		// 첫 번째 정수가 세 번째 정수보다 클 경우		//-- check~!!! 조건식은 if 와 else if 로 구성할지 if 로만 구성할지 고민
		{
			// 자리 바꿈
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b > c)		// 두 번째 정수가 세 번째 정수보다 클 경우
		{
			// 자리 바꿈
			b=b^c;
			c=c^b;
			b=b^c;
		}
		
		// 최종 결과 출력
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b,c );

	}
}

// 실행 결괴

/*
첫 번째 정수 입력 : 300
두 번째 정수 입력 : 200
세 번째 정수 입력 : 100

>> 정렬 결과 : 100 200 300
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 200
두 번째 정수 입력 : 100
세 번째 정수 입력 : 300

>> 정렬 결과 : 100 200 300
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 200
두 번째 정수 입력 : 100
세 번째 정수 입력 : 100

>> 정렬 결과 : 100 100 200
계속하려면 아무 키나 누르십시오 . . .
*/
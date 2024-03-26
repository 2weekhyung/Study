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

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단 Scanner 를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예
// 임의의 정수 5개 입력(공백 구분) : 11 12 13 14 15

// >> 짝수의 합은 26 이고, 홀수의 합은 39 입니다.

import java.util.*;

public class Test037
{
	public static void main(String[] args) 
	{	
		/*
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, n5;
		int sum1;	// 짝수
		int sum2;	// 홀수


		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
		n1 = Integer.parseInt(sc.next());
		n2 = Integer.parseInt(sc.next());
		n3 = Integer.parseInt(sc.next());
		n4 = Integer.parseInt(sc.next());
		n5 = Integer.parseInt(sc.next());

		sum1 = 0;
		sum2 = 0;

		

		if (n1 % 2 == 0)
		{
			sum1 += n1;
		}
		else
		{
			sum2 += n1;
		}
		if (n2 % 2 == 0)
		{
			sum1 += n2;
		}
		else
		{
			sum2 += n2;
		}
		if (n3 % 2 == 0)
		{
			sum1 += n3;
		}
		else
		{
			sum2 += n3;
		}
		if (n4 % 2 == 0)
		{
			sum1 += n4;
		}
		else
		{
			sum2 += n4;
		}
		if (n5 % 2 == 0)
		{
			sum1 += n5;
		}
		else
		{
			sum2 += n5;
		}
		
		System.out.printf("\n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n", sum1, sum2);
		*/

		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);

		// 누적합을 담아낼 변수 초기화 - check~!!! 누적합 일때는 0 으로 초기화 / 누적곱 일때는 1로 초기화
		int evenSum=0;		//-- 짝수의 합을 담아낼 변수 선언
		int oddSum=0;		//-- 홀수의 합을 담아낼 변수 선언
		int num1, num2, num3, num4, num5;

		// 연산 및 처리
		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		
		if (num1 % 2 == 0) //-- num1 이 짝수일 때...
		{
			// evenSum 을 num1 만큼 증가
			evenSum += num1;
		}
		else	//-- num1 이 짝수가 아닐 때... (홀수일 때)
		{
			// oddSum 을 num1 만큼 증가
			oddSum += num1;
		}
		if (num2 % 2 == 0) //-- num1 이 짝수일 때...
		{
			// evenSum 을 num1 만큼 증가
			evenSum += num2;
		}
		else	//-- num1 이 짝수가 아닐 때... (홀수일 때)
		{
			// oddSum 을 num1 만큼 증가
			oddSum += num2;
		}
		if (num3 % 2 == 0) //-- num1 이 짝수일 때...
		{
			// evenSum 을 num1 만큼 증가
			evenSum += num3;
		}
		else	//-- num1 이 짝수가 아닐 때... (홀수일 때)
		{
			// oddSum 을 num1 만큼 증가
			oddSum += num3;
		}
		if (num4 % 4 == 0) //-- num1 이 짝수일 때...
		{
			// evenSum 을 num1 만큼 증가
			evenSum += num4;
		}
		else	//-- num1 이 짝수가 아닐 때... (홀수일 때)
		{
			// oddSum 을 num1 만큼 증가
			oddSum += num4;
		}
		if (num5 % 2 == 0) //-- num1 이 짝수일 때...
		{
			// evenSum 을 num1 만큼 증가
			evenSum += num5;
		}
		else	//-- num1 이 짝수가 아닐 때... (홀수일 때)
		{
			// oddSum 을 num1 만큼 증가
			oddSum += num5;
		}
		*/

		// 결과 출력

		System.out.printf("\n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n", evenSum, oddSum);
		
		


	}
}
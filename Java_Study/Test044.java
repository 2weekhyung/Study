/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문 실습 및 관찰
=========================================*/

/*
○ 반복문의 개요

   주어진 조건이 『참』인 경우
   일정한 영역이 문장을 반복 수행 하다가
   조건식이 『거짓』이 되는 순간이 오면,
   반복 수행을 중단하는 문장이다.
   이러한 반복문에는 『while』, 『do~while』, 『for』문 등이 있으며
   반복의 제어를 위해 『break』, 『continue』등을 사용하는 경우가 있다.

○ while 문
   
   조건식을 먼저 비교하여
   조건식의 처리 결과가 참인 경우, 특정 영역을 반복 수행하는 문장으로
   반복 횟수가 정해져 있지 않은 경우나
   반복 횟수가 많은 경우 주로 사용한다.
   while 문은 조건이 많지 앟은 경우
   반복은 커녕 단 한 번도 실행 되지 않을 수 있다.

○ while 문의 형식 및 구조

   while(조건식)
   {
	   실행문;
   }

*/

// 1 부터 100 까지의 정수 중에서
// 짝수들의 합을 계산하여, 결과값을 출력하는 프로그램을 구현한다.
// 단, 조건문은 사용하지 않도록 하며,
// while 반복문을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 1 부터 100 까지의 수 중 짝수의 합 : xxx
// 계속하려면 아무 키나...

// 문제 인식 및 분석
// 2 + 4 + 6 + 8 + ... + 100
// - 초기값 : 2
// - 증가값 : 2
// - 한계값 : 100

public class Test044
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int n=2;
		int sum=0;

		// 연산 및 처리(반복 연산)
		while (n<=100)
		{
			sum+=n;	//-- sum 값을 n 만큼 증가~!!!
			n+=2;	//-- n 값을 2만큼 증가
		}

		// 결과 출력
		System.out.println("1부터 100까지의 수 중 짝수의 합 : " + sum);
	}	
}

// 실행 결과

/*
1부터 100까지의 수 중 짝수의 합 : 2550
계속하려면 아무 키나 누르십시오 . . .
*/
/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문 실습 및 관찰
=========================================*/

// 실행 예)
// 1부터 100까지 정수의 합 : xxxx
// 1부터 100까지 짝수의 합 : xxxx
// 1부터 100까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요

public class Test046
{
	public static void main(String[] args)
	{	/*
		int n = 1;
		int sum = 0;
		int even = 0;
		int odd = 0;

		while (n <= 100)
		{	
			
			
			if (n % 2 == 0)
			{
				even += n;
			}
			else if (n % 2 != 0)
			{
				odd += n;
			}
			else
			{	
				System.out.println("판별 불가");
				return;
			}
			sum += n;
			n++;
		}
		
		//sum = even + odd;

		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);
		*/

		// 주요 변수 선언 및 초기화
		int n=1, sum, odd, even;
		sum=odd=even=0; // even에 0 을 넣고 odd 에 even 을 넣고 ~

		// 연산 및 처리
		while (n<=100)
		{
			sum += n;

			if (n%2==0)
			{
				even += n;
			}
			else if (n % 2 != 0)
			{
				odd += n;
			}
			else
			{
				System.out.println("판별할 수 없는 데이터");
				return;
			}

			n++;
		}
		
		System.out.println("1부터 100까지 정수의 합 : " + sum);
		System.out.println("1부터 100까지 짝수의 합 : " + even);
		System.out.println("1부터 100까지 홀수의 합 : " + odd);


	}
}

//실행 결과
/*
1부터 100까지 정수의 합 : 5050
1부터 100까지 짝수의 합 : 2550
1부터 100까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/
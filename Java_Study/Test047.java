/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문 실습 및 관찰
=========================================*/

// 1부터 100까지 정수의 합을 구하되...
// 10의 배수가 될 때 마다...
// 그 시점까지의 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 1 ~ 10 까지의 합 : xx
// 1 ~ 20 까지의 합 : xxx
// 1 ~ 30 까지의 합 : xxx
//	 :
// 1 ~ 100 까지의 합 : xxx
// 계속하려먼 아무 키나 누르세요...

public class Test047
{
	public static void main(String[] args)
	{	
		/*
		int n = 1;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;
		int sum6 = 0;
		int sum7 = 0;
		int sum8 = 0;
		int sum9 = 0;
		int sum10 = 0;

		while (n<=100)
		{
			if (n<=10)
			{
				sum1 += n;
			}
			if (n<=20)
			{
				sum2 += n;
			}
			if (n<=30)
			{
				sum3 += n;
			}
			if (n<=40)
			{
				sum4 += n;
			}
			if (n<=50)
			{
				sum5 += n;
			}
			if (n<=60)
			{
				sum6 += n;
			}
			if (n<=70)
			{
				sum7 += n;
			}
			if (n<=80)
			{
				sum8 += n;
			}
			if (n<=90)
			{
				sum9 += n;
			}
			if (n<=100)
			{
				sum10 += n;
			}
			n++;
		}

		System.out.println("1 ~ 10 까지의 합 : " + sum1);
		System.out.println("1 ~ 20 까지의 합 : " + sum2);
		System.out.println("1 ~ 30 까지의 합 : " + sum3);
		System.out.println("1 ~ 40 까지의 합 : " + sum4);
		System.out.println("1 ~ 50 까지의 합 : " + sum5);
		System.out.println("1 ~ 60 까지의 합 : " + sum6);
		System.out.println("1 ~ 70 까지의 합 : " + sum7);
		System.out.println("1 ~ 80 까지의 합 : " + sum8);
		System.out.println("1 ~ 90 까지의 합 : " + sum9);
		System.out.println("1 ~ 100 까지의 합 : " + sum10);
		*/

		int n=1, sum=0;
		//--n → 1 부터 1씩 증가할 변수
		//	sum → 누적합을 담아낼 변수

		while (n<=100) // 1 2 3 4 ... 100 → 100번 반복
		{
			sum += n;

			if (n%10==0)
			{
				System.out.printf("1 ~ %d 까지의 합 : %d\n", n, sum);
			}

			n++;
		}


	}
}
/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문 실습 및 관찰
=========================================*/

// ○ 과제
// 사용자로 부터 임의의 정수를 입력 받아
// 1 부터 입력받은 그 정수까지의
// 전체 합과, 짝수의 합과. 홀수의 합을
// 각각 결과값으로 연산하여 출력하는 프로그램을 구현한다.

// 실행 예
// 임의의 정수 입력 : 396
// >> 1 ~ 396 까지 정수의 합 : XXXX
// >> 1 ~ 396 까지 짝수의 합 : xxxx
// >> 1 ~ 396 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;		// 입력값을 받을 변수
		int r = 1;	// 루프 변수, 1부터 n까지 더해야 하니까 1로 초기화
		int sum=0;	// 정수의 합, 누적합은 0으로 초기화
		int even=0;	// 짝수의 합
		int odd=0;	// 홀수의 합


		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		

		while (r <= n)
		{
			sum += r;	// 정수의 합
			

			if (r % 2 == 0)	// 짝수인 경우 / 2 했을 때 나머지가 0 이면 짝수
			{
				even += r;	// 짝수의 합
				
			}
			else
			{
				odd += r;	// 그 외의 경우(홀수)
				
			}
			r++;	// r 이 n 이 될 때 까지 반복
		}

		System.out.printf("1 ~ %d 까지 정수의 합 : %d\n", n , sum);		// 1 ~ n 까지 정수의 합 출력
		System.out.printf("1 ~ %d 까지 짝수의 합 : %d\n", n , even);	// 1 ~ n 까지 짝수의 합
		System.out.printf("1 ~ %d 까지 홀수의 합 : %d\n", n , odd);		// 1 ~ n 까지 홀수의 합
		
	}
}

// 실행 결과

/*
임의의 정수 입력 : 396
1 ~ 396 까지 정수의 합 : 78606
1 ~ 396 까지 짝수의 합 : 39402
1 ~ 396 까지 홀수의 합 : 39204
계속하려면 아무 키나 누르십시오 . . .
*/
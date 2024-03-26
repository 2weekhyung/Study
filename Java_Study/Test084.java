/*=========================================================
	■■■ 배열 ■■■
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
===========================================================*/

// ○ 과제
//    사용자로부터 임의의 학생 수를 입력 받고
//    그만큼의 점수(정수 형태)를 입력 받아
//    전체 학생 점수의 합, 평균, 편차를 구해서
//	  결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차
// 90 : - 16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int student;	// 학생 수 를 받을 변수

		int sum=0;		// 학생들의 점수 총합을 담을 변수
		double avg=0;	// 학생들의 평균을 담을 변수 ※ 실수 형태가 나올 수 있기 때문에 double로 초기화

		System.out.print("학생 수 입력 : ");
		student = sc.nextInt();

		int[] score = new int[student];	// 학생수 만큼 score 배열을 생성

		for (int i=0 ; i < score.length ; i++)	// score 배열에 점수를 입력
		{	
			System.out.printf("%d번 학생의 점수 입력 : ",(i+1));
			score[i] = sc.nextInt();
		}

		for (int i=0 ;i < score.length ; i++ )	// 학생들의 점수 총합을 계산 하려면 배열의 누적합을 계산
		{
			sum += score[i];
		}

		avg = (double)sum / student;			// 실수 형태로 표현하기 위해 sum을 double 형으로 계산

		System.out.println();
		System.out.println(">>합 : "+ sum);
		System.out.println(">>평균 : "+ avg);
		System.out.println(">>편차");

		for (int j=0 ; j < score.length ; j++ )	// 실행 예에서 원하는 것은 배열을 출력하면서 편차를 계산하라는 것인데
		{
			System.out.printf("%d : %.1f\n", score[j], -(score[j] - avg));	// 편차는 개인의 점수 - 평균 이기 때문에 이렇게 출력
		}

	}
	
}

// 실행 결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>>합 : 370
>>평균 : 74.0
>>편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/
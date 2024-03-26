/*===========================================
	■■■ 정렬(sort) 알고리즘 ■■■
=============================================*/

// ○ 과제
//    사용자로부터 여러 학생의 성적 데이터를 입력받아
//    점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

//    실행 예)
//    인원 수 입력 : 5
//    이름 점수 입력(1, 공백구분) : 임하성 90
//    이름 점수 입력(2, 공백구분) : 정한울 80
//    이름 점수 입력(3, 공백구분) : 정현욱 85
//    이름 점수 입력(4, 공백구분) : 채다선 75
//    이름 점수 입력(5, 공백구분) : 최혜인 95
//
//------------
//1등
//2등
//3등
//4등
//5등
//--------------
//계속하려면 아무키나 누르세요...

import java.util.Scanner;

public class Test110
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int inwon;	// -- 인원 수를 담을 변수
		int r =1;	// 루프 변수
		
		System.out.print("인원 수 입력 : ");
		inwon = sc.nextInt();
		
		String[] names = new String[inwon];	//-- 인원수 만큼의 이름을 담을 문자열 배열 생성
		
		int[] scores = new int[inwon];		//-- 임원수 만큼의 점수를 담을 정수형 배열 생성
		
		if (inwon == 0)
		{
			return;
		}

		for (int i=0 ; i < inwon ; i++ )
		{
			System.out.printf("이름 점수 입력(%d, 공백구분) : ",i+1);
			names[i] = sc.next();
			scores[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("-------------------");

		for (int i=0 ; i < scores.length-1 ; i++ )				
		{
			for (int j=i+1 ; j < scores.length ; j++)
			{
				if (scores[i] < scores[j])						// 선택정렬 알고리즘을 사용해 배열을 내림차순으로 정렬하고 순서대로 출력할 계획
				{
					scores[i] = scores[i]^scores[j];			// 점수는 인트형 배열이기 때문에 기존의 방법으로 수행가능
					scores[j] = scores[j]^scores[i];
					scores[i] = scores[i]^scores[j];

					String temp;								// 이름 배열은 문자열 배열이기 때문에 비트열 반전으로 순서를 바꾸는 것은 불가능 함으로
					temp = names[i];							// 문자열을 임시로 받을 문자열 타입의 temp를 선언하고 이 temp를 이용해 바꿔줌
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}

		for (int i=0 ;i < scores.length ; i++ )
		{
			System.out.printf("%d등 %s %d", (i+1), names[i], scores[i]);		// 점수를 기준으로 내림차순으로 정렬했기 때문에  
			System.out.println();												// [0]에 성적이 가장 높은 학생의 이름과 점수가 담김
		}
		System.out.println("-------------------");
	}
}

// 실행결과

/*
인원 수 입력 : 5
이름 점수 입력(1, 공백구분) : 임하성 90
이름 점수 입력(2, 공백구분) : 정한울 80
이름 점수 입력(3, 공백구분) : 정현욱 85
이름 점수 입력(4, 공백구분) : 채다선 75
이름 점수 입력(5, 공백구분) : 최혜인 95

-------------------
1등 최혜인 95
2등 임하성 90
3등 정현욱 85
4등 정한울 80
5등 채다선 75
-------------------
계속하려면 아무 키나 누르십시오 . . .
*/
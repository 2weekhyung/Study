/*=========================================
	■■■ 자바의 개요 및 특징 ■■■
=========================================*/

// ○ 퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다.

// 실행 예)
// ■ 삼각형 넓이 구하는 프로그램 ■
// - 삼각형의 밑변 입력 : 5
// - 삼각형의 높이 입력 : 3

//>> 밑변이 5, 높이가 3인 삼각형의 넓이 : xxx
// 계속하려면 아무 키나 누르세요...

// ※ 문제 인식 및 분석
//	  삼각형의 넓이 = 밑변 * 높이 / 2
//	  사용자로부터 데이터 입력 받아 처리 → BufferedReader 활용
//	  BufferedReader 를 여러개 사용?? 한 개 사용??
//									-------------


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		// 내가 풀이한 코드
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a; // 밑변
		int b; // 높이
		double c; // 넓이
		
		System.out.println(" ■ 삼각형 넓이를 구하는 프로그램 ■");
		
		System.out.print("삼각형의 밑변 입력: ");

		a = Integer.parseInt(br.readLine());

		System.out.print("삼각형의 높이 입력: ");

		b = Integer.parseInt(br.readLine());

		System.out.print("\n");

		c = a * b / 2.0;

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 %.2f:\n", a, b, c);

		/*

// 실행 결과
/*
 ■ 삼각형 넓이를 구하는 프로그램 ■
삼각형의 밑변 입력: 5
삼각형의 높이 입력: 3

>> 밑변이 5, 높이가 3인 삼각형의 넓이 7.50:
계속하려면 아무 키나 누르십시오 . . ..
*/

	    // 함께 풀이한 코드
		
		// 주요 변수 선언

		// BufferedReader 인스턴스 생성

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 밑변, 높이
		int underLength, height; //-- 밑변 높이
		double area;			 //-- 넓이	check~!!!

		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.println(" ■ 삼각형의 넓이 구하는 프로그램 ■");
		System.out.print("- 삼각형의 밑변 입력 : ");

		// ② 사용자가 입력한 데이터(문자열)를 정수 형태로 변환 후 변수 underLength 에 담아내기
		underLength = Integer.parseInt(br.readLine());
		
		// ③ 다시 사용자에게 안내 메세지 출력
		System.out.print("- 삼각형의 높이 입력");

		// ④ 사용자가 입력한 데이터(문자열)를 정수 형태로 변환 후를 변수 height 에 담아내기
		height = Integer.parseInt(br.readLine());

		// ⑤ 삼각형의 넓이 구하는 연산 처리
		//	  삼각형의 넓이 = 밑변 * 높이 / 2;
		// area = underLength * height / 2;
		//		정수형		정수형	  정수형
		//		-------------------------------
		//				정수형		/ 정수형	→ 정수 기반 연산
		//											(즉 몫을 취하고 나머지는 버림)

		area = underLength * height / 2.0;	// check~!!!
		//		정수형		정수형	실수형 → 실수 기반 연산

		// ※ 실수 자료형이 결과값으로 나오는 과정에서
		//	  실수 기반의 연산이 필요한 상황이다.
		//	  정수형 『2』가 아닌, 실수형으로 『2.0』으로 나눗셈 연산을 수행하게 되면
		//	  이 연산은 실수 기반으로 처리된다.

		// area = (double)underlength * height / 2;
		// area = underlength * (double)height / 2;
		// area = (double)(underLength * height) / 2;
		// area = (double)(underLength * height / 2); ---- (X)

		// 결과 도출
		//System.out.println(); // 개행
		//System.out.print(); //- 에러 발생(컴파일 에러)
		
		System.out.printf("\n>> 밑변이 %d, 높이가 %d인 삼각형의 넓이 %.2f:\n", underLength, height, area);




	}
}

// 실행 결과

/*
 ■ 삼각형의 넓이 구하는 프로그램 ■
- 삼각형의 밑변 입력 : 5
- 삼각형의 높이 입력3

>> 밑변이 5, 높이가 3인 삼각형의 넓이 7.50:
계속하려면 아무 키나 누르십시오 . . .

*/
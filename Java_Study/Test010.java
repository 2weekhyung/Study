/*=========================================
	■■■ 자바의 개요 및 특징 ■■■
=========================================*/

// ○ 퀴즈
//	사전에 부여된 반지름 정보를 통해
//	원의 넓이와 둘레를 구하는 프로그램을 구현한다.
//  → 반지름 : 10

// ※ 원의 넓이 : 반지름 * 반지름 * 3.141592
//    원의 둘레 : 반지름 * 2 * 3.1415192

// 실행 예)
// 넓이 : xxx
// 둘레 : xxx
// 계속하려면 아무 키나 누르세요...

public class Test010
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println("넓이 : " + a*a*3.141592);
		System.out.println("둘레 : " + 2*a*3.141592);

		// 실행 결과
		// 넓이 : 314.1592
		// 둘레 : 62.83184
		// 계속하려면 아무 키나 누르십시오 . . .

		// 다른 사람이 푼 내용
		// int a = 10;
		// double b = a * a * 3.141592;
		// double c = a * 2 * 3.141592;

		// System.out.println("넓이 : " + b);
		// System.out.println("둘레 : " + c);

		// 함께 풀이한 내용 ---------------------------
		
		// 주요 변수 선언
		int r = 10;						//-- 반지름(r)
		//double pi = 3.141592;			//-- 원주율(π)
		//final double pi = 3.141592;	//-- 원주율(π)
		final double PI = 3.141592;		//-- 원주율(π)
		//-- 『final』 키워드 : 변수의 상수화~!!!
		//-- 상수화된 키워드들은 대문자로 작성

		// rainbowColor → RAINBOWCOLOR → RAINBOW_COLOR
		// userNAME → USERNAME → USER_NAME
		// applePrice → AAPLEPRICE → APPLE_PRICE
		// 상수화된 키워드들을 전부 대문자화 하면 가독성이 떨어지니 띄어쓰기로 언더바 (_) 사용

		double area, length;		//-- 원의 넓이. 둘레


		// 연산 및 처리
		// ① 넓이 연산
		//	  원의 넓이 : 반지름 * 반지름 * 3.141592
		area = r * r * PI;

		// ② 둘레 연산
		//    원의 둘레 : 반지름 * 2 * 3.1415192
		length = r * 2 * PI;

		// 결과 출력
		//System.out.println("넓이 : " + area);
		System.out.printf("넓이 : %.3f%n" , area);
		//System.out.println("둘레 : " + length);
		System.out.printf("둘레 : %.3f%n" , length);

		System.out.printf("넓이 : %.3f%n둘레 : %.3f%n" , area, length);

	}
}

// 실행 결과

/*
넓이 : 314.159
둘레 : 62.832
계속하려면 아무 키나 누르십시오 . . .
*/
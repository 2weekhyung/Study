/*=========================================
	■■■ 자바의 개요 및 특징 ■■■
=========================================*/

// ○ 퀴즈
//	  직각사각형의 넓이와 둘레를 구하는 프로그램을 구현한다.
//    → 가로 : 10, 세로 : 20

// 실행 예)
// 넓이 : xxx
// 둘레 : xxx
// 계속하려면 아무 키나 누르세요...

// ※ 문제 인식 및 분석
//	  직각사각형의 넓이와 둘레를 구하는 공식
//	  넓이 = 가로 * 세로;
//	  둘레 = (가로+세로) * 2;
public class Test011
{
	public static void main(String[] args)
	{
		// int a = 10;
		// int b = 20;
		// int area = a * b ;
		// int length = (a + b) * 2;

		// System.out.println("넓이 : " + area);
		// System.out.println("둘레 : " + length);

		// 실행 결과)
		/*
		넓이 : 200
		둘레 : 60
		계속하려면 아무 키나 누르십시오 . . 
		*/

		// 함께 풀이한 내용 ---------------------------

		// 주요 변수 선언
		int a= 10, b =20;  //-- 가로, 세로
		int x, y;		   //-- 넓이, 둘레

		// 연산 및 처리
		x = a * b;
		y = (a + b) * 2;

		// 결과 출력
		System.out.println("넓이 : " + x);
		System.out.println("둘레 : " + y);
		
	}
}

// 실행 결과

/*
넓이 : 200
둘레 : 60
*/
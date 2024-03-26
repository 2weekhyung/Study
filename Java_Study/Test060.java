/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(for문) 실습 및 관찰
=========================================*/

// ○ 다중 for문(반복문의 중첩)을 활용한 별찍기 실습
// ○ 과제
//    다음과 같은 내용이 출력 될 수 있도록
//	  반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

// 실행 예)
/*
    *
   **
  ***
 ****
*****
*/


public class Test060
{
	public static void main(String[] args)
	{
		int i; //행을 만들 변수
		int j; //공백을 찍을 변수
		int star; // 별을 찍을 변수

		for (i = 1; i <= 5 ; i++)		// 5행 만들어라(i= 5까지 반복)
		{
			for (j = 1 ; j <= 5 - i ; j++ ) // 5 - i 만큼 공백을 찍어라
			{
				System.out.print("  ");
			}

			for (star = 1; star <= i ; star++ )	// i 만큼 별을 찍어라
			{
				System.out.print('★');
			}

			System.out.println();	// 개행
		}
	}

}

// 실행 결과
/*
        ★
      ★★
    ★★★
  ★★★★
★★★★★
계속하려면 아무 키나 누르십시오 . . .
*/
/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(for문) 실습 및 관찰
	- 다중 for문(반복문의 중첩)을 활용한 구구단 출력 실습
=========================================*/

// 실행 예)
/*

2 * 1 = 2 3 * 1 = 3 4 * 1 = 4 5 * 1 = 5
2 * 2 = 4 3 * 2 = 6 4 * 2 = 8 5 * 2 = 10
	:
2 * 9 = 18 3 * 9 = 27 4 * 9 = 36 5 * 9 = 45

6 * 1 = 6 7 * 1 = 7 8 * 1 = 8 9 * 1 = 9
6 * 2 = 6 7 * 2 = 7 8 * 2 = 8 9 * 2 = 9
	:
6 * 9 = 6 7 * 9 = 7 8 * 9 = 8 9 * 9 = 9


*/
public class Test059
{
	public static void main(String[] args)
	{	/*
		int dan;	// 단
		int n;		// 곱
		// ⓛ 2중첩 2개
		for (n = 1;n < 10 ;n++ )
		{
			for (dan=2;dan<6 ;dan++ )
			{
				System.out.printf("%2d * %2d = %2d",dan,n, (dan*n));
				if (dan == 5)
				{
					System.out.println();
				}
			}
			
		}
		
		System.out.println();
		
		for (n = 1;n < 10 ;n++ )
		{
			for (dan = 6; dan<10; dan++)
			{
				System.out.printf("%2d * %2d = %2d",dan,n, (dan*n));
				if (dan ==9)
				{
					System.out.println();
				}
			}
		}

		*/
		
		//System.out.println();
		/*
		// ② 3중첩 1개 
		int a;
		for (a = 1; a <= 2 ; a++)
		{
			for (n = 1 ; n < 10 ; n++ )
			{
				if (a == 1)
				{
					for (dan=2; dan < 6 ; dan ++ )
					{
						System.out.printf("%2d * %2d = %2d",dan,n, (dan*n));
						if (dan == 5)
						{
							System.out.println();
						}
					}
				}
				else
				{
					for (dan=6; dan < 10 ; dan++ )
					{
						System.out.printf("%2d * %2d = %2d",dan,n, (dan*n));
						if (dan == 9)
						{
							System.out.println();
						}
					}
				}
			}

			System.out.println();
		}
		*/
		/*
		int c = 0;
		for (a = 1; a <= 2 ; a++)
		{
			for (n = 1 ; n < 10 ; n++ )
			{
				
				
					for (dan=2+c; dan < 6+c ; dan ++ )
					{
						System.out.printf("%2d * %2d = %2d",dan,n, (dan*n));
						if (dan == 5+c)
						{
							System.out.println();
						}
					}
				
				
				
					
						
					
				
			}
			c += 4;
			System.out.println();
		}
		*/

		// ① Test058과 비교하여
		//	  출력 방향(출력의 순서)가 다르기 때문에
		//	  반복문의 제어 흐름도 달아져야 한다.
		//	  (한 방향으로 처리되는 콘솔 기반의 출력 환경이기 때문이다...)

		// ② (1)에 따라
		//	   『단』 과 『곱해지는 수』의 위치가
		//	 달라진 상태에서의 반복문 구성
		/*
		for (int i = 1 ; i <= 9 ; i++)		// 웅 → 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			for (int j = 2 ; j <= 5 ; j++ )			// 쑝쑝쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j));
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1 ; i <= 9 ; i++)		// 웅 → 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			for (int j = 6 ; j <= 9 ; j++ )			// 쑝쑝쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j));
			}
			System.out.println();
		}
		*/

		// ③ (2) 에서 처리한 결과를
		//    두 문단으로 반복하는 반복문 구성
		//	  (check~!!! → 두 반복하는 반복문에 (2)의 결과를 삽입)
		/*
		for (int h=0 ; h <= 1 ; h++ ) // 문단 구성 check~!!!
		{
			for (int i = 1 ; i <= 9 ; i++)		// 웅 → 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			for (int j = 2 ; j <= 5 ; j++ )			// 쑝쑝쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j));
			}
			System.out.println();
		}
		System.out.println();
		}
		*/
		
		// ④ 같은 구문을
		//    두 문단으로 나누어 처리하는 과정에서
		//	  문단에 따라 다르게 주어지는 환경(h의 값을) 활용하는 방법으로
		//	  최종 반복문 3중첩 구성

		for (int h=0 ; h <= 1 ; h++ ) // 문단 구성 check~!!!
		{
			for (int i = 1 ; i <= 9 ; i++)		// 웅 → 곱해지는 수 1 2 3 4 5 6 7 8 9
			{
				for (int j = 2 ; j <= 5 ; j++ )			// 쑝쑝쑝 → 단
				{
				System.out.printf("%4d * %d = %2d", j+(h*4), i, (i*(j+(h*4))));
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

// 실행 결과

/*
   2 * 1 =  2   3 * 1 =  3   4 * 1 =  4   5 * 1 =  5
   2 * 2 =  4   3 * 2 =  6   4 * 2 =  8   5 * 2 = 10
   2 * 3 =  6   3 * 3 =  9   4 * 3 = 12   5 * 3 = 15
   2 * 4 =  8   3 * 4 = 12   4 * 4 = 16   5 * 4 = 20
   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   5 * 5 = 25
   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   5 * 6 = 30
   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   5 * 7 = 35
   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   5 * 8 = 40
   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36   5 * 9 = 45

   6 * 1 =  6   7 * 1 =  7   8 * 1 =  8   9 * 1 =  9
   6 * 2 = 12   7 * 2 = 14   8 * 2 = 16   9 * 2 = 18
   6 * 3 = 18   7 * 3 = 21   8 * 3 = 24   9 * 3 = 27
   6 * 4 = 24   7 * 4 = 28   8 * 4 = 32   9 * 4 = 36
   6 * 5 = 30   7 * 5 = 35   8 * 5 = 40   9 * 5 = 45
   6 * 6 = 36   7 * 6 = 42   8 * 6 = 48   9 * 6 = 54
   6 * 7 = 42   7 * 7 = 49   8 * 7 = 56   9 * 7 = 63
   6 * 8 = 48   7 * 8 = 56   8 * 8 = 64   9 * 8 = 72
   6 * 9 = 54   7 * 9 = 63   8 * 9 = 72   9 * 9 = 81

   계속하려면 아무 키나 누르십시오 . . .
*/
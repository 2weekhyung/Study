/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- 반복문(for문) 실습 및 관찰
=========================================*/

// continue 실습

// continue 를 활용하여
// 다음과 같은 처리와 출력이 이루어질 수 있도록
// 프로그램을 구현한다.

// 실행 예)
// 1 : 1
// 3 : 4
// 5 : 9
// 7 : 16
// 9 : 25
//	:
//	:
// 99 : 2500
// 계속하려면 아무 키나 누르세요...

public class Test065
{
	public static void main(String[] args)
	{
		int odd=1;
		int sum=0;
		/*
		if (odd % 2 != 0)
		{
			for (odd = 1; odd <= 100 ; odd++)
			{
				sum += odd;
				odd++;
				System.out.printf("%d : %d", (odd-1), sum);
				System.out.println();
			}
		}
		*/

		for (odd=1; odd <= 100 ; odd++)
		{	
			if (odd % 2 == 0)		//-- n이 짝수라면...
			{
				continue;			//-- (뒷부분 무시하고) + 계속해라
			}

			sum += odd;				//-- 뒷부분
		

			System.out.printf("%d : %d", (odd), sum);	//-- 뒷부분
			System.out.println();						//-- 뒷부분

			
		}
	}
}
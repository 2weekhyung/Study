/*=========================================================
	■■■ 배열 ■■■
	- 배열의 배열
===========================================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
1  2   3   4		10
5  6   7   8		26
9  10  11 12		42
13 14 15 16			58
28 32 36 40			146
계속하려면 아무 키나 누르세요...
*/
public class Test091
{
	public static void main(String[] args)
	{	/*
		int[][] arr1 = new int[5][5];
		int n=1;
		int sumI = 0;
		int sumJ = 0;

		for (int i=0; i<5;i++ )
		{
			for (int j=0 ; j<5 ;j++ )
			{
				if (i<4 && j<4)
				{
					arr1[i][j] = n;
					n++;
		
				}
			}
		}

		// (0.0)(1.0)(2.0)(3.0)(4.0) /
		
		
		

		//arr1[4][0]= arr[0][0] + arr[1][0]+ arr[2][0]+ arr[3][0]
		// arr1[4][1]= arr[0][1] + arr[1][1]+ arr[2][1]+ arr[3][1]

		for (int j =0 ; j < 5 ; j++ )
		{
			for (int i=0 ; i < 5 ; i++ )
			{
				sumI+=arr1[i][j];

				if (i==4 && j<4)
				{
					
					arr1[i][j] = sumI;
						
				}
				
			}
			sumI -= sumI;
		}

		for (int i =0 ; i < 5 ; i++ )
		{
			for (int j=0 ; j < 5 ; j++ )
			{
				sumJ+=arr1[i][j];

				if (j==4)
				{
					
					arr1[i][j] = sumJ;
						
				}
				
			}
			sumJ -= sumJ;
		}

		

		for (int i=0 ; i<arr1.length ;i++ )
		{	
			for (int j=0 ; j<arr1[i].length ;j++ )
			{
			
			System.out.printf("%3d",arr1[i][j]);
			}
			
			System.out.println();
			*/

			int[][] arr = new int[5][5];
			int n=0;

			// 테스트 변수
			int sum=0;

			// 각 for문 수식2의 『-1』 → 반복문의 처리가 필요하지 않은 영역
			for (int i=0 ; i < arr.length-1 ;i++ )			//-- 웅~ i → 0 1 2 3
			{
				for (int j=0 ; j<arr[i].length-1 ;j++ )		//-- 쑝쑝쑝 j → 0123 0123 0123 0123
				{
					n++;
					arr[i][j] = n;

					//sum += arr[i][j];
					//System.out.printf("%4d", sum);

					/*
					arr[0][4] += arr[0][0];
							  += arr[0][1];
							  += arr[0][2];
							  += arr[0][3];

					arr[4][0] += arr[0][0];
							  += arr[1][0];
							  += arr[2][0];
							  += arr[3][0];
					
					arr[4][4] += arr[0][0];
							  += arr[0][1];
							  += arr[0][2];
							  += arr[0][3];

					
					*/
					arr[i][arr[i].length-1] += arr[i][j];

					arr[arr.length-1][j] += arr[i][j];

					arr[arr.length-1][arr[i].length-1] += arr[i][j];
				}
			}

			// 배열의 배열 전체 출력 구문
			for (int i=0 ; i<arr.length ;i++ )
			{	
				for (int j=0 ; j<arr[i].length ;j++ )
				{
			
				System.out.printf("%3d",arr[i][j]);
				}
			
			System.out.println();


			}
	}
}

// 실행 결과

/*
  1  2  3  4 10
  5  6  7  8 26
  9 10 11 12 42
 13 14 15 16 58
 28 32 36 40136
계속하려면 아무 키나 누르십시오 . . .
*/
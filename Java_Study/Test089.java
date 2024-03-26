/*=========================================================
	■■■ 배열 ■■■
	- 배열의 배열
===========================================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*


 1 8 9  16 17	00 01 02 03 04	
 2 7 10 15 18	10 11 12 13 14	
 3 6 11 14 19	20 21 22 23 24  
 4 5 12 13 20   30 31 32 33 34						(0,0) (1,0) (2,0) (3,0)/ (3,1) (2,1) (1,1) (0,1)/ (0,2)
계속하려면 아무 키나 누르세요...										4						8
*/

public class Test089
{
	public static void main(String[] args)
	{
		//int[][] arr = new int[4][5];

		//int n=1;

		/*
		for (int i =0 ; i < arr[0].length ; i++ )
		{
			for (int j=0; j < arr.length ; j++ )
			{
				if (i % 2 == 0)
				{
					arr[j][i] = n;
					n++;
				}
				if (i % 2 == 1)
				{
					arr[3-j][i] = n;
					n++;
				}
			}
		}
		*/

		/*
		for (int j=0 ; j <5 ; j++ )
		{
			for (int i=0 ; i < 4 ; i++ )
			{
				arr[i][j] = n;
				n++;
				
			}
		}

		int[][] arr2 = new int[4][5];

		int m=4;

		for (int j=0 ; j <5 ; j++ )
		{
			for (int i=0 ; i < 4 ; i++ )
			{
				arr2[i][j] = m;
				m++;
				
			}
		}
		

		
		int i;
		int j;

		for ( j=0 ; j < 5 ; j++ )
		{
			for (i=0 ; i < 4 ; i++ )
			{
				if (i % 2 == 0)
				{
					arr[i][j] = arr[i][j];
				}
				else
				{
					arr[i][j] = arr2[i][j];
				}
				
			}
		}
		


		

		
		
		
		
		

	
		
			for (int a=0 ; a < arr.length ; a++ )
		{
			for (int b=0 ; b <arr[a].length ;b++ )
			{
				System.out.printf("%3d",arr[a][b]);
			}
			System.out.println();
		}
		*/
		
		
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];

		int n=0;

		for (int i=0;  i< 5 ; i++)	// outer 웅~~~~~~ 
		{
			for (int j=0; j < 4; j++) //j → 0 1 2 3
			{
				n++;

				if (i%2==0)
				{
					arr[j][i] = n;
				}
				else
				{
					arr[3-j][i] = n;
				}
			}
		}
		

		// 전체 요소 출력

		for (int i=0 ; i < arr.length ; i++ )		// i → 0 1 2 3
		{
			for (int j=0 ; j <arr[i].length ;j++ )	// j → 0 1 2 3 4
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

// 실행 결과

/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르십시오 . . .
*/
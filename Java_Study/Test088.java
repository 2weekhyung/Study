/*=========================================================
	■■■ 배열 ■■■
	- 배열의 배열
===========================================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
 1 2 3 4 5	00 01 02 03 04
 5 1 2 3 4	10 11 12 13 14
 4 5 1 2 3	20 21 22 23 24
 3 4 5 1 2  30 31 32 33 34
 2 3 4 5 1  40 41 42 43 44  
   
계속하려면 아무 키나 누르세요...
*/

/*
			 0으로
	1 2 3 4 5 |
	  1 2 3 4 | 5
	    1 2 3 | 4 5
		  1 2 | 3 4 5
		    1 | 2 3 4 5
*/
public class Test088
{
	public static void main(String[] args)
	{
		//int [][] arr = new int[5][5];
		
		/*
		for (int i=0 ; i < arr.length ; i++ )
		{
			for (int j = 0; j < arr[i].length ; j++ )
			{
				int n = j - i;
				if (j-i < 0)
				{
					n += 5;
				}
				arr[i][j] = n + 1;
			}
		}
		*/
		
		/*
		for (int i=0 ; i < arr.length ; i++)
		{
			int n=1;
			for (int j = 0; j < arr[i].length ; j++ )
			{	if (i <= j)
				{
					arr[i][j] = n;
					n++;
				}
				else 
				{
				  	arr[i][j] = n-5;
					n++;
				}
				
			}

		}
		*/
		/*
		int b;
		int m;

		for (int a = 0 ; a < arr.length ; a++ )
		{
			for (b=a, m=1 ; m <= 5 ; m++ )
			{
				arr[a][b]=m;

				b++;

				if (b ==5)
				{
					b = 0;
				}
			}
		}
		


		for (int i=0 ; i < arr.length ; i++ )
		{
			for (int j=0 ; j <arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		*/

		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length ; i++ )	// i → 0 1 2 3 4
		{
			for (int n=1, j=i ; n<=5 ; n++ )		// n → 1 2 3 4 5
			{
				//테스트(확인)
				//System.out.print(" "+i+", "+j+ "[" + n + "]");
				
				arr[i][j] = n;

				j++;

				if (j==5)
				{
					j=0;
				}
			}
			//System.out.println();
		}

		for (int i=0 ; i < arr.length ; i++ )
		{
			for (int j=0 ; j <arr[i].length ;j++ )
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}

//실행 결과

/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/
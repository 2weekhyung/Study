/*=========================================================
	���� �迭 ����
	- �迭�� �迭
===========================================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
1  2   3   4		10
5  6   7   8		26
9  10  11 12		42
13 14 15 16			58
28 32 36 40			146
����Ϸ��� �ƹ� Ű�� ��������...
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

			// �׽�Ʈ ����
			int sum=0;

			// �� for�� ����2�� ��-1�� �� �ݺ����� ó���� �ʿ����� ���� ����
			for (int i=0 ; i < arr.length-1 ;i++ )			//-- ��~ i �� 0 1 2 3
			{
				for (int j=0 ; j<arr[i].length-1 ;j++ )		//-- ������ j �� 0123 0123 0123 0123
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

			// �迭�� �迭 ��ü ��� ����
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

// ���� ���

/*
  1  2  3  4 10
  5  6  7  8 26
  9 10 11 12 42
 13 14 15 16 58
 28 32 36 40136
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
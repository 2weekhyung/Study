/*=========================================================
	���� �迭 ����
	- �迭�� �迭
===========================================================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*

E J O T Y							69(0,0)		74
D I N S X							68			73
C H M R W							67			72
B G L Q V							66			71
A F K P	U							65(4,0)		70
����Ϸ��� �ƹ� Ű�� ��������...										
*/

public class Test090
{
	public static void main(String[] args)
	{	/*
		int [][] arr = new int[5][5];
		
		int ch = 65;

		for (int j=0; j<5;j++ )
		{
			for (int i=0 ;i<5 ;i++ )
			{
				arr[4-i][j] = ch;
				ch++;
			}
		}

		for (int i=0 ; i < arr.length ; i++ )		// i �� 0 1 2 3
		{
			for (int j=0 ; j <arr[i].length ;j++ )	// j �� 0 1 2 3 4
			{
				System.out.printf("%3c",(char)arr[i][j]);
			}
			System.out.println();
		}
		*/

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		// �迭 ����
		char start = 'A';		//65

		for (int i=0 ; i<5 ; i++ )		//-- ��~~~ i ��		0			1		 2				3				4
		{
			for (int j=4; j>=0 ; j-- )	//-- ������ j �� 4 3 2 10	4 3 2 1 0  4 3 2 1 0	4 3 2 1 0		4 3 2 1 0
			{
				arr[j][i] = start++;
			}
		}

		// �迭 ��ü ��� ���
		for (int i=0 ; i<arr.length ;i++ )
		{	
			for (int j=0 ; j<arr[i].length ;j++ )
			{
			//System.out.printf("%3",arr[i][j]);
			System.out.printf("%3c",arr[i][j]);
			}
			
			System.out.println();
		}
		


	}
}

//���� ���

/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
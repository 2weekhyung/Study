/*=========================================================
	■■■ 배열 ■■■
	- 배열의 배열
===========================================================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*

E J O T Y							69(0,0)		74
D I N S X							68			73
C H M R W							67			72
B G L Q V							66			71
A F K P	U							65(4,0)		70
계속하려면 아무 키나 누르세요...										
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

		for (int i=0 ; i < arr.length ; i++ )		// i → 0 1 2 3
		{
			for (int j=0 ; j <arr[i].length ;j++ )	// j → 0 1 2 3 4
			{
				System.out.printf("%3c",(char)arr[i][j]);
			}
			System.out.println();
		}
		*/

		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 배열 구성
		char start = 'A';		//65

		for (int i=0 ; i<5 ; i++ )		//-- 웅~~~ i →		0			1		 2				3				4
		{
			for (int j=4; j>=0 ; j-- )	//-- 쑝쑝쑝 j → 4 3 2 10	4 3 2 1 0  4 3 2 1 0	4 3 2 1 0		4 3 2 1 0
			{
				arr[j][i] = start++;
			}
		}

		// 배열 전체 요소 출력
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

//실행 결과

/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .
*/
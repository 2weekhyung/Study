/*=========================================================
	■■■ 배열 ■■■
	- 배열의 배열
===========================================================*/
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y
계속하려면 아무 키나 누르세요...
*/
public class Test092
{
	public static void main(String[] args)
	{
		int [][] arr = new int[5][5];	// arr 이라는 배열 선언

		int ch = 65;					// char 형으로 데이터를 받아도 되지만,
										
										// ※ 'A' = 65
		
		for (int i = 0 ; i < arr.length ; i++ )			// i =		0		1		2		3		4	
		{
			for (int j=0 ; j < arr[i].length ; j++ )	// j =	   01234	01234	01234	01234	01234
			{
					arr[i][j] = ch;						// arr[0][0] 에 A 담기게 시작 
					ch++;								// 루프 하면서 ch 가 1씩 증가하면 알파벳이 한칸식 이동함
			}
		}
		

		// 배열 출력 구문
		for (int i=0 ; i < arr.length ; i++ )
		{
			for (int j=0 ; j < arr[i].length ; j++ )
			{
				System.out.printf("%3c", (char)arr[i][j]);		//int 형 배열을 char 로 변환 후 출력해야 원하는 배열을 얻을 수 있다
			}

			System.out.println();
		}
	}
}

// 실행 결과

/*
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
계속하려면 아무 키나 누르십시오 . . .
*/
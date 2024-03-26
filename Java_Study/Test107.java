/*===========================================
	■■■ 정렬(sort) 알고리즘 ■■■
=============================================*/
/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순,내림차순)

○ 정렬의 목적
    : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	  → 보기 좋게... 찾기 좋게...검색이 편하게...

○ 정렬의 종류
    : 선택 정렬, 삽입 정렬, 버블 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬 .....
*/

// 선택 정렬(Seclection Sort)

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Date : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...
public class Test107
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};

		/*
		52, 42, 12, 62, 60
		==  -- 

		42 52   12
		==		--
		
		*/
		/*
		System.out.print("Source Data : ");
		for (int i=0 ; i < a.length ; i++)
		{	
			System.out.printf("%4d",a[i]);
		}

		System.out.println();
		
		for (int i=0 ; i < a.length-1 ; i++ )
		{
			for (int j=i+1 ; j < a.length ; j++)
			{
				if (a[i] > a[j])
				{
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		System.out.print("Source Data : ");

		for (int i=0 ; i < a.length ; i++)
		{	
			System.out.printf("%4d",a[i]);
		}

		System.out.println();
		
		*/

		int i, j;
		
		System.out.print("Source Data : ");

		/*
		for (i=0 ; i < a.length ; i++)
		{	
			System.out.print(a[i] + " ");
		}

		System.out.println();
		//--==>> Source Data :   52  42  12  62  60
		*/

		// 향상된 for문(foreach 구문)
		for (int n : a )
		{
			System.out.print(n + " ");
		}
		System.out.println();
		//--==>> Source Data : 52 42 12 62 60

		// 정렬
		// → Seclection Sort
		for (i=0; i<a.length-1 ; i++ )		// 웅~~~~~~~ → 비교기준 데이터 (0			1			2			3)
		{
			for (j=i+1 ; j<a.length ; j++ )	// 쑝쑝쑝 → 비교대상 데이터(1 2 3 4) (2 3 4)     (3 4)			(4)
			{
				// 크기비교
				if (a[i] > a[j])				// 오름차순 정렬
				//if (a[i] < a[j])				// 내림차순
				{
					// 자리 바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		//결과출력
		System.out.print("Sorted Data : ");
		/*
		for (i=0 ; i<a.length ; i++ )
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		*/
		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();

		
		
	}
}

/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .

*/
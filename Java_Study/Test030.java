/*=========================================
	■■■ 연산자(Operator) ■■■
	- 조건 연산자 == 삼항 연산자
=========================================*/

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지... 평년인지... 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단 입력은 BufferedReader 를 활용하고
// 조건연산자를  활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2012 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2023
// 2023 → 평년
// 계속하려면 아무 키나 누르세요...

// ※ 2월이 28일 까지 있는 해 → 평년
//			29일 까지 있는 해 → 윤년

// ※ 윤년의 판별 조건
//	  연도가 4의 배수이면서 100의 배수가 아니거나
//	  400의 배수이면 윤년~!!!
//	  그렇지 않으면 평년~!!!


import java.io.*;

public class Test030
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int year;
		String strResult;

		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		
		//strResult = (year % 4 == 0) ? ((year % 100 != 0) ? "윤년" : (year % 400 == 0) ? 윤년") : "평년";
		strResult = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";
		
		

		System.out.printf("%d → %s\n", year, strResult);
		*/

		int year;
		String strResult;
		
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		// 연도가 4의 배수			연도가 100의 배수 아님		연도가 400의 배수
		// year%4==0				year%100!=0					year%400==0
		
		// → year%4==0	이면서 year%100!=0	또는 year%400==0
		// → year%4==0	&& year%100!=0	|| year%400==0
		strResult = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "평년";

		System.out.printf("%d → %s\n", year, strResult);



    }
}
//실행 결과

/*
임의의 연도 입력 : 2000
2000 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2048
2048 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2023
2023 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/
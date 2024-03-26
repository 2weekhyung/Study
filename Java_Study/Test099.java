/*==================================
	■■■ 클래스와 인스턴스 ■■■
	-클래스 설계
	-배열의 활용
	-접근제어지시자와 정보은닉
====================================*/

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calendar)는 사용하지 않는다.
// 또한 클래스의 개념을 활용하여 작성할 수 있도록 한다.
//(→ WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.

// 최종적으로...
// WeekDay클래스 설계를 통해
// Test009 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 2023 9 7
// >> 2023년 9월 7일 → 목요일
// 계속하려면 아무 키나 누르세요...

// ※ Hint
//	   - 1년 1월 1일 → "월요일"
//     - 1년은 365일이 아니다
//		2월의 마지막 날짜가 29일 → 윤년
//		2월의 마지막 날짜가 28일 → 평년
//	   - 윤년의 판별 조건
//	   - 년도가 4의 배수이면서 100의 배수가 아니거나,
//		 400의 배수이면 윤년, 그 이외의 년도는 평년

import java.util.Scanner;

class WeekDay
{	/*
	int y;
	int m;
	int d;
	String yoil;
	int unNomalYear;
	int totalDay;

	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}
	
	int[] arr = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	void cal1()
	{
		for (int r=1 ; r < y ; r++ )
		{
			if (r % 4 == 0 && r % 100 !=0 || r % 400 == 0)
			{
				unNomalYear++;
			}
		}
	}

	void cal2()
	{
		totalDay = (365 * ((y-1)-unNomalYear) + (366 * unNomalYear) );
	}

	void cal3()
	{
		for (int i=0 ; i < m-2 ; i++)
		{
			totalDay += arr[i];
		}
	}

	void cal4()
	{
		if (y % 4 == 0 && y % 100 !=0 || y % 400 == 0)
		{
			totalDay += 29;
		}
		else
		{
			totalDay += 28;
		}
	}

	void cal5()
	{
		totalDay += (d);
	}

	void cal6()
	{
		if (totalDay % 7 == 1)
		{
			yoil = "월";
		}

		else if (totalDay % 7 == 2)
		{
			yoil = "화";
		}

		else if (totalDay % 7 == 3)
		{
			yoil = "수";
		}

		else if (totalDay % 7 == 4)
		{
			yoil = "목";
		}

		else if (totalDay % 7 == 5)
		{
			yoil = "금";
		}

		else if (totalDay % 7 == 6)
		{
			yoil = "토";
		}

		else if (totalDay % 7 == 0)
		{
			yoil = "일";
		}
	}

	void print()
	{
		System.out.printf("%d년 %d월 %d일 → %s요일\n", y, m, d, yoil);
	}
	*/
	
	// 주요 변수 선언 → 속성
	private int y, m, d;

	// 메소드 정의 → 기능 : 연, 월 일 입력받기
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : ");	//-- 2024 3 19
		y = sc.nextInt();									//-- 2024
		m = sc.nextInt();									//-- 3
		d = sc.nextInt();									//-- 19
	}

	// 메소드 정의 → 기능 : 요일 산출하기
	public String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)를 배열 형태로 구성
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		//확인
		//System.out.println(months.length);
		//--==>> 12

		// 날 수를 종합할 변수
		int nalsu;

		// 요일을 판별할 변수
		int w;

		// 요일 타이틀을 배열 형태로 구성
		 String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

		// 윤년에 따른 2월의 날 수 계산
		// 입력 년도가 윤년이라면 2월의 마지막 날짜를 29일로 설정
		// 입력 년도가 평년이라면 2월의 마지막 날짜를 28일로 설정

		if (y%4==0 && y%100!=0 || y%400==0)	//-- 입력 년도가 윤년이라면..
		{
			// 2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		}
		
		else								//-- 입력 년도가 윤년이 아니라면... 즉, 평년이라면....
		{
			// 2월의 마지막 날짜를 28일 설정
			months[1] = 28;
		}
		

		// ex) 2024 3 19 → 1.1.1 ~ 2023.12.31
	// ① 1 년 1월 1일 부터 입력받은 년도의 이전년도 12월 31일 까지의 날 수 계산
	//						------------
	//							y
	//						------------------------
	//										y-1

	nalsu = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
	//		-----------
	//		1년기본주기	---------
	//					4년마다+1
	//							---------------
	//							100년마다+1(X)
	//											-------------
	//											400년마다+1
		

		//System.out.println("날 수 : " + nalsu);

		// ② 입력받은 월의 이전 월 까지의 날 수 계산 후
	// 이 결과를 1번의 결과에 더하는 연산
	// ex) 2024 3 19 → 2024 1.1 ~ 2024.2.29

	for (int i=0;i<(m-1) ;i++ )
	{
		nalsu += months[i];
	}
	//확인(테스트)
	//System.out.println("날 수 : " + nalsu);
	//--==>>년 월 일 입력(공백 구분) : 2024 3 19
	//		날 수 : 738945
	//				------
	//			    738885 + 31 + 29 + 738895
	//				1년 1월 1일 ~ 2024년 2월 29일 까지의 날 수

	// ③ 입력받은 일의 날짜만큼 날 수 계산 후
	//    이 결과를 2번의 결과에 더하는 연산
	//	  2024 3 19 → +19
	nalsu += d;		// nalsu 를 d만큼 증가

	//확인(테스트)
	//System.out.println("날 수 : " + nalsu);
	//--==>> 년 월 일 입력(공백 구분) : 2024 3 19
	//		 날 수 : 738964+ 19 = 738,964

	// ==>> 1.1.1 ~ 2024.3.19 총~~~~~ 날짜 수

	//----------------------------------------------------------------------여기까지 수행하면 날 수 연산 끝~!!!

	// 무슨 요일인지 확인하기 위한 연산
	
	w = nalsu % 7;		//-- 전체 날 수 % 7 == 0 일요일
						//-- 전체 날 수 % 7 == 1 월요일
						//-- 전체 날 수 % 7 == 2 화요일
						//-- 전체 날 수 % 7 == 3 수요일
						//-- 전체 날 수 % 7 == 4 목요일
						//-- 전체 날 수 % 7 == 5 금요일
						//-- 전체 날 수 % 7 == 6 토요일

	//System.out.println("w : " + w);
	//-->> 년 월 일 입력(공백 구분) : 2024 3 19
	//	    w : 2
	//		    -- → 계속하려면 아무 키나 누르십시오 . . .

	//return w;
	return weekNames[w];



	}

	// 메소드 정의 → 기능 : 결과 출력하기
	public void print(String day)
	{
		System.out.printf(">> %d년 %d월 %d일 → %s\n",y,m,d, day);
	}
	
	
}

public class Test099
{
	public static void main(String[] args)
	{	
		/*
		 WeekDay ob = new WeekDay();

		 ob.input();
		 ob.cal1();
		 ob.cal2();
		 ob.cal3();
		 ob.cal4();
		 ob.cal5();
		 ob.cal6();
		 ob.print();
		 */
		
		 // WeekDay 클래스 기반 인스턴스 생성
		 WeekDay wd = new WeekDay();

		 // 입력 메소드 호출
		 wd.input();

		 // 요일 산출 메소드 호출
		 String result =wd.week();
		 
		 // 최종 결과 출력 메소드 호출
		 wd.print(result);
		 
		 

	}
}

// 실행 결과

/*
년 월 일 입력(공백 구분) : 2024 3 19
>> 2024년 3월 19일 → 화
계속하려면 아무 키나 누르십시오 . . .

년 월 일 입력(공백 구분) : 2023 9 7
>> 2023년 9월 7일 → 목
계속하려면 아무 키나 누르십시오 . . .


*/
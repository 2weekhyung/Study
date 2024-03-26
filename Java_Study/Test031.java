/*=========================================
	■■■ 실행 흐름의 컨트롤 (제어문) ■■■
	- if문
	- if ~ else 문 실습
=========================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if~else문, 조건연산자, 복합if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참(true)일 경우
//    특정 문장을 수해아고자 할 때 사용되는 구문이다.

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.
// 등급은 평균 점수를 기준으로 처리한다.

// 90점 이상			: A
// 80 점 이상 90점 미만 : B
// 70 점 이상 80점 미만 : C
// 60 점 이상 70점 미만 : D
// 60 점 미만			: F

// 단, BufferedReader 를 활용해 데이터를 입력받을 수 있도록 하며,
// printf() 메소드를 통해 출력할 수 있도록 한다.

// 실행 예)
// 이름 입력 :
// 국어 점수 :
// 영어 점수 :
// 수학 점수:
//
// >> 당신의 이름은 김경태 입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240 이고, 평균은 80.00 입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무 키나 누르세요

import java.io.*;
public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		String name;
		int kor;
		int eng;
		int mat;
		int sum;
		double avg;
		char g;

		System.out.print("이름 입력 : ");
		name = br.readLine();
		
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor + eng + mat;
		avg = sum / 3.0;

		System.out.println();

		System.out.printf("당신의 이름은 %s입니다\n ", name);
		System.out.printf("국어 점수는 %d,\n", kor);
		System.out.printf("영어 점수는 %d,\n", eng);
		System.out.printf("수학 점수는 %d,\n", mat);
		System.out.printf("총점은 %d이고, 평균은 %.2f입니다\n", sum, avg);

		if (avg >= 90)
		{
			System.out.println("등급은 A입니다.");
		}
		else if (avg >= 80)
		{
			System.out.println("등급은 B입니다.");
		}
		else if (avg >= 70)
		{
			System.out.println("등급은 C입니다.");
		}
		else if (avg >= 60)
		{
			System.out.println("등급은 D입니다.");
		}
		else // 60 미만인 경우
		{
			System.out.println("등급은 F입니다.");
		}
		*/

		// 1. 사용자로부터 이름을 입력받는다.
		System.out.print("이름 입력 : ");
		String strName = br.readLine();

		// 2. 사용자로부터 국어, 영어, 수학 점수를 입력받는다.
		System.out.print("국어 점수 : ");
		String strKor = br.readLine();

		System.out.print("영어 점수 : ");
		String strEng = br.readLine();

		System.out.print("수학 점수 : ");
		String strMat = br.readLine();
		
		// 3. 문자열 형태로 입력받은 과목 점수를 정수 형태로 변환한다.
		int nKor = Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		int nMat = Integer.parseInt(strMat);

		// 4. 산술 연산을 통해 총점과 평균을 산출 한다.
		int nTot = nKor + nEng + nMat;		//-- 총점
		double fAvg= nTot / 3.0;			//-- 평균 check~!!!

		// 5. 등급에 대한 조건 검사를 수행한다.
		char grade;		//-- 등급

		if (fAvg >= 90)
		{
			grade = 'A';
		}
		//else if (fAvg >= 80 && fAvg < 90)
		else if (fAvg >= 80)		//-- 평균이 90점 미만 조건 포함
		{
			grade = 'B';
		}
		else if (fAvg >= 70)		//-- 평균이 80점 미만 조건 포함
		{
			grade = 'C';
		}
		else if (fAvg >= 60)		//-- 평균이 70점 미만 조건 포함
		{
			grade = 'D';
		}
		else // check~!!! 마직만은 되도록이면 else if가 아니라 else 끝내자
		// else if 로 끝낸다고 하면, char grade = 'F'; 식으로 미리 변수를 초기화 하자
		{
			grade = 'F';
		}

		// 6. 최종 결과 출력
		System.out.printf("\n>> 당신의 이름은 %s 입니다.\n", strName);
		System.out.printf(">> 국어 점수는 %s,\n", strKor);
		System.out.printf(">> 영어 점수는 %s,\n", strEng);
		System.out.printf(">> 수학 점수는 %s,\n", strMat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", nTot, fAvg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);






	}
}

// 실행 결과

/*
이름 입력 : 정한울
국어 점수 : 20
영어 점수 : 30
수학 점수 : 10

당신의 이름은 정한울입니다
 국어 점수는 20
영어 점수는 30
수학 점수는 10
총점은 60이고, 평균은 20.00입니다
등급은 F입니다
계속하려면 아무 키나 누르십시오 . . .
*/
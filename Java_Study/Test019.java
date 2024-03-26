/*=========================================
	■■■ 자바의 기본 프로그래밍 ■■■
	- 변수와 자료형
	- 자바의 기본 입출력 : System.util.Scanner
=========================================*/

// ※ java.utill.Scanner
//	  단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며 (구분자에 의해 구분된 것)
//	  디폴트(default)로 사용되는 단락문자는 공백이다.
//	  작성된 다음 토큰은 『next()』 메소드 사용
//	  다른 형태(자료형의) 값으로 변환할 수 있다.

import java.util.*;

public class Test019
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		// 연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(『,』 구분) : ");
		// 이름,국어,영어,수학(『,』 구분) : 채다선,90,80,70

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//				-----------
		//			"채다선,90,80,70"
		// new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//							.구분자사용();
		//										"\\s*,\\s*"
		//										  \s*,\s*
		// 김숙
		// 황금독수리세상을놀라게하다

		//- 사용자가 입력한 데이터를 각각의 변수에 담아내기
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		// 결과 출력
		System.out.println("\n>> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);


	}
}

// 실행 결과
/*
이름,국어,영어,수학 입력(『,』 구분) : 정한울,90,80,70

>> 이름 : 정한울
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/
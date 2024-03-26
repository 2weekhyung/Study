/*=======================================
 ■■■ 클래스 고급 ■■■
 - 인터페이스(Interface)
 ========================================*/

 // ○ 실습 문제
 //    성적 처리 프로그램을 구현한다.
 //    단 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 11
// 인원 수 입력(1~10) : 0
// 인원 수 입력(1~10) : 2

// 1번째 학생의 학번 이름 입력(공백 구분) : 2309123 김다슬
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 230925 김동민
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 60

// 2309123 김다슬 90  100  85 총점 평균.xx
//				  수  수   우
// 2309123 김동민 85  70   60 총점 평균.xx
//				  우  미   양

// 계속하려면 아무 키나 누르세요
// 90 이상 → 수
// 80 이상 90 미만 → 우
// 70 이상 80 미만 → 미
// 60 이상 70 미만 → 양
// 60 미만 (그 외) → 가

import java.util.Scanner;

// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name;		//-- 학번 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학점수
	int tot;				//-- 총점
	double avg;				//-- 평균
}

// 인터페이스
interface Sungjuk
{
	public void set();		// 인원 세팅
	public void input();	// 데이터 입력
	public void print();	// 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 이터페이스를 구현하는 클래스
class SunghukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	// 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		String grade;

		switch (score/10)
		{
		case 10: case 9: grade="수"; break;
		 case 8: grade="우"; break;
		 case 7: grade="미"; break;
		 case 6: grade="양"; break;
		 default: grade="가"; break;
		}

		return grade;
	}

	public void set()
	{	
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];
	}

	public void input()
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println();
	
		for (int i=0 ; i < rec.length ; i++ )
		{	
			rec[i] = new Record();
			
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3.0;

		}
	}

	public void print()
	{
		for (int i=0 ; i < rec.length ; i++ )
		{
			System.out.printf("\n%s %s %d %3d %3d %6d   %.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%16s %2s %2s\n",panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));
		}
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		// 문제 해결 과정에서 작성해야 할 구성 및 객체 생성
		ob = new SunghukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}

// 실행 결과

/*
인원 수 입력(1~10) : 11
인원 수 입력(1~10) : 0
인원 수 입력(1~10) : 2

1번째 학생의 학번 이름 입력(공백 구분) : 2309123 김다슬
국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
2번째 학생의 학번 이름 입력(공백 구분) : 2309345 김동민
국어 영어 수학 점수 입력   (공백 구분) : 85 70 60

2309123 김다슬 90 100  85    275   91.67
               수  수  우

2309345 김동민 85  70  60    215   71.67
               우  미  양
계속하려면 아무 키나 누르십시오 . . .
*/
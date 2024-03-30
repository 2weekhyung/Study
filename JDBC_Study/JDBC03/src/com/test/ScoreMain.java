/*=================
 ScoreMain.java
===================*/

/*
○ 성적 처리 프로그램 구현 → 데이터베이스 연동 → ScoreDAO, ScoreDTO 클래스 활용

   여러 명의 이름, 국어점수, 영어점수, 수학점수를 입력받아
   총점, 평균을 연산하여 내용을 출력하는 프로그램을 구현한다.
   
실행 예)

1번째 학생 성적 입력(이름 국어 영어 수학) : 강혜성 80 75 60
2번째 학생 성적 입력(이름 국어 영어 수학) : 김동민 100 90 80
3번째 학생 성적 입력(이름 국어 영어 수학) : 이주형 80 85 80
4번째 학생 성적 입력(이름 국어 영어 수학) : .

--------------------------------------------------------------
	번호	이름	국어	영어	수학	총점	평균
--------------------------------------------------------------
	1		강혜성	 80		 75		 60		 xxx    xx.x
	2		김동민	100		 90		 80		 xxx    xx.x
	3		이주형	 80		 85		 80		 xxx    xx.x
*/

package com.test;

import java.util.Scanner;

public class ScoreMain
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		ScoreDAO dao = new ScoreDAO();
		
		try
		{
		  int count = dao.count();
		  
			do
			{
				System.out.printf("%d번째 학생 성적 입력(이름 국어 영어 수학) : ", ++count);
				String name = sc.next();
				
				if (name.equals("."))
				{
					break;
				}
				
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				int mat = sc.nextInt();
				
				ScoreDTO dto = new ScoreDTO();
				
				dto.setName(name);
				dto.setKor(kor);
				dto.setEng(eng);
				dto.setMat(mat);
				
				
				int result = dao.input(dto);
				if (result > 0)
				{
					System.out.println(">> 회원 정보 입력 완료~!!!");
				}
				
			}while (true);
			
			System.out.println();
			System.out.println("--------------------------------------------------------------");
			System.out.println("	번호	이름	국어	영어	수학	총점	평균");
			
			for (ScoreDTO obj : dao.list())
			{	
				int tot = obj.getKor() + obj.getEng()+ obj.getEng();
				
				double avg = tot / 3.0;
				
				System.out.printf("%3s %4s %4d %4d %4d %4d %4.1f\n", obj.getSid(), obj.getName(), obj.getKor(), obj.getEng(), obj.getMat(), tot, avg);
			}
			System.out.println("--------------------------------------------------------------");
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}

// 실행 결과
/*
 * --------------------------------------------------------------
	번호	이름	국어	영어	수학	총점	평균
  1  강혜성   80   75   60  230 76.7
  2  김동민  100   90   80  280 93.3
  3  이주형   80   85   80  250 83.3
--------------------------------------------------------------
*/

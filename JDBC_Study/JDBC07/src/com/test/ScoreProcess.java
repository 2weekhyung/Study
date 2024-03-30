package com.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreProcess
{	
	private ScoreDAO dao;
	
	public ScoreProcess()
	{
		dao = new ScoreDAO();
	}
	
	public void sungjukInsert()
	{	
		Scanner sc = new Scanner(System.in);
		
		try
		{
			dao.connection();
			
			int count = dao.count();
			
			
			do
			{
				System.out.printf("%d번 학생 성적 입력(이름 국어 영어 수학) : ", (++count));
				
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
				
				int result = dao.add(dto);
				
				if (result > 0)
				{
					System.out.println("성적 입력이 완료되었습니다.");
				}
				
				dao.close();
						
			} while (true);
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		
	
	}
	
	public void sungjukSelectAll()
	{
		try
		{
			dao.connection();
			
			int count = dao.count();
			
			System.out.printf("전체 인원: %d명\n", count);
			
			System.out.println(" 번호	 이름	  국어	 영어   수학   총점   평균	석차");
			
			for (ScoreDTO dto : dao.lists())
			{
				System.out.printf("%4s %6s %6d %6d %6d %6d %8.1f %6d\n"
						, dto.getSid(), dto.getName(), dto.getKor(), dto.getEng()
						, dto.getMat(), dto.getTot(), dto.getAvg(), dto.getRank());
			}
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	public void sungjukSearchName()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();
		
		try
		{
			dao.connection();
				
			ArrayList<ScoreDTO> arrayList = dao.lists(name);
			
			if (arrayList.size() > 0)
			{
				
				System.out.println(" 번호	 이름	  국어	 영어   수학   총점   평균	석차");
				
				for (ScoreDTO dto : arrayList)
				{
					System.out.printf("%4s %6s %6d %6d %6d %6d %8.1f %6d\n"
							, dto.getSid(), dto.getName(), dto.getKor(), dto.getEng()
							, dto.getMat(), dto.getTot(), dto.getAvg(), dto.getRank());
				}
			}
			else
			{
				
				System.out.println("검색결과가 존재하지 않습니다.");
			}
			
			dao.close();
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	public void sungjukUpdate()
	{
		try
		{	
			//수정할 대상의 번호 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 번호를 입력하세요 : ");
			int sid = sc.nextInt();
			
			//-- 입력받은 번호로 체크해야 할 로직 적용 삽입 가능
			
			// 데이터베이스 연결
			dao.connection();
			
			// 수정할 대상 수신 → 데이터 수정을 위한 대상 검색
			ArrayList<ScoreDTO> arrayList =  dao.lists(sid);
			
			if (arrayList.size() > 0)
			{
				// 수신된 내용 출력
				System.out.println("  번호    이름    국어    영어    수학    총점    평균    석차");
				
				for (ScoreDTO dto : arrayList)
				{
					System.out.printf("%4s %8s %8d %8d %8d %8d %8.1f %8d\n"
							, dto.getSid(), dto.getName(), dto.getKor(), dto.getEng()
							, dto.getMat(), dto.getTot(), dto.getAvg(), dto.getRank());
				}
				
				System.out.println();
				System.out.print("수정 데이터 입력(이름 국어 영어 수학) : ");
				String name = sc.next();
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				int mat = sc.nextInt();
				
				// dto 구성
				ScoreDTO dto = new ScoreDTO();
				dto.setName(name);
				dto.setKor(kor);
				dto.setEng(eng);
				dto.setMat(mat);
				dto.setSid(sid);	// -- check~!!!
				
				// 구성된 dto 를 넘겨주며 dao 의 modify() 메소드 호출
				int result = dao.modify(dto);
				
				if (result > 0)
				{
					System.out.println("수정이 완료되었습니다.");
				}
			}
			else
			{
				// 수신된 내용이 존재하지 않는 상황 전달(안내)
				System.out.println("검색 결과가 존재하지 않습니다.");
			}
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	public void sungjukDelete() throws SQLException
	{	
					Scanner sc = new Scanner(System.in);
					
					System.out.print("삭제할 학생의 번호를 입력하세요 : ");
					int sid = sc.nextInt();
					
					dao.connection();
					
					ArrayList<ScoreDTO> arrayList =  dao.lists(sid);

					if (arrayList.size() > 0)
					{	
	
						System.out.println(" 번호	 이름	  국어	 영어   수학   총점   평균	석차");
						
						for (ScoreDTO dto : arrayList)
						{
							System.out.printf("%4s %6s %6d %6d %6d %6d %8.1f %6d\n"
									, dto.getSid(), dto.getName(), dto.getKor(), dto.getEng()
									, dto.getMat(), dto.getTot(), dto.getAvg(), dto.getRank());
						}
						
						System.out.print("정말 삭제하시겠습니까?(Y/N) : ");
						String response = sc.next();
						
						if (response.equals("Y") || response.equals("y"))
						{
							int result = dao.remove(sid);
							
							if (result > 0)
							{
								System.out.print("삭제가 완료되었습니다.");
							}
						}
						else
						{
							System.out.println("취소되었습니다.");
						}
						
					}
					
					else
					{	
						System.out.println("검색 결과가 존재하지 않습니다.");
					}
					
					dao.close();
	}
}

/*============================================
 	MemberProcess.java
 	- 콘솔 기반 서브 메뉴 입출력 전용 클래스
==============================================*/

package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberProcess
{	
	private MemberDAO dao;
	
	public MemberProcess()
	{
		dao = new MemberDAO();
	}
	
	public void jikwonInsert()
	{
		try
		{
			dao.connection();
			
			Scanner sc = new Scanner(System.in);
			
			// 도시 결합
			ArrayList<String> citys = dao.listsOfCity();
			StringBuilder cityUnion = new StringBuilder();
			
			for (String city : citys)
			{
				cityUnion.append(city + "/");
			}
			
			// 부서 결합
			ArrayList<String> buseos = dao.listsOfBuseo();
			StringBuilder buseoUnion = new StringBuilder();
			
			for (String buseo : buseos)
			{
				buseoUnion.append(buseo + "/");
			}
			
			// 직위 결합
			ArrayList<String> jikwis = dao.listsOfJikwi();
			StringBuilder jikwiUnion = new StringBuilder();
			
			for (String jikwi : jikwis)
			{
				jikwiUnion.append(jikwi + "/");
			}
			
			// 직급별 최소 기본급
			
			
			do
			{
				System.out.println();
				System.out.println("--------------------------------------------------------------------");
				System.out.println("직원 정보 입력");
				System.out.print("이름 : ");
				String nameA = sc.next();
				
				if (nameA.equals("."))
				{
					break;
				}
				
				System.out.print("주민등록 번호 : ");
				String ssnA = sc.next();
				
				System.out.print("입사일 : ");
				String ibsadateA = sc.next();
				
				System.out.print("지역"+ " (" + cityUnion + ") : ");
				String cityA = sc.next();
				
				System.out.print("전화번호 : ");
				String telA = sc.next();
				
				System.out.print("부서"+ " (" + buseoUnion + ") : ");
				String buseoA = sc.next();
				
				System.out.print("직위"+ " (" + jikwiUnion + ") : ");
				String jikwiA = sc.next();
				
				int min_pay = dao.listsOfMinpay(jikwiA);
				
				System.out.print("기본급 (최소 " + min_pay +") : ");
				int basicPayA = sc.nextInt();
				
				
				System.out.print("수당 : ");
				int sudangA = sc.nextInt();
				
				System.out.println();
				
				// 입력받은 항목들로 객체 구성
				MemberDTO dto = new MemberDTO();
				
				dto.setEmp_name(nameA);
				dto.setSsn(ssnA);
				dto.setDate(ibsadateA);
				dto.setCity_name(cityA);
				dto.setTel(telA);
				dto.setBuseo_name(buseoA);
				dto.setJikwi_name(jikwiA);
				dto.setBasicpay(basicPayA);
				dto.setSudang(sudangA);
				
				int result = dao.add(dto);
				
				if (result > 0)
				{
					System.out.println("직원 정보 입력 완료~!!!");
				}
				
			} while (true);
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	public void jikwonSelectAll()
	{	
		dao.connection();
		
		Scanner sc = new Scanner(System.in);
		
		int count = dao.count();
		
		System.out.println();
		
		try
		{
			do
			{	
				int sel = 0;
				
				System.out.println("1. 사번정렬");
				System.out.println("2. 이름정렬");
				System.out.println("3. 부서정렬");
				System.out.println("4. 직위정렬");
				System.out.println("5. 급여내림차순 정렬");
				System.out.print("-->> 메뉴 선택(1~5, -1종료) -1 : ");
				
				sel = sc.nextInt();
				
				if (sel == -1)
				{
					break;
				}
				
				System.out.printf("전체 인원 : %d명\n", count);
				
				System.out.println("사번 이름 주민번호 입사일 지역 전화번호 부서 직위 기본급 수당 급여");
				
				for (MemberDTO dto : dao.lists(sel))
				{
					System.out.printf("%s %s %s %s %s %s %s %s %d %d %d\n", dto.getEmp_id(), dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getSal());
				}
				
			} while (true);
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	
	public void jikwonSearch()
	{
		Scanner sc = new Scanner(System.in);
		
		dao.connection();
		
		try
		{
			do
			{	
				int sel = 0;
				
				System.out.println("1. 사번검색");
				System.out.println("2. 이름검색");
				System.out.println("3. 부서검색");
				System.out.println("4. 직위검색");
				
				System.out.print("-->> 메뉴 선택(1~5, -1종료) -1 : ");
				sel = sc.nextInt();
				
				if (sel == -1)
				{
					break;
				}
				
				String column;
				
				switch (sel)
				{
				case 1 : column = "EMP_ID";
						 System.out.print("사번을 입력해 주세요 : ");
						 String e_id = sc.next();
						 
						 int count = dao.count(column, e_id);
						 System.out.printf("인원 : %d명\n", count);
						 
						 ArrayList<MemberDTO> arrayList = dao.search(column, e_id);
						 
						 if (arrayList.size() > 0)
						 {
							System.out.println("사번 이름 주민번호 입사일 지역 전화번호 부서 직위 기본급 수당 급여");
								
							for (MemberDTO dto : arrayList)
							{
								System.out.printf("%s %s %s %s %s %s %s %s %d %d %d\n", dto.getEmp_id(), dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getSal());
							}
						 }
						 else
						 {
							 System.out.println("검색결과가 존재하지 않습니다.");
						 }
					
					break;
					
				case 2 : column = "EMP_NAME";
						 System.out.print("이름을 입력해 주세요 : ");
						 String e_name = sc.next();
						 
						 int countA = dao.count(column, e_name);
						 System.out.printf("인원 : %d명\n", countA);
						 
						 ArrayList<MemberDTO> arrayListA = dao.search(column, e_name);
						 
						 if (arrayListA.size() > 0)
						 {
							System.out.println("사번 이름 주민번호 입사일 지역 전화번호 부서 직위 기본급 수당 급여");
								
							for (MemberDTO dto : arrayListA)
							{
								System.out.printf("%s %s %s %s %s %s %s %s %d %d %d\n", dto.getEmp_id(), dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getSal());
							}
						 }
						 else
						 {
							 System.out.println("검색결과가 존재하지 않습니다.");
						 }
						 
					break;
				
				case 3 : column = "BUSEO_NAME";
						 System.out.print("부서를 입력해 주세요 : ");
						 String buseo_name = sc.next();
						 
						 int countB = dao.count(column, buseo_name);
						 System.out.printf("인원 : %d명\n", countB);
						 
						 ArrayList<MemberDTO> arrayListB = dao.search(column, buseo_name);
						 
						 if (arrayListB.size() > 0)
						 {
							System.out.println("사번 이름 주민번호 입사일 지역 전화번호 부서 직위 기본급 수당 급여");
								
							for (MemberDTO dto : arrayListB)
							{
								System.out.printf("%s %s %s %s %s %s %s %s %d %d %d\n", dto.getEmp_id(), dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getSal());
							}
						 }
						 else
						 {
							 System.out.println("검색결과가 존재하지 않습니다.");
						 }
				
					break;
				
				case 4 : column = "JIKWI_NAME";
						 System.out.print("직위를 입력해 주세요 : ");
						 String jikwi_name = sc.next();
						 
						 int countC = dao.count(column, jikwi_name);
						 System.out.printf("인원 : %d명\n", countC);
						 
						 ArrayList<MemberDTO> arrayListC = dao.search(column, jikwi_name);
						 
						 if (arrayListC.size() > 0)
						 {
							System.out.println("사번 이름 주민번호 입사일 지역 전화번호 부서 직위 기본급 수당 급여");
								
							for (MemberDTO dto : arrayListC)
							{
								System.out.printf("%s %s %s %s %s %s %s %s %d %d %d\n", dto.getEmp_id(), dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getSal());
							}
						 }
						 else
						 {
							 System.out.println("검색결과가 존재하지 않습니다.");
						 }
				
					break;

				default : column = "";
					break;
				}
				
				
			} while (true);
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	
	public void jikwonUpdate()
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("수정할 직원의 번호를 입력하세요 : ");
			String e_id = sc.next();
			
			dao.connection();
			
			ArrayList<MemberDTO> arrayList = dao.search("EMP_ID", e_id);
			
			if (arrayList.size() > 0)
			{
				System.out.println("사번 이름 주민번호 입사일 지역 전화번호 부서 직위 기본급 수당 급여");
				
				for (MemberDTO dto : arrayList)
				{
					System.out.printf("%s %s %s %s %s %s %s %s %d %d %d\n", dto.getEmp_id(), dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getSal());
				}
				
				System.out.println();
				
				ArrayList<String> citys = dao.listsOfCity();
				StringBuilder cityUnion = new StringBuilder();
							
				for (String city : citys)
				{
					cityUnion.append(city + "/");
				}
							

				ArrayList<String> buseos = dao.listsOfBuseo();
				StringBuilder buseoUnion = new StringBuilder();
							
				for (String buseo : buseos)
				{
					buseoUnion.append(buseo + "/");
				}
							
				ArrayList<String> jikwis = dao.listsOfJikwi();
				StringBuilder jikwiUnion = new StringBuilder();
							
				for (String jikwi : jikwis)
				{
					jikwiUnion.append(jikwi + "/");
				}

				System.out.println("수정 데이터 입력");
				System.out.print("이름 : ");
				String nameA = sc.next();
								
				System.out.print("주민등록 번호 : ");
				String ssnA = sc.next();
								
				System.out.print("입사일 : ");
				String ibsadateA = sc.next();
								
				System.out.print("지역"+ " (" + cityUnion + ") : ");
				String cityA = sc.next();
								
				System.out.print("전화번호 : ");
				String telA = sc.next();
								
				System.out.print("부서"+ " (" + buseoUnion + ") : ");
				String buseoA = sc.next();
								
				System.out.print("직위"+ " (" + jikwiUnion + ") : ");
				String jikwiA = sc.next();
								
				int min_pay = dao.listsOfMinpay(jikwiA);
								
				System.out.print("기본급 (최소 " + min_pay +") : ");
				int basicPayA = sc.nextInt();
												
				System.out.print("수당 : ");
				int sudangA = sc.nextInt();
								
				System.out.println();
				
				MemberDTO dto = new MemberDTO();
				
				dto.setEmp_name(nameA);
				dto.setSsn(ssnA);
				dto.setDate(ibsadateA);
				dto.setCity_name(cityA);
				dto.setTel(telA);
				dto.setBuseo_name(buseoA);
				dto.setJikwi_name(jikwiA);
				dto.setBasicpay(basicPayA);
				dto.setSudang(sudangA);
				dto.setEmp_id(e_id);
				
				int result = dao.modify(dto);
				
				if (result > 0)
				{
					System.out.println("수정이 완료되었습니다.");
				}
			}
			else
			{
				System.out.println("검색결과가 존재하지 않습니다.");
			}
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	public void jikwonDelete()
	{	
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("삭제할 직원의 번호를 입력하세요 : ");
			String e_id = sc.next();
			
			dao.connection();
			
			ArrayList<MemberDTO> arrayList = dao.search("EMP_ID", e_id);
			
			if (arrayList.size() > 0)
			 {
				System.out.println("사번 이름 주민번호 입사일 지역 전화번호 부서 직위 기본급 수당 급여");
					
				for (MemberDTO dto : arrayList)
				{
					System.out.printf("%s %s %s %s %s %s %s %s %d %d %d\n", dto.getEmp_id(), dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getSal());
				}
				
				System.out.println("정말 삭제하시겠습니까?(Y/N) : ");
				String response = sc.next();
				
				if (response.equals("Y") || response.equals("y"))
				{
					int result = dao.remove(Integer.parseInt(e_id));
					
					if (result > 0)
					{
						System.out.println("삭제가 완료되었습니다.");
					}
				}
				else
				{
					System.out.println("취소되었습니다.");
				}
			 }
			 else
			 {
				 System.out.println("검색결과가 존재하지 않습니다.");
			 }
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
}

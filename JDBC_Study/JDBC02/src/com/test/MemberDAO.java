/*==============================
 	MemberDAO.java
===============================*/

// 데이터베이스에 액세스 하는 기능
// → DBConn 활용(전담 계층)

// 데이터를 입력하는 기능 → insert

// 인원 수 확인하는 기능
// 즉, 대상 테이블(TBL_MEMBER)의 레코드 카운팅 기능 → select

// 전체 리스트를 조회하는 기능
// 즉, 대상 테이블(TBL_MEMBER)의 데이터를 조회하는 기능 → select

/*
○ TBL_MEMBER 테이블을 활용하여
   이름과 전화번호를 여러 건 입력받고, 전체 출력하는 프로그램을 구현한다.
   단, 데이터베이스 연동이 이루어져야 하고
   MemberDAO, MemberDTO(vo) 클래스를 활용해야 한다.
   
실행 예)

이름 전화 번호 입력(2) : 임하성 010-2222-2222
>> 회원 정보 입력 완료~!!!

이름 전화 번호 입력(3) : 김민지 010-3333-3333
>> 회원 정보 입력 완료~!!!

이름 전화 번호 입력(4) : .

-----------------------------------------------
전체 회원수 : 3명
-----------------------------------------------
번호 이름 전화번호
1 이윤수 010-1111-1111
2 임하성 010-2222-2222
3 김민지 010-3333-3333
------------------------------------------------
*/

package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.util.DBConn;

public class MemberDAO
{
	// 주요 속성 구성 → DB 연결 객체
	private Connection conn;
	
	/*
	public Connection getConn()
	{
		return conn;
	}

	public void setConn(Connection conn)
	{
		this.conn = conn;
	}
	*/
	
	// 생성자 정의(사용자 정의 생성자)
	public MemberDAO()
	{
		conn = DBConn.getConnection();
	}
	
	// 메소드 정의 → 데이터를 입력하는 기능
	public int add(MemberDTO dto) throws SQLException
	{	
		// 반환할 결과값을 담아낼 변수(적용된 행의 갯수)
		int result = 0;
		
		try
		{
			// 작업 객체 생성
			Statement stmt = conn.createStatement();
			
			// 쿼리문 준비(insert)
			String sql = String.format("INSERT INTO TBL_MEMBER(SID, NAME, TEL) VALUES(MEMBERSEQ.NEXTVAL, '%s', '%s')", dto.getName(), dto.getTel());
			
			// 쿼리문 실행
			result = stmt.executeUpdate(sql);
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 메소드 정의 → 전체 인원 수 확인하는 기능
	public int count() throws SQLException
	{	
		// 결과값으로 반환하게 될 변수 선언 및 초기화(인원 수)
		int result = 0;
		
		try
		{
			// 작업 객체 생성
			Statement stmt = conn.createStatement();
			
			// 쿼리문 준비(select)
			String sql = "SELECT COUNT(*) AS COUNT FROM TBL_MEMBER";
			
			// 쿼리문 실행
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next())
			{
				result = rs.getInt("COUNT");
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 메소드 정의 → 전체 리스트 조회하는 기능
	public ArrayList<MemberDTO> lists() throws SQLException
	{	
		// 결과값으로 반환할 변수 선언 및 초기화
		ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
		
		try
		{	
			// 작업 객체 생성
			Statement stmt = conn.createStatement();
			
			// 쿼리문 준비(select)
			String sql = "SELECT SID, NAME, TEL FROM TBL_MEMBER ORDER BY SID";
			
			// 쿼리문 실행
			ResultSet rs = stmt.executeQuery(sql);
			
			
			
			// check~!!!
			while (rs.next())
			{	
				MemberDTO dto = new MemberDTO();
		
				dto.setSid(rs.getString("SID"));
				dto.setName(rs.getString("NAME"));
				dto.setTel(rs.getString("TEL"));
				
				result.add(dto);
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 메소드 정의 → 데이터베이스 연결 종료
	public void close()
	{	
		// 주의 check~!!!
		//conn.close();
		
		DBConn.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

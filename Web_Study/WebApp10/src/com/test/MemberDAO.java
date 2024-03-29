package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.util.DBConn;

public class MemberDAO
{
	// 주요 속성 구성
	private Connection conn;
	
	// 데이터베이스 연결 → 생성자 형태로 정의
	public MemberDAO() throws ClassNotFoundException, SQLException
	{
		conn = DBConn.getConnection();
	}
	
	// 데이터 입력 메소드 정의
	public int add(MemberDTO dto)
	{
		int result = 0;
		
		try
		{	
			String sql = "INSERT INTO TBL_MEMBER(SID, NAME, TEL)"
					+ " VALUES(MEMBERSEQ.NEXTVAL, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTel());
			
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 리스트 출력 메소드 정의
	public ArrayList<MemberDTO> lists()
	{	
		ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
		
		try
		{	
			String sql = "SELECT SID, NAME, TEL FROM TBL_MEMBER ORDER BY SID";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next())
			{	
				MemberDTO dto = new MemberDTO();
		
				dto.setSid(rs.getString("SID"));
				dto.setName(rs.getString("NAME"));
				dto.setTel(rs.getString("TEL"));
				
				result.add(dto);
			}
			
			rs.close();
			pstmt.close();
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 전체 인원 수 확인을 위한 메소드 정의
	public int count()
	{	
		int result = 0;
		
		try
		{	
			String sql = "SELECT COUNT(*) AS COUNT FROM TBL_MEMBER";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next())
			{
				result = rs.getInt("COUNT");
			}
			
			rs.close();
			pstmt.close();
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 데이터베이스 연결 종료 담당 메소드, 정의
	public void close() throws SQLException
	{
		DBConn.close();
	}
}

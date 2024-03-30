package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.util.DBConn;

public class ScoreDAO
{
	// 주요 속성 구성 → DB 연결 객체
	private Connection conn;
	
	public ScoreDAO()
	{
		conn = DBConn.getConnection();
	}
	
	// 입력 메소드
	public int input(ScoreDTO dto)
	{
		int result = 0;
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = String.format("INSERT INTO TBL_SCORE(SID, NAME, KOR, ENG, MAT) VALUES(SCORESEQ.NEXTVAL,'%s', %d, %d, %d)", dto.getName(), dto.getKor(), dto.getEng(), dto.getMat());
			
			result = stmt.executeUpdate(sql);
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 카운트 메소드
	public int count()
	{
		int result = 0;
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT COUNT(*) AS COUNT FROM TBL_SCORE";
			
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
	
	// 리스트 메소드
	public ArrayList<ScoreDTO> list()
	{
		ArrayList<ScoreDTO> result = new ArrayList<ScoreDTO>();
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT SID, NAME, KOR, ENG, MAT FROM TBL_SCORE";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{
				ScoreDTO dto = new ScoreDTO();
				
				dto.setSid(rs.getString("SID"));
				dto.setName(rs.getString("NAME"));
				
				dto.setKor(rs.getInt("KOR"));
				dto.setEng(rs.getInt("ENG"));
				dto.setMat(rs.getInt("MAT"));
				
				result.add(dto);
				
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

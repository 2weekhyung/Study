package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.util.DBConn;

public class ScoreDAO
{
	private Connection conn;
	
	public ScoreDAO() throws ClassNotFoundException, SQLException
	{
		conn = DBConn.getConnection();
	}
	
	public int add(ScoreDTO dto)
	{
		int result = 0;
		
		try
		{
			String sql = "INSERT INTO TBL_SCORE(SID, NAME, KOR, ENG, MAT) VALUES(SCORESEQ.NEXTVAL, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMat());
			
			result = pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	public int count()
	{
		int result = 0;
		
		try
		{
			String sql = "SELECT COUNT(*) AS COUNT FROM TBL_SCORE";
			
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
	
	public ArrayList<ScoreDTO> lists()
	{
		ArrayList<ScoreDTO> result = new ArrayList<ScoreDTO>();
		
		try
		{
			String sql = "SELECT SID, NAME, KOR, ENG, MAT,"
					+ " (KOR+ENG+MAT) AS TOT,"
					+ " (KOR+ENG+MAT)/3 AS AVG"
					+ " FROM TBL_SCORE ORDER BY SID";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			int kor = 0;
			int eng = 0;
			int mat = 0;
			int tot = 0;
			double avg = 0;
			
			while (rs.next())
			{	
				ScoreDTO dto = new ScoreDTO();
		
				dto.setSid(rs.getString("SID"));
				dto.setName(rs.getString("NAME"));
				
				kor = rs.getInt("KOR");
				eng = rs.getInt("ENG");
				mat = rs.getInt("MAT");
				
				tot = (kor+eng+mat);
				avg = tot/3.0;
				
				//dto.setKor(rs.getInt("KOR"));
				//dto.setEng(rs.getInt("ENG"));
				//dto.setMat(rs.getInt("MAT"));
				
				dto.setKor(kor);
				dto.setEng(eng);
				dto.setMat(mat);
				dto.setTot(tot);
				dto.setAvg(avg);
				
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
	
	public void close() throws SQLException
	{
		DBConn.close();
	}
}

package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.PartialResultException;

import com.util.DBConn;

public class ScoreDAO
{	
	private Connection conn;
	
	public Connection connection()
	{
		conn = DBConn.getConnection();
		return conn;
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
	
	// 성적 전체 출력
	public ArrayList<ScoreDTO> lists()
	{
		ArrayList<ScoreDTO> result = new ArrayList<ScoreDTO>();
		
		try
		{	
			String sql = "SELECT SID, NAME, KOR, ENG, MAT"
					+ ", (KOR + ENG + MAT) AS TOT"
					+ ", (KOR + ENG + MAT)/3 AS AVG"
					+ ", RANK() OVER(ORDER BY (KOR+ENG+MAT) DESC) AS RANK FROM TBL_SCORE";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				ScoreDTO dto = new ScoreDTO();
				
				dto.setSid(rs.getInt("SID"));
				dto.setName(rs.getString("NAME"));
				
				dto.setKor(rs.getInt("KOR"));
				dto.setEng(rs.getInt("ENG"));
				dto.setMat(rs.getInt("MAT"));
				
				dto.setTot(rs.getInt("TOT"));
				dto.setAvg(rs.getDouble("AVG"));
				dto.setRank(rs.getInt("RANK"));
				
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
	
	// 이름 검색 출력
	public ArrayList<ScoreDTO> lists(String name)
	{
		ArrayList<ScoreDTO> result = new ArrayList<ScoreDTO>();
		
		try
		{	
			String sql = "SELECT SID, NAME, KOR, ENG, MAT"
					+ ", (KOR + ENG + MAT) AS TOT"
					+ ", (KOR + ENG + MAT)/3 AS AVG"
					+ ", RANK() OVER(ORDER BY (KOR+ENG+MAT) DESC) AS RANK FROM TBL_SCORE WHERE NAME = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				ScoreDTO dto = new ScoreDTO();
				
				dto.setSid(rs.getInt("SID"));
				dto.setName(rs.getString("NAME"));
				
				dto.setKor(rs.getInt("KOR"));
				dto.setEng(rs.getInt("ENG"));
				dto.setMat(rs.getInt("MAT"));
				
				dto.setTot(rs.getInt("TOT"));
				dto.setAvg(rs.getDouble("AVG"));
				dto.setRank(rs.getInt("RANK"));
				
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
	
	// 번호 검색
	public ArrayList<ScoreDTO> lists(int sid)
	{
		ArrayList<ScoreDTO> result = new ArrayList<ScoreDTO>();
		
		try
		{	
			String sql = "SELECT SID, NAME, KOR, ENG, MAT"
					+ ", (KOR + ENG + MAT) AS TOT"
					+ ", (KOR + ENG + MAT)/3 AS AVG"
					+ ", RANK() OVER(ORDER BY (KOR+ENG+MAT) DESC) AS RANK FROM TBL_SCORE WHERE SID = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, sid);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				ScoreDTO dto = new ScoreDTO();
				
				dto.setSid(rs.getInt("SID"));
				dto.setName(rs.getString("NAME"));
				
				dto.setKor(rs.getInt("KOR"));
				dto.setEng(rs.getInt("ENG"));
				dto.setMat(rs.getInt("MAT"));
				
				dto.setTot(rs.getInt("TOT"));
				dto.setAvg(rs.getDouble("AVG"));
				dto.setRank(rs.getInt("RANK"));
				
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
	
	// 성적 수정
	public int modify(ScoreDTO dto)
	{
		int result = 0;
		
		try
		{	
			String sql = ("UPDATE TBL_SCORE SET NAME = ?, KOR = ?, ENG = ?, MAT = ? WHERE SID = ?");
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3, dto.getEng());
			pstmt.setInt(4, dto.getMat());
			pstmt.setInt(5,  dto.getSid());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 성적 삭제
	public int remove(int sid)
	{
		int result = 0;
		
		try
		{
			String sql = "DELETE FROM TBL_SCORE WHERE SID = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, sid);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 연결 종료
	public void close() throws SQLException
	{
		DBConn.close();
	}
}

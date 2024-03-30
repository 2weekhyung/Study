package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.util.DBConn;

public class Test003
{
	public static void main(String[] args)
	{
		try
		{
			Connection conn = DBConn.getConnection();
			
			if (conn != null)
			{
				System.out.println("데이터베이스 연결 성공~!!!");
			}
			
			try
			{
				// 쿼리문 준비
				String sql = "SELECT SID, NAME, TEL FROM TBL_MEMBER ORDER BY SID";
				
				// 작업 객체 생성(쿼리문 전달)
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				// 작업 객체 실행(쿼리문 실행)
				ResultSet rs = pstmt.executeQuery();
				
				// 결과 처리
				while (rs.next())
				{
					int sid = rs.getInt("SID");
					String name = rs.getString("NAME");
					String tel = rs.getString("TEL");
					
					String str = String.format("%3d %7s %10s", sid, name, tel);
							
					System.out.println(str);
					
				}
				
				//리소스 반납
				rs.close();
				pstmt.close();
				
			} catch (Exception e)
			{
				System.out.println(e.toString());
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		finally {
			try
			{
				DBConn.close();
				System.out.println("\n 데이터베이스 연결 닫힘");
				System.out.println("프로그램 종료");
			} catch (Exception e2)
			{
				System.out.println(e2.toString());
			}
		}
	}
}


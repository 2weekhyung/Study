/*================================
    Test006.java
    - 테이블 내의 데이터 읽어오기
==================================*/

// EMP 테이블을 대상으로
// EMPNO, ENAME, JOB, SAL 항목을 확인하는 프로그램 구성
package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConn;

public class Test006
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{	
		// 연결객체 생성
		Connection conn = DBConn.getConnection();
		
		if (conn != null)
		{
			System.out.println("데이터베이스 연결 성공~!!!");
		}
		else
		{
			System.out.println("데이터베이스 연결 실패~!!!");
			System.exit(0);
		}
		
		try
		{
			// 작업 객체 생성
			Statement stmt = conn.createStatement();
			
			// 쿼리문 준비
			String sql = "SELECT EMPNO, ENAME, JOB, SAL FROM EMP ORDER BY EMPNO";
			
			// 쿼리문 실행
			ResultSet rs = stmt.executeQuery(sql);
			
			// ResultSet에 대한 처리
			while (rs.next())
			{
				System.out.println(rs.getInt("EMPNO") + "\t" + rs.getString("ENAME") + "\t" + rs.getString("JOB") + "\t" + rs.getInt("SAL"));
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		DBConn.close();
		
		System.out.println(">> 데이터베이스 연결 닫힘~!!!");
		System.out.println(">> 프로그램 종료됨~!!!");

	}

}

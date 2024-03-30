/*=======================================
 	MemberDAO.java
 	- 데이터베이스 액션 처리 전용 클래스
=========================================*/

package com.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.util.DBConn;

public class MemberDAO
{
	private Connection conn;
	
	public Connection connection()
	{
		conn = DBConn.getConnection();
		return conn;
	}
	
	// 입력 메소드
	public int add(MemberDTO dto)
	{
		int result = 0;
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = String.format("INSERT INTO TBL_EMP (EMP_ID, EMP_NAME, SSN, IBSADATE, CITY_ID, TEL, BUSEO_ID, JIKWI_ID, BASICPAY, SUDANG) VALUES(EMPSEQ.NEXTVAL, '%s', '%s', TO_DATE('%s', 'YYYY-MM-DD'), (SELECT CITY_ID FROM TBL_CITY WHERE CITY_NAME = '%s'), '%s', (SELECT BUSEO_ID FROM TBL_BUSEO WHERE BUSEO_NAME = '%s'), (SELECT JIKWI_ID FROM TBL_JIKWI WHERE JIKWI_NAME = '%s'), %d, %d)"
						,dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang());
			
			result = stmt.executeUpdate(sql);
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 전체 출력 메소드
	public ArrayList<MemberDTO> lists(int sel)
	{
		ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
		
		try
		{	
			String column;
			
			switch (sel)
			{
			case 1 : column = "EMP_ID";
				
				break;
				
			case 2 : column = "EMP_NAME";
			
				break;
			
			case 3 : column = "BUSEO_NAME";
			
				break;
			
			case 4 : column = "JIKWI_NAME";
			
				break;
			
			case 5 : column = "PAY DESC";
			
				break;
			
			default : column = "";
			
				break;
			}
			
			Statement stmt = conn.createStatement();
			
			String sql = String.format("SELECT EMP_ID, EMP_NAME, SSN, IBSADATE"
					+ ", CITY_NAME, TEL"
					+ ", BUSEO_NAME, JIKWI_NAME, BASICPAY"
					+ ", SUDANG, SAL"
					+ " FROM VIEW_EMP"
					+ " ORDER BY '%s'"
					, column);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{
				MemberDTO dto = new MemberDTO();
				
				dto.setEmp_id(rs.getString("EMP_ID"));
				dto.setEmp_name(rs.getString("EMP_NAME"));
				dto.setSsn(rs.getString("SSN"));
				dto.setDate(rs.getString("IBSADATE"));
				dto.setCity_name(rs.getString("CITY_NAME"));
				dto.setTel(rs.getString("TEL"));
				dto.setBuseo_name(rs.getString("BUSEO_NAME"));
				dto.setJikwi_name(rs.getString("JIKWI_NAME"));
				dto.setBasicpay(rs.getInt("BASICPAY"));
				dto.setSudang(rs.getInt("SUDANG"));
				dto.setSal(rs.getInt("SAL"));
				
				result.add(dto);
			}
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;

	}
	
	// 전체 직원 수
	public int count()
	{
		int result = 0;
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT COUNT(*) AS COUNT FROM TBL_EMP";
			
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
	
	// 검색 인원수
	public int count(String column, String value)
	{
		int result = 0;
		
		try
		{	
			Statement stmt = conn.createStatement();
			
			String sql;
			
			if (column.equals("EMP_ID"))
			{
				sql = String.format("SELECT COUNT(*) AS COUNT FROM TBL_EMP WHERE %s = %s", column, value);
			}
			else
			{
				sql = String.format("SELECT COUNT(*) AS COUNT FROM TBL_EMP WHERE %s = '%s'", column, value);
			}
			
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
	
	// 직원 검색
	public ArrayList<MemberDTO> search(String column, String value)
	{
		ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql;
			
			if (column.equals("EMP_ID"))
			{
				sql = String.format("SELECT EMP_ID, EMP_NAME, SSN, IBSADATE, CITY_NAME, TEL, BUSEO_NAME, JIKWI_NAME, BASICPAY, SUDANG, SAL FROM VIEW_EMP WHERE %s = %s", column, value);
			}
			else
			{
				sql = String.format("SELECT EMP_ID, EMP_NAME, SSN, IBSADATE, CITY_NAME, TEL, BUSEO_NAME, JIKWI_NAME, BASICPAY, SUDANG, SAL FROM VIEW_EMP WHERE %s = '%s'", column, value);
			}
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{
				MemberDTO dto = new MemberDTO();
				
				dto.setEmp_id(rs.getString("EMP_ID"));
				dto.setEmp_name(rs.getString("EMP_NAME"));
				dto.setSsn(rs.getString("SSN"));
				dto.setDate(rs.getString("IBSADATE"));
				dto.setCity_name(rs.getString("CITY_NAME"));
				dto.setTel(rs.getString("TEL"));
				dto.setBuseo_name(rs.getString("BUSEO_NAME"));
				dto.setJikwi_name(rs.getString("JIKWI_NAME"));
				dto.setBasicpay(rs.getInt("BASICPAY"));
				dto.setSudang(rs.getInt("SUDANG"));
				dto.setSal(rs.getInt("SAL"));
				
				result.add(dto);
			}
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 지역 리스트
	public ArrayList<String> listsOfCity()
	{
		ArrayList<String> result = new ArrayList<String>();
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT CITY_NAME FROM TBL_CITY";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{	
				result.add(rs.getString("CITY_NAME"));
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 부서 리스트
	public ArrayList<String> listsOfBuseo()
	{
		ArrayList<String> result = new ArrayList<String>();
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT BUSEO_NAME FROM TBL_BUSEO";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{
			
				result.add(rs.getString("BUSEO_NAME"));
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 직위 리스트
	public ArrayList<String> listsOfJikwi()
	{
		ArrayList<String> result = new ArrayList<String>();
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT JIKWI_NAME FROM TBL_JIKWI";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{	
				result.add(rs.getString("JIKWI_NAME"));
				
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 최소 기본급
	public int listsOfMinpay(String jikwi)
	{
		int result = 0;
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = String.format("SELECT MIN_BASICPAY FROM TBL_JIKWI WHERE JIKWI_NAME = '%s'", jikwi);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next())
			{
				result = rs.getInt("MIN_BASICPAY");
			}
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 수정
	public int modify(MemberDTO dto)
	{
		int result = 0;
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = String.format("UPDATE TBL_EMP SET EMP_NAME = '%s', SSN = '%s', IBSADATE = TO_DATE('%s', 'YYYY-MM-DD'), CITY_ID = (SELECT CITY_ID FROM TBL_CITY WHERE CITY_NAME = '%s'), TEL = '%s', BUSEO_ID = (SELECT BUSEO_ID FROM TBL_BUSEO WHERE BUSEO_NAME = '%s'), JIKWI_ID = (SELECT JIKWI_ID FROM TBL_JIKWI WHERE JIKWI_NAME = '%s'), BASICPAY = %d, SUDANG = %d WHERE EMP_ID = %s;"
									  , dto.getEmp_name(), dto.getSsn(), dto.getDate(), dto.getCity_name(), dto.getTel(), dto.getBuseo_name(), dto.getJikwi_name(), dto.getBasicpay(), dto.getSudang(), dto.getEmp_id());
			
			result = stmt.executeUpdate(sql);
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 삭제
	public int remove(int emp_id)
	{
		int result = 0;
		
		try
		{
			Statement stmt = conn.createStatement();
			
			String sql = String.format("DELETE FROM TBL_EMP WHERE EMP_ID = %s", emp_id);
			
			result = stmt.executeUpdate(sql);
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// 종료
	public void close()
	{
		DBConn.close();
	}
}

















































































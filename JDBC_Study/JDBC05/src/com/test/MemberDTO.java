/*====================================
 	MemberDTO.java
 	- 데이터 보관 및 전송 전용 클래스
======================================*/

package com.test;

public class MemberDTO
{
	private String emp_id, emp_name, ssn, date, city_name, tel, buseo_name, jikwi_name;
	
	private int basicpay, sudang;
	
	private int sal;
	
	
	public int getSal()
	{
		return sal;
	}

	public void setSal(int sal)
	{
		this.sal = sal;
	}

	public String getCity_name()
	{
		return city_name;
	}

	public void setCity_name(String city_name)
	{
		this.city_name = city_name;
	}

	public String getBuseo_name()
	{
		return buseo_name;
	}

	public void setBuseo_name(String buseo_name)
	{
		this.buseo_name = buseo_name;
	}

	public String getJikwi_name()
	{
		return jikwi_name;
	}

	public void setJikwi_name(String jikwi_name)
	{
		this.jikwi_name = jikwi_name;
	}
	
	public String getEmp_id()
	{
		return emp_id;
	}

	public void setEmp_id(String emp_id)
	{
		this.emp_id = emp_id;
	}

	public String getEmp_name()
	{
		return emp_name;
	}

	public void setEmp_name(String emp_name)
	{
		this.emp_name = emp_name;
	}

	public String getSsn()
	{
		return ssn;
	}

	public void setSsn(String ssn)
	{
		this.ssn = ssn;
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getTel()
	{
		return tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}


	public int getBasicpay()
	{
		return basicpay;
	}

	public void setBasicpay(int basicpay)
	{
		this.basicpay = basicpay;
	}

	public int getSudang()
	{
		return sudang;
	}

	public void setSudang(int sudang)
	{
		this.sudang = sudang;
	}
}

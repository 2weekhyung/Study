package com.test;

public class FriendDTO
{
	private String userName;
	private String gender;
	private String[] type;
	private int age;
	
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String[] getType()
	{
		return type;
	}
	
	public void setType(String[] type)
	{
		this.type = type;
	}
	
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}

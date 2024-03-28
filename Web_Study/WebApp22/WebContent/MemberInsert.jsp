
<%@page import="java.util.ArrayList"%>
<%@page import="com.test.MemberDTO_1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<jsp:useBean id="ob" class="com.test.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="ob"/>

<%
	// MemberInsert.jsp
	
	// 5명 분 데이터 수신 → 객체 구성 → 자료구조 구성 → setAttribute()
	//					     MemberDTO
	
	// → MemberList.jsp 에서 출력
	/*
	String[] names = ob.getName();
	String[] tel = ob.getTel();
	String[] addr = ob.getAddr();
	
	HashMap<Integer,String> member = new HashMap<Integer,String>();
	
	for (int i=0; i<names.length; i++)
	{
		member.put(i, names[i]+ " " + tel[i]+ " " + addr[i]);
	}
	
	request.setAttribute("member", member);
	*/
	
	List<MemberDTO_1> lists = new ArrayList<MemberDTO_1>();
	
	for(int i=1; i<=5; i++)	// i → 1 2 3 4 5
	{
		MemberDTO_1 ob1 = new MemberDTO_1(request.getParameter("name"+i), request.getParameter("tel"+i), request.getParameter("addr"+i));
		
		lists.add(ob1);
	}
	
	request.setAttribute("lists", lists);
%>
<jsp:forward page="MemberList.jsp"></jsp:forward>

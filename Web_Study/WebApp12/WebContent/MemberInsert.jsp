<%@page import="com.test.MemberDTO"%>
<%@page import="com.test.MemberDAO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	// MemberInsert.jsp
	//-- 데이터베이스의 테이블(TBL_MEMBER)에
	//   회원 데이터 추가 액션 처리 수행
	//   ... 이후... 
	//   클라이언트기 다시 리스트 페이지(MemberSelect.jsp)를
	//   요청할 수 있도록 안내
	
	request.setCharacterEncoding("UTF-8");

	String userName = request.getParameter("uName");
	String userTel = request.getParameter("uTel");
	
	MemberDAO dao = new MemberDAO();
	
	try
	{	
		// 데이터베이스 연결
		dao.connection();
		
		// MemberDTO 객체 생성 및 속성 구성 (→ add() 메소드 호출을 위해 필요)
		MemberDTO member = new MemberDTO();
		
		member.setName(userName);
		member.setTel(userTel);
		
		dao.add(member);
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	finally
	{
		try
		{
			dao.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	response.sendRedirect("MemberSelect.jsp");
%>
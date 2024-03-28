<%@page import="com.test.MemberScoreDTO"%>
<%@page import="com.test.MemberScoreDAO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String sid = request.getParameter("sid");
	
	// 이전 페이지로(MemberScoreUpdateForm.jsp)부터 넘어온 데이터 수신
	// → sid, kor, eng, mat
	
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	
	// MemberScoreDATO 인스턴스 생성
	MemberScoreDAO dao = new MemberScoreDAO();
	
	try
	{
		// 데이터베이스 연결
		dao.connection();
		
		MemberScoreDTO dto = new MemberScoreDTO();
		
		dto.setSid(sid);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMat(mat);
		
		dao.modify(dto);
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	finally
	{
		try
		{
			// 데이터베이스 연결 종료
			dao.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	response.sendRedirect("MemberScoreSelect.jsp");
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	
	String memo = request.getParameter("memo");
	//memo = memo.replace("\n", "<br>");
	memo = memo.replaceAll("\n", "<br>");
	//-- JDK 1.5 이후부터 『replaceAll()』 메소드 사용 가능
	//   『replaceAll()』을 통해 처리한 결괄를 다시 memo 변수에 대입
	//   "안녕하세요\n반갑습니다.\n이윤수입니다." → "안녕하세요<br>반갑습니다.<br>이윤수입니다."
	
	// 이상형 데이터 수신
	
	// ※ 같은 name 속성의 값을 가진 데이터 여러개를 받는 경우
	//    (즉, 다중 데이터로 수신하는 경우)
	//    이를 배열로 처리해야 한다. → 『getParameterValues()』
	
	String[] dremaArr=request.getParameterValues("checkGroup");
	
	// ※ 배열 데이터를 수신하여 처리하는 경우...
	//    수신된 데이터가 전혀 없는 경우는
	//    배열의 값 자체가 null 이 되어저리기 때문에
	//    null 에 대한 확인(검사) 과정이 필요히다.	check~!!!
	
	String dream = "";
	
	if(dremaArr != null)
	{	
		for (String item : dremaArr)
			dream += "[" + item  + "]";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CheckBoxOk.jsp</title>
</head>
<body>

<div>
	<h2>checkBox 데이터 수신 결과 확인</h2>
	<div>
		<p>이름: <%=name %></p>
		<p>메모: <%=memo %></p>
		<p>이상형: <%=dream %></p>
	</div>
</div>

</body>
</html>
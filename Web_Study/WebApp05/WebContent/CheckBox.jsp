<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CheckBox.jsp</title>

<link rel="stylesheet" type="text/css" href="css/main.css">

</head>
<body>

<div>
	<h1>JSP를 이용한 데이터 송수신 실습 04</h1>
	<hr>
	<p>CheckBox.jsp → CheckBoxOk.jsp</p>
</div>

<div>
	<form action="CheckBoxOk.jsp" method="post">
		이름 <input type="text" name="name" class="txt">
		<br><br>
		
		메모<br>
		<textarea rows="5" cols="30" name="memo"></textarea>
		<br><br>
		
		이상형<br>
		<label><input type="checkbox" name="checkGroup" value="권은비">권은비</label>
		<label><input type="checkbox" name="checkGroup" value="박혜수">박혜수</label>
		<label><input type="checkbox" name="checkGroup" value="류진">류진</label>
		<label><input type="checkbox" name="checkGroup" value="윈터">윈터</label>
		<label><input type="checkbox" name="checkGroup" value="김채원">김채원</label>
		<br>
		<label><input type="checkbox" name="checkGroup" value="박보영">박보영</label>
		<label><input type="checkbox" name="checkGroup" value="카리나">카리나</label>
		<label><input type="checkbox" name="checkGroup" value="슈화">슈화</label>
		<label><input type="checkbox" name="checkGroup" value="박은빈">박은빈</label>
		<label><input type="checkbox" name="checkGroup" value="고윤정">고윤정</label>
		<br><br>
		
		<input type="submit" value="전송하기" class="btn control">
	</form>
</div>

</body>
</html>
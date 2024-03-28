<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Friend.jsp</title>
<link rel="stylesheet" type="text/css" href="css/main.css">

<script type="text/javascript">

	function sendIt()
	{	
		//alert("호출~!!!");
		
		var f = document.myForm;
		
		if(!f.userName.value)
		{
			alert("이름을 입력하세요~!!!");
			f.userName.focus();
			return;
		}
		
		f.submit();
		
		
	}

</script>
</head>
<body>

<div>
	<h1>데이터 입력</h1>
	<hr>
</div>

<!-- com.test.FriendDTO -->
<!-- Friend_ok.jsp -->

<div>
	<form action="Friend_ok.jsp" method="post" name="myForm">
		<table class="table">
			<tr>
				<th>이름(*)</th>
				<td>
					<input type="text" class="txt" name="userName">
				</td>
			</tr>
			<tr>
				<th>나이</th>
				<td>
					<input type="text" class="txt" name="age">
				</td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<label>
						<input type="radio" name="gender" value="남자"> 남자
					</label>
					<label>
						<input type="radio" name="gender" value="여자"> 여자
					</label>
				</td>
			</tr>
			<tr>
				<th>이상형</th>
				<td>
					<label>
						<input type="checkbox" name="type" value="박보영"> 박보영
					</label>
					<label>
						<input type="checkbox" name="type" value="천우희"> 천우희
					</label>
					<label>
						<input type="checkbox" name="type" value="카리나"> 카리나
					</label>
					<label>
						<input type="checkbox" name="type" value="박혜수"> 박혜수
					</label>
					<label>
						<input type="checkbox" name="type" value="슈화"> 슈화
					</label>
					<label>
						<input type="checkbox" name="type" value="한소희"> 한소희
					</label>
					<label>
						<input type="checkbox" name="type" value="김채원"> 김채원
					</label>
					<label>
						<input type="checkbox" name="type" value="수지"> 수지
					</label>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" class="btn" style="width: 100%;" onclick="sendIt()">등록</button>
				</td>
			</tr>
		</table>
	</form>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/common.css">
<title>Insert title here</title>
</head>
<body>
	<form action="tokyoPjt.do?cmd=regProc" method="post" name="regForm">
		<div id="indexMainContainer">
			<div id="loginContainer">
				<div>
					<div id="checkBoxContainer">
						<div><input type="radio" name="typeCheck" value="customer">会員</div>
						<div><input type="radio" name="typeCheck" value="owner">お店</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">アカウント</div>
						<div class="inputContainer">
							<input type="text" maxlength="10" name="acountCheck">
						</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">ニックネーム</div>
						<div class="inputContainer">
							<input type="text" maxlength="10" name="nickNameCheck">
						</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">パスワード</div>
						<div class="inputContainer">
							<input type="password" maxlength="16" name="passwordCheck">
						</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">パスワード確認</div>
						<div class="inputContainer">
							<input type="password" maxlength="16" name="passwordCheck2">
						</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">苗字</div>
						<div class="inputContainer">
							<input type="text" maxlength="10" name="familyNameCheck">
						</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">氏名</div>
						<div class="inputContainer">
							<input type="text" maxlength="10" name="firstNameCheck">
						</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">生年月日</div>
						<div class="dateContainer">
							<input id="yearInput" type="text" maxlength="4" name="yearCheck"> 年　 
							<input id="monthInput" type="text" maxlength="2" name="monthCheck"> 月　
							<input id="dateInput" type="text" maxlength="2" name="dateCheck"> 日
						</div>
					</div>
				</div>
				<div>
					<div class="loginContents">
						<div class="contextContainer">電話番号</div>
						<div class="phoneContainer">
							<input type="text" maxlength="4" name="phone1Check"> - 
							<input type="text" maxlength="4" name="phone2Check"> - 
							<input type="text" maxlength="4" name="phone3Check">
						</div>
					</div>
				</div>
				<button type="submit" name="sadsads"></button>
			</div>
		</div>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">

	<form action="/auth/loginProc" method="post">
		<div class="form-group">
			<label for="userid">ID:</label> <input type="text" name="userid" class="form-control" placeholder="Enter ID" id="userid">
		</div>
		<div class="form-group">
			<label for="userpassword">Password:</label> <input type="password" name="userpassword" class="form-control" placeholder="Enter password" id="userpassword">
		</div>
		<button id="btn-login" class="btn btn-primary">Sign In</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>

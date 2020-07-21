<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">

	<form>
		<div class="form-group">
    			<label for="userid">ID:</label> <input type="text" name="userid" class="form-control" placeholder="Enter ID" id="userid">
    		</div>
    		<div class="form-group">
    			<label for="userpassword">Password:</label> <input type="password" name="userpassword" class="form-control" placeholder="Enter password" id="userpassword">
    		</div>
    		<div class="form-group">
            	<label for="username">Name:</label> <input type="text" name="username" class="form-control" placeholder="Enter name" id="username">
            </div>
	</form>
	<button id="btn-save" class="btn btn-primary">Join</button>
</div>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>

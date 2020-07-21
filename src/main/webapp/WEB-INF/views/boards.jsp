<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="layout/header.jsp"%>

<div class="container">
	<form>
		<input type="text" id="title" placeholder="할일을 입력해 주세요."> <input type="button" id="btn-save" value="입력">
	</form>
	<c:forEach var="board" items="${boards}">
		<div class="card m-2">
			<div class="card-body">
				<input type="checkbox" name="boardList" value="${board.id}" class="card-title">${board.title}
			</div>
		</div>
	</c:forEach>
	<input type="button" id="btn-delete" value="삭제">
</div>
<script src="/js/board.js"></script>
<%@ include file="layout/footer.jsp"%>

<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">			
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>	
		<!-- bootstrap css -->
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<link href="${path}/resources/css/custom.css" rel="stylesheet"/>		
		<title>오늘의 성구</title>		
	</head>
	<body>
		<div>
			<h1>오늘의 성구</h1>
			<button class="btn btn-success" id="check" style="display:block">성구보기</button>
		</div>
		<div id="verseBox" style="display:none">
			<h2 id="verse"></h2>
			<h3 id="verse2"></h3>
		<button class="btn btn-success" id="change">다른 성구보기</button>
		</div>

		<script type="text/javascript" src="${path}/resources/js/bible.js"></script>
	</body>
</html>
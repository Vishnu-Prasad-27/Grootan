<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
label{
	margin-top: 10px;
}
</style>
</head>
<body>
	<div class="story-details">
		<form action="StoryServlet">
		<label> By</label>
		<input type="text" name="by" required><br>
		<label> Name of the Story</label>
		<input type="text" name="nameofstory" required><br>
		<label> Type of the story</label>
		<input type="text" name="typeofstory" required><br>
		<label>Story</label><br>
		<textarea rows="75" cols="75" name="story" required ></textarea><br>
		<button>Upload </button>
		</form>
	</div>
</body>
</html>
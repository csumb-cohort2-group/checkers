<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<head><title>Checkers Game - Enter</title></head>
<style>
div
{
    text-align: center;
    color: white;
    font-family: verdana;
    font-size: 20px;
}
</style>
<body style="background-color:red;">
<div>
<br><h3>Hello, <% out.print(session.getAttribute("username")); %>! Welcome to the Checkers Game.</h3><br>
<br><h3><a href = "https://simple.wikipedia.org/wiki/Checkers">How to Play!</a> </h3><br>
<br>Press Enter to Start!<br>
<br><br>
<form method="POST" action="Checkers">
<input type=Submit value="Enter" name="submit" />
</form>
</div>
</body></html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Enrollment</title>
</head>

<%
String Name = request.getParameter("name");
Long Reg_No = Long.parseLong(request.getParameter("no"));
Long Mobile_No = Long.parseLong(request.getParameter("mobile")); String Email_ID = request.getParameter("email");
String Gender = request.getParameter("gender");
String Department = request.getParameter("department");
int Semester = Integer.parseInt(request.getParameter("sem")); String Course_Name = request.getParameter("course"); String Faculty_Name = request.getParameter("faculty");
%>

<body>
<head>
<div style="background-image: url('reg1.jpg');">
<link rel="stylesheet" href="enroll.css">
<style>
.button {
border-radius: 15px; color: black; padding: 15px 15px; text-align: center; text-decoration: bold; display: inline-block;
font-family: Times New Roman; font-size: 16px;
 
margin: 4px 2px; cursor: pointer;
}

.button1 {background-color: cadetblue;}
</style>
</head>
<form name="demoForm" action="login.html" method="post">
<h1><center>Enrollment Successful!!!</center></h1>
<h2><div class="register">
<B style="color:yellow;">Name	: </B>
<B style="color:white;"><%= Name %></B><br><br>

<B style="color:yellow;">Reg No : </B>
<B style="color:white;"><%= Reg_No %></B><br><br>

<B style="color:yellow;">Mobile No : </B>
<B style="color:white;"><%= Mobile_No %></B><br><br>

<B style="color:yellow;">Email ID : </B>
<B style="color:white;"><%= Email_ID %></B><br><br>

<B style="color:yellow;">Gender : </B>
<B style="color:white;"><%= Gender %></B><br><br>

<B style="color:yellow;">Department : </B>
<B style="color:white;"><%= Department %></B><br><br>

<B style="color:yellow;">Semester : </B>
<B style="color:white;"><%= Semester %></B><br><br>

<B style="color:yellow;">Course Name : </B>
<B style="color:white;"><%= Course_Name %></B><br><br>

<B style="color:yellow;">Faculty Name : </B>
<B style="color:white;"><%= Faculty_Name %></B><br><br></body>
<button class="button button1">Logout</button>

</html>

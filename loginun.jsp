<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"href="login.css">
<style>
.button {
border-radius: 15px; color: black; padding: 15px 15px; text-align: center; text-decoration: bold; display: inline-block;
font-family: Times New Roman; font-size: 16px;
margin: 4px 2px; cursor: pointer;
}

.button1 {background-color: cadetblue;}
</style>
<title>Login Form</title>
</head>
<body>
<CENTER><h1 style="color:indigo;">MADRAS INSTITUTE OF TECHNOLOGY</h1></center>
<h2 style="color:black;">ANNA UNIVERSITY</h2>
<h3 style="color:black;">CHROMPET , CHENNAI - 600044</h3><BR>
<div>
<form action="login"method="post"id="register">
<div class="register">
<h2><b>LOGIN FORM<b></h2>
<h4><b style="color:black;">Registration Number or Password is incorrect</b></h4><br>
REGISTRATION NUMBER : <br>
<input type="text"name="regno"required><br><br> PASSWORD : <br>
<input type="password"name="password"required><br><br>
<CENTER><button class="button button1">LOGIN</button></CENTER>
<a href="registration.html">New User?Register Here</a></form>
</body>
</html>

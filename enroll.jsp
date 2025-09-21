<!DOCTYPE html>
<html>
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
.button2 {background-color: cadetblue;}
</style>
<title>Enrollment Form</title>
</head>
<body>
<h2 style="color:black;"><center>STUDENT ENROLLMENT FORM</h2>

<form name="demoForm" action="enroll_success.jsp" method="post">
<div class="register">
<h3 style="color:yellow;">
<B>Name	:</B><br>
<input type="text" name="name" value="" size="50" required><br><br>
<B>Reg No	:</B><br>
<input type="text" name="no" value="" size="50" required><br><br>

<B>Mobile No	:</B><br>
<input type="text" name="mobile" value="" size="50" required><br><br>

<B>Email ID	:</B><br>
<input type="email" name="email" value="" size="50" required><br><br>
 
<B>Gender	:</B>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Others">Others<br><br>

<B>Department :</B><br>

<select name="department">
<option value=""></option>
<option value="Information Technology">Information Technology</option>
<option value="Computer Technology">Computer Technology</option>
<option value="Production Technology">Production Technology</option>
<option value="Food Technology">Food Technology</option>
<option value="Mechanical Engineering">Mechanical Engineering</option>
</select><br><br>


<B>Semester	:</B><br>

<select name="sem">
<option value=""></option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
</select>
<br><br>


<B>Course Name :</B>

<select name="course">
<option value=""></option>
<option value="Compiler Engineering">Compiler Engineering</option>
<option value="Computer Networks">Computer Networks</option>
<option value="Advances in Databases">Advances in Databases</option>
<option value="Web Technology">Web Technology</option>
<option value="Personality Development">Personality
 
Development</option>
</select>
<br><br>


<B>Faculty Name	:</B>

 <select name="faculty">
    <option value=""></option>
    <option value="Natheztha">Natheztha</option>
    <option value="Rajesh">Rajesh</option>
    <option value="Radhasenthil Kumar">Radhasenthil Kumar</option>
    <option value="Seethalakshmi">Seethalakshmi</option>
    <option value="Hemalatha">Hemalatha</option>
    </select>
    <br> 

</h3>    
    <center><button class="button button1" type ="reset">CLEAR</button>&nbsp
    <button class="button button2" type ="submit">REGISTER</button>
    </center>
    
    </form>
    </body>
    </html>
    

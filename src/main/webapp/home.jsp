
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
    function submitForm(button) {
    	if( button.name == "Display"){
    		var action = "DisplaySevlet";
    	}else{
        var action = button.name + ".jsp";
    	}// Construct the action URL based on button name
        document.forms[0].action = action; // Set the action of the form
        document.forms[0].submit(); // Submit the form
    }
</script>
<style>
    input{
        width: 150px;
        height: 50px;
        border-radius: 5px;
        cursor:pointer;
        background-color:#A1C398;
    }
    body {
    background: #FA7070;
    }
   div 
{
  display: flex;
  justify-content: center;
  text-indent:50px;
  align-items: center;
  min-height: 20vh;
  background: #FA7070;
  }
  .heading {
  display:flex;
  align-items: center;
  justify-content: center;
  text-indent:50px;
  padding-top:30vh;
 }
  
  
   
</style>
<body>
<h1 class="heading">school management system</h1>

<div>
    <form method="post">
    	<input type="button" value="student" name="studenthome" onClick="submitForm(this)">
        <input type="button" value="teacher" name="teacherhome" onClick="submitForm(this)">
        <input type="button" value="admin" name="admin" onClick="submitForm(this)">
    </form>
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
</head>
<style>
            body {
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
                            }

            form {
                width: 400px;
                height:500px
                background-color: #EADBC8;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px
                    rgba(0, 0, 0, 0.1);
            }

            fieldset {
                border: 1px solid black;
                padding: 10px;
                margin: 0;
            }
            label {
                display: block;
                margin-bottom: 5px;
            }
            div {
            display: flex;
            justify-content: center; 
            align-items: center;
            min-height: 100vh;
            }
</style>
<body style="background-color:#C6EBC5;">
    
	<form action="AttendenceUpdateServlet" method="post">
	<fieldset>
	<label>Enter the Rollno :</label>
	<input type="text" name="rollno">
	<br></br>
	<label>Enter the Name:</label>
	<input type="text" name="name">
	<br></br>
	<label>Enter the attendence percentage of java:</label>
	<input type="text" name="javaatt">
	<br></br>
	<label>Enter the attendence percentage of python:</label>
	<input type="text" name="pythonatt">
	<br></br>
	<label>Enter the attendence percentage of c:</label>
	<input type="text" name="catt">
	<br></br>
	<input type="submit">
	<br></br>
	</fieldset>
	</form>	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
    
	<form action="AddteacherServlet" method="post">
	<fieldset>
	<label>Enter the idno :</label>
	<input type="text" name="idno">
	<br></br>
	<label>Enter the Name:</label>
	<input type="text" name="tname">
	<br></br>
	<label>subject taken by teacher :</label>
	<input type="text" name="sub">
	<br></br>
	<input type="submit">
	<br></br>
	</fieldset>
	</form>	
</body>
</html>
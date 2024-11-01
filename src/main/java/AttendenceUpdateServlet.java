

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Servlet implementation class AttendenceUpdateServlet
 */
public class AttendenceUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","8073121866");
			Statement s = con.createStatement();
			String rollno = request.getParameter("rollno");
			String name = request.getParameter("name");
			int javaatt = Integer.parseInt(request.getParameter("javaatt"));
			int pythonatt = Integer.parseInt(request.getParameter("pythonatt"));
			int catt = Integer.parseInt(request.getParameter("catt"));
			String q = "update student set javaatt="+javaatt+",pythonatt="+pythonatt+",catt="+catt+" where rollno= '"+rollno+"' and name='"+name+"'";
			s.executeUpdate(q);
			out.print("java attendence="+javaatt+"python attendence"+pythonatt+"c attendence="+catt);
			out.write("<form action=\"home.jsp\"><input type=\"submit\" value=\"HomePage\"></form>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	}

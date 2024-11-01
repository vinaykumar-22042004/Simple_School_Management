

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class AttendenceServlet
 */
public class AttendenceServlet extends HttpServlet {
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
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","8073121866");
			Statement s = con.createStatement();
			String rollno = request.getParameter("rollno");
			String name = request.getParameter("name");
			String q = "Select javaatt,pythonatt,catt from student where rollno= '"+rollno+"' and name='"+name+"'";
			ResultSet rs = s.executeQuery(q);

			System.out.println(rs);
			int javaatt = -1;
			int pythonatt = -1;
			int catt = -1;
		    while(rs.next()) {
			javaatt = rs.getInt("javaatt");
			pythonatt=rs.getInt("pythonatt");
			catt=rs.getInt("catt");
			out.print("java attendence is:"+javaatt);
			out.print("python attendence is:"+pythonatt);
			out.print("c attendence is:"+catt);
			}
		    
					
			out.write("<form action=\"home.jsp\"><input type=\"submit\" value=\"HomePage\"></form>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	}
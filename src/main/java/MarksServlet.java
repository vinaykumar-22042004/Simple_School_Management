

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
 * Servlet implementation class MarksServlet
 */
public class MarksServlet extends HttpServlet {
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
			String q = "Select java,python,c from student where rollno= '"+rollno+"' and name='"+name+"'";
			ResultSet rs = s.executeQuery(q);

			System.out.println(rs);
			int java = -1;
			int python = -1;
			int c = -1;
		    while(rs.next()) {
			java = rs.getInt("java");
			python=rs.getInt("python");
			c=rs.getInt("c");
			out.print("java attendence is:"+java);
			out.print("python attendence is:"+python);
			out.print("c attendence is:"+c);
			}
		    
					
			out.write("<form action=\"home.jsp\"><input type=\"submit\" value=\"HomePage\"></form>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	}

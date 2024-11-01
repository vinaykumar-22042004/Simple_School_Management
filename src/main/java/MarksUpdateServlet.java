

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
 * Servlet implementation class MarksUpdateServlet
 */
public class MarksUpdateServlet extends HttpServlet {
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
			int java = Integer.parseInt(request.getParameter("java"));
			int python = Integer.parseInt(request.getParameter("python"));
			int c = Integer.parseInt(request.getParameter("c"));
			String q = "update student set java="+java+",python="+python+",c="+c+" where rollno= '"+rollno+"' and name='"+name+"'";
			s.executeUpdate(q);
			out.print("java="+java+"python="+python+"c="+c);
			out.write("<form action=\"home.jsp\"><input type=\"submit\" value=\"HomePage\"></form>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	}
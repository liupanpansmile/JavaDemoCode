package lpp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lpp.entity.User;
import lpp.service.CheckUserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("DoGet###################");
		String username = request.getParameter("username") ;
		String password = request.getParameter("password") ;
		System.out.println(username);
		System.out.println(password);
		CheckUserService service = new CheckUserService() ;
		User user = new User(username, password) ;
		
		if(service.checkUser(user)){
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp") ;
			dispatcher.forward(request, response);
			
			//重定向
			//response.sendRedirect("success.jsp");
		}else {
			System.out.println("no");
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp") ;
			dispatcher.forward(request, response);
			
			//重定向
			//response.sendRedirect("error.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username") ;
		String password = request.getParameter("password") ;
		System.out.println(username);
		System.out.println(password);
		CheckUserService service = new CheckUserService() ;
		User user = new User(username, password) ;
		
		if(service.checkUser(user)){
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp") ;
			dispatcher.forward(request, response);
			
			//重定向
			//response.sendRedirect("success.jsp");
		}else {
			System.out.println("no");
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp") ;
			dispatcher.forward(request, response);
			
			//重定向
			//response.sendRedirect("error.jsp");
		}
	}

}

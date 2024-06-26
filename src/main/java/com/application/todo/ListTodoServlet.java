package com.application.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodoServlet
 */

@WebServlet("/list-todos.do")
public class ListTodoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoService todoService = new TodoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("todos", todoService.retrieveTodos());
		request.getRequestDispatcher("WEB-INF/views/list-todos.jsp").forward(request, response);
	}


}

// The ListTodoServlet class retrieves a list of to-do items from a TodoService and forwards them to a JSP (list-todos.jsp) 
// for rendering. When a user accesses the /list-todos.do URL via a GET request, this servlet retrieves the list of to-do 
// items and sends them to the JSP for display. The JSP (list-todos.jsp) is responsible for rendering the HTML output that 
// presents the list of to-do items to the user.
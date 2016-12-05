package cst;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class User
 */
public class CreateUsername extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private static final String USERNAME_ERROR_MSG = "The username entered is "
      + "not valid. Ensure the field is not empty and has at least one "
      + "character.";

  /**
   * @see HttpServlet#HttpServlet()
   */
  public CreateUsername() {
    super();
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.getRequestDispatcher("create_user.jsp").forward(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    HttpSession session = request.getSession(true);
    String requestedUsername = (String) request.getParameter("username");
    
    // If the username is invalid, display an error and have the user enter it
    // again.
    if (requestedUsername == null || requestedUsername.length() < 1) {
      request.setAttribute("error", USERNAME_ERROR_MSG);
      request.getRequestDispatcher("create_user.jsp")
          .forward(request, response);
      return;
    }
    
    // If there is a valid username, set it in the session and proceed to the
    // checkers game.
    session.setAttribute("username", requestedUsername);
    request.getRequestDispatcher("checkers.jsp").forward(request, response);
  }
}

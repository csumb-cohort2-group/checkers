package cst;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Checkers
 */
public class Checkers extends HttpServlet {
   private static final long serialVersionUID = 1L;
   static int playerOne1x = 0;
   static int playerOne1y = 0;
   static int playerOne2x = 0;
   static int playerOne2y = 0;
   static int playerOne3x = 0;
   static int playerOne3y = 0;
   static int playerOne4x = 0;
   static int playerOne4y = 0;
   static int playerOne5x = 0;
   static int playerOne5y = 0;
   static int playerOne6x = 0;
   static int playerOne6y = 0;
   static int playerOne7x = 0;
   static int playerOne7y = 0;
   static int playerOne8x = 0;
   static int playerOne8y = 0;
   static int playerOne9x = 0;
   static int playerOne9y = 0;
   static int playerOne10x = 0;
   static int playerOne10y = 0;
   static int playerOne11x = 0;
   static int playerOne11y = 0;
   static int playerOne12x = 0;
   static int playerOne12y = 0;
   static int playerTwo1x = 0;
   static int playerTwo1y = 0;
   static int playerTwo2x = 0;
   static int playerTwo2y = 0;
   static int playerTwo3x = 0;
   static int playerTwo3y = 0;
   static int playerTwo4x = 0;
   static int playerTwo4y = 0;
   static int playerTwo5x = 0;
   static int playerTwo5y = 0;
   static int playerTwo6x = 0;
   static int playerTwo6y = 0;
   static int playerTwo7x = 0;
   static int playerTwo7y = 0;
   static int playerTwo8x = 0;
   static int playerTwo8y = 0;
   static int playerTwo9x = 0;
   static int playerTwo9y = 0;
   static int playerTwo10x = 0;
   static int playerTwo10y = 0;
   static int playerTwo11x = 0;
   static int playerTwo11y = 0;
   static int playerTwo12x = 0;
   static int playerTwo12y = 0;
   static int newGame = 0;

    /**
     * Default constructor. 
     */
    public Checkers() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Create or retrieve previous session.
    HttpSession session = request.getSession(true);
    String username = (String) session.getAttribute("username");

    // Make the user create a username if they haven't already done so.
    if (username == null) {
      request.getRequestDispatcher("create_user.jsp")
          .forward(request, response);
      return;
    }

    // Proceed to the checkers game.
    request.getRequestDispatcher("checkers.jsp").forward(request, response);
	}

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      HttpSession session = request.getSession(true);
      Integer counter = (Integer)session.getAttribute("counter");
      if (counter == null || newGame == 0) 
      {
         
         counter = new Integer(0);
         counter++;
         playerOne1x = 75;
         playerOne1y = 25;
         playerOne2x = 175;
         playerOne2y = 25;
         playerOne3x = 275;
         playerOne3y = 25;
         playerOne4x = 375;
         playerOne4y = 25;
         
         playerOne5x = 25;
         playerOne5y = 75;
         playerOne6x = 125;
         playerOne6y = 75;
         playerOne7x = 225;
         playerOne7y = 75;
         playerOne8x = 325;
         playerOne8y = 75;
         
         playerOne9x = 75;
         playerOne9y = 125;
         playerOne10x = 175;
         playerOne10y = 125;
         playerOne11x = 275;
         playerOne11y = 125;
         playerOne12x = 375;
         playerOne12y = 125;
         
         playerTwo1x = 25;
         playerTwo1y = 375;
         playerTwo2x = 125;
         playerTwo2y = 375;
         playerTwo3x = 225;
         playerTwo3y = 375;
         playerTwo4x = 325;
         playerTwo4y = 375;
         
         playerTwo5x = 75;
         playerTwo5y = 325;
         playerTwo6x = 175;
         playerTwo6y = 325;
         playerTwo7x = 275;
         playerTwo7y = 325;
         playerTwo8x = 375;
         playerTwo8y = 325;
         
         playerTwo9x = 25;
         playerTwo9y = 275;
         playerTwo10x = 125;
         playerTwo10y = 275;
         playerTwo11x = 225;
         playerTwo11y = 275;
         playerTwo12x = 325;
         playerTwo12y = 275;
         newGame++;
         setData(session, request, counter);
         //make coor of pieces in var pass to page in session
         //make each place a coord var
         request.getRequestDispatcher("checkersPlay.jsp").forward(request, response);
      }
   }
   public static void setData(HttpSession session, HttpServletRequest request, int counter)
   {
      session.setAttribute("counter", counter);
      request.setAttribute("playerOne1x", playerOne1x);
      request.setAttribute("playerOne1y", playerOne1y);
      request.setAttribute("playerOne2x", playerOne2x);
      request.setAttribute("playerOne2y", playerOne2y);
      request.setAttribute("playerOne3x", playerOne3x);
      request.setAttribute("playerOne3y", playerOne3y);
      request.setAttribute("playerOne4x", playerOne4x);
      request.setAttribute("playerOne4y", playerOne4y);
      request.setAttribute("playerOne5x", playerOne5x);
      request.setAttribute("playerOne5y", playerOne5y);
      request.setAttribute("playerOne6x", playerOne6x);
      request.setAttribute("playerOne6y", playerOne6y);
    
      request.setAttribute("playerOne7x", playerOne7x);
      request.setAttribute("playerOne7y", playerOne7y);
      request.setAttribute("playerOne8x", playerOne8x);
      request.setAttribute("playerOne8y", playerOne8y);
      request.setAttribute("playerOne9x", playerOne9x);
      request.setAttribute("playerOne9y", playerOne9y);
      request.setAttribute("playerOne10x", playerOne10x);
      request.setAttribute("playerOne10y", playerOne10y);
      request.setAttribute("playerOne11x", playerOne11x);
      request.setAttribute("playerOne11y", playerOne11y);
      request.setAttribute("playerOne12x", playerOne12x);
      request.setAttribute("playerOne12y", playerOne12y);
      
      request.setAttribute("playerTwo1x", playerTwo1x);
      request.setAttribute("playerTwo1y", playerTwo1y);
      request.setAttribute("playerTwo2x", playerTwo2x);
      request.setAttribute("playerTwo2y", playerTwo2y);
      request.setAttribute("playerTwo3x", playerTwo3x);
      request.setAttribute("playerTwo3y", playerTwo3y);
      request.setAttribute("playerTwo4x", playerTwo4x);
      request.setAttribute("playerTwo4y", playerTwo4y);
      request.setAttribute("playerTwo5x", playerTwo5x);
      request.setAttribute("playerTwo5y", playerTwo5y);
      request.setAttribute("playerTwo6x", playerTwo6x);
      request.setAttribute("playerTwo6y", playerTwo6y);
    
      request.setAttribute("playerTwo7x", playerTwo7x);
      request.setAttribute("playerTwo7y", playerTwo7y);
      request.setAttribute("playerTwo8x", playerTwo8x);
      request.setAttribute("playerTwo8y", playerTwo8y);
      request.setAttribute("playerTwo9x", playerTwo9x);
      request.setAttribute("playerTwo9y", playerTwo9y);
      request.setAttribute("playerTwo10x", playerTwo10x);
      request.setAttribute("playerTwo10y", playerTwo10y);
      request.setAttribute("playerTwo11x", playerTwo11x);
      request.setAttribute("playerTwo11y", playerTwo11y);
      request.setAttribute("playerTwo12x", playerTwo12x);
      request.setAttribute("playerTwo12y", playerTwo12y);
      
   }
}

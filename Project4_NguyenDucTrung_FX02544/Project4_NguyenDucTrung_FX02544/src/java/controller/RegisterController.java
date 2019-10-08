
package controller;

import dal.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterController extends BaseController {

    private final UserDAO userDAO = new UserDAO();
    
    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username = req.getParameter("username");
       String password = req.getParameter("password");
       String role = req.getParameter("role");
       if(username != null && password != null){
           //
           if(!userDAO.isExist(username)){
               userDAO.register(username, password,Integer.parseInt(role));
               req.setAttribute("message","Register success :)~");
               processGet(req, resp);
           }
           else{
               req.setAttribute("message","User: "+username+" is existed,try input other :)~");
               processGet(req, resp);
           }
           
       }
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Register.jsp").forward(req, resp);
    }

   
}

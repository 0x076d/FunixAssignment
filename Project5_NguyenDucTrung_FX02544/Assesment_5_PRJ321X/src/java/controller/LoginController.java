package controller;

import dal.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

public class LoginController extends BaseController {

    private final UserDAO userDAO = new UserDAO();

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = (req.getParameter("username"));
        String password = (req.getParameter("password"));
        User u = userDAO.login(username, password);
        if(u == null){
            req.setAttribute("message","Wrong username or password!");
            processGet(req, resp);
        }
        else{
            HttpSession session = req.getSession(true);
            session.setAttribute("login",username);
            resp.sendRedirect("home");
        }
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Login.jsp").forward(req, resp);
    }

}

package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.MapUser;

public class LoginServlet extends BaseController {

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Login.jsp").forward(req, resp);
    }

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account a = MapUser.getMap().get(username);
        if (a == null) {
            req.setAttribute("message", username + " is not exist!");
            processGet(req, resp);
            return;
        }
        if (a != null) {
            if (!a.getPassword().equals(password)) {
                req.setAttribute("message","Wrong password!");
                processGet(req, resp);
                return;
            }
            if(password.equals(a.getPassword()) && username.equals(a.getUsername())){
                HttpSession session = req.getSession(true);
                session.setAttribute("login",a);
                resp.sendRedirect("home");
            }
        }
    }

}

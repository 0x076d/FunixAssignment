package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.MapUser;

public class SignupServlet extends BaseController {

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Signup.jsp").forward(req, resp);
    }

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String usrRegex = "[a-zA-Z0-9 ]*";
        String pswRegex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        req.setAttribute("username", username);
        if (username != null
                && password != null
                && !username.trim().isEmpty()
                && !password.trim().isEmpty()) {
            if (!username.matches(usrRegex)) {
                req.setAttribute("message", "Username is not contains special characters like $#@%^&*");
                processGet(req, resp);
                return;
            }
            if (!password.matches(pswRegex)) {
                req.setAttribute("message", "Password length > 8 and one capital letter,one digit,one special character");
                processGet(req, resp);
                return;
            }

            if (MapUser.getMap() != null) {
                Account a = MapUser.getMap().get(username);
                if (a != null) {
                    req.setAttribute("message", "Username is existed on database");
                    processGet(req, resp);
                    return;
                }
            }
            Account account = new Account(username, password);
            MapUser.getMap().put(username, account);
            resp.sendRedirect("loginProcess");
        }
    }

}

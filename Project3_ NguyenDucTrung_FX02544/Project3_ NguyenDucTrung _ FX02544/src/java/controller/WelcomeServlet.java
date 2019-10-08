package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServlet extends BaseController {

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        Boolean isFirst = (Boolean) session.getAttribute("first") != null;
        if (isFirst == null || !isFirst) {
            session.setAttribute("first", true);
        }
        if (!isFirst) {
            req.setAttribute("message", "Welcome to the board");
        } else {
            req.setAttribute("message", "Welcome back!");
        }
        req.getRequestDispatcher("Welcome.jsp").forward(req, resp);
    }

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}

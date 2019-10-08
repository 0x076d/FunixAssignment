package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mail.SendGmail;

public class HomeMailController extends BaseController {

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SendGmail sendGmail = new SendGmail();
        String to = req.getParameter("email");
        String subject = req.getParameter("subject");
        String content = req.getParameter("content");
        String cc = req.getParameter("cc");
        sendGmail.sendEmail(to, subject, content, cc);
        req.setAttribute("to", to);
        req.setAttribute("subject", subject);
        req.setAttribute("content", content);
        req.setAttribute("cc", cc);
        req.setAttribute("message", "Send message success");
        processGet(req, resp);
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("Home.jsp").forward(req, resp);
    }

}

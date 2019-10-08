package controller;

import dal.ArticleDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;

public class EditArticleController extends BaseController {

    ArticleDAO articleDAO = new ArticleDAO();

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String username = (String) req.getSession(true).getAttribute("login");
        Integer id = Integer.parseInt(req.getParameter("id"));
        articleDAO.Update(title, content, username, id);
        processGet(req, resp);
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Article a = articleDAO.get(id, (String) req.getSession(true).getAttribute("login"));
        req.setAttribute("a", a);
        req.setAttribute("id", id);
        req.getRequestDispatcher("Edit.jsp").forward(req, resp);
    }

}

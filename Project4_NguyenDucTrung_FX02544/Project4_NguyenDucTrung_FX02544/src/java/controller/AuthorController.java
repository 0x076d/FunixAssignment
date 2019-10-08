package controller;

import dal.ArticleDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;

public class AuthorController extends BaseController {

    ArticleDAO articleDAO = new ArticleDAO();

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String username = (String) req.getSession(true).getAttribute("login");
        articleDAO.AddNewArticle(title, content, username);
        req.setAttribute("message", "Add success");
        processGet(req, resp);
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = (String) req.getSession(true).getAttribute("login");
        List<Article> articles = articleDAO.getArticles(username);
        req.setAttribute("list", articles);
        req.getRequestDispatcher("Author.jsp").forward(req, resp);
    }

}

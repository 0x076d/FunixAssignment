package controller;

import dal.ArticleDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;

public class ReaderController extends BaseController {

    ArticleDAO articleDAO = new ArticleDAO();

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Article> articles = articleDAO.getAllArticles();
        req.setAttribute("a", articles);
        req.getRequestDispatcher("Home.jsp").forward(req, resp);
    }

}

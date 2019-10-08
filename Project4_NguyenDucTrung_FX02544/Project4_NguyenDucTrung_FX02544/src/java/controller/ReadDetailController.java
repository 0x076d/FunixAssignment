package controller;

import dal.ArticleDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Article;

public class ReadDetailController extends BaseController {

    ArticleDAO articleDAO = new ArticleDAO();
    
    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Article a = articleDAO.get(id);
        req.setAttribute("a", a);
        req.getRequestDispatcher("Read.jsp").forward(req, resp);
    }

}

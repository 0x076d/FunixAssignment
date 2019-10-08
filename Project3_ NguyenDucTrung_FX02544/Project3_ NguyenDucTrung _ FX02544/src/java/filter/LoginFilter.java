package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession(true);
        String url = req.getRequestURI();
        if (url.endsWith("jsp")) {
            resp.sendRedirect("home");
        } else {
            Account a = (Account) session.getAttribute("login");
            if (a == null) {
                if (url.endsWith("loginProcess") || url.endsWith("signup")) {
                    chain.doFilter(request, response);
                } else {
                    resp.sendRedirect("loginProcess");
                }
            } else {
                if (url.endsWith("loginProcess") || url.endsWith("signup")) {
                    resp.sendRedirect("home");
                } else {
                    chain.doFilter(request, response);
                }
            }
        }
    }

    @Override
    public void destroy() {

    }

}

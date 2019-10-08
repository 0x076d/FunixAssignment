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

public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession(true);
        String currentURL = req.getRequestURI().substring(1);
        if (currentURL.endsWith(".jsp")) {
            resp.sendRedirect("login");
        } else {
            if (session.getAttribute("login") != null) {
                if (currentURL.contains("login") || currentURL.contains("register")) {
                    resp.sendRedirect(((int) session.getAttribute("role") == 1) ? "home" : "author");
                } else {
                    chain.doFilter(request, response);
                }
            } else {
                if (currentURL.contains("login") || currentURL.contains("register")) {
                    chain.doFilter(request, response);
                } else {
                    resp.sendRedirect("login");
                }
            }
        }
    }

    @Override
    public void destroy() {

    }

}

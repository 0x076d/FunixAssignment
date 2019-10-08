/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DucTrung
 */
@WebServlet(urlPatterns = {"/CourseValidationServlet"})
public class CourseValidationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CourseValidationServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CourseValidationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String submitBtn = request.getParameter("submit");
        String cancelBtn = request.getParameter("cancel");
        if (submitBtn != null) {
            String getFullName = request.getParameter("fullname").trim();
            String getAge = request.getParameter("age");
            String getCountry = request.getParameter("country");
            String[] getCourse = request.getParameterValues("course");
            String [] getLanguage = request.getParameterValues("lang");

            if (getFullName.equals("") || isNumber(getFullName)) {
                request.setAttribute("error1", "Name can not be blank or contains number!");
                request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
            } else if (getAge.equals("") || Integer.parseInt(getAge) < 18 || Integer.parseInt(getAge) > 40) {
                request.setAttribute("error2", "Age can not be blank, or must be greater than 18 and less than 40!");
                request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
            } else if (getCourse == null) {
                request.setAttribute("error3", "Please choose a course!");
                request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
            } else if (getLanguage == null) {
                request.setAttribute("error4", "Please choose a language to study!");
                request.getRequestDispatcher("CourseForm.jsp").forward(request, response);
            } else {
                request.setAttribute("getFullName", getFullName);
                request.setAttribute("getAge", getAge);
                request.setAttribute("getCountry", getCountry);
                request.setAttribute("getCourse", getCourse);
                request.setAttribute("getLanguage", getLanguage);
                request.getRequestDispatcher("Information.jsp").forward(request, response);
            }
        } else if (cancelBtn != null) {
            request.getRequestDispatcher("page2.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public boolean isNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}

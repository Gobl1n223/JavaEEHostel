package Obche;

import mysql.hostel.hostel;
import mysql.hostel.hostelDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/editObch")
public class EditObchServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Obch obch = ObchDB.selectOfStudents(id);
            if(obch!=null) {
                request.setAttribute("obch",obch);
                getServletContext().getRequestDispatcher("/editObch.jsp").forward(request, response);
            }
            else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
            }
        }
        catch(Exception ex) {
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            int number1 = Integer.parseInt(request.getParameter("number1"));
            String address = request.getParameter("address");
            Obch obch = new Obch(id,number1, address);
            ObchDB.update(obch);
            response.sendRedirect(request.getContextPath() + "/ObchServlet");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}

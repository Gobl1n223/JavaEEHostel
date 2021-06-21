package Obche;

import mysql.hostel.hostel;
import mysql.hostel.hostelDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createObch")
public class CreateObchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/createObch.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int number1 = Integer.parseInt(request.getParameter("number1"));
            String address = request.getParameter("address");
            Obch obch = new Obch(number1, address);
            ObchDB.insert(obch);
            response.sendRedirect(request.getContextPath() + "/ObchServlet");
        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/createObch.jsp").forward(request, response);
        }
    }


}

package Logo;


import Obche.Obch;
import Obche.ObchDB;
import mysql.hostel.hostel;
import mysql.hostel.hostelDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createLogin")
public class CreateLoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/createLogin.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
           String username = request.getParameter("username");
           String password = request.getParameter("password");
            LogB login = new LogB(username, password);
            LoginBD.insert(login);
            response.sendRedirect(request.getContextPath() + "/LoginServlet");
        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/createLogin.jsp").forward(request, response);
        }
    }


}

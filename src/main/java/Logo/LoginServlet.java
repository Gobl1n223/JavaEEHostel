package Logo;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysql.hostel.hostel;
import mysql.hostel.hostelDB;



@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<LogB> login = LoginBD.select();
        request.setAttribute("login", login);

        getServletContext().getRequestDispatcher("/drugoi.jsp").forward(request, response);
    }
}

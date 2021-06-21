import mysql.hostel.hostel;
import mysql.hostel.hostelDB;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Редактировать
@WebServlet("/create")
public class CreateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String groupa = request.getParameter("groupa");
            int number = Integer.parseInt(request.getParameter("number"));
            int number_room = Integer.parseInt(request.getParameter("number_room"));
            hostel hostel = new hostel(name, surname, groupa, number, number_room);
            hostelDB.insert(hostel);
            response.sendRedirect(request.getContextPath() + "/IndexServlet");
        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/create.jsp").forward(request, response);
        }
    }


}

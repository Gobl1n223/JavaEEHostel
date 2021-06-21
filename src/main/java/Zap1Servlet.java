import mysql.hostel.hostel;
import mysql.hostel.hostelDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Zap1Servlet", value = "/Zap1Servlet")
public class Zap1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int number_room = Integer.parseInt(request.getParameter("number_room"));
        ArrayList<hostel> hostel = hostelDB.selectOfStudents111(number_room);
        request.setAttribute("hostel", hostel);

        getServletContext().getRequestDispatcher("/Zap1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

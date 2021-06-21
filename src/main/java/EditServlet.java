import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysql.hostel.hostel;
import mysql.hostel.hostelDB;



@WebServlet("/edit")
public class EditServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            hostel hostel = hostelDB.selectOfStudents(id);
            if(hostel!=null) {
                request.setAttribute("hostel", hostel);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
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
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String groupa = request.getParameter("groupa");
            int number = Integer.parseInt(request.getParameter("number"));
            int number_room = Integer.parseInt(request.getParameter("number_room"));
            hostel hostel = new hostel(id,name, surname, groupa, number, number_room);
            hostelDB.update(hostel);
            response.sendRedirect(request.getContextPath() + "/IndexServlet");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}

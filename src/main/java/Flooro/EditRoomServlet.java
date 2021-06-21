package Flooro;

import Flooro.Room;
import Flooro.RoomDB;
import Obche.Obch;
import Obche.ObchDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/editRoom")
public class EditRoomServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Room room1 = RoomDB.selectOfStudents(id);
            if(room1!=null) {
                request.setAttribute("room",room1);
                getServletContext().getRequestDispatcher("/editRoom.jsp").forward(request, response);
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
            int number_room = Integer.parseInt(request.getParameter("room"));
            int floor = Integer.parseInt(request.getParameter("floor"));
            Room room1 = new Room(id,number_room,floor);
            RoomDB.update(room1);
            response.sendRedirect(request.getContextPath() + "/RoomServlet");
        }
        catch(Exception ex) {

            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);
        }
    }
}

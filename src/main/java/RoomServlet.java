import Flooro.Room;
import Flooro.RoomDB;
import Obche.Obch;
import Obche.ObchDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "RoomServlet", value = "/RoomServlet")
public class RoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Room> rooms = RoomDB.select();
        request.setAttribute("room", rooms);

        getServletContext().getRequestDispatcher("/room.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
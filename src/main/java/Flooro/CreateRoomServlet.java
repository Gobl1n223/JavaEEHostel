package Flooro;

import Flooro.Room;
import Flooro.RoomDB;
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

@WebServlet("/createRoom")
public class CreateRoomServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/createRoom.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            int number_room = Integer.parseInt(request.getParameter("room"));
            int floor = Integer.parseInt(request.getParameter("floor"));
            Room room1 = new Room(number_room, floor);
            RoomDB.insert(room1);
            response.sendRedirect(request.getContextPath() + "/RoomServlet");
        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/createRoom.jsp").forward(request, response);
        }
    }


}

import Obche.Obch;
import Obche.ObchDB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ObchServlet", value = "/ObchServlet")
public class ObchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ArrayList<Obch> obches = ObchDB.select();
            request.setAttribute("obch", obches);

            getServletContext().getRequestDispatcher("/obch.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

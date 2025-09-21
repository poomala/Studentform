package net.javaguides.registration.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import net.javaguides.registration.dao.*;
import net.javaguides.registration.model.*;

/**
 * Servlet implementation class ticketServlet
 */
@WebServlet("/")
public class ticketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ticketDao tickdao= new ticketDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ticketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("/WEB-INF/views/register.jsp");
				dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String passname=request.getParameter("passname");
		String startloc=request.getParameter("startloc");
		String destination=request.getParameter("destination");
		String seat=request.getParameter("seat");
		
		ticket tick = new ticket();
        tick.setPassname(passname);
        tick.setStartloc(startloc);
        tick.setDestintion(destination);
        tick.setSeat(seat);
        

        try {
            tickdao.registerticket(tick);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("/WEB-INF/views/details.jsp");
		dispatcher.forward(request, response);
		
	}

}

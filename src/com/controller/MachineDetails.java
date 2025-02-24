package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pojo.Machinery;

import modal.BLManager;


@WebServlet("/MachineDetails")
public class MachineDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    BLManager bl=new BLManager();   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		Machinery machinery=bl.getRecordByMid(id);
		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("Machine", machinery);
		response.sendRedirect("demo.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

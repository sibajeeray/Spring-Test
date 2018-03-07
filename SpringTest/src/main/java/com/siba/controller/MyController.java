package com.siba.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MyController {
	
	@RequestMapping(value="/url.sr")
	public void handler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		if(name.equals(""))
		{
			request.setAttribute("error", "PLZ ENTER A NAME");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("username", name);
			request.getRequestDispatcher("/view.jsp").forward(request, response);
		}
	}
}

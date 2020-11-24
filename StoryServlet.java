package com.storydetails;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StoryServlet")
public class StoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StoryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StoryDetails sd=new StoryDetails();
		String by = request.getParameter("by");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String story = request.getParameter("story");
		sd.setBy(by);
		sd.setStoryname(name);
		sd.setType(type);
		sd.setStory(story);
		StoryDAO storyDAO = new StoryDAO();
		String userRegistered = storyDAO.uploadStory(sd);
		if (userRegistered.equals("SUCCESS")) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			request.setAttribute("message", userRegistered);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}

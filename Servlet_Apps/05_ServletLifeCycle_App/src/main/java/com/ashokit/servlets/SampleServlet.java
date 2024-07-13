package com.ashokit.servlets;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SampleServlet() {
       System.out.println("SampleServlet Class Default Constructor......");
    }
    
    //InstantiationEvent(public,defaultConstructor,loaded,newInstance())
    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("SampleServlet Class init(-)");
    	
    }

    
	//RequestArrival Event
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
    	System.out.println("SampleServlet Class Service(-,-)..........");
    }
    
    //Destruction Event
    @Override
    public void destroy() {
    	System.out.println("SampleServlet Class destroy()......");
    }

}

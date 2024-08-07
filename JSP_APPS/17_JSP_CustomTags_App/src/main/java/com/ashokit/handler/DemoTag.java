package com.ashokit.handler;

import java.io.IOException;
import jakarta.servlet.jsp.*;
import jakarta.servlet.jsp.tagext.*;

public class DemoTag extends TagSupport{
	
	 private static final long serialVersionUID = 1L;
	
	 private String user="AshokIT";
	
	 public void setUser(String user){
		  this.user= user;
	 }
	 
	 public String getUser(){
		 return user;
	 }
	
	 //overriding the methods from TagSupport Class <demo/>
	  public int doStartTag(){
		   System.out.println("Inside the doStartTag()..............");
		   try{
			   //By using PageContext Object we can get other implicit object
			   JspWriter out = pageContext.getOut();			      
			   out.print("This is Demo Tag:"+user +" <br/>");
		   }catch(IOException ioe){
			   System.out.println("Error in the Tag Creation:" + ioe);
		   }
		   return SKIP_BODY;
	  }

	  //overriding the methods from TagSupport Class
	  public int doEndTag(){
		  System.out.println("Inside the doEndTag()..................");
		  return EVAL_PAGE;
	  }
}

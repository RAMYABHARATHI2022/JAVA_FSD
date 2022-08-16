package java.programs;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstCookie extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
	    
		try{  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    out.print("Welcome "+ n);  
	  
	    Cookie ck=new Cookie("uname",n);		//creating cookie object  
	    response.addCookie(ck);					//adding cookie in the response  
	  
	    //creating submit button  
	    out.print("<form action='serv2'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	          
	    out.close();  
	  
	        }catch(Exception e){System.out.println(e);
	      } 
	  }

}

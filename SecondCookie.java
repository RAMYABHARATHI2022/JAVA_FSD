package java.programs;

import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondCookie extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response){  
	    
		try{  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		      
		    Cookie ck[]=request.getCookies();  
		    
		    for(int i=0;i<ck.length;i++){  
		    	 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
		    	} 
	        out.close();  
	         }
		catch(Exception e)
		{
			System.out.println(e);
		}  
	  }  

}

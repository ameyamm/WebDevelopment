package com.ameyamm.webdev.ws.restws;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userinfoservice")
public class UserInfo {

	@GET
	@Path("/name/{i}")
	@Produces(MediaType.TEXT_HTML)
	public String userName(@PathParam("i") String i)
	{
		String display = "Hello " + i ; 
		return "<html>" +
				"<title> " + display + "</title>" + 
				"<body>" + display + "</body>" + 
				"</html>" ; 
	}
	
	@GET
	@Path("/name2/{i}")
	@Produces(MediaType.APPLICATION_XML)
	public String userName2(@PathParam("i") String i)
	{
		String display = "Hello " + i ; 
		return "<?xml version=\"1.0\"?>" + 
				"<hello> <name> " + i + "</name> </hello>";
	}
}

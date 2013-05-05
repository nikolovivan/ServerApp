/**
 * 
 */
package com.ivan.nikolov.telnet.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * A simple http Ping class to test the server.
 * 
 * @author Ivan Nikolov
 * 
 */
@Path("/ping")
public class Ping {

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_HTML)
	public String testPing() {
		return "<h1>Hooray! The server responded!</h1>";
	}
}

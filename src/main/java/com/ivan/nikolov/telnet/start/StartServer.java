/**
 * 
 */
package com.ivan.nikolov.telnet.start;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author Ivan Nikolov
 * 
 */
public class StartServer {

	/**
	 * @param args
	 * @throws Exception
	 *             if the initialization of the server was not successful.
	 */
	public static void main(final String[] args) throws Exception {
		Server server = new Server(8080);

		WebAppContext context = new WebAppContext();
		context.setDescriptor("./src/main/webapp/WEB-INF/web.xml");
		context.setResourceBase("./src/main/webapp");
		context.setContextPath("/");
		context.setParentLoaderPriority(true);

		server.setHandler(context);

		server.start();
		server.join();
	}

}

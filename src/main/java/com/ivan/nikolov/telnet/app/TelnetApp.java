/**
 * 
 */
package com.ivan.nikolov.telnet.app;

import java.util.HashSet;
import java.util.Set;

import com.ivan.nikolov.telnet.logger.Log4jLoggerInitializer;
import com.ivan.nikolov.telnet.rest.Default;
import com.ivan.nikolov.telnet.rest.Ping;

/**
 * @author Ivan Nikolov
 * 
 */
public class TelnetApp extends javax.ws.rs.core.Application {

	private final Set<Object> resources = new HashSet<Object>();

	/**
	 * Initializes the application and its endpoints.
	 */
	public TelnetApp() {
		// initialize the logger
		Log4jLoggerInitializer.initialize();
		// add the classes that will respond to requests
		this.resources.add(new Ping());
		this.resources.add(new Default());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.Application#getSingletons()
	 */
	@Override
	public Set<Object> getSingletons() {
		return this.resources;
	}
}

/**
 * 
 */
package com.ivan.nikolov.telnet.logger;

import java.io.InputStream;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Initializes the log4j logger from a file in the classpath.
 * 
 */
public class Log4jLoggerInitializer {

	private static Logger logger = LoggerFactory.getLogger(Log4jLoggerInitializer.class);
	private static final String LOG4J_CONFIG = "log4j.properties";

	public static void initialize() {
		InputStream is = Log4jLoggerInitializer.class.getClassLoader().getResourceAsStream(Log4jLoggerInitializer.LOG4J_CONFIG);

		if (is != null) {
			PropertyConfigurator.configure(is);
			Log4jLoggerInitializer.logger.info("Logger successfully initialized.");
		} else {
			Log4jLoggerInitializer.logger.warn("Could not load log4j properties configuration.");
		}
	}
}

/**
 * 
 */
package com.ivan.nikolov.telnet.rest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Ivan Nikolov
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ PingTestCase.class })
public class RestServicesTestSuite {

	@BeforeClass
	public static void doBeforeClass() {
		System.out.println("Starting rest services tests.");
	}

	@AfterClass
	public static void doAfterClass() {
		System.out.println("Rest services tests finished.");
	}
}

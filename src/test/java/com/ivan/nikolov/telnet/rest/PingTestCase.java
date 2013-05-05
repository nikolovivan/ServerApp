/**
 * 
 */
package com.ivan.nikolov.telnet.rest;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

/**
 * @author Ivan Nikolov
 * 
 */
public class PingTestCase extends TestCase {

	@Test
	public void testPingTestMethod() {
		Ping ping = new Ping();
		Assert.assertEquals("<h1>Hooray! The server responded!</h1>", ping.testPing());
	}
}

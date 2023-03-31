package com.delphicalljava.demo;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("io")
class DemoApplicationTests {

	@Test
	void contextLoads() { TestCase.assertEquals(1, 1); }
}

package com.frank.boot;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.frank.boot.controller.HomeController;

public class AppTest {

	@Test
	public void testApp() {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "This is my home page");
	}
}

package com.micro.Aggrigation.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionControllerTest {

	@Test
	void divtest() {
		DivisionController D1=new DivisionController();
		String result=D1.div(200, 20);
		assertEquals("10", result);
	}

}

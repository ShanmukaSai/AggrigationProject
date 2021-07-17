package com.micro.Aggrigation.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractionControllerTest {

	@Test
	void subtest() {
		SubtractionController S1=new SubtractionController();
		String result=S1.sub(100, 50);
		assertEquals("50", result);
	}

}

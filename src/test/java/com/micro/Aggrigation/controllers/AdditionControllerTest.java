package com.micro.Aggrigation.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionControllerTest {

	@Test
	void addtest() {
		AdditionController A1=new AdditionController();
		String result=A1.add(10, 20);
		assertEquals("30", result);
		
	}

}

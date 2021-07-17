package com.micro.Aggrigation.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicationControllerTest {

	@Test
	void multest() {
		MultiplicationController M1=new MultiplicationController();
		String result=M1.mul(90, 10);
		assertEquals("900", result);
	}

}

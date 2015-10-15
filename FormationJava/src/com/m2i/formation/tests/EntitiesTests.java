package com.m2i.formation.tests;


import org.junit.*;

import com.m2i.formation.media.entities.*;


public class EntitiesTests {

	@Test
	public void test() {
		
		Book b = new Book();
		b.setId(102);
		Assert.assertEquals(102, b.getId());
		
	}

	@Test
	public void VATPriceTest(){
		Media m = new Cd ();
		m.setPrice(10);
		Assert.assertEquals(12, m.getVATPrice(), 0.001);
	}

	
	@Test
	public void testFirstTest(){
		Book b = new Book();
		int eval = b.getEvaluation();
		Assert.assertEquals(0, eval);
	}
	

}

package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class DLCase {

	//TestCase1
	@Test
	public void test1() {
	
		//EO and AO are tested
		DL DlObject=new DL();
		assertEquals("right to drive PAN India",DlObject.DL(20));
	}

	//TestCase2
		@Test
		public void test2() {
		
			//EO and AO are tested
			DL DlObject=new DL();
			assertEquals("no right to drive",DlObject.DL(22));
		}
}

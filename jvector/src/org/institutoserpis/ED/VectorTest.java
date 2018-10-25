package org.institutoserpis.ED;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void IndexOf() {
		int[] v = new int[] {16,12,15,14,17};
		assertEquals(0, vector.indexOf(v, 16));
		assertEquals(2, vector.indexOf(v, 15));
		assertEquals(4, vector.indexOf(v, 17));
		assertEquals(-1, vector.indexOf(v, 33));
		
	}
	
	@Test
	void indexOfEmpty() {
	int [] v=new int[] {};
	
	assertEquals(-1, vector.indexOf(v, 22));

	}
	@Test
	void min() {
	
	assertEquals(16, vector.min(new int[] {16,12,15,14,17}));
	assertEquals(12, vector.min(new int[] {12,16,15,14,17}));
	assertEquals(12, vector.min(new int[] {12}));
	assertEquals(12, vector.min(new int[] {16,17,15,14,12}));
	assertEquals(-12, vector.min(new int[] {-16,-17,-15,-14,-12}));
	}
}

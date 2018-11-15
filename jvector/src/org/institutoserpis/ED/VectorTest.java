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
	
	assertEquals(12, vector.min(new int[] {16,12,15,14,17}));
	assertEquals(12, vector.min(new int[] {12,16,15,14,17}));
	assertEquals(12, vector.min(new int[] {12}));
	assertEquals(12, vector.min(new int[] {16,17,15,14,12}));
	assertEquals(-17, vector.min(new int[] {-16,-17,-15,-14,-12}));
	}
	@Test
	void indexOfMin() {
	assertEquals(1, vector.indexOfMin(new int[] {16, 12, 15, 14, 17}));
	assertEquals(0, vector.indexOfMin(new int[] {9, 12, 15, 14, 17}));
	assertEquals(4, vector.indexOfMin(new int[] {16, 12, 15, 14, 7}));
	assertEquals(0, vector.indexOfMin(new int[] {57}));
	assertEquals(0, vector.indexOfMin(new int[] {57, 98}));
	assertEquals(1, vector.indexOfMin(new int[] {98, 57}));
	}
	@Test 
	void sort() {
		int[] v=new int[] {15, 12};
		vector.sort(v);
		assertArrayEquals(new int [] {12, 15}, v);
		
		v=new int[] {17, 12, 15};
		vector.sort(v);
		assertArrayEquals(new int [] {12, 15, 17}, v);
		
		v=new int[] {15};
		vector.sort(v);
		assertArrayEquals(new int [] {15}, v);
		
		v=new int[] {16, 15, 14, 15};
		vector.sort(v);
		assertArrayEquals(new int [] {14, 15, 15, 16}, v);
		

	}
	@Test 
	void sortEmpty() {
		int[] v=new int[] {};
		vector.sort(v);
		assertArrayEquals(new int [] {}, v);
	}
	@Test
	void indexOfMinWidthinitialIndex() {
		assertEquals(1, vector.indexOfMin(new int[] {16, 12, 15, 14, 17}, 0));
		assertEquals(3, vector.indexOfMin(new int[] {12, 13, 15, 14, 17}, 2));
	}
}

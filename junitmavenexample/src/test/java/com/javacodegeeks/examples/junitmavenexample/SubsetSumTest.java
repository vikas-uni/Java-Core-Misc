package com.javacodegeeks.examples.junitmavenexample;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import nagarro.test.SubsetSum;

public class SubsetSumTest {

	private static SubsetSum subsetSum;

	@BeforeClass
	public static void initCalculator() {
		subsetSum = new SubsetSum();
	}
	
	@Test
	public void testHasSum_existsPositive() {
		assertTrue(subsetSum.hasSum(getTestArray(), 9));
	}
	
	@Test
	public void testHasSum_exists() {
		assertTrue(subsetSum.hasSum(getTestArray(), -6));
	}
	
	@Test
	public void testHasSum_notExists() {
		assertFalse(subsetSum.hasSum(getTestArray(), 1235));
	}
	
	@Test(expected=NullPointerException.class)
	public void testHasSum_forNull(){
		subsetSum.hasSum(null, 2);
	}
	
	@Test
	public void testHasSum_existsOneNegative() {
		assertTrue(subsetSum.hasSum(getTestArrayoneNeg(), -2));
	}
	
	@Test
	public void testHasSum_existsAllNegative() {
		assertTrue(subsetSum.hasSum(getTestArrayAllNeg(), -17));
	}
	
	private int[] getTestArray() {
		int[] arr = {3, 34, 4, 12, 5, -2, -4};
		return arr;
	}
	
	private int[] getTestArrayoneNeg() {
		int[] arr = {3, 34, 4, 12, 5,-4,2};
		return arr;
	}
	
	private int[] getTestArrayAllNeg() {
		int[] arr = {-3, -34, -4, -12, -5,-4,-2};
		return arr;
	}
	
}

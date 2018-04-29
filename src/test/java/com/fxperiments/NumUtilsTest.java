package com.fxperiments;

import static com.fxperiments.NumUtils.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class NumUtilsTest {
	
	@Test
	public void isThirteenBytePrimTest(){
		byte thirteen = 13;
		assertTrue(isThirteen(thirteen));
	}
	
	@Test
	public void isThirteenShortPrimTest(){
		short thirteen = 13;
		assertTrue(isThirteen(thirteen));
	}
	
	@Test
	public void isThirteenIntPrimTest(){
		int thirteen = 13;
		assertTrue(isThirteen(thirteen));
	}
	
	@Test
	public void isThirteenLongPrimTest(){
		long thirteen = 13;
		assertTrue(isThirteen(thirteen));
	}
	
	@Test
	public void isThirteenFloatPrimTest(){
		float thirteen = 13;
		assertTrue(isThirteen(thirteen));
	}
	
	@Test
	public void isThirteenDoublePrimTest(){
		double thirteen = 13;
		assertTrue(isThirteen(thirteen));
	}
	
	@Test
	public void isThirteenBigDecimalTest() {
		BigDecimal thirteen = new BigDecimal("13.0");
		assertTrue(isThirteen(thirteen));
	}
	
	@Test
	public void isThirteenBytePrimNegTest(){
		byte notThirteen = 14;
		assertFalse(isThirteen(notThirteen));
	}
	
	@Test
	public void isThirteenShortPrimNegTest(){
		short notThirteen = 14;
		assertFalse(isThirteen(notThirteen));
	}
	
	@Test
	public void isThirteenIntPrimNegTest(){
		int notThirteen = 14;
		assertFalse(isThirteen(notThirteen));
	}
	
	@Test
	public void isThirteenLongPrimNegTest(){
		long notThirteen = 14;
		assertFalse(isThirteen(notThirteen));
	}
	
	@Test
	public void isThirteenFloatPrimNegTest(){
		float notThirteen = 14;
		assertFalse(isThirteen(notThirteen));
	}
	
	@Test
	public void isThirteenDoublePrimNegTest(){
		double notThirteen = 14;
		assertFalse(isThirteen(notThirteen));
	}
	
	@Test	
	public void isThirteenBigDecimalNegTest() {
		BigDecimal notThirteen = new BigDecimal("13.001");
		assertFalse(isThirteen(notThirteen));
	}
	
	@Test
	public void isThirteenNullTest() {
		Object nullObj = null;
		assertFalse(isThirteen(nullObj));		
	}
	
	
}

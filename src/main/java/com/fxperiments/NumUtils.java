package com.fxperiments;

public class NumUtils {
	
	private static final Integer THIRTEEN = Integer.valueOf(13);
	
	public static boolean isThirteen(byte num){
		return num == THIRTEEN.byteValue();
	}
	
	public static boolean isThirteen(short num){
		return num == THIRTEEN.shortValue();
	}
	
	public static boolean isThirteen(int num){
		return num == THIRTEEN.intValue();
	}
	
	public static boolean isThirteen(long num){
		return num == THIRTEEN.longValue();
	}
	
	public static boolean isThirteen(float num){
		return num == THIRTEEN.floatValue();
	}
	
	public static boolean isThirteen(double num){
		return num == THIRTEEN.doubleValue();
	}
	
	public static boolean isThirteen(Number num){
		if(num == null) return false;
		return isThirteen(num.doubleValue());
	}
	
	public static boolean isThirteen(Object num){
		if(num instanceof Number) {
			return isThirteen((Number) num);
		} else {
			return false;
		}
	}
	
}

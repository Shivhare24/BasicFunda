package com.programmingpractise.questions;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "gfcaaaecbg";
		long l =547602;
		BigDecimal n = new BigDecimal(l);
		BigDecimal Count = new BigDecimal(0);
		BigDecimal length = new BigDecimal(str.length());
		BigDecimal result = new BigDecimal(0);
		if (1 == length.intValueExact()) {
			System.out.println(n);
		} else {
			for (long k = 0; k <length.intValue(); k++) {
				if (str.charAt((int) k) == 'a')
					Count = Count.add(new BigDecimal(1));
			}
			result = ((Count.multiply(n)).divide(length,0,RoundingMode.CEILING));
			System.out.println(result);
			
		}
		System.out.println(str);
	}
}
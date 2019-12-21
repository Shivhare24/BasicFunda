package com.hackerank.pkg;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;


public class Java_DateTime {

	public static void main(String[] args) {
		/*
		 * LocalDate date = LocalDate.now(); System.out.println(date);
		 * 
		 * LocalTime time = LocalTime.now(); System.out.println(time);
		 * 
		 * LocalDateTime localDateTime = LocalDateTime.now();
		 * System.out.println(localDateTime);
		 * 
		 * LocalDate localDate = LocalDate.of(2019, 11, 10); DayOfWeek
		 * dayOfWeek=localDate.getDayOfWeek(); System.out.println(dayOfWeek);
		 * 
		 * System.out.println(LocalDate.of(2019, 11, 12).getDayOfWeek().name());
		 */

	List list = new ArrayList<String>();
	
	
	list.add(new Integer(2));
	list.add("a string");
	
	System.out.println("--------------------");
	for (Object obj : list) {
		System.out.println(obj);
	}
	
	
	}
	public static String findDay(int month, int day, int year) {
		return null;
        
    }

}

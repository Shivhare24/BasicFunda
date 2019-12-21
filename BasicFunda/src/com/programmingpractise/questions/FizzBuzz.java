package com.programmingpractise.questions;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub
		 * Stream.iterate(0,j->j+1).limit(100).filter(n->{ if((n%3==0)&&(n%5!=0)) {
		 * System.out.println("Fizz"); } else if ((n%3!=0)&&(n%5==0)){
		 * System.out.println("Buzz"); } else if ((n%3==0)&&(n%5==0)){
		 * System.out.println("FizzBuzz"); } else System.out.println(n); });
		 */
		/*
		 * Stream.iterate(0,
		 * n->n+1).limit(101).filter(n->n%3!=0).filter(n->n%5!=0).forEach(n->System.out.
		 * println(n)); Stream.iterate(0,
		 * n->n+1).limit(101).filter(n->n%3==0).forEach(n->System.out.println("fizz"));
		 * Stream.iterate(0,
		 * n->n+1).limit(101).filter(n->n%5==0).forEach(n->System.out.println("buzz"));
		 * Stream.iterate(0,
		 * n->n+1).limit(101).filter(n->n%3==0).filter(n->n%5==0).forEach(n->System.out.
		 * println("fizzbuzz"));
		 */
		
		/*
		 * for (int i = 1; i < 101; i++) { if ((i % 3 == 0) && (i % 5 != 0)) {
		 * System.out.println("Fizz"); } else if ((i % 3 != 0) && (i % 5 == 0)) {
		 * System.out.println("Buzz"); } else if ((i % 3 == 0) && (i % 5 == 0)) {
		 * System.out.println("FizzBuzz"); } else System.out.println(i); }
		 */
		
		IntConsumer action = i -> {
		    if((i%3==0)&&(i%5!=0)) {
		        System.out.println("Fizz");
		    } else if((i%3!=0)&&(i%5==0)){
		        System.out.println("Buzz");
		    }
		    else if((i%3==0)&&(i%5==0)) {
		    	System.out.println("FizzBuzz");
		    }
		    else
		    	System.out.println(i);
		};
		
		IntStream.iterate(1,n->n+1).limit(100).forEach(action);
	}
}

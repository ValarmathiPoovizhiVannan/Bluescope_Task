package com.bluescope;
import java.util.Arrays;
import java.util.List;

public class Stream_API {
	public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        numbers.stream()
	               .filter(n -> n % 2 == 0)     
	               .map(n -> n * 10)          
	               .forEach(System.out::println);

 	        System.out.println("Parallel Stream Output:");
	        numbers.parallelStream()
	               .forEach(System.out::println);
	    }
	}



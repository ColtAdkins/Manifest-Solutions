package com.manifestcorp;

public class FizzBuzz {
	public void creates100LinesOfFizzBuzz() {
		for(int i=0;i<100;i++) {
			System.out.println(fizzBuzzCreator(i));
		}
	}
	public String fizzBuzzCreator(int count){
		if (count % 15 == 0) {
			return "FizzBuzz";
		}
		if(count % 3 == 0) {
			return "Fizz";
		} if (count % 5 == 0) {
			return "Buzz";
		}
		else return String.valueOf(count);
	}
}

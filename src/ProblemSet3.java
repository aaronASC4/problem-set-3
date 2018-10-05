﻿import java.util.Scanner;

/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be extensive. You've been warned. Practice
 * makes perfect, and we'll get a lot of practice with conditional
 * and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment.
 * Last time, we saw methods (other than the main method) for the
 * first time. Now, we're seeing parameters, which are the variables
 * inside the parentheses in our methods. We'll cover these in more
 * detail later. For now, you just need to understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the
 * method do its job. It's passed in through the parentheses, and
 * you can reference these variables by name as if they're your own.
 * 
 * Each of the return statements included in this skeleton are
 * placeholders. You'll need to modify them as you write your code.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods
	 * from the main method!
	 */
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		ps3.dateFashion(5, 10);
		ps3.dateFashion(5, 2);
		ps3.dateFashion(5, 5);
		ps3.isPrime(112);
		ps3.fizzString("fig");
		ps3.fizzString("dib");
		ps3.fizzString("fib");
		ps3.squirrelPlay(70, false);
		ps3.squirrelPlay(95, false);
		ps3.squirrelPlay(95, true);
		ps3.fizzStringAgain(1);
		ps3.fizzStringAgain(2);
		ps3.fizzStringAgain(3);
		ps3.makeBricks(3, 1, 8);
		ps3.makeBricks(3, 1, 9);
		ps3.makeBricks(3, 2, 10);
		ps3.loneSum(1, 2, 3);
		ps3.loneSum(3, 2, 3);
		ps3.loneSum(3, 3, 3);
		ps3.luckySum(1, 2, 3);
		
	}
	/*
	 * You and your date are trying to get a table at a restaurant. The
	 * parameter "you" is the stylishness of your clothes, in the range
	 * 0..10, and "date" is the stylishness of your date's clothes. The
	 * result getting the table is encoded as an int value with (0 = no,
	 * 1 = maybe, 2 = yes). If either of you is very stylish, 8 or more,
	 * then the result is 2 (yes). With the exception that if either of
	 * you has style of 2 or less, then the result is 0 (no). Otherwise
	 * the result is 1 (maybe). Print YES, NO, or MAYBE. Nothing more,
	 * nothing less.
	 * 
	 * dateFashion(5, 10) â†’ YES
	 * dateFashion(5, 2) â†’ NO
	 * dateFashion(5, 5) â†’ MAYBE
	 */
	
	public void dateFashion(int you, int date) {
		if(you <= 2 || date <= 2) {
			System.out.println("NO");
		} else if(you >= 8 || date >= 8) {
			System.out.println("YES");
		} else {
			System.out.println("MAYBE");
		}
		
	}
	
	/*
	 * Given a string str, if the string starts with "f" print FIZZ.
	 * If the string ends with "b" print BUZZ. If both the "f" and "b"
	 * conditions are true, print FIZZBUZZ. In all other cases, print
	 * the string unchanged.
	 * 
	 * fizzString("fig") â†’ FIZZ
	 * fizzString("dib") â†’ BUZZ
	 * fizzString("fib") â†’ FIZZBUZZ
	 */
	
	public void fizzString(String str) {
		if (str.contains("f") && !str.contains("b")) {
			System.out.println("FIZZ");
		} else if(str.contains("b") && !str.contains("f")) {
			System.out.println("BUZZ");
		} else if(str.contains("f") && str.contains("b")) {
			System.out.println("FIZZBUZZ");
		}
	}
	
	/*
	 * The squirrels in Palo Alto spend most of the day playing. In particular,
	 * they play if the temperature is between 60 and 90 (inclusive). Unless it
	 * is summer, then the upper limit is 100 instead of 90. Given an int
	 * temperature and a boolean isSummer, print YES if the squirrels play and
	 * NO otherwise.
	 * 
	 * squirrelPlay(70, false) â†’ YES
	 * squirrelPlay(95, false) â†’ NO
	 * squirrelPlay(95, true) â†’ YES
	 */
	
	public void squirrelPlay(int temp, boolean isSummer) {
		if (isSummer == true) {
			if (temp >= 60 && temp <= 100 ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			if (temp >= 60 && temp <= 90) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	/*
	 * Given an int n, print the string form of the number followed by "!". So the
	 * int 6 yields "6!". Except if the number is divisible by 3 print FIZZ instead of
	 * the number; if the number is divisible by 5 print BUZZ; if divisible by
	 * both 3 and 5, print FIZZBUZZ.
	 * 
	 * fizzStringAgain(1) â†’ 1!
	 * fizzStringAgain(2) â†’ 2!
	 * fizzStringAgain(3) â†’ FIZZ!
	 */
	
	public void fizzStringAgain(int n) {
		if(n%3 == 0 && n%5 == 0 ) {
			System.out.println("FIZZBUZZ" + "!");
		} else if(n%3 == 0) {
			System.out.println("FIZZ!");
		} else if(n%5 == 0) {
			System.out.println("BUZZ!");
		} else {
			System.out.println(n + "!");
		}
	}
	/*
	 * We want to make a row of bricks that is goal inches long. We have a number of small
	 * bricks (1 inch each) and big bricks (5 inches each). Print YES if it is possible
	 * to make the goal by choosing from the given bricks, otherwise print NO. This is a
	 * little harder than it looks and can be done without any loops.
	 * 
	 * makeBricks(3, 1, 8) â†’ YES
	 * makeBricks(3, 1, 9) â†’ NO
	 * akeBricks(3, 2, 10) â†’ YES
	 */
	
	public void makeBricks(int small, int big, int goal) {
		if(small + big*5 >= goal) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	/*
	 * Given 3 int values, a b c, print their sum. However, if one of the values is the
	 * same as another of the values, it does not count towards the sum.
	 * 
	 * loneSum(1, 2, 3) â†’ 6
	 * loneSum(3, 2, 3) â†’ 2
	 * loneSum(3, 3, 3) â†’ 0
	 */
	
	public void loneSum(int a, int b, int c) {
		 if (a == b && b == c) {
	            a = 0;
	            b = 0;
	            c = 0;
	        }
	        if (a == b) {
	            a = 0;
	            b = 0;
	        }
	        if (a == c) {
	            a = 0;
	            c = 0;
	        }
	        if (b == c) {
	            b = 0;
	            c = 0;
	        }

	        System.out.println(a + b + c);
	}
	
	/*
	 * Given 3 int values, a b c, return their sum. However, if one of the values is 13
	 * then it does not count towards the sum and values to its right do not count. So for
	 * example, if b is 13, then both b and c do not count.
	 * 
	 * luckySum(1, 2, 3) â†’ 6
	 * luckySum(1, 2, 13) â†’ 3
	 * luckySum(1, 13, 3) â†’ 1
	 */
	
	public void luckySum(int a, int b, int c) {
		if(a == 13) {
			System.out.println(0);
		} else if(b == 13) {
			System.out.println(a);
		} else if(c == 13) {
			System.out.println(a + b);
		}
		System.out.println(a + b + c);
}
	
	/*
	 * Given an integer value, n, compute the factorial of n. You are required to use a
	 * for loop to solve this exercise.
	 * 
	 * factorialFor(3) â†’ 6
	 * factorialFor(4) â†’ 24
	 * factorialFor(5) â†’ 120
	 */
	
	public void factorialFor(int n) {
		for(int i = 1;i<=n;i++) {
			i=i*i;
			System.out.println(i);
		}
	}
	
	/*
	 * Given an integer value, n, compute the factorial of n. You are required to use a
	 * while loop to solve this exercise. Your method should print n! = y (where n is the
	 * input and y is the output). Nothing more, nothing less.
	 * 
	 * factorialWhile(3) â†’ 6
	 * factorialWhile(4) â†’ 24
	 * factorialWhile(5) â†’ 120
	 */
	
	public void factorialWhile(int n) {
		int i = 1;
		while(i<=n) {
			i++;
			i=i*i;
		}
		System.out.println(n + "! = " + i);
	}
	
	/*
	 * Given an integer value, n, determine whether or not n is a prime number. Your method
	 * should either print PRIME or NOT PRIME. Nothing more, nothing less.
	 * 
	 * isPrime(11) â†’ YES
	 * isPrime(17) â†’ YES
	 * isPrime(112) â†’ NO
	 */
	
	public void isPrime(int n) {
		boolean check = false;
		
		for (int i = 2; i <= n/2; i++) { 
			if (n % i == 0) { 
				check = true;
			}
		}
		if(!check) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}
	}
}
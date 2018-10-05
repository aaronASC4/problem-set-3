import java.util.Scanner;

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
		// dateFashion(you, date) Test Cases

		ps3.dateFashion(0, 0); // NO.
		ps3.dateFashion(0, 1); // NO.
		ps3.dateFashion(0, 2); // NO.
		ps3.dateFashion(0, 3); // NO.
		ps3.dateFashion(0, 4); // NO.
		ps3.dateFashion(0, 5); // NO.
		ps3.dateFashion(0, 6); // NO.
		ps3.dateFashion(0, 7); // NO.
		ps3.dateFashion(0, 8); // NO.
		ps3.dateFashion(0, 9); // NO.
		ps3.dateFashion(0, 10); // NO.
		ps3.dateFashion(1, 0); // NO.
		ps3.dateFashion(1, 1); // NO.
		ps3.dateFashion(1, 2); // NO.
		ps3.dateFashion(1, 3); // NO.
		ps3.dateFashion(1, 4); // NO.
		ps3.dateFashion(1, 5); // NO.
		ps3.dateFashion(1, 6); // NO.
		ps3.dateFashion(1, 7); // NO.
		ps3.dateFashion(1, 8); // NO.
		ps3.dateFashion(1, 9); // NO.
		ps3.dateFashion(1, 10); // NO.
		ps3.dateFashion(2, 0); // NO.
		ps3.dateFashion(2, 1); // NO.
		ps3.dateFashion(2, 2); // NO.
		ps3.dateFashion(2, 3); // NO.
		ps3.dateFashion(2, 4); // NO.
		ps3.dateFashion(2, 5); // NO.
		ps3.dateFashion(2, 6); // NO.
		ps3.dateFashion(2, 7); // NO.
		ps3.dateFashion(2, 8); // NO.
		ps3.dateFashion(2, 9); // NO.
		ps3.dateFashion(2, 10); // NO.
		ps3.dateFashion(3, 0); // NO.
		ps3.dateFashion(3, 1); // NO.
		ps3.dateFashion(3, 2); // NO.
		ps3.dateFashion(3, 3); // MAYBE.
		ps3.dateFashion(3, 4); // MAYBE.
		ps3.dateFashion(3, 5); // MAYBE.
		ps3.dateFashion(3, 6); // MAYBE.
		ps3.dateFashion(3, 7); // MAYBE.
		ps3.dateFashion(3, 8); // YES.
		ps3.dateFashion(3, 9); // YES.
		ps3.dateFashion(3, 10); // YES.
		ps3.dateFashion(4, 0); // NO.
		ps3.dateFashion(4, 1); // NO.
		ps3.dateFashion(4, 2); // NO.
		ps3.dateFashion(4, 3); // MAYBE.
		ps3.dateFashion(4, 4); // MAYBE.
		ps3.dateFashion(4, 5); // MAYBE.
		ps3.dateFashion(4, 6); // MAYBE.
		ps3.dateFashion(4, 7); // MAYBE.
		ps3.dateFashion(4, 8); // YES.
		ps3.dateFashion(4, 9); // YES.
		ps3.dateFashion(4, 10); // YES.
		ps3.dateFashion(5, 0); // NO.
		ps3.dateFashion(5, 1); // NO.
		ps3.dateFashion(5, 2); // NO.
		ps3.dateFashion(5, 3); // MAYBE.
		ps3.dateFashion(5, 4); // MAYBE.
		ps3.dateFashion(5, 5); // MAYBE.
		ps3.dateFashion(5, 6); // MAYBE.
		ps3.dateFashion(5, 7); // MAYBE.
		ps3.dateFashion(5, 8); // YES.
		ps3.dateFashion(5, 9); // YES.
		ps3.dateFashion(5, 10); // YES.
		ps3.dateFashion(6, 0); // NO.
		ps3.dateFashion(6, 1); // NO.
		ps3.dateFashion(6, 2); // NO.
		ps3.dateFashion(6, 3); // MAYBE.
		ps3.dateFashion(6, 4); // MAYBE.
		ps3.dateFashion(6, 5); // MAYBE.
		ps3.dateFashion(6, 6); // MAYBE.
		ps3.dateFashion(6, 7); // MAYBE.
		ps3.dateFashion(6, 8); // YES.
		ps3.dateFashion(6, 9); // YES.
		ps3.dateFashion(6, 10); // YES.
		ps3.dateFashion(7, 0); // NO.
		ps3.dateFashion(7, 1); // NO.
		ps3.dateFashion(7, 2); // NO.
		ps3.dateFashion(7, 3); // MAYBE.
		ps3.dateFashion(7, 4); // MAYBE.
		ps3.dateFashion(7, 5); // MAYBE.
		ps3.dateFashion(7, 6); // MAYBE.
		ps3.dateFashion(7, 7); // MAYBE.
		ps3.dateFashion(7, 8); // YES.
		ps3.dateFashion(7, 9); // YES.
		ps3.dateFashion(7, 10); // YES.
		ps3.dateFashion(8, 0); // NO.
		ps3.dateFashion(8, 1); // NO.
		ps3.dateFashion(8, 2); // NO.
		ps3.dateFashion(8, 3); // YES.
		ps3.dateFashion(8, 4); // YES.
		ps3.dateFashion(8, 5); // YES.
		ps3.dateFashion(8, 6); // YES.
		ps3.dateFashion(8, 7); // YES.
		ps3.dateFashion(8, 8); // YES.
		ps3.dateFashion(8, 9); // YES.
		ps3.dateFashion(8, 10); // YES.
		ps3.dateFashion(9, 0); // NO.
		ps3.dateFashion(9, 1); // NO.
		ps3.dateFashion(9, 2); // NO.
		ps3.dateFashion(9, 3); // YES.
		ps3.dateFashion(9, 4); // YES.
		ps3.dateFashion(9, 5); // YES.
		ps3.dateFashion(9, 6); // YES.
		ps3.dateFashion(9, 7); // YES.
		ps3.dateFashion(9, 8); // YES.
		ps3.dateFashion(9, 9); // YES.
		ps3.dateFashion(9, 10); // YES.
		ps3.dateFashion(10, 0); // NO.
		ps3.dateFashion(10, 1); // NO.
		ps3.dateFashion(10, 2); // NO.
		ps3.dateFashion(10, 3); // YES.
		ps3.dateFashion(10, 4); // YES.
		ps3.dateFashion(10, 5); // YES.
		ps3.dateFashion(10, 6); // YES.
		ps3.dateFashion(10, 7); // YES.
		ps3.dateFashion(10, 8); // YES.
		ps3.dateFashion(10, 9); // YES.
		ps3.dateFashion(10, 10); // YES.

		// fizzString(str) Test Cases

		ps3.fizzString("for"); // FIZZ.
		ps3.fizzString("fit"); // FIZZ.
		ps3.fizzString("fax"); // FIZZ.
		ps3.fizzString("fat"); // FIZZ.
		ps3.fizzString("fix"); // FIZZ.
		ps3.fizzString("job"); // BUZZ.
		ps3.fizzString("rob"); // BUZZ.
		ps3.fizzString("pub"); // BUZZ.
		ps3.fizzString("tab"); // BUZZ.
		ps3.fizzString("rib"); // BUZZ.
		ps3.fizzString("fab"); // FIZZBUZZ.
		ps3.fizzString("fib"); // FIZZBUZZ.
		ps3.fizzString("flab"); // FIZZBUZZ.
		ps3.fizzString("feeb"); // FIZZBUZZ.
		ps3.fizzString("forb"); // FIZZBUZZ.
		ps3.fizzString("qwerty"); // qwerty
		ps3.fizzString("asdfg"); // asdfg
		ps3.fizzString("mnbvc"); // mnbvc
		ps3.fizzString("qazwsx"); // qazwsx
		ps3.fizzString("edcrfv"); // edcrfv

		// squirrelPlay(temp, isSummer) Test Cases

		ps3.squirrelPlay(50, false); // NO.
		ps3.squirrelPlay(50, true); // NO.
		ps3.squirrelPlay(51, false); // NO.
		ps3.squirrelPlay(51, true); // NO.
		ps3.squirrelPlay(52, false); // NO.
		ps3.squirrelPlay(52, true); // NO.
		ps3.squirrelPlay(53, false); // NO.
		ps3.squirrelPlay(53, true); // NO.
		ps3.squirrelPlay(54, false); // NO.
		ps3.squirrelPlay(54, true); // NO.
		ps3.squirrelPlay(55, false); // NO.
		ps3.squirrelPlay(55, true); // NO.
		ps3.squirrelPlay(56, false); // NO.
		ps3.squirrelPlay(56, true); // NO.
		ps3.squirrelPlay(57, false); // NO.
		ps3.squirrelPlay(57, true); // NO.
		ps3.squirrelPlay(58, false); // NO.
		ps3.squirrelPlay(58, true); // NO.
		ps3.squirrelPlay(59, false); // NO.
		ps3.squirrelPlay(59, true); // NO.
		ps3.squirrelPlay(60, false); // YES.
		ps3.squirrelPlay(60, true); // YES.
		ps3.squirrelPlay(61, false); // YES.
		ps3.squirrelPlay(61, true); // YES.
		ps3.squirrelPlay(62, false); // YES.
		ps3.squirrelPlay(62, true); // YES.
		ps3.squirrelPlay(63, false); // YES.
		ps3.squirrelPlay(63, true); // YES.
		ps3.squirrelPlay(64, false); // YES.
		ps3.squirrelPlay(64, true); // YES.
		ps3.squirrelPlay(65, false); // YES.
		ps3.squirrelPlay(65, true); // YES.
		ps3.squirrelPlay(66, false); // YES.
		ps3.squirrelPlay(66, true); // YES.
		ps3.squirrelPlay(67, false); // YES.
		ps3.squirrelPlay(67, true); // YES.
		ps3.squirrelPlay(68, false); // YES.
		ps3.squirrelPlay(68, true); // YES.
		ps3.squirrelPlay(69, false); // YES.
		ps3.squirrelPlay(69, true); // YES.
		ps3.squirrelPlay(70, false); // YES.
		ps3.squirrelPlay(70, true); // YES.
		ps3.squirrelPlay(71, false); // YES.
		ps3.squirrelPlay(71, true); // YES.
		ps3.squirrelPlay(72, false); // YES.
		ps3.squirrelPlay(72, true); // YES.
		ps3.squirrelPlay(73, false); // YES.
		ps3.squirrelPlay(73, true); // YES.
		ps3.squirrelPlay(74, false); // YES.
		ps3.squirrelPlay(74, true); // YES.
		ps3.squirrelPlay(75, false); // YES.
		ps3.squirrelPlay(75, true); // YES.
		ps3.squirrelPlay(76, false); // YES.
		ps3.squirrelPlay(76, true); // YES.
		ps3.squirrelPlay(77, false); // YES.
		ps3.squirrelPlay(77, true); // YES.
		ps3.squirrelPlay(78, false); // YES.
		ps3.squirrelPlay(78, true); // YES.
		ps3.squirrelPlay(79, false); // YES.
		ps3.squirrelPlay(79, true); // YES.
		ps3.squirrelPlay(80, false); // YES.
		ps3.squirrelPlay(80, true); // YES.
		ps3.squirrelPlay(81, false); // YES.
		ps3.squirrelPlay(81, true); // YES.
		ps3.squirrelPlay(82, false); // YES.
		ps3.squirrelPlay(82, true); // YES.
		ps3.squirrelPlay(83, false); // YES.
		ps3.squirrelPlay(83, true); // YES.
		ps3.squirrelPlay(84, false); // YES.
		ps3.squirrelPlay(84, true); // YES.
		ps3.squirrelPlay(85, false); // YES.
		ps3.squirrelPlay(85, true); // YES.
		ps3.squirrelPlay(86, false); // YES.
		ps3.squirrelPlay(86, true); // YES.
		ps3.squirrelPlay(87, false); // YES.
		ps3.squirrelPlay(87, true); // YES.
		ps3.squirrelPlay(88, false); // YES.
		ps3.squirrelPlay(88, true); // YES.
		ps3.squirrelPlay(89, false); // YES.
		ps3.squirrelPlay(89, true); // YES.
		ps3.squirrelPlay(90, false); // YES.
		ps3.squirrelPlay(90, true); // YES.
		ps3.squirrelPlay(91, false); // NO.
		ps3.squirrelPlay(91, true); // YES.
		ps3.squirrelPlay(92, false); // NO.
		ps3.squirrelPlay(92, true); // YES.
		ps3.squirrelPlay(93, false); // NO.
		ps3.squirrelPlay(93, true); // YES.
		ps3.squirrelPlay(94, false); // NO.
		ps3.squirrelPlay(94, true); // YES.
		ps3.squirrelPlay(95, false); // NO.
		ps3.squirrelPlay(95, true); // YES.
		ps3.squirrelPlay(96, false); // NO.
		ps3.squirrelPlay(96, true); // YES.
		ps3.squirrelPlay(97, false); // NO.
		ps3.squirrelPlay(97, true); // YES.
		ps3.squirrelPlay(98, false); // NO.
		ps3.squirrelPlay(98, true); // YES.
		ps3.squirrelPlay(99, false); // NO.
		ps3.squirrelPlay(99, true); // YES.
		ps3.squirrelPlay(100, false); // NO.
		ps3.squirrelPlay(100, true); // YES.
		ps3.squirrelPlay(101, false); // NO.
		ps3.squirrelPlay(101, true); // NO.
		ps3.squirrelPlay(102, false); // NO.
		ps3.squirrelPlay(102, true); // NO.
		ps3.squirrelPlay(103, false); // NO.
		ps3.squirrelPlay(103, true); // NO.
		ps3.squirrelPlay(104, false); // NO.
		ps3.squirrelPlay(104, true); // NO.
		ps3.squirrelPlay(105, false); // NO.
		ps3.squirrelPlay(105, true); // NO.
		ps3.squirrelPlay(106, false); // NO.
		ps3.squirrelPlay(106, true); // NO.
		ps3.squirrelPlay(107, false); // NO.
		ps3.squirrelPlay(107, true); // NO.
		ps3.squirrelPlay(108, false); // NO.
		ps3.squirrelPlay(108, true); // NO.
		ps3.squirrelPlay(109, false); // NO.
		ps3.squirrelPlay(109, true); // NO.

		// fizzStringAgain(n) Test Cases

		ps3.fizzStringAgain(0); // FIZZBUZZ!
		ps3.fizzStringAgain(1); // 1!
		ps3.fizzStringAgain(2); // 2!
		ps3.fizzStringAgain(3); // FIZZ!
		ps3.fizzStringAgain(4); // 4!
		ps3.fizzStringAgain(5); // BUZZ!
		ps3.fizzStringAgain(6); // FIZZ!
		ps3.fizzStringAgain(7); // 7!
		ps3.fizzStringAgain(8); // 8!
		ps3.fizzStringAgain(9); // FIZZ!
		ps3.fizzStringAgain(10); // BUZZ!
		ps3.fizzStringAgain(11); // 11!
		ps3.fizzStringAgain(12); // FIZZ!
		ps3.fizzStringAgain(13); // 13!
		ps3.fizzStringAgain(14); // 14!
		ps3.fizzStringAgain(15); // FIZZBUZZ!
		ps3.fizzStringAgain(16); // 16!
		ps3.fizzStringAgain(17); // 17!
		ps3.fizzStringAgain(18); // FIZZ!
		ps3.fizzStringAgain(19); // 19!
		ps3.fizzStringAgain(20); // BUZZ!
		ps3.fizzStringAgain(21); // FIZZ!
		ps3.fizzStringAgain(22); // 22!
		ps3.fizzStringAgain(23); // 23!
		ps3.fizzStringAgain(24); // FIZZ!
		ps3.fizzStringAgain(25); // BUZZ!
		ps3.fizzStringAgain(26); // 26!
		ps3.fizzStringAgain(27); // FIZZ!
		ps3.fizzStringAgain(28); // 28!
		ps3.fizzStringAgain(29); // 29!
		ps3.fizzStringAgain(30); // FIZZBUZZ!
		ps3.fizzStringAgain(31); // 31!
		ps3.fizzStringAgain(32); // 32!
		ps3.fizzStringAgain(33); // FIZZ!
		ps3.fizzStringAgain(34); // 34!
		ps3.fizzStringAgain(35); // BUZZ!
		ps3.fizzStringAgain(36); // FIZZ!
		ps3.fizzStringAgain(37); // 37!
		ps3.fizzStringAgain(38); // 38!
		ps3.fizzStringAgain(39); // FIZZ!
		ps3.fizzStringAgain(40); // BUZZ!
		ps3.fizzStringAgain(41); // 41!
		ps3.fizzStringAgain(42); // FIZZ!
		ps3.fizzStringAgain(43); // 43!
		ps3.fizzStringAgain(44); // 44!
		ps3.fizzStringAgain(45); // FIZZBUZZ!
		ps3.fizzStringAgain(46); // 46!
		ps3.fizzStringAgain(47); // 47!
		ps3.fizzStringAgain(48); // FIZZ!
		ps3.fizzStringAgain(49); // 49!
		ps3.fizzStringAgain(50); // BUZZ!
		ps3.fizzStringAgain(51); // FIZZ!
		ps3.fizzStringAgain(52); // 52!
		ps3.fizzStringAgain(53); // 53!
		ps3.fizzStringAgain(54); // FIZZ!
		ps3.fizzStringAgain(55); // BUZZ!
		ps3.fizzStringAgain(56); // 56!
		ps3.fizzStringAgain(57); // FIZZ!
		ps3.fizzStringAgain(58); // 58!
		ps3.fizzStringAgain(59); // 59!
		ps3.fizzStringAgain(60); // FIZZBUZZ!
		ps3.fizzStringAgain(61); // 61!
		ps3.fizzStringAgain(62); // 62!
		ps3.fizzStringAgain(63); // FIZZ!
		ps3.fizzStringAgain(64); // 64!
		ps3.fizzStringAgain(65); // BUZZ!
		ps3.fizzStringAgain(66); // FIZZ!
		ps3.fizzStringAgain(67); // 67!
		ps3.fizzStringAgain(68); // 68!
		ps3.fizzStringAgain(69); // FIZZ!
		ps3.fizzStringAgain(70); // BUZZ!
		ps3.fizzStringAgain(71); // 71!
		ps3.fizzStringAgain(72); // FIZZ!
		ps3.fizzStringAgain(73); // 73!
		ps3.fizzStringAgain(74); // 74!
		ps3.fizzStringAgain(75); // FIZZBUZZ!
		ps3.fizzStringAgain(76); // 76!
		ps3.fizzStringAgain(77); // 77!
		ps3.fizzStringAgain(78); // FIZZ!
		ps3.fizzStringAgain(79); // 79!
		ps3.fizzStringAgain(80); // BUZZ!
		ps3.fizzStringAgain(81); // FIZZ!
		ps3.fizzStringAgain(82); // 82!
		ps3.fizzStringAgain(83); // 83!
		ps3.fizzStringAgain(84); // FIZZ!
		ps3.fizzStringAgain(85); // BUZZ!
		ps3.fizzStringAgain(86); // 86!
		ps3.fizzStringAgain(87); // FIZZ!
		ps3.fizzStringAgain(88); // 88!
		ps3.fizzStringAgain(89); // 89!
		ps3.fizzStringAgain(90); // FIZZBUZZ!
		ps3.fizzStringAgain(91); // 91!
		ps3.fizzStringAgain(92); // 92!
		ps3.fizzStringAgain(93); // FIZZ!
		ps3.fizzStringAgain(94); // 94!
		ps3.fizzStringAgain(95); // BUZZ!
		ps3.fizzStringAgain(96); // FIZZ!
		ps3.fizzStringAgain(97); // 97!
		ps3.fizzStringAgain(98); // 98!
		ps3.fizzStringAgain(99); // FIZZ!

		// makeBricks(small, big, goal) Test Cases

		ps3.makeBricks(3, 1, 8); // YES.
		ps3.makeBricks(3, 1, 9); // NO.
		ps3.makeBricks(3, 2, 10); // YES.
		ps3.makeBricks(3, 2, 8); // YES.
		ps3.makeBricks(3, 2, 9); // NO.
		ps3.makeBricks(6, 1, 11); // YES.
		ps3.makeBricks(6, 0, 11); // NO.
		ps3.makeBricks(1, 4, 11); // YES.
		ps3.makeBricks(0, 3, 10); // YES.
		ps3.makeBricks(1, 4, 12); // NO.
		ps3.makeBricks(3, 1, 7); // YES.
		ps3.makeBricks(1, 1, 7); // NO.
		ps3.makeBricks(2, 1, 7); // YES.
		ps3.makeBricks(7, 1, 11); // YES.
		ps3.makeBricks(7, 1, 8); // YES.
		ps3.makeBricks(7, 1, 13); // NO.
		ps3.makeBricks(43, 1, 46); // YES.
		ps3.makeBricks(40, 1, 46); // NO.
		ps3.makeBricks(40, 2, 47); // YES.
		ps3.makeBricks(40, 2, 50); // YES.
		ps3.makeBricks(40, 2, 52); // NO.
		ps3.makeBricks(22, 2, 33); // NO.
		ps3.makeBricks(0, 2, 10); // YES.
		ps3.makeBricks(1000000, 1000, 1000100); // YES.
		ps3.makeBricks(2, 1000000, 100003); // NO.
		ps3.makeBricks(20, 0, 19); // YES.
		ps3.makeBricks(20, 0, 21); // NO.
		ps3.makeBricks(20, 4, 51); // NO.
		ps3.makeBricks(20, 4, 39); // YES.

		// loneSum(a, b, c) Test Cases

		ps3.loneSum(0, 0, 0); // 0.
		ps3.loneSum(0, 0, 1); // 1.
		ps3.loneSum(0, 0, 2); // 2.
		ps3.loneSum(0, 0, 3); // 3.
		ps3.loneSum(0, 0, 4); // 4.
		ps3.loneSum(0, 0, 5); // 5.
		ps3.loneSum(0, 0, 6); // 6.
		ps3.loneSum(0, 0, 7); // 7.
		ps3.loneSum(0, 0, 8); // 8.
		ps3.loneSum(0, 0, 9); // 9.
		ps3.loneSum(0, 1, 0); // 1.
		ps3.loneSum(0, 1, 1); // 0.
		ps3.loneSum(0, 1, 2); // 3.
		ps3.loneSum(0, 1, 3); // 4.
		ps3.loneSum(0, 1, 4); // 5.
		ps3.loneSum(0, 1, 5); // 6.
		ps3.loneSum(0, 1, 6); // 7.
		ps3.loneSum(0, 1, 7); // 8.
		ps3.loneSum(0, 1, 8); // 9.
		ps3.loneSum(0, 1, 9); // 10.
		ps3.loneSum(0, 2, 0); // 2.
		ps3.loneSum(0, 2, 1); // 3.
		ps3.loneSum(0, 2, 2); // 0.
		ps3.loneSum(0, 2, 3); // 5.
		ps3.loneSum(0, 2, 4); // 6.
		ps3.loneSum(0, 2, 5); // 7.
		ps3.loneSum(0, 2, 6); // 8.
		ps3.loneSum(0, 2, 7); // 9.
		ps3.loneSum(0, 2, 8); // 10.
		ps3.loneSum(0, 2, 9); // 11.
		ps3.loneSum(0, 3, 0); // 3.
		ps3.loneSum(0, 3, 1); // 4.
		ps3.loneSum(0, 3, 2); // 5.
		ps3.loneSum(0, 3, 3); // 0.
		ps3.loneSum(0, 3, 4); // 7.
		ps3.loneSum(0, 3, 5); // 8.
		ps3.loneSum(0, 3, 6); // 9.
		ps3.loneSum(0, 3, 7); // 10.
		ps3.loneSum(0, 3, 8); // 11.
		ps3.loneSum(0, 3, 9); // 12.
		ps3.loneSum(0, 4, 0); // 4.
		ps3.loneSum(0, 4, 1); // 5.
		ps3.loneSum(0, 4, 2); // 6.
		ps3.loneSum(0, 4, 3); // 7.
		ps3.loneSum(0, 4, 4); // 0.
		ps3.loneSum(0, 4, 5); // 9.
		ps3.loneSum(0, 4, 6); // 10.
		ps3.loneSum(0, 4, 7); // 11.
		ps3.loneSum(0, 4, 8); // 12.
		ps3.loneSum(0, 4, 9); // 13.
		ps3.loneSum(0, 5, 0); // 5.
		ps3.loneSum(0, 5, 1); // 6.
		ps3.loneSum(0, 5, 2); // 7.
		ps3.loneSum(0, 5, 3); // 8.
		ps3.loneSum(0, 5, 4); // 9.
		ps3.loneSum(0, 5, 5); // 0.
		ps3.loneSum(0, 5, 6); // 11.
		ps3.loneSum(0, 5, 7); // 12.
		ps3.loneSum(0, 5, 8); // 13.
		ps3.loneSum(0, 5, 9); // 14.
		ps3.loneSum(0, 6, 0); // 6.
		ps3.loneSum(0, 6, 1); // 7.
		ps3.loneSum(0, 6, 2); // 8.
		ps3.loneSum(0, 6, 3); // 9.
		ps3.loneSum(0, 6, 4); // 10.
		ps3.loneSum(0, 6, 5); // 11.
		ps3.loneSum(0, 6, 6); // 0.
		ps3.loneSum(0, 6, 7); // 13.
		ps3.loneSum(0, 6, 8); // 14.
		ps3.loneSum(0, 6, 9); // 15.
		ps3.loneSum(0, 7, 0); // 7.
		ps3.loneSum(0, 7, 1); // 8.
		ps3.loneSum(0, 7, 2); // 9.
		ps3.loneSum(0, 7, 3); // 10.
		ps3.loneSum(0, 7, 4); // 11.
		ps3.loneSum(0, 7, 5); // 12.
		ps3.loneSum(0, 7, 6); // 13.
		ps3.loneSum(0, 7, 7); // 0.
		ps3.loneSum(0, 7, 8); // 15.
		ps3.loneSum(0, 7, 9); // 16.
		ps3.loneSum(0, 8, 0); // 8.
		ps3.loneSum(0, 8, 1); // 9.
		ps3.loneSum(0, 8, 2); // 10.
		ps3.loneSum(0, 8, 3); // 11.
		ps3.loneSum(0, 8, 4); // 12.
		ps3.loneSum(0, 8, 5); // 13.
		ps3.loneSum(0, 8, 6); // 14.
		ps3.loneSum(0, 8, 7); // 15.
		ps3.loneSum(0, 8, 8); // 0.
		ps3.loneSum(0, 8, 9); // 17.
		ps3.loneSum(0, 9, 0); // 9.
		ps3.loneSum(0, 9, 1); // 10.
		ps3.loneSum(0, 9, 2); // 11.
		ps3.loneSum(0, 9, 3); // 12.
		ps3.loneSum(0, 9, 4); // 13.
		ps3.loneSum(0, 9, 5); // 14.
		ps3.loneSum(0, 9, 6); // 15.
		ps3.loneSum(0, 9, 7); // 16.
		ps3.loneSum(0, 9, 8); // 17.
		ps3.loneSum(0, 9, 9); // 0.
		ps3.loneSum(1, 0, 0); // 1.
		ps3.loneSum(1, 0, 1); // 0.
		ps3.loneSum(1, 0, 2); // 3.
		ps3.loneSum(1, 0, 3); // 4.
		ps3.loneSum(1, 0, 4); // 5.
		ps3.loneSum(1, 0, 5); // 6.
		ps3.loneSum(1, 0, 6); // 7.
		ps3.loneSum(1, 0, 7); // 8.
		ps3.loneSum(1, 0, 8); // 9.
		ps3.loneSum(1, 0, 9); // 10.
		ps3.loneSum(1, 1, 0); // 0.
		ps3.loneSum(1, 1, 1); // 0.
		ps3.loneSum(1, 1, 2); // 2.
		ps3.loneSum(1, 1, 3); // 3.
		ps3.loneSum(1, 1, 4); // 4.
		ps3.loneSum(1, 1, 5); // 5.
		ps3.loneSum(1, 1, 6); // 6.
		ps3.loneSum(1, 1, 7); // 7.
		ps3.loneSum(1, 1, 8); // 8.
		ps3.loneSum(1, 1, 9); // 9.
		ps3.loneSum(1, 2, 0); // 3.
		ps3.loneSum(1, 2, 1); // 2.
		ps3.loneSum(1, 2, 2); // 1.
		ps3.loneSum(1, 2, 3); // 6.
		ps3.loneSum(1, 2, 4); // 7.
		ps3.loneSum(1, 2, 5); // 8.
		ps3.loneSum(1, 2, 6); // 9.
		ps3.loneSum(1, 2, 7); // 10.
		ps3.loneSum(1, 2, 8); // 11.
		ps3.loneSum(1, 2, 9); // 12.
		ps3.loneSum(1, 3, 0); // 4.
		ps3.loneSum(1, 3, 1); // 3.
		ps3.loneSum(1, 3, 2); // 6.
		ps3.loneSum(1, 3, 3); // 1.
		ps3.loneSum(1, 3, 4); // 8.
		ps3.loneSum(1, 3, 5); // 9.
		ps3.loneSum(1, 3, 6); // 10.
		ps3.loneSum(1, 3, 7); // 11.
		ps3.loneSum(1, 3, 8); // 12.
		ps3.loneSum(1, 3, 9); // 13.
		ps3.loneSum(1, 4, 0); // 5.
		ps3.loneSum(1, 4, 1); // 4.
		ps3.loneSum(1, 4, 2); // 7.
		ps3.loneSum(1, 4, 3); // 8.
		ps3.loneSum(1, 4, 4); // 1.
		ps3.loneSum(1, 4, 5); // 10.
		ps3.loneSum(1, 4, 6); // 11.
		ps3.loneSum(1, 4, 7); // 12.
		ps3.loneSum(1, 4, 8); // 13.
		ps3.loneSum(1, 4, 9); // 14.
		ps3.loneSum(1, 5, 0); // 6.
		ps3.loneSum(1, 5, 1); // 5.
		ps3.loneSum(1, 5, 2); // 8.
		ps3.loneSum(1, 5, 3); // 9.
		ps3.loneSum(1, 5, 4); // 10.
		ps3.loneSum(1, 5, 5); // 1.
		ps3.loneSum(1, 5, 6); // 12.
		ps3.loneSum(1, 5, 7); // 13.
		ps3.loneSum(1, 5, 8); // 14.
		ps3.loneSum(1, 5, 9); // 15.
		ps3.loneSum(1, 6, 0); // 7.
		ps3.loneSum(1, 6, 1); // 6.
		ps3.loneSum(1, 6, 2); // 9.
		ps3.loneSum(1, 6, 3); // 10.
		ps3.loneSum(1, 6, 4); // 11.
		ps3.loneSum(1, 6, 5); // 12.
		ps3.loneSum(1, 6, 6); // 1.
		ps3.loneSum(1, 6, 7); // 14.
		ps3.loneSum(1, 6, 8); // 15.
		ps3.loneSum(1, 6, 9); // 16.
		ps3.loneSum(1, 7, 0); // 8.
		ps3.loneSum(1, 7, 1); // 7.
		ps3.loneSum(1, 7, 2); // 10.
		ps3.loneSum(1, 7, 3); // 11.
		ps3.loneSum(1, 7, 4); // 12.
		ps3.loneSum(1, 7, 5); // 13.
		ps3.loneSum(1, 7, 6); // 14.
		ps3.loneSum(1, 7, 7); // 1.
		ps3.loneSum(1, 7, 8); // 16.
		ps3.loneSum(1, 7, 9); // 17.
		ps3.loneSum(1, 8, 0); // 9.
		ps3.loneSum(1, 8, 1); // 8.
		ps3.loneSum(1, 8, 2); // 11.
		ps3.loneSum(1, 8, 3); // 12.
		ps3.loneSum(1, 8, 4); // 13.
		ps3.loneSum(1, 8, 5); // 14.
		ps3.loneSum(1, 8, 6); // 15.
		ps3.loneSum(1, 8, 7); // 16.
		ps3.loneSum(1, 8, 8); // 1.
		ps3.loneSum(1, 8, 9); // 18.
		ps3.loneSum(1, 9, 0); // 10.
		ps3.loneSum(1, 9, 1); // 9.
		ps3.loneSum(1, 9, 2); // 12.
		ps3.loneSum(1, 9, 3); // 13.
		ps3.loneSum(1, 9, 4); // 14.
		ps3.loneSum(1, 9, 5); // 15.
		ps3.loneSum(1, 9, 6); // 16.
		ps3.loneSum(1, 9, 7); // 17.
		ps3.loneSum(1, 9, 8); // 18.
		ps3.loneSum(1, 9, 9); // 1.
		ps3.loneSum(2, 0, 0); // 2.
		ps3.loneSum(2, 0, 1); // 3.
		ps3.loneSum(2, 0, 2); // 0.
		ps3.loneSum(2, 0, 3); // 5.
		ps3.loneSum(2, 0, 4); // 6.
		ps3.loneSum(2, 0, 5); // 7.
		ps3.loneSum(2, 0, 6); // 8.
		ps3.loneSum(2, 0, 7); // 9.
		ps3.loneSum(2, 0, 8); // 10.
		ps3.loneSum(2, 0, 9); // 11.
		ps3.loneSum(2, 1, 0); // 3.
		ps3.loneSum(2, 1, 1); // 2.
		ps3.loneSum(2, 1, 2); // 1.
		ps3.loneSum(2, 1, 3); // 6.
		ps3.loneSum(2, 1, 4); // 7.
		ps3.loneSum(2, 1, 5); // 8.
		ps3.loneSum(2, 1, 6); // 9.
		ps3.loneSum(2, 1, 7); // 10.
		ps3.loneSum(2, 1, 8); // 11.
		ps3.loneSum(2, 1, 9); // 12.
		ps3.loneSum(2, 2, 0); // 0.
		ps3.loneSum(2, 2, 1); // 1.
		ps3.loneSum(2, 2, 2); // 0.
		ps3.loneSum(2, 2, 3); // 3.
		ps3.loneSum(2, 2, 4); // 4.
		ps3.loneSum(2, 2, 5); // 5.
		ps3.loneSum(2, 2, 6); // 6.
		ps3.loneSum(2, 2, 7); // 7.
		ps3.loneSum(2, 2, 8); // 8.
		ps3.loneSum(2, 2, 9); // 9.
		ps3.loneSum(2, 3, 0); // 5.
		ps3.loneSum(2, 3, 1); // 6.
		ps3.loneSum(2, 3, 2); // 3.
		ps3.loneSum(2, 3, 3); // 2.
		ps3.loneSum(2, 3, 4); // 9.
		ps3.loneSum(2, 3, 5); // 10.
		ps3.loneSum(2, 3, 6); // 11.
		ps3.loneSum(2, 3, 7); // 12.
		ps3.loneSum(2, 3, 8); // 13.
		ps3.loneSum(2, 3, 9); // 14.
		ps3.loneSum(2, 4, 0); // 6.
		ps3.loneSum(2, 4, 1); // 7.
		ps3.loneSum(2, 4, 2); // 4.
		ps3.loneSum(2, 4, 3); // 9.
		ps3.loneSum(2, 4, 4); // 2.
		ps3.loneSum(2, 4, 5); // 11.
		ps3.loneSum(2, 4, 6); // 12.
		ps3.loneSum(2, 4, 7); // 13.
		ps3.loneSum(2, 4, 8); // 14.
		ps3.loneSum(2, 4, 9); // 15.
		ps3.loneSum(2, 5, 0); // 7.
		ps3.loneSum(2, 5, 1); // 8.
		ps3.loneSum(2, 5, 2); // 5.
		ps3.loneSum(2, 5, 3); // 10.
		ps3.loneSum(2, 5, 4); // 11.
		ps3.loneSum(2, 5, 5); // 2.
		ps3.loneSum(2, 5, 6); // 13.
		ps3.loneSum(2, 5, 7); // 14.
		ps3.loneSum(2, 5, 8); // 15.
		ps3.loneSum(2, 5, 9); // 16.
		ps3.loneSum(2, 6, 0); // 8.
		ps3.loneSum(2, 6, 1); // 9.
		ps3.loneSum(2, 6, 2); // 6.
		ps3.loneSum(2, 6, 3); // 11.
		ps3.loneSum(2, 6, 4); // 12.
		ps3.loneSum(2, 6, 5); // 13.
		ps3.loneSum(2, 6, 6); // 2.
		ps3.loneSum(2, 6, 7); // 15.
		ps3.loneSum(2, 6, 8); // 16.
		ps3.loneSum(2, 6, 9); // 17.
		ps3.loneSum(2, 7, 0); // 9.
		ps3.loneSum(2, 7, 1); // 10.
		ps3.loneSum(2, 7, 2); // 7.
		ps3.loneSum(2, 7, 3); // 12.
		ps3.loneSum(2, 7, 4); // 13.
		ps3.loneSum(2, 7, 5); // 14.
		ps3.loneSum(2, 7, 6); // 15.
		ps3.loneSum(2, 7, 7); // 2.
		ps3.loneSum(2, 7, 8); // 17.
		ps3.loneSum(2, 7, 9); // 18.
		ps3.loneSum(2, 8, 0); // 10.
		ps3.loneSum(2, 8, 1); // 11.
		ps3.loneSum(2, 8, 2); // 8.
		ps3.loneSum(2, 8, 3); // 13.
		ps3.loneSum(2, 8, 4); // 14.
		ps3.loneSum(2, 8, 5); // 15.
		ps3.loneSum(2, 8, 6); // 16.
		ps3.loneSum(2, 8, 7); // 17.
		ps3.loneSum(2, 8, 8); // 2.
		ps3.loneSum(2, 8, 9); // 19.
		ps3.loneSum(2, 9, 0); // 11.
		ps3.loneSum(2, 9, 1); // 12.
		ps3.loneSum(2, 9, 2); // 9.
		ps3.loneSum(2, 9, 3); // 14.
		ps3.loneSum(2, 9, 4); // 15.
		ps3.loneSum(2, 9, 5); // 16.
		ps3.loneSum(2, 9, 6); // 17.
		ps3.loneSum(2, 9, 7); // 18.
		ps3.loneSum(2, 9, 8); // 19.
		ps3.loneSum(2, 9, 9); // 2.
		ps3.loneSum(3, 0, 0); // 3.
		ps3.loneSum(3, 0, 1); // 4.
		ps3.loneSum(3, 0, 2); // 5.
		ps3.loneSum(3, 0, 3); // 0.
		ps3.loneSum(3, 0, 4); // 7.
		ps3.loneSum(3, 0, 5); // 8.
		ps3.loneSum(3, 0, 6); // 9.
		ps3.loneSum(3, 0, 7); // 10.
		ps3.loneSum(3, 0, 8); // 11.
		ps3.loneSum(3, 0, 9); // 12.
		ps3.loneSum(3, 1, 0); // 4.
		ps3.loneSum(3, 1, 1); // 3.
		ps3.loneSum(3, 1, 2); // 6.
		ps3.loneSum(3, 1, 3); // 1.
		ps3.loneSum(3, 1, 4); // 8.
		ps3.loneSum(3, 1, 5); // 9.
		ps3.loneSum(3, 1, 6); // 10.
		ps3.loneSum(3, 1, 7); // 11.
		ps3.loneSum(3, 1, 8); // 12.
		ps3.loneSum(3, 1, 9); // 13.
		ps3.loneSum(3, 2, 0); // 5.
		ps3.loneSum(3, 2, 1); // 6.
		ps3.loneSum(3, 2, 2); // 3.
		ps3.loneSum(3, 2, 3); // 2.
		ps3.loneSum(3, 2, 4); // 9.
		ps3.loneSum(3, 2, 5); // 10.
		ps3.loneSum(3, 2, 6); // 11.
		ps3.loneSum(3, 2, 7); // 12.
		ps3.loneSum(3, 2, 8); // 13.
		ps3.loneSum(3, 2, 9); // 14.
		ps3.loneSum(3, 3, 0); // 0.
		ps3.loneSum(3, 3, 1); // 1.
		ps3.loneSum(3, 3, 2); // 2.
		ps3.loneSum(3, 3, 3); // 0.
		ps3.loneSum(3, 3, 4); // 4.
		ps3.loneSum(3, 3, 5); // 5.
		ps3.loneSum(3, 3, 6); // 6.
		ps3.loneSum(3, 3, 7); // 7.
		ps3.loneSum(3, 3, 8); // 8.
		ps3.loneSum(3, 3, 9); // 9.
		ps3.loneSum(3, 4, 0); // 7.
		ps3.loneSum(3, 4, 1); // 8.
		ps3.loneSum(3, 4, 2); // 9.
		ps3.loneSum(3, 4, 3); // 4.
		ps3.loneSum(3, 4, 4); // 3.
		ps3.loneSum(3, 4, 5); // 12.
		ps3.loneSum(3, 4, 6); // 13.
		ps3.loneSum(3, 4, 7); // 14.
		ps3.loneSum(3, 4, 8); // 15.
		ps3.loneSum(3, 4, 9); // 16.
		ps3.loneSum(3, 5, 0); // 8.
		ps3.loneSum(3, 5, 1); // 9.
		ps3.loneSum(3, 5, 2); // 10.
		ps3.loneSum(3, 5, 3); // 5.
		ps3.loneSum(3, 5, 4); // 12.
		ps3.loneSum(3, 5, 5); // 3.
		ps3.loneSum(3, 5, 6); // 14.
		ps3.loneSum(3, 5, 7); // 15.
		ps3.loneSum(3, 5, 8); // 16.
		ps3.loneSum(3, 5, 9); // 17.
		ps3.loneSum(3, 6, 0); // 9.
		ps3.loneSum(3, 6, 1); // 10.
		ps3.loneSum(3, 6, 2); // 11.
		ps3.loneSum(3, 6, 3); // 6.
		ps3.loneSum(3, 6, 4); // 13.
		ps3.loneSum(3, 6, 5); // 14.
		ps3.loneSum(3, 6, 6); // 3.
		ps3.loneSum(3, 6, 7); // 16.
		ps3.loneSum(3, 6, 8); // 17.
		ps3.loneSum(3, 6, 9); // 18.
		ps3.loneSum(3, 7, 0); // 10.
		ps3.loneSum(3, 7, 1); // 11.
		ps3.loneSum(3, 7, 2); // 12.
		ps3.loneSum(3, 7, 3); // 7.
		ps3.loneSum(3, 7, 4); // 14.
		ps3.loneSum(3, 7, 5); // 15.
		ps3.loneSum(3, 7, 6); // 16.
		ps3.loneSum(3, 7, 7); // 3.
		ps3.loneSum(3, 7, 8); // 18.
		ps3.loneSum(3, 7, 9); // 19.
		ps3.loneSum(3, 8, 0); // 11.
		ps3.loneSum(3, 8, 1); // 12.
		ps3.loneSum(3, 8, 2); // 13.
		ps3.loneSum(3, 8, 3); // 8.
		ps3.loneSum(3, 8, 4); // 15.
		ps3.loneSum(3, 8, 5); // 16.
		ps3.loneSum(3, 8, 6); // 17.
		ps3.loneSum(3, 8, 7); // 18.
		ps3.loneSum(3, 8, 8); // 3.
		ps3.loneSum(3, 8, 9); // 20.
		ps3.loneSum(3, 9, 0); // 12.
		ps3.loneSum(3, 9, 1); // 13.
		ps3.loneSum(3, 9, 2); // 14.
		ps3.loneSum(3, 9, 3); // 9.
		ps3.loneSum(3, 9, 4); // 16.
		ps3.loneSum(3, 9, 5); // 17.
		ps3.loneSum(3, 9, 6); // 18.
		ps3.loneSum(3, 9, 7); // 19.
		ps3.loneSum(3, 9, 8); // 20.
		ps3.loneSum(3, 9, 9); // 3.
		ps3.loneSum(4, 0, 0); // 4.
		ps3.loneSum(4, 0, 1); // 5.
		ps3.loneSum(4, 0, 2); // 6.
		ps3.loneSum(4, 0, 3); // 7.
		ps3.loneSum(4, 0, 4); // 0.
		ps3.loneSum(4, 0, 5); // 9.
		ps3.loneSum(4, 0, 6); // 10.
		ps3.loneSum(4, 0, 7); // 11.
		ps3.loneSum(4, 0, 8); // 12.
		ps3.loneSum(4, 0, 9); // 13.
		ps3.loneSum(4, 1, 0); // 5.
		ps3.loneSum(4, 1, 1); // 4.
		ps3.loneSum(4, 1, 2); // 7.
		ps3.loneSum(4, 1, 3); // 8.
		ps3.loneSum(4, 1, 4); // 1.
		ps3.loneSum(4, 1, 5); // 10.
		ps3.loneSum(4, 1, 6); // 11.
		ps3.loneSum(4, 1, 7); // 12.
		ps3.loneSum(4, 1, 8); // 13.
		ps3.loneSum(4, 1, 9); // 14.
		ps3.loneSum(4, 2, 0); // 6.
		ps3.loneSum(4, 2, 1); // 7.
		ps3.loneSum(4, 2, 2); // 4.
		ps3.loneSum(4, 2, 3); // 9.
		ps3.loneSum(4, 2, 4); // 2.
		ps3.loneSum(4, 2, 5); // 11.
		ps3.loneSum(4, 2, 6); // 12.
		ps3.loneSum(4, 2, 7); // 13.
		ps3.loneSum(4, 2, 8); // 14.
		ps3.loneSum(4, 2, 9); // 15.
		ps3.loneSum(4, 3, 0); // 7.
		ps3.loneSum(4, 3, 1); // 8.
		ps3.loneSum(4, 3, 2); // 9.
		ps3.loneSum(4, 3, 3); // 4.
		ps3.loneSum(4, 3, 4); // 3.
		ps3.loneSum(4, 3, 5); // 12.
		ps3.loneSum(4, 3, 6); // 13.
		ps3.loneSum(4, 3, 7); // 14.
		ps3.loneSum(4, 3, 8); // 15.
		ps3.loneSum(4, 3, 9); // 16.
		ps3.loneSum(4, 4, 0); // 0.
		ps3.loneSum(4, 4, 1); // 1.
		ps3.loneSum(4, 4, 2); // 2.
		ps3.loneSum(4, 4, 3); // 3.
		ps3.loneSum(4, 4, 4); // 0.
		ps3.loneSum(4, 4, 5); // 5.
		ps3.loneSum(4, 4, 6); // 6.
		ps3.loneSum(4, 4, 7); // 7.
		ps3.loneSum(4, 4, 8); // 8.
		ps3.loneSum(4, 4, 9); // 9.
		ps3.loneSum(4, 5, 0); // 9.
		ps3.loneSum(4, 5, 1); // 10.
		ps3.loneSum(4, 5, 2); // 11.
		ps3.loneSum(4, 5, 3); // 12.
		ps3.loneSum(4, 5, 4); // 5.
		ps3.loneSum(4, 5, 5); // 4.
		ps3.loneSum(4, 5, 6); // 15.
		ps3.loneSum(4, 5, 7); // 16.
		ps3.loneSum(4, 5, 8); // 17.
		ps3.loneSum(4, 5, 9); // 18.
		ps3.loneSum(4, 6, 0); // 10.
		ps3.loneSum(4, 6, 1); // 11.
		ps3.loneSum(4, 6, 2); // 12.
		ps3.loneSum(4, 6, 3); // 13.
		ps3.loneSum(4, 6, 4); // 6.
		ps3.loneSum(4, 6, 5); // 15.
		ps3.loneSum(4, 6, 6); // 4.
		ps3.loneSum(4, 6, 7); // 17.
		ps3.loneSum(4, 6, 8); // 18.
		ps3.loneSum(4, 6, 9); // 19.
		ps3.loneSum(4, 7, 0); // 11.
		ps3.loneSum(4, 7, 1); // 12.
		ps3.loneSum(4, 7, 2); // 13.
		ps3.loneSum(4, 7, 3); // 14.
		ps3.loneSum(4, 7, 4); // 7.
		ps3.loneSum(4, 7, 5); // 16.
		ps3.loneSum(4, 7, 6); // 17.
		ps3.loneSum(4, 7, 7); // 4.
		ps3.loneSum(4, 7, 8); // 19.
		ps3.loneSum(4, 7, 9); // 20.
		ps3.loneSum(4, 8, 0); // 12.
		ps3.loneSum(4, 8, 1); // 13.
		ps3.loneSum(4, 8, 2); // 14.
		ps3.loneSum(4, 8, 3); // 15.
		ps3.loneSum(4, 8, 4); // 8.
		ps3.loneSum(4, 8, 5); // 17.
		ps3.loneSum(4, 8, 6); // 18.
		ps3.loneSum(4, 8, 7); // 19.
		ps3.loneSum(4, 8, 8); // 4.
		ps3.loneSum(4, 8, 9); // 21.
		ps3.loneSum(4, 9, 0); // 13.
		ps3.loneSum(4, 9, 1); // 14.
		ps3.loneSum(4, 9, 2); // 15.
		ps3.loneSum(4, 9, 3); // 16.
		ps3.loneSum(4, 9, 4); // 9.
		ps3.loneSum(4, 9, 5); // 18.
		ps3.loneSum(4, 9, 6); // 19.
		ps3.loneSum(4, 9, 7); // 20.
		ps3.loneSum(4, 9, 8); // 21.
		ps3.loneSum(4, 9, 9); // 4.
		ps3.loneSum(5, 0, 0); // 5.
		ps3.loneSum(5, 0, 1); // 6.
		ps3.loneSum(5, 0, 2); // 7.
		ps3.loneSum(5, 0, 3); // 8.
		ps3.loneSum(5, 0, 4); // 9.
		ps3.loneSum(5, 0, 5); // 0.
		ps3.loneSum(5, 0, 6); // 11.
		ps3.loneSum(5, 0, 7); // 12.
		ps3.loneSum(5, 0, 8); // 13.
		ps3.loneSum(5, 0, 9); // 14.
		ps3.loneSum(5, 1, 0); // 6.
		ps3.loneSum(5, 1, 1); // 5.
		ps3.loneSum(5, 1, 2); // 8.
		ps3.loneSum(5, 1, 3); // 9.
		ps3.loneSum(5, 1, 4); // 10.
		ps3.loneSum(5, 1, 5); // 1.
		ps3.loneSum(5, 1, 6); // 12.
		ps3.loneSum(5, 1, 7); // 13.
		ps3.loneSum(5, 1, 8); // 14.
		ps3.loneSum(5, 1, 9); // 15.
		ps3.loneSum(5, 2, 0); // 7.
		ps3.loneSum(5, 2, 1); // 8.
		ps3.loneSum(5, 2, 2); // 5.
		ps3.loneSum(5, 2, 3); // 10.
		ps3.loneSum(5, 2, 4); // 11.
		ps3.loneSum(5, 2, 5); // 2.
		ps3.loneSum(5, 2, 6); // 13.
		ps3.loneSum(5, 2, 7); // 14.
		ps3.loneSum(5, 2, 8); // 15.
		ps3.loneSum(5, 2, 9); // 16.
		ps3.loneSum(5, 3, 0); // 8.
		ps3.loneSum(5, 3, 1); // 9.
		ps3.loneSum(5, 3, 2); // 10.
		ps3.loneSum(5, 3, 3); // 5.
		ps3.loneSum(5, 3, 4); // 12.
		ps3.loneSum(5, 3, 5); // 3.
		ps3.loneSum(5, 3, 6); // 14.
		ps3.loneSum(5, 3, 7); // 15.
		ps3.loneSum(5, 3, 8); // 16.
		ps3.loneSum(5, 3, 9); // 17.
		ps3.loneSum(5, 4, 0); // 9.
		ps3.loneSum(5, 4, 1); // 10.
		ps3.loneSum(5, 4, 2); // 11.
		ps3.loneSum(5, 4, 3); // 12.
		ps3.loneSum(5, 4, 4); // 5.
		ps3.loneSum(5, 4, 5); // 4.
		ps3.loneSum(5, 4, 6); // 15.
		ps3.loneSum(5, 4, 7); // 16.
		ps3.loneSum(5, 4, 8); // 17.
		ps3.loneSum(5, 4, 9); // 18.
		ps3.loneSum(5, 5, 0); // 0.
		ps3.loneSum(5, 5, 1); // 1.
		ps3.loneSum(5, 5, 2); // 2.
		ps3.loneSum(5, 5, 3); // 3.
		ps3.loneSum(5, 5, 4); // 4.
		ps3.loneSum(5, 5, 5); // 0.
		ps3.loneSum(5, 5, 6); // 6.
		ps3.loneSum(5, 5, 7); // 7.
		ps3.loneSum(5, 5, 8); // 8.
		ps3.loneSum(5, 5, 9); // 9.
		ps3.loneSum(5, 6, 0); // 11.
		ps3.loneSum(5, 6, 1); // 12.
		ps3.loneSum(5, 6, 2); // 13.
		ps3.loneSum(5, 6, 3); // 14.
		ps3.loneSum(5, 6, 4); // 15.
		ps3.loneSum(5, 6, 5); // 6.
		ps3.loneSum(5, 6, 6); // 5.
		ps3.loneSum(5, 6, 7); // 18.
		ps3.loneSum(5, 6, 8); // 19.
		ps3.loneSum(5, 6, 9); // 20.
		ps3.loneSum(5, 7, 0); // 12.
		ps3.loneSum(5, 7, 1); // 13.
		ps3.loneSum(5, 7, 2); // 14.
		ps3.loneSum(5, 7, 3); // 15.
		ps3.loneSum(5, 7, 4); // 16.
		ps3.loneSum(5, 7, 5); // 7.
		ps3.loneSum(5, 7, 6); // 18.
		ps3.loneSum(5, 7, 7); // 5.
		ps3.loneSum(5, 7, 8); // 20.
		ps3.loneSum(5, 7, 9); // 21.
		ps3.loneSum(5, 8, 0); // 13.
		ps3.loneSum(5, 8, 1); // 14.
		ps3.loneSum(5, 8, 2); // 15.
		ps3.loneSum(5, 8, 3); // 16.
		ps3.loneSum(5, 8, 4); // 17.
		ps3.loneSum(5, 8, 5); // 8.
		ps3.loneSum(5, 8, 6); // 19.
		ps3.loneSum(5, 8, 7); // 20.
		ps3.loneSum(5, 8, 8); // 5.
		ps3.loneSum(5, 8, 9); // 22.
		ps3.loneSum(5, 9, 0); // 14.
		ps3.loneSum(5, 9, 1); // 15.
		ps3.loneSum(5, 9, 2); // 16.
		ps3.loneSum(5, 9, 3); // 17.
		ps3.loneSum(5, 9, 4); // 18.
		ps3.loneSum(5, 9, 5); // 9.
		ps3.loneSum(5, 9, 6); // 20.
		ps3.loneSum(5, 9, 7); // 21.
		ps3.loneSum(5, 9, 8); // 22.
		ps3.loneSum(5, 9, 9); // 5.
		ps3.loneSum(6, 0, 0); // 6.
		ps3.loneSum(6, 0, 1); // 7.
		ps3.loneSum(6, 0, 2); // 8.
		ps3.loneSum(6, 0, 3); // 9.
		ps3.loneSum(6, 0, 4); // 10.
		ps3.loneSum(6, 0, 5); // 11.
		ps3.loneSum(6, 0, 6); // 0.
		ps3.loneSum(6, 0, 7); // 13.
		ps3.loneSum(6, 0, 8); // 14.
		ps3.loneSum(6, 0, 9); // 15.
		ps3.loneSum(6, 1, 0); // 7.
		ps3.loneSum(6, 1, 1); // 6.
		ps3.loneSum(6, 1, 2); // 9.
		ps3.loneSum(6, 1, 3); // 10.
		ps3.loneSum(6, 1, 4); // 11.
		ps3.loneSum(6, 1, 5); // 12.
		ps3.loneSum(6, 1, 6); // 1.
		ps3.loneSum(6, 1, 7); // 14.
		ps3.loneSum(6, 1, 8); // 15.
		ps3.loneSum(6, 1, 9); // 16.
		ps3.loneSum(6, 2, 0); // 8.
		ps3.loneSum(6, 2, 1); // 9.
		ps3.loneSum(6, 2, 2); // 6.
		ps3.loneSum(6, 2, 3); // 11.
		ps3.loneSum(6, 2, 4); // 12.
		ps3.loneSum(6, 2, 5); // 13.
		ps3.loneSum(6, 2, 6); // 2.
		ps3.loneSum(6, 2, 7); // 15.
		ps3.loneSum(6, 2, 8); // 16.
		ps3.loneSum(6, 2, 9); // 17.
		ps3.loneSum(6, 3, 0); // 9.
		ps3.loneSum(6, 3, 1); // 10.
		ps3.loneSum(6, 3, 2); // 11.
		ps3.loneSum(6, 3, 3); // 6.
		ps3.loneSum(6, 3, 4); // 13.
		ps3.loneSum(6, 3, 5); // 14.
		ps3.loneSum(6, 3, 6); // 3.
		ps3.loneSum(6, 3, 7); // 16.
		ps3.loneSum(6, 3, 8); // 17.
		ps3.loneSum(6, 3, 9); // 18.
		ps3.loneSum(6, 4, 0); // 10.
		ps3.loneSum(6, 4, 1); // 11.
		ps3.loneSum(6, 4, 2); // 12.
		ps3.loneSum(6, 4, 3); // 13.
		ps3.loneSum(6, 4, 4); // 6.
		ps3.loneSum(6, 4, 5); // 15.
		ps3.loneSum(6, 4, 6); // 4.
		ps3.loneSum(6, 4, 7); // 17.
		ps3.loneSum(6, 4, 8); // 18.
		ps3.loneSum(6, 4, 9); // 19.
		ps3.loneSum(6, 5, 0); // 11.
		ps3.loneSum(6, 5, 1); // 12.
		ps3.loneSum(6, 5, 2); // 13.
		ps3.loneSum(6, 5, 3); // 14.
		ps3.loneSum(6, 5, 4); // 15.
		ps3.loneSum(6, 5, 5); // 6.
		ps3.loneSum(6, 5, 6); // 5.
		ps3.loneSum(6, 5, 7); // 18.
		ps3.loneSum(6, 5, 8); // 19.
		ps3.loneSum(6, 5, 9); // 20.
		ps3.loneSum(6, 6, 0); // 0.
		ps3.loneSum(6, 6, 1); // 1.
		ps3.loneSum(6, 6, 2); // 2.
		ps3.loneSum(6, 6, 3); // 3.
		ps3.loneSum(6, 6, 4); // 4.
		ps3.loneSum(6, 6, 5); // 5.
		ps3.loneSum(6, 6, 6); // 0.
		ps3.loneSum(6, 6, 7); // 7.
		ps3.loneSum(6, 6, 8); // 8.
		ps3.loneSum(6, 6, 9); // 9.
		ps3.loneSum(6, 7, 0); // 13.
		ps3.loneSum(6, 7, 1); // 14.
		ps3.loneSum(6, 7, 2); // 15.
		ps3.loneSum(6, 7, 3); // 16.
		ps3.loneSum(6, 7, 4); // 17.
		ps3.loneSum(6, 7, 5); // 18.
		ps3.loneSum(6, 7, 6); // 7.
		ps3.loneSum(6, 7, 7); // 6.
		ps3.loneSum(6, 7, 8); // 21.
		ps3.loneSum(6, 7, 9); // 22.
		ps3.loneSum(6, 8, 0); // 14.
		ps3.loneSum(6, 8, 1); // 15.
		ps3.loneSum(6, 8, 2); // 16.
		ps3.loneSum(6, 8, 3); // 17.
		ps3.loneSum(6, 8, 4); // 18.
		ps3.loneSum(6, 8, 5); // 19.
		ps3.loneSum(6, 8, 6); // 8.
		ps3.loneSum(6, 8, 7); // 21.
		ps3.loneSum(6, 8, 8); // 6.
		ps3.loneSum(6, 8, 9); // 23.
		ps3.loneSum(6, 9, 0); // 15.
		ps3.loneSum(6, 9, 1); // 16.
		ps3.loneSum(6, 9, 2); // 17.
		ps3.loneSum(6, 9, 3); // 18.
		ps3.loneSum(6, 9, 4); // 19.
		ps3.loneSum(6, 9, 5); // 20.
		ps3.loneSum(6, 9, 6); // 9.
		ps3.loneSum(6, 9, 7); // 22.
		ps3.loneSum(6, 9, 8); // 23.
		ps3.loneSum(6, 9, 9); // 6.
		ps3.loneSum(7, 0, 0); // 7.
		ps3.loneSum(7, 0, 1); // 8.
		ps3.loneSum(7, 0, 2); // 9.
		ps3.loneSum(7, 0, 3); // 10.
		ps3.loneSum(7, 0, 4); // 11.
		ps3.loneSum(7, 0, 5); // 12.
		ps3.loneSum(7, 0, 6); // 13.
		ps3.loneSum(7, 0, 7); // 0.
		ps3.loneSum(7, 0, 8); // 15.
		ps3.loneSum(7, 0, 9); // 16.
		ps3.loneSum(7, 1, 0); // 8.
		ps3.loneSum(7, 1, 1); // 7.
		ps3.loneSum(7, 1, 2); // 10.
		ps3.loneSum(7, 1, 3); // 11.
		ps3.loneSum(7, 1, 4); // 12.
		ps3.loneSum(7, 1, 5); // 13.
		ps3.loneSum(7, 1, 6); // 14.
		ps3.loneSum(7, 1, 7); // 1.
		ps3.loneSum(7, 1, 8); // 16.
		ps3.loneSum(7, 1, 9); // 17.
		ps3.loneSum(7, 2, 0); // 9.
		ps3.loneSum(7, 2, 1); // 10.
		ps3.loneSum(7, 2, 2); // 7.
		ps3.loneSum(7, 2, 3); // 12.
		ps3.loneSum(7, 2, 4); // 13.
		ps3.loneSum(7, 2, 5); // 14.
		ps3.loneSum(7, 2, 6); // 15.
		ps3.loneSum(7, 2, 7); // 2.
		ps3.loneSum(7, 2, 8); // 17.
		ps3.loneSum(7, 2, 9); // 18.
		ps3.loneSum(7, 3, 0); // 10.
		ps3.loneSum(7, 3, 1); // 11.
		ps3.loneSum(7, 3, 2); // 12.
		ps3.loneSum(7, 3, 3); // 7.
		ps3.loneSum(7, 3, 4); // 14.
		ps3.loneSum(7, 3, 5); // 15.
		ps3.loneSum(7, 3, 6); // 16.
		ps3.loneSum(7, 3, 7); // 3.
		ps3.loneSum(7, 3, 8); // 18.
		ps3.loneSum(7, 3, 9); // 19.
		ps3.loneSum(7, 4, 0); // 11.
		ps3.loneSum(7, 4, 1); // 12.
		ps3.loneSum(7, 4, 2); // 13.
		ps3.loneSum(7, 4, 3); // 14.
		ps3.loneSum(7, 4, 4); // 7.
		ps3.loneSum(7, 4, 5); // 16.
		ps3.loneSum(7, 4, 6); // 17.
		ps3.loneSum(7, 4, 7); // 4.
		ps3.loneSum(7, 4, 8); // 19.
		ps3.loneSum(7, 4, 9); // 20.
		ps3.loneSum(7, 5, 0); // 12.
		ps3.loneSum(7, 5, 1); // 13.
		ps3.loneSum(7, 5, 2); // 14.
		ps3.loneSum(7, 5, 3); // 15.
		ps3.loneSum(7, 5, 4); // 16.
		ps3.loneSum(7, 5, 5); // 7.
		ps3.loneSum(7, 5, 6); // 18.
		ps3.loneSum(7, 5, 7); // 5.
		ps3.loneSum(7, 5, 8); // 20.
		ps3.loneSum(7, 5, 9); // 21.
		ps3.loneSum(7, 6, 0); // 13.
		ps3.loneSum(7, 6, 1); // 14.
		ps3.loneSum(7, 6, 2); // 15.
		ps3.loneSum(7, 6, 3); // 16.
		ps3.loneSum(7, 6, 4); // 17.
		ps3.loneSum(7, 6, 5); // 18.
		ps3.loneSum(7, 6, 6); // 7.
		ps3.loneSum(7, 6, 7); // 6.
		ps3.loneSum(7, 6, 8); // 21.
		ps3.loneSum(7, 6, 9); // 22.
		ps3.loneSum(7, 7, 0); // 0.
		ps3.loneSum(7, 7, 1); // 1.
		ps3.loneSum(7, 7, 2); // 2.
		ps3.loneSum(7, 7, 3); // 3.
		ps3.loneSum(7, 7, 4); // 4.
		ps3.loneSum(7, 7, 5); // 5.
		ps3.loneSum(7, 7, 6); // 6.
		ps3.loneSum(7, 7, 7); // 0.
		ps3.loneSum(7, 7, 8); // 8.
		ps3.loneSum(7, 7, 9); // 9.
		ps3.loneSum(7, 8, 0); // 15.
		ps3.loneSum(7, 8, 1); // 16.
		ps3.loneSum(7, 8, 2); // 17.
		ps3.loneSum(7, 8, 3); // 18.
		ps3.loneSum(7, 8, 4); // 19.
		ps3.loneSum(7, 8, 5); // 20.
		ps3.loneSum(7, 8, 6); // 21.
		ps3.loneSum(7, 8, 7); // 8.
		ps3.loneSum(7, 8, 8); // 7.
		ps3.loneSum(7, 8, 9); // 24.
		ps3.loneSum(7, 9, 0); // 16.
		ps3.loneSum(7, 9, 1); // 17.
		ps3.loneSum(7, 9, 2); // 18.
		ps3.loneSum(7, 9, 3); // 19.
		ps3.loneSum(7, 9, 4); // 20.
		ps3.loneSum(7, 9, 5); // 21.
		ps3.loneSum(7, 9, 6); // 22.
		ps3.loneSum(7, 9, 7); // 9.
		ps3.loneSum(7, 9, 8); // 24.
		ps3.loneSum(7, 9, 9); // 7.
		ps3.loneSum(8, 0, 0); // 8.
		ps3.loneSum(8, 0, 1); // 9.
		ps3.loneSum(8, 0, 2); // 10.
		ps3.loneSum(8, 0, 3); // 11.
		ps3.loneSum(8, 0, 4); // 12.
		ps3.loneSum(8, 0, 5); // 13.
		ps3.loneSum(8, 0, 6); // 14.
		ps3.loneSum(8, 0, 7); // 15.
		ps3.loneSum(8, 0, 8); // 0.
		ps3.loneSum(8, 0, 9); // 17.
		ps3.loneSum(8, 1, 0); // 9.
		ps3.loneSum(8, 1, 1); // 8.
		ps3.loneSum(8, 1, 2); // 11.
		ps3.loneSum(8, 1, 3); // 12.
		ps3.loneSum(8, 1, 4); // 13.
		ps3.loneSum(8, 1, 5); // 14.
		ps3.loneSum(8, 1, 6); // 15.
		ps3.loneSum(8, 1, 7); // 16.
		ps3.loneSum(8, 1, 8); // 1.
		ps3.loneSum(8, 1, 9); // 18.
		ps3.loneSum(8, 2, 0); // 10.
		ps3.loneSum(8, 2, 1); // 11.
		ps3.loneSum(8, 2, 2); // 8.
		ps3.loneSum(8, 2, 3); // 13.
		ps3.loneSum(8, 2, 4); // 14.
		ps3.loneSum(8, 2, 5); // 15.
		ps3.loneSum(8, 2, 6); // 16.
		ps3.loneSum(8, 2, 7); // 17.
		ps3.loneSum(8, 2, 8); // 2.
		ps3.loneSum(8, 2, 9); // 19.
		ps3.loneSum(8, 3, 0); // 11.
		ps3.loneSum(8, 3, 1); // 12.
		ps3.loneSum(8, 3, 2); // 13.
		ps3.loneSum(8, 3, 3); // 8.
		ps3.loneSum(8, 3, 4); // 15.
		ps3.loneSum(8, 3, 5); // 16.
		ps3.loneSum(8, 3, 6); // 17.
		ps3.loneSum(8, 3, 7); // 18.
		ps3.loneSum(8, 3, 8); // 3.
		ps3.loneSum(8, 3, 9); // 20.
		ps3.loneSum(8, 4, 0); // 12.
		ps3.loneSum(8, 4, 1); // 13.
		ps3.loneSum(8, 4, 2); // 14.
		ps3.loneSum(8, 4, 3); // 15.
		ps3.loneSum(8, 4, 4); // 8.
		ps3.loneSum(8, 4, 5); // 17.
		ps3.loneSum(8, 4, 6); // 18.
		ps3.loneSum(8, 4, 7); // 19.
		ps3.loneSum(8, 4, 8); // 4.
		ps3.loneSum(8, 4, 9); // 21.
		ps3.loneSum(8, 5, 0); // 13.
		ps3.loneSum(8, 5, 1); // 14.
		ps3.loneSum(8, 5, 2); // 15.
		ps3.loneSum(8, 5, 3); // 16.
		ps3.loneSum(8, 5, 4); // 17.
		ps3.loneSum(8, 5, 5); // 8.
		ps3.loneSum(8, 5, 6); // 19.
		ps3.loneSum(8, 5, 7); // 20.
		ps3.loneSum(8, 5, 8); // 5.
		ps3.loneSum(8, 5, 9); // 22.
		ps3.loneSum(8, 6, 0); // 14.
		ps3.loneSum(8, 6, 1); // 15.
		ps3.loneSum(8, 6, 2); // 16.
		ps3.loneSum(8, 6, 3); // 17.
		ps3.loneSum(8, 6, 4); // 18.
		ps3.loneSum(8, 6, 5); // 19.
		ps3.loneSum(8, 6, 6); // 8.
		ps3.loneSum(8, 6, 7); // 21.
		ps3.loneSum(8, 6, 8); // 6.
		ps3.loneSum(8, 6, 9); // 23.
		ps3.loneSum(8, 7, 0); // 15.
		ps3.loneSum(8, 7, 1); // 16.
		ps3.loneSum(8, 7, 2); // 17.
		ps3.loneSum(8, 7, 3); // 18.
		ps3.loneSum(8, 7, 4); // 19.
		ps3.loneSum(8, 7, 5); // 20.
		ps3.loneSum(8, 7, 6); // 21.
		ps3.loneSum(8, 7, 7); // 8.
		ps3.loneSum(8, 7, 8); // 7.
		ps3.loneSum(8, 7, 9); // 24.
		ps3.loneSum(8, 8, 0); // 0.
		ps3.loneSum(8, 8, 1); // 1.
		ps3.loneSum(8, 8, 2); // 2.
		ps3.loneSum(8, 8, 3); // 3.
		ps3.loneSum(8, 8, 4); // 4.
		ps3.loneSum(8, 8, 5); // 5.
		ps3.loneSum(8, 8, 6); // 6.
		ps3.loneSum(8, 8, 7); // 7.
		ps3.loneSum(8, 8, 8); // 0.
		ps3.loneSum(8, 8, 9); // 9.
		ps3.loneSum(8, 9, 0); // 17.
		ps3.loneSum(8, 9, 1); // 18.
		ps3.loneSum(8, 9, 2); // 19.
		ps3.loneSum(8, 9, 3); // 20.
		ps3.loneSum(8, 9, 4); // 21.
		ps3.loneSum(8, 9, 5); // 22.
		ps3.loneSum(8, 9, 6); // 23.
		ps3.loneSum(8, 9, 7); // 24.
		ps3.loneSum(8, 9, 8); // 9.
		ps3.loneSum(8, 9, 9); // 8.
		ps3.loneSum(9, 0, 0); // 9.
		ps3.loneSum(9, 0, 1); // 10.
		ps3.loneSum(9, 0, 2); // 11.
		ps3.loneSum(9, 0, 3); // 12.
		ps3.loneSum(9, 0, 4); // 13.
		ps3.loneSum(9, 0, 5); // 14.
		ps3.loneSum(9, 0, 6); // 15.
		ps3.loneSum(9, 0, 7); // 16.
		ps3.loneSum(9, 0, 8); // 17.
		ps3.loneSum(9, 0, 9); // 0.
		ps3.loneSum(9, 1, 0); // 10.
		ps3.loneSum(9, 1, 1); // 9.
		ps3.loneSum(9, 1, 2); // 12.
		ps3.loneSum(9, 1, 3); // 13.
		ps3.loneSum(9, 1, 4); // 14.
		ps3.loneSum(9, 1, 5); // 15.
		ps3.loneSum(9, 1, 6); // 16.
		ps3.loneSum(9, 1, 7); // 17.
		ps3.loneSum(9, 1, 8); // 18.
		ps3.loneSum(9, 1, 9); // 1.
		ps3.loneSum(9, 2, 0); // 11.
		ps3.loneSum(9, 2, 1); // 12.
		ps3.loneSum(9, 2, 2); // 9.
		ps3.loneSum(9, 2, 3); // 14.
		ps3.loneSum(9, 2, 4); // 15.
		ps3.loneSum(9, 2, 5); // 16.
		ps3.loneSum(9, 2, 6); // 17.
		ps3.loneSum(9, 2, 7); // 18.
		ps3.loneSum(9, 2, 8); // 19.
		ps3.loneSum(9, 2, 9); // 2.
		ps3.loneSum(9, 3, 0); // 12.
		ps3.loneSum(9, 3, 1); // 13.
		ps3.loneSum(9, 3, 2); // 14.
		ps3.loneSum(9, 3, 3); // 9.
		ps3.loneSum(9, 3, 4); // 16.
		ps3.loneSum(9, 3, 5); // 17.
		ps3.loneSum(9, 3, 6); // 18.
		ps3.loneSum(9, 3, 7); // 19.
		ps3.loneSum(9, 3, 8); // 20.
		ps3.loneSum(9, 3, 9); // 3.
		ps3.loneSum(9, 4, 0); // 13.
		ps3.loneSum(9, 4, 1); // 14.
		ps3.loneSum(9, 4, 2); // 15.
		ps3.loneSum(9, 4, 3); // 16.
		ps3.loneSum(9, 4, 4); // 9.
		ps3.loneSum(9, 4, 5); // 18.
		ps3.loneSum(9, 4, 6); // 19.
		ps3.loneSum(9, 4, 7); // 20.
		ps3.loneSum(9, 4, 8); // 21.
		ps3.loneSum(9, 4, 9); // 4.
		ps3.loneSum(9, 5, 0); // 14.
		ps3.loneSum(9, 5, 1); // 15.
		ps3.loneSum(9, 5, 2); // 16.
		ps3.loneSum(9, 5, 3); // 17.
		ps3.loneSum(9, 5, 4); // 18.
		ps3.loneSum(9, 5, 5); // 9.
		ps3.loneSum(9, 5, 6); // 20.
		ps3.loneSum(9, 5, 7); // 21.
		ps3.loneSum(9, 5, 8); // 22.
		ps3.loneSum(9, 5, 9); // 5.
		ps3.loneSum(9, 6, 0); // 15.
		ps3.loneSum(9, 6, 1); // 16.
		ps3.loneSum(9, 6, 2); // 17.
		ps3.loneSum(9, 6, 3); // 18.
		ps3.loneSum(9, 6, 4); // 19.
		ps3.loneSum(9, 6, 5); // 20.
		ps3.loneSum(9, 6, 6); // 9.
		ps3.loneSum(9, 6, 7); // 22.
		ps3.loneSum(9, 6, 8); // 23.
		ps3.loneSum(9, 6, 9); // 6.
		ps3.loneSum(9, 7, 0); // 16.
		ps3.loneSum(9, 7, 1); // 17.
		ps3.loneSum(9, 7, 2); // 18.
		ps3.loneSum(9, 7, 3); // 19.
		ps3.loneSum(9, 7, 4); // 20.
		ps3.loneSum(9, 7, 5); // 21.
		ps3.loneSum(9, 7, 6); // 22.
		ps3.loneSum(9, 7, 7); // 9.
		ps3.loneSum(9, 7, 8); // 24.
		ps3.loneSum(9, 7, 9); // 7.
		ps3.loneSum(9, 8, 0); // 17.
		ps3.loneSum(9, 8, 1); // 18.
		ps3.loneSum(9, 8, 2); // 19.
		ps3.loneSum(9, 8, 3); // 20.
		ps3.loneSum(9, 8, 4); // 21.
		ps3.loneSum(9, 8, 5); // 22.
		ps3.loneSum(9, 8, 6); // 23.
		ps3.loneSum(9, 8, 7); // 24.
		ps3.loneSum(9, 8, 8); // 9.
		ps3.loneSum(9, 8, 9); // 8.
		ps3.loneSum(9, 9, 0); // 0.
		ps3.loneSum(9, 9, 1); // 1.
		ps3.loneSum(9, 9, 2); // 2.
		ps3.loneSum(9, 9, 3); // 3.
		ps3.loneSum(9, 9, 4); // 4.
		ps3.loneSum(9, 9, 5); // 5.
		ps3.loneSum(9, 9, 6); // 6.
		ps3.loneSum(9, 9, 7); // 7.
		ps3.loneSum(9, 9, 8); // 8.
		ps3.loneSum(9, 9, 9); // 0.

		// luckySum(a, b, c) Test Cases

		ps3.luckySum(0, 0, 0); // 0.
		ps3.luckySum(0, 0, 1); // 1.
		ps3.luckySum(0, 0, 2); // 2.
		ps3.luckySum(0, 0, 3); // 3.
		ps3.luckySum(0, 0, 4); // 4.
		ps3.luckySum(0, 0, 5); // 5.
		ps3.luckySum(0, 0, 6); // 6.
		ps3.luckySum(0, 0, 7); // 7.
		ps3.luckySum(0, 0, 8); // 8.
		ps3.luckySum(0, 0, 9); // 9.
		ps3.luckySum(0, 1, 0); // 1.
		ps3.luckySum(0, 1, 1); // 2.
		ps3.luckySum(0, 1, 2); // 3.
		ps3.luckySum(0, 1, 3); // 4.
		ps3.luckySum(0, 1, 4); // 5.
		ps3.luckySum(0, 1, 5); // 6.
		ps3.luckySum(0, 1, 6); // 7.
		ps3.luckySum(0, 1, 7); // 8.
		ps3.luckySum(0, 1, 8); // 9.
		ps3.luckySum(0, 1, 9); // 10.
		ps3.luckySum(0, 2, 0); // 2.
		ps3.luckySum(0, 2, 1); // 3.
		ps3.luckySum(0, 2, 2); // 4.
		ps3.luckySum(0, 2, 3); // 5.
		ps3.luckySum(0, 2, 4); // 6.
		ps3.luckySum(0, 2, 5); // 7.
		ps3.luckySum(0, 2, 6); // 8.
		ps3.luckySum(0, 2, 7); // 9.
		ps3.luckySum(0, 2, 8); // 10.
		ps3.luckySum(0, 2, 9); // 11.
		ps3.luckySum(0, 3, 0); // 3.
		ps3.luckySum(0, 3, 1); // 4.
		ps3.luckySum(0, 3, 2); // 5.
		ps3.luckySum(0, 3, 3); // 6.
		ps3.luckySum(0, 3, 4); // 7.
		ps3.luckySum(0, 3, 5); // 8.
		ps3.luckySum(0, 3, 6); // 9.
		ps3.luckySum(0, 3, 7); // 10.
		ps3.luckySum(0, 3, 8); // 11.
		ps3.luckySum(0, 3, 9); // 12.
		ps3.luckySum(0, 4, 0); // 4.
		ps3.luckySum(0, 4, 1); // 5.
		ps3.luckySum(0, 4, 2); // 6.
		ps3.luckySum(0, 4, 3); // 7.
		ps3.luckySum(0, 4, 4); // 8.
		ps3.luckySum(0, 4, 5); // 9.
		ps3.luckySum(0, 4, 6); // 10.
		ps3.luckySum(0, 4, 7); // 11.
		ps3.luckySum(0, 4, 8); // 12.
		ps3.luckySum(0, 4, 9); // 13.
		ps3.luckySum(0, 5, 0); // 5.
		ps3.luckySum(0, 5, 1); // 6.
		ps3.luckySum(0, 5, 2); // 7.
		ps3.luckySum(0, 5, 3); // 8.
		ps3.luckySum(0, 5, 4); // 9.
		ps3.luckySum(0, 5, 5); // 10.
		ps3.luckySum(0, 5, 6); // 11.
		ps3.luckySum(0, 5, 7); // 12.
		ps3.luckySum(0, 5, 8); // 13.
		ps3.luckySum(0, 5, 9); // 14.
		ps3.luckySum(0, 6, 0); // 6.
		ps3.luckySum(0, 6, 1); // 7.
		ps3.luckySum(0, 6, 2); // 8.
		ps3.luckySum(0, 6, 3); // 9.
		ps3.luckySum(0, 6, 4); // 10.
		ps3.luckySum(0, 6, 5); // 11.
		ps3.luckySum(0, 6, 6); // 12.
		ps3.luckySum(0, 6, 7); // 13.
		ps3.luckySum(0, 6, 8); // 14.
		ps3.luckySum(0, 6, 9); // 15.
		ps3.luckySum(0, 7, 0); // 7.
		ps3.luckySum(0, 7, 1); // 8.
		ps3.luckySum(0, 7, 2); // 9.
		ps3.luckySum(0, 7, 3); // 10.
		ps3.luckySum(0, 7, 4); // 11.
		ps3.luckySum(0, 7, 5); // 12.
		ps3.luckySum(0, 7, 6); // 13.
		ps3.luckySum(0, 7, 7); // 14.
		ps3.luckySum(0, 7, 8); // 15.
		ps3.luckySum(0, 7, 9); // 16.
		ps3.luckySum(0, 8, 0); // 8.
		ps3.luckySum(0, 8, 1); // 9.
		ps3.luckySum(0, 8, 2); // 10.
		ps3.luckySum(0, 8, 3); // 11.
		ps3.luckySum(0, 8, 4); // 12.
		ps3.luckySum(0, 8, 5); // 13.
		ps3.luckySum(0, 8, 6); // 14.
		ps3.luckySum(0, 8, 7); // 15.
		ps3.luckySum(0, 8, 8); // 16.
		ps3.luckySum(0, 8, 9); // 17.
		ps3.luckySum(0, 9, 0); // 9.
		ps3.luckySum(0, 9, 1); // 10.
		ps3.luckySum(0, 9, 2); // 11.
		ps3.luckySum(0, 9, 3); // 12.
		ps3.luckySum(0, 9, 4); // 13.
		ps3.luckySum(0, 9, 5); // 14.
		ps3.luckySum(0, 9, 6); // 15.
		ps3.luckySum(0, 9, 7); // 16.
		ps3.luckySum(0, 9, 8); // 17.
		ps3.luckySum(0, 9, 9); // 18.
		ps3.luckySum(1, 0, 0); // 1.
		ps3.luckySum(1, 0, 1); // 2.
		ps3.luckySum(1, 0, 2); // 3.
		ps3.luckySum(1, 0, 3); // 4.
		ps3.luckySum(1, 0, 4); // 5.
		ps3.luckySum(1, 0, 5); // 6.
		ps3.luckySum(1, 0, 6); // 7.
		ps3.luckySum(1, 0, 7); // 8.
		ps3.luckySum(1, 0, 8); // 9.
		ps3.luckySum(1, 0, 9); // 10.
		ps3.luckySum(1, 1, 0); // 2.
		ps3.luckySum(1, 1, 1); // 3.
		ps3.luckySum(1, 1, 2); // 4.
		ps3.luckySum(1, 1, 3); // 5.
		ps3.luckySum(1, 1, 4); // 6.
		ps3.luckySum(1, 1, 5); // 7.
		ps3.luckySum(1, 1, 6); // 8.
		ps3.luckySum(1, 1, 7); // 9.
		ps3.luckySum(1, 1, 8); // 10.
		ps3.luckySum(1, 1, 9); // 11.
		ps3.luckySum(1, 2, 0); // 3.
		ps3.luckySum(1, 2, 1); // 4.
		ps3.luckySum(1, 2, 2); // 5.
		ps3.luckySum(1, 2, 3); // 6.
		ps3.luckySum(1, 2, 4); // 7.
		ps3.luckySum(1, 2, 5); // 8.
		ps3.luckySum(1, 2, 6); // 9.
		ps3.luckySum(1, 2, 7); // 10.
		ps3.luckySum(1, 2, 8); // 11.
		ps3.luckySum(1, 2, 9); // 12.
		ps3.luckySum(1, 3, 0); // 4.
		ps3.luckySum(1, 3, 1); // 5.
		ps3.luckySum(1, 3, 2); // 6.
		ps3.luckySum(1, 3, 3); // 7.
		ps3.luckySum(1, 3, 4); // 8.
		ps3.luckySum(1, 3, 5); // 9.
		ps3.luckySum(1, 3, 6); // 10.
		ps3.luckySum(1, 3, 7); // 11.
		ps3.luckySum(1, 3, 8); // 12.
		ps3.luckySum(1, 3, 9); // 13.
		ps3.luckySum(1, 4, 0); // 5.
		ps3.luckySum(1, 4, 1); // 6.
		ps3.luckySum(1, 4, 2); // 7.
		ps3.luckySum(1, 4, 3); // 8.
		ps3.luckySum(1, 4, 4); // 9.
		ps3.luckySum(1, 4, 5); // 10.
		ps3.luckySum(1, 4, 6); // 11.
		ps3.luckySum(1, 4, 7); // 12.
		ps3.luckySum(1, 4, 8); // 13.
		ps3.luckySum(1, 4, 9); // 14.
		ps3.luckySum(1, 5, 0); // 6.
		ps3.luckySum(1, 5, 1); // 7.
		ps3.luckySum(1, 5, 2); // 8.
		ps3.luckySum(1, 5, 3); // 9.
		ps3.luckySum(1, 5, 4); // 10.
		ps3.luckySum(1, 5, 5); // 11.
		ps3.luckySum(1, 5, 6); // 12.
		ps3.luckySum(1, 5, 7); // 13.
		ps3.luckySum(1, 5, 8); // 14.
		ps3.luckySum(1, 5, 9); // 15.
		ps3.luckySum(1, 6, 0); // 7.
		ps3.luckySum(1, 6, 1); // 8.
		ps3.luckySum(1, 6, 2); // 9.
		ps3.luckySum(1, 6, 3); // 10.
		ps3.luckySum(1, 6, 4); // 11.
		ps3.luckySum(1, 6, 5); // 12.
		ps3.luckySum(1, 6, 6); // 13.
		ps3.luckySum(1, 6, 7); // 14.
		ps3.luckySum(1, 6, 8); // 15.
		ps3.luckySum(1, 6, 9); // 16.
		ps3.luckySum(1, 7, 0); // 8.
		ps3.luckySum(1, 7, 1); // 9.
		ps3.luckySum(1, 7, 2); // 10.
		ps3.luckySum(1, 7, 3); // 11.
		ps3.luckySum(1, 7, 4); // 12.
		ps3.luckySum(1, 7, 5); // 13.
		ps3.luckySum(1, 7, 6); // 14.
		ps3.luckySum(1, 7, 7); // 15.
		ps3.luckySum(1, 7, 8); // 16.
		ps3.luckySum(1, 7, 9); // 17.
		ps3.luckySum(1, 8, 0); // 9.
		ps3.luckySum(1, 8, 1); // 10.
		ps3.luckySum(1, 8, 2); // 11.
		ps3.luckySum(1, 8, 3); // 12.
		ps3.luckySum(1, 8, 4); // 13.
		ps3.luckySum(1, 8, 5); // 14.
		ps3.luckySum(1, 8, 6); // 15.
		ps3.luckySum(1, 8, 7); // 16.
		ps3.luckySum(1, 8, 8); // 17.
		ps3.luckySum(1, 8, 9); // 18.
		ps3.luckySum(1, 9, 0); // 10.
		ps3.luckySum(1, 9, 1); // 11.
		ps3.luckySum(1, 9, 2); // 12.
		ps3.luckySum(1, 9, 3); // 13.
		ps3.luckySum(1, 9, 4); // 14.
		ps3.luckySum(1, 9, 5); // 15.
		ps3.luckySum(1, 9, 6); // 16.
		ps3.luckySum(1, 9, 7); // 17.
		ps3.luckySum(1, 9, 8); // 18.
		ps3.luckySum(1, 9, 9); // 19.
		ps3.luckySum(2, 0, 0); // 2.
		ps3.luckySum(2, 0, 1); // 3.
		ps3.luckySum(2, 0, 2); // 4.
		ps3.luckySum(2, 0, 3); // 5.
		ps3.luckySum(2, 0, 4); // 6.
		ps3.luckySum(2, 0, 5); // 7.
		ps3.luckySum(2, 0, 6); // 8.
		ps3.luckySum(2, 0, 7); // 9.
		ps3.luckySum(2, 0, 8); // 10.
		ps3.luckySum(2, 0, 9); // 11.
		ps3.luckySum(2, 1, 0); // 3.
		ps3.luckySum(2, 1, 1); // 4.
		ps3.luckySum(2, 1, 2); // 5.
		ps3.luckySum(2, 1, 3); // 6.
		ps3.luckySum(2, 1, 4); // 7.
		ps3.luckySum(2, 1, 5); // 8.
		ps3.luckySum(2, 1, 6); // 9.
		ps3.luckySum(2, 1, 7); // 10.
		ps3.luckySum(2, 1, 8); // 11.
		ps3.luckySum(2, 1, 9); // 12.
		ps3.luckySum(2, 2, 0); // 4.
		ps3.luckySum(2, 2, 1); // 5.
		ps3.luckySum(2, 2, 2); // 6.
		ps3.luckySum(2, 2, 3); // 7.
		ps3.luckySum(2, 2, 4); // 8.
		ps3.luckySum(2, 2, 5); // 9.
		ps3.luckySum(2, 2, 6); // 10.
		ps3.luckySum(2, 2, 7); // 11.
		ps3.luckySum(2, 2, 8); // 12.
		ps3.luckySum(2, 2, 9); // 13.
		ps3.luckySum(2, 3, 0); // 5.
		ps3.luckySum(2, 3, 1); // 6.
		ps3.luckySum(2, 3, 2); // 7.
		ps3.luckySum(2, 3, 3); // 8.
		ps3.luckySum(2, 3, 4); // 9.
		ps3.luckySum(2, 3, 5); // 10.
		ps3.luckySum(2, 3, 6); // 11.
		ps3.luckySum(2, 3, 7); // 12.
		ps3.luckySum(2, 3, 8); // 13.
		ps3.luckySum(2, 3, 9); // 14.
		ps3.luckySum(2, 4, 0); // 6.
		ps3.luckySum(2, 4, 1); // 7.
		ps3.luckySum(2, 4, 2); // 8.
		ps3.luckySum(2, 4, 3); // 9.
		ps3.luckySum(2, 4, 4); // 10.
		ps3.luckySum(2, 4, 5); // 11.
		ps3.luckySum(2, 4, 6); // 12.
		ps3.luckySum(2, 4, 7); // 13.
		ps3.luckySum(2, 4, 8); // 14.
		ps3.luckySum(2, 4, 9); // 15.
		ps3.luckySum(2, 5, 0); // 7.
		ps3.luckySum(2, 5, 1); // 8.
		ps3.luckySum(2, 5, 2); // 9.
		ps3.luckySum(2, 5, 3); // 10.
		ps3.luckySum(2, 5, 4); // 11.
		ps3.luckySum(2, 5, 5); // 12.
		ps3.luckySum(2, 5, 6); // 13.
		ps3.luckySum(2, 5, 7); // 14.
		ps3.luckySum(2, 5, 8); // 15.
		ps3.luckySum(2, 5, 9); // 16.
		ps3.luckySum(2, 6, 0); // 8.
		ps3.luckySum(2, 6, 1); // 9.
		ps3.luckySum(2, 6, 2); // 10.
		ps3.luckySum(2, 6, 3); // 11.
		ps3.luckySum(2, 6, 4); // 12.
		ps3.luckySum(2, 6, 5); // 13.
		ps3.luckySum(2, 6, 6); // 14.
		ps3.luckySum(2, 6, 7); // 15.
		ps3.luckySum(2, 6, 8); // 16.
		ps3.luckySum(2, 6, 9); // 17.
		ps3.luckySum(2, 7, 0); // 9.
		ps3.luckySum(2, 7, 1); // 10.
		ps3.luckySum(2, 7, 2); // 11.
		ps3.luckySum(2, 7, 3); // 12.
		ps3.luckySum(2, 7, 4); // 13.
		ps3.luckySum(2, 7, 5); // 14.
		ps3.luckySum(2, 7, 6); // 15.
		ps3.luckySum(2, 7, 7); // 16.
		ps3.luckySum(2, 7, 8); // 17.
		ps3.luckySum(2, 7, 9); // 18.
		ps3.luckySum(2, 8, 0); // 10.
		ps3.luckySum(2, 8, 1); // 11.
		ps3.luckySum(2, 8, 2); // 12.
		ps3.luckySum(2, 8, 3); // 13.
		ps3.luckySum(2, 8, 4); // 14.
		ps3.luckySum(2, 8, 5); // 15.
		ps3.luckySum(2, 8, 6); // 16.
		ps3.luckySum(2, 8, 7); // 17.
		ps3.luckySum(2, 8, 8); // 18.
		ps3.luckySum(2, 8, 9); // 19.
		ps3.luckySum(2, 9, 0); // 11.
		ps3.luckySum(2, 9, 1); // 12.
		ps3.luckySum(2, 9, 2); // 13.
		ps3.luckySum(2, 9, 3); // 14.
		ps3.luckySum(2, 9, 4); // 15.
		ps3.luckySum(2, 9, 5); // 16.
		ps3.luckySum(2, 9, 6); // 17.
		ps3.luckySum(2, 9, 7); // 18.
		ps3.luckySum(2, 9, 8); // 19.
		ps3.luckySum(2, 9, 9); // 20.
		ps3.luckySum(3, 0, 0); // 3.
		ps3.luckySum(3, 0, 1); // 4.
		ps3.luckySum(3, 0, 2); // 5.
		ps3.luckySum(3, 0, 3); // 6.
		ps3.luckySum(3, 0, 4); // 7.
		ps3.luckySum(3, 0, 5); // 8.
		ps3.luckySum(3, 0, 6); // 9.
		ps3.luckySum(3, 0, 7); // 10.
		ps3.luckySum(3, 0, 8); // 11.
		ps3.luckySum(3, 0, 9); // 12.
		ps3.luckySum(3, 1, 0); // 4.
		ps3.luckySum(3, 1, 1); // 5.
		ps3.luckySum(3, 1, 2); // 6.
		ps3.luckySum(3, 1, 3); // 7.
		ps3.luckySum(3, 1, 4); // 8.
		ps3.luckySum(3, 1, 5); // 9.
		ps3.luckySum(3, 1, 6); // 10.
		ps3.luckySum(3, 1, 7); // 11.
		ps3.luckySum(3, 1, 8); // 12.
		ps3.luckySum(3, 1, 9); // 13.
		ps3.luckySum(3, 2, 0); // 5.
		ps3.luckySum(3, 2, 1); // 6.
		ps3.luckySum(3, 2, 2); // 7.
		ps3.luckySum(3, 2, 3); // 8.
		ps3.luckySum(3, 2, 4); // 9.
		ps3.luckySum(3, 2, 5); // 10.
		ps3.luckySum(3, 2, 6); // 11.
		ps3.luckySum(3, 2, 7); // 12.
		ps3.luckySum(3, 2, 8); // 13.
		ps3.luckySum(3, 2, 9); // 14.
		ps3.luckySum(3, 3, 0); // 6.
		ps3.luckySum(3, 3, 1); // 7.
		ps3.luckySum(3, 3, 2); // 8.
		ps3.luckySum(3, 3, 3); // 9.
		ps3.luckySum(3, 3, 4); // 10.
		ps3.luckySum(3, 3, 5); // 11.
		ps3.luckySum(3, 3, 6); // 12.
		ps3.luckySum(3, 3, 7); // 13.
		ps3.luckySum(3, 3, 8); // 14.
		ps3.luckySum(3, 3, 9); // 15.
		ps3.luckySum(3, 4, 0); // 7.
		ps3.luckySum(3, 4, 1); // 8.
		ps3.luckySum(3, 4, 2); // 9.
		ps3.luckySum(3, 4, 3); // 10.
		ps3.luckySum(3, 4, 4); // 11.
		ps3.luckySum(3, 4, 5); // 12.
		ps3.luckySum(3, 4, 6); // 13.
		ps3.luckySum(3, 4, 7); // 14.
		ps3.luckySum(3, 4, 8); // 15.
		ps3.luckySum(3, 4, 9); // 16.
		ps3.luckySum(3, 5, 0); // 8.
		ps3.luckySum(3, 5, 1); // 9.
		ps3.luckySum(3, 5, 2); // 10.
		ps3.luckySum(3, 5, 3); // 11.
		ps3.luckySum(3, 5, 4); // 12.
		ps3.luckySum(3, 5, 5); // 13.
		ps3.luckySum(3, 5, 6); // 14.
		ps3.luckySum(3, 5, 7); // 15.
		ps3.luckySum(3, 5, 8); // 16.
		ps3.luckySum(3, 5, 9); // 17.
		ps3.luckySum(3, 6, 0); // 9.
		ps3.luckySum(3, 6, 1); // 10.
		ps3.luckySum(3, 6, 2); // 11.
		ps3.luckySum(3, 6, 3); // 12.
		ps3.luckySum(3, 6, 4); // 13.
		ps3.luckySum(3, 6, 5); // 14.
		ps3.luckySum(3, 6, 6); // 15.
		ps3.luckySum(3, 6, 7); // 16.
		ps3.luckySum(3, 6, 8); // 17.
		ps3.luckySum(3, 6, 9); // 18.
		ps3.luckySum(3, 7, 0); // 10.
		ps3.luckySum(3, 7, 1); // 11.
		ps3.luckySum(3, 7, 2); // 12.
		ps3.luckySum(3, 7, 3); // 13.
		ps3.luckySum(3, 7, 4); // 14.
		ps3.luckySum(3, 7, 5); // 15.
		ps3.luckySum(3, 7, 6); // 16.
		ps3.luckySum(3, 7, 7); // 17.
		ps3.luckySum(3, 7, 8); // 18.
		ps3.luckySum(3, 7, 9); // 19.
		ps3.luckySum(3, 8, 0); // 11.
		ps3.luckySum(3, 8, 1); // 12.
		ps3.luckySum(3, 8, 2); // 13.
		ps3.luckySum(3, 8, 3); // 14.
		ps3.luckySum(3, 8, 4); // 15.
		ps3.luckySum(3, 8, 5); // 16.
		ps3.luckySum(3, 8, 6); // 17.
		ps3.luckySum(3, 8, 7); // 18.
		ps3.luckySum(3, 8, 8); // 19.
		ps3.luckySum(3, 8, 9); // 20.
		ps3.luckySum(3, 9, 0); // 12.
		ps3.luckySum(3, 9, 1); // 13.
		ps3.luckySum(3, 9, 2); // 14.
		ps3.luckySum(3, 9, 3); // 15.
		ps3.luckySum(3, 9, 4); // 16.
		ps3.luckySum(3, 9, 5); // 17.
		ps3.luckySum(3, 9, 6); // 18.
		ps3.luckySum(3, 9, 7); // 19.
		ps3.luckySum(3, 9, 8); // 20.
		ps3.luckySum(3, 9, 9); // 21.
		ps3.luckySum(4, 0, 0); // 4.
		ps3.luckySum(4, 0, 1); // 5.
		ps3.luckySum(4, 0, 2); // 6.
		ps3.luckySum(4, 0, 3); // 7.
		ps3.luckySum(4, 0, 4); // 8.
		ps3.luckySum(4, 0, 5); // 9.
		ps3.luckySum(4, 0, 6); // 10.
		ps3.luckySum(4, 0, 7); // 11.
		ps3.luckySum(4, 0, 8); // 12.
		ps3.luckySum(4, 0, 9); // 13.
		ps3.luckySum(4, 1, 0); // 5.
		ps3.luckySum(4, 1, 1); // 6.
		ps3.luckySum(4, 1, 2); // 7.
		ps3.luckySum(4, 1, 3); // 8.
		ps3.luckySum(4, 1, 4); // 9.
		ps3.luckySum(4, 1, 5); // 10.
		ps3.luckySum(4, 1, 6); // 11.
		ps3.luckySum(4, 1, 7); // 12.
		ps3.luckySum(4, 1, 8); // 13.
		ps3.luckySum(4, 1, 9); // 14.
		ps3.luckySum(4, 2, 0); // 6.
		ps3.luckySum(4, 2, 1); // 7.
		ps3.luckySum(4, 2, 2); // 8.
		ps3.luckySum(4, 2, 3); // 9.
		ps3.luckySum(4, 2, 4); // 10.
		ps3.luckySum(4, 2, 5); // 11.
		ps3.luckySum(4, 2, 6); // 12.
		ps3.luckySum(4, 2, 7); // 13.
		ps3.luckySum(4, 2, 8); // 14.
		ps3.luckySum(4, 2, 9); // 15.
		ps3.luckySum(4, 3, 0); // 7.
		ps3.luckySum(4, 3, 1); // 8.
		ps3.luckySum(4, 3, 2); // 9.
		ps3.luckySum(4, 3, 3); // 10.
		ps3.luckySum(4, 3, 4); // 11.
		ps3.luckySum(4, 3, 5); // 12.
		ps3.luckySum(4, 3, 6); // 13.
		ps3.luckySum(4, 3, 7); // 14.
		ps3.luckySum(4, 3, 8); // 15.
		ps3.luckySum(4, 3, 9); // 16.
		ps3.luckySum(4, 4, 0); // 8.
		ps3.luckySum(4, 4, 1); // 9.
		ps3.luckySum(4, 4, 2); // 10.
		ps3.luckySum(4, 4, 3); // 11.
		ps3.luckySum(4, 4, 4); // 12.
		ps3.luckySum(4, 4, 5); // 13.
		ps3.luckySum(4, 4, 6); // 14.
		ps3.luckySum(4, 4, 7); // 15.
		ps3.luckySum(4, 4, 8); // 16.
		ps3.luckySum(4, 4, 9); // 17.
		ps3.luckySum(4, 5, 0); // 9.
		ps3.luckySum(4, 5, 1); // 10.
		ps3.luckySum(4, 5, 2); // 11.
		ps3.luckySum(4, 5, 3); // 12.
		ps3.luckySum(4, 5, 4); // 13.
		ps3.luckySum(4, 5, 5); // 14.
		ps3.luckySum(4, 5, 6); // 15.
		ps3.luckySum(4, 5, 7); // 16.
		ps3.luckySum(4, 5, 8); // 17.
		ps3.luckySum(4, 5, 9); // 18.
		ps3.luckySum(4, 6, 0); // 10.
		ps3.luckySum(4, 6, 1); // 11.
		ps3.luckySum(4, 6, 2); // 12.
		ps3.luckySum(4, 6, 3); // 13.
		ps3.luckySum(4, 6, 4); // 14.
		ps3.luckySum(4, 6, 5); // 15.
		ps3.luckySum(4, 6, 6); // 16.
		ps3.luckySum(4, 6, 7); // 17.
		ps3.luckySum(4, 6, 8); // 18.
		ps3.luckySum(4, 6, 9); // 19.
		ps3.luckySum(4, 7, 0); // 11.
		ps3.luckySum(4, 7, 1); // 12.
		ps3.luckySum(4, 7, 2); // 13.
		ps3.luckySum(4, 7, 3); // 14.
		ps3.luckySum(4, 7, 4); // 15.
		ps3.luckySum(4, 7, 5); // 16.
		ps3.luckySum(4, 7, 6); // 17.
		ps3.luckySum(4, 7, 7); // 18.
		ps3.luckySum(4, 7, 8); // 19.
		ps3.luckySum(4, 7, 9); // 20.
		ps3.luckySum(4, 8, 0); // 12.
		ps3.luckySum(4, 8, 1); // 13.
		ps3.luckySum(4, 8, 2); // 14.
		ps3.luckySum(4, 8, 3); // 15.
		ps3.luckySum(4, 8, 4); // 16.
		ps3.luckySum(4, 8, 5); // 17.
		ps3.luckySum(4, 8, 6); // 18.
		ps3.luckySum(4, 8, 7); // 19.
		ps3.luckySum(4, 8, 8); // 20.
		ps3.luckySum(4, 8, 9); // 21.
		ps3.luckySum(4, 9, 0); // 13.
		ps3.luckySum(4, 9, 1); // 14.
		ps3.luckySum(4, 9, 2); // 15.
		ps3.luckySum(4, 9, 3); // 16.
		ps3.luckySum(4, 9, 4); // 17.
		ps3.luckySum(4, 9, 5); // 18.
		ps3.luckySum(4, 9, 6); // 19.
		ps3.luckySum(4, 9, 7); // 20.
		ps3.luckySum(4, 9, 8); // 21.
		ps3.luckySum(4, 9, 9); // 22.
		ps3.luckySum(5, 0, 0); // 5.
		ps3.luckySum(5, 0, 1); // 6.
		ps3.luckySum(5, 0, 2); // 7.
		ps3.luckySum(5, 0, 3); // 8.
		ps3.luckySum(5, 0, 4); // 9.
		ps3.luckySum(5, 0, 5); // 10.
		ps3.luckySum(5, 0, 6); // 11.
		ps3.luckySum(5, 0, 7); // 12.
		ps3.luckySum(5, 0, 8); // 13.
		ps3.luckySum(5, 0, 9); // 14.
		ps3.luckySum(5, 1, 0); // 6.
		ps3.luckySum(5, 1, 1); // 7.
		ps3.luckySum(5, 1, 2); // 8.
		ps3.luckySum(5, 1, 3); // 9.
		ps3.luckySum(5, 1, 4); // 10.
		ps3.luckySum(5, 1, 5); // 11.
		ps3.luckySum(5, 1, 6); // 12.
		ps3.luckySum(5, 1, 7); // 13.
		ps3.luckySum(5, 1, 8); // 14.
		ps3.luckySum(5, 1, 9); // 15.
		ps3.luckySum(5, 2, 0); // 7.
		ps3.luckySum(5, 2, 1); // 8.
		ps3.luckySum(5, 2, 2); // 9.
		ps3.luckySum(5, 2, 3); // 10.
		ps3.luckySum(5, 2, 4); // 11.
		ps3.luckySum(5, 2, 5); // 12.
		ps3.luckySum(5, 2, 6); // 13.
		ps3.luckySum(5, 2, 7); // 14.
		ps3.luckySum(5, 2, 8); // 15.
		ps3.luckySum(5, 2, 9); // 16.
		ps3.luckySum(5, 3, 0); // 8.
		ps3.luckySum(5, 3, 1); // 9.
		ps3.luckySum(5, 3, 2); // 10.
		ps3.luckySum(5, 3, 3); // 11.
		ps3.luckySum(5, 3, 4); // 12.
		ps3.luckySum(5, 3, 5); // 13.
		ps3.luckySum(5, 3, 6); // 14.
		ps3.luckySum(5, 3, 7); // 15.
		ps3.luckySum(5, 3, 8); // 16.
		ps3.luckySum(5, 3, 9); // 17.
		ps3.luckySum(5, 4, 0); // 9.
		ps3.luckySum(5, 4, 1); // 10.
		ps3.luckySum(5, 4, 2); // 11.
		ps3.luckySum(5, 4, 3); // 12.
		ps3.luckySum(5, 4, 4); // 13.
		ps3.luckySum(5, 4, 5); // 14.
		ps3.luckySum(5, 4, 6); // 15.
		ps3.luckySum(5, 4, 7); // 16.
		ps3.luckySum(5, 4, 8); // 17.
		ps3.luckySum(5, 4, 9); // 18.
		ps3.luckySum(5, 5, 0); // 10.
		ps3.luckySum(5, 5, 1); // 11.
		ps3.luckySum(5, 5, 2); // 12.
		ps3.luckySum(5, 5, 3); // 13.
		ps3.luckySum(5, 5, 4); // 14.
		ps3.luckySum(5, 5, 5); // 15.
		ps3.luckySum(5, 5, 6); // 16.
		ps3.luckySum(5, 5, 7); // 17.
		ps3.luckySum(5, 5, 8); // 18.
		ps3.luckySum(5, 5, 9); // 19.
		ps3.luckySum(5, 6, 0); // 11.
		ps3.luckySum(5, 6, 1); // 12.
		ps3.luckySum(5, 6, 2); // 13.
		ps3.luckySum(5, 6, 3); // 14.
		ps3.luckySum(5, 6, 4); // 15.
		ps3.luckySum(5, 6, 5); // 16.
		ps3.luckySum(5, 6, 6); // 17.
		ps3.luckySum(5, 6, 7); // 18.
		ps3.luckySum(5, 6, 8); // 19.
		ps3.luckySum(5, 6, 9); // 20.
		ps3.luckySum(5, 7, 0); // 12.
		ps3.luckySum(5, 7, 1); // 13.
		ps3.luckySum(5, 7, 2); // 14.
		ps3.luckySum(5, 7, 3); // 15.
		ps3.luckySum(5, 7, 4); // 16.
		ps3.luckySum(5, 7, 5); // 17.
		ps3.luckySum(5, 7, 6); // 18.
		ps3.luckySum(5, 7, 7); // 19.
		ps3.luckySum(5, 7, 8); // 20.
		ps3.luckySum(5, 7, 9); // 21.
		ps3.luckySum(5, 8, 0); // 13.
		ps3.luckySum(5, 8, 1); // 14.
		ps3.luckySum(5, 8, 2); // 15.
		ps3.luckySum(5, 8, 3); // 16.
		ps3.luckySum(5, 8, 4); // 17.
		ps3.luckySum(5, 8, 5); // 18.
		ps3.luckySum(5, 8, 6); // 19.
		ps3.luckySum(5, 8, 7); // 20.
		ps3.luckySum(5, 8, 8); // 21.
		ps3.luckySum(5, 8, 9); // 22.
		ps3.luckySum(5, 9, 0); // 14.
		ps3.luckySum(5, 9, 1); // 15.
		ps3.luckySum(5, 9, 2); // 16.
		ps3.luckySum(5, 9, 3); // 17.
		ps3.luckySum(5, 9, 4); // 18.
		ps3.luckySum(5, 9, 5); // 19.
		ps3.luckySum(5, 9, 6); // 20.
		ps3.luckySum(5, 9, 7); // 21.
		ps3.luckySum(5, 9, 8); // 22.
		ps3.luckySum(5, 9, 9); // 23.
		ps3.luckySum(6, 0, 0); // 6.
		ps3.luckySum(6, 0, 1); // 7.
		ps3.luckySum(6, 0, 2); // 8.
		ps3.luckySum(6, 0, 3); // 9.
		ps3.luckySum(6, 0, 4); // 10.
		ps3.luckySum(6, 0, 5); // 11.
		ps3.luckySum(6, 0, 6); // 12.
		ps3.luckySum(6, 0, 7); // 13.
		ps3.luckySum(6, 0, 8); // 14.
		ps3.luckySum(6, 0, 9); // 15.
		ps3.luckySum(6, 1, 0); // 7.
		ps3.luckySum(6, 1, 1); // 8.
		ps3.luckySum(6, 1, 2); // 9.
		ps3.luckySum(6, 1, 3); // 10.
		ps3.luckySum(6, 1, 4); // 11.
		ps3.luckySum(6, 1, 5); // 12.
		ps3.luckySum(6, 1, 6); // 13.
		ps3.luckySum(6, 1, 7); // 14.
		ps3.luckySum(6, 1, 8); // 15.
		ps3.luckySum(6, 1, 9); // 16.
		ps3.luckySum(6, 2, 0); // 8.
		ps3.luckySum(6, 2, 1); // 9.
		ps3.luckySum(6, 2, 2); // 10.
		ps3.luckySum(6, 2, 3); // 11.
		ps3.luckySum(6, 2, 4); // 12.
		ps3.luckySum(6, 2, 5); // 13.
		ps3.luckySum(6, 2, 6); // 14.
		ps3.luckySum(6, 2, 7); // 15.
		ps3.luckySum(6, 2, 8); // 16.
		ps3.luckySum(6, 2, 9); // 17.
		ps3.luckySum(6, 3, 0); // 9.
		ps3.luckySum(6, 3, 1); // 10.
		ps3.luckySum(6, 3, 2); // 11.
		ps3.luckySum(6, 3, 3); // 12.
		ps3.luckySum(6, 3, 4); // 13.
		ps3.luckySum(6, 3, 5); // 14.
		ps3.luckySum(6, 3, 6); // 15.
		ps3.luckySum(6, 3, 7); // 16.
		ps3.luckySum(6, 3, 8); // 17.
		ps3.luckySum(6, 3, 9); // 18.
		ps3.luckySum(6, 4, 0); // 10.
		ps3.luckySum(6, 4, 1); // 11.
		ps3.luckySum(6, 4, 2); // 12.
		ps3.luckySum(6, 4, 3); // 13.
		ps3.luckySum(6, 4, 4); // 14.
		ps3.luckySum(6, 4, 5); // 15.
		ps3.luckySum(6, 4, 6); // 16.
		ps3.luckySum(6, 4, 7); // 17.
		ps3.luckySum(6, 4, 8); // 18.
		ps3.luckySum(6, 4, 9); // 19.
		ps3.luckySum(6, 5, 0); // 11.
		ps3.luckySum(6, 5, 1); // 12.
		ps3.luckySum(6, 5, 2); // 13.
		ps3.luckySum(6, 5, 3); // 14.
		ps3.luckySum(6, 5, 4); // 15.
		ps3.luckySum(6, 5, 5); // 16.
		ps3.luckySum(6, 5, 6); // 17.
		ps3.luckySum(6, 5, 7); // 18.
		ps3.luckySum(6, 5, 8); // 19.
		ps3.luckySum(6, 5, 9); // 20.
		ps3.luckySum(6, 6, 0); // 12.
		ps3.luckySum(6, 6, 1); // 13.
		ps3.luckySum(6, 6, 2); // 14.
		ps3.luckySum(6, 6, 3); // 15.
		ps3.luckySum(6, 6, 4); // 16.
		ps3.luckySum(6, 6, 5); // 17.
		ps3.luckySum(6, 6, 6); // 18.
		ps3.luckySum(6, 6, 7); // 19.
		ps3.luckySum(6, 6, 8); // 20.
		ps3.luckySum(6, 6, 9); // 21.
		ps3.luckySum(6, 7, 0); // 13.
		ps3.luckySum(6, 7, 1); // 14.
		ps3.luckySum(6, 7, 2); // 15.
		ps3.luckySum(6, 7, 3); // 16.
		ps3.luckySum(6, 7, 4); // 17.
		ps3.luckySum(6, 7, 5); // 18.
		ps3.luckySum(6, 7, 6); // 19.
		ps3.luckySum(6, 7, 7); // 20.
		ps3.luckySum(6, 7, 8); // 21.
		ps3.luckySum(6, 7, 9); // 22.
		ps3.luckySum(6, 8, 0); // 14.
		ps3.luckySum(6, 8, 1); // 15.
		ps3.luckySum(6, 8, 2); // 16.
		ps3.luckySum(6, 8, 3); // 17.
		ps3.luckySum(6, 8, 4); // 18.
		ps3.luckySum(6, 8, 5); // 19.
		ps3.luckySum(6, 8, 6); // 20.
		ps3.luckySum(6, 8, 7); // 21.
		ps3.luckySum(6, 8, 8); // 22.
		ps3.luckySum(6, 8, 9); // 23.
		ps3.luckySum(6, 9, 0); // 15.
		ps3.luckySum(6, 9, 1); // 16.
		ps3.luckySum(6, 9, 2); // 17.
		ps3.luckySum(6, 9, 3); // 18.
		ps3.luckySum(6, 9, 4); // 19.
		ps3.luckySum(6, 9, 5); // 20.
		ps3.luckySum(6, 9, 6); // 21.
		ps3.luckySum(6, 9, 7); // 22.
		ps3.luckySum(6, 9, 8); // 23.
		ps3.luckySum(6, 9, 9); // 24.
		ps3.luckySum(7, 0, 0); // 7.
		ps3.luckySum(7, 0, 1); // 8.
		ps3.luckySum(7, 0, 2); // 9.
		ps3.luckySum(7, 0, 3); // 10.
		ps3.luckySum(7, 0, 4); // 11.
		ps3.luckySum(7, 0, 5); // 12.
		ps3.luckySum(7, 0, 6); // 13.
		ps3.luckySum(7, 0, 7); // 14.
		ps3.luckySum(7, 0, 8); // 15.
		ps3.luckySum(7, 0, 9); // 16.
		ps3.luckySum(7, 1, 0); // 8.
		ps3.luckySum(7, 1, 1); // 9.
		ps3.luckySum(7, 1, 2); // 10.
		ps3.luckySum(7, 1, 3); // 11.
		ps3.luckySum(7, 1, 4); // 12.
		ps3.luckySum(7, 1, 5); // 13.
		ps3.luckySum(7, 1, 6); // 14.
		ps3.luckySum(7, 1, 7); // 15.
		ps3.luckySum(7, 1, 8); // 16.
		ps3.luckySum(7, 1, 9); // 17.
		ps3.luckySum(7, 2, 0); // 9.
		ps3.luckySum(7, 2, 1); // 10.
		ps3.luckySum(7, 2, 2); // 11.
		ps3.luckySum(7, 2, 3); // 12.
		ps3.luckySum(7, 2, 4); // 13.
		ps3.luckySum(7, 2, 5); // 14.
		ps3.luckySum(7, 2, 6); // 15.
		ps3.luckySum(7, 2, 7); // 16.
		ps3.luckySum(7, 2, 8); // 17.
		ps3.luckySum(7, 2, 9); // 18.
		ps3.luckySum(7, 3, 0); // 10.
		ps3.luckySum(7, 3, 1); // 11.
		ps3.luckySum(7, 3, 2); // 12.
		ps3.luckySum(7, 3, 3); // 13.
		ps3.luckySum(7, 3, 4); // 14.
		ps3.luckySum(7, 3, 5); // 15.
		ps3.luckySum(7, 3, 6); // 16.
		ps3.luckySum(7, 3, 7); // 17.
		ps3.luckySum(7, 3, 8); // 18.
		ps3.luckySum(7, 3, 9); // 19.
		ps3.luckySum(7, 4, 0); // 11.
		ps3.luckySum(7, 4, 1); // 12.
		ps3.luckySum(7, 4, 2); // 13.
		ps3.luckySum(7, 4, 3); // 14.
		ps3.luckySum(7, 4, 4); // 15.
		ps3.luckySum(7, 4, 5); // 16.
		ps3.luckySum(7, 4, 6); // 17.
		ps3.luckySum(7, 4, 7); // 18.
		ps3.luckySum(7, 4, 8); // 19.
		ps3.luckySum(7, 4, 9); // 20.
		ps3.luckySum(7, 5, 0); // 12.
		ps3.luckySum(7, 5, 1); // 13.
		ps3.luckySum(7, 5, 2); // 14.
		ps3.luckySum(7, 5, 3); // 15.
		ps3.luckySum(7, 5, 4); // 16.
		ps3.luckySum(7, 5, 5); // 17.
		ps3.luckySum(7, 5, 6); // 18.
		ps3.luckySum(7, 5, 7); // 19.
		ps3.luckySum(7, 5, 8); // 20.
		ps3.luckySum(7, 5, 9); // 21.
		ps3.luckySum(7, 6, 0); // 13.
		ps3.luckySum(7, 6, 1); // 14.
		ps3.luckySum(7, 6, 2); // 15.
		ps3.luckySum(7, 6, 3); // 16.
		ps3.luckySum(7, 6, 4); // 17.
		ps3.luckySum(7, 6, 5); // 18.
		ps3.luckySum(7, 6, 6); // 19.
		ps3.luckySum(7, 6, 7); // 20.
		ps3.luckySum(7, 6, 8); // 21.
		ps3.luckySum(7, 6, 9); // 22.
		ps3.luckySum(7, 7, 0); // 14.
		ps3.luckySum(7, 7, 1); // 15.
		ps3.luckySum(7, 7, 2); // 16.
		ps3.luckySum(7, 7, 3); // 17.
		ps3.luckySum(7, 7, 4); // 18.
		ps3.luckySum(7, 7, 5); // 19.
		ps3.luckySum(7, 7, 6); // 20.
		ps3.luckySum(7, 7, 7); // 21.
		ps3.luckySum(7, 7, 8); // 22.
		ps3.luckySum(7, 7, 9); // 23.
		ps3.luckySum(7, 8, 0); // 15.
		ps3.luckySum(7, 8, 1); // 16.
		ps3.luckySum(7, 8, 2); // 17.
		ps3.luckySum(7, 8, 3); // 18.
		ps3.luckySum(7, 8, 4); // 19.
		ps3.luckySum(7, 8, 5); // 20.
		ps3.luckySum(7, 8, 6); // 21.
		ps3.luckySum(7, 8, 7); // 22.
		ps3.luckySum(7, 8, 8); // 23.
		ps3.luckySum(7, 8, 9); // 24.
		ps3.luckySum(7, 9, 0); // 16.
		ps3.luckySum(7, 9, 1); // 17.
		ps3.luckySum(7, 9, 2); // 18.
		ps3.luckySum(7, 9, 3); // 19.
		ps3.luckySum(7, 9, 4); // 20.
		ps3.luckySum(7, 9, 5); // 21.
		ps3.luckySum(7, 9, 6); // 22.
		ps3.luckySum(7, 9, 7); // 23.
		ps3.luckySum(7, 9, 8); // 24.
		ps3.luckySum(7, 9, 9); // 25.
		ps3.luckySum(8, 0, 0); // 8.
		ps3.luckySum(8, 0, 1); // 9.
		ps3.luckySum(8, 0, 2); // 10.
		ps3.luckySum(8, 0, 3); // 11.
		ps3.luckySum(8, 0, 4); // 12.
		ps3.luckySum(8, 0, 5); // 13.
		ps3.luckySum(8, 0, 6); // 14.
		ps3.luckySum(8, 0, 7); // 15.
		ps3.luckySum(8, 0, 8); // 16.
		ps3.luckySum(8, 0, 9); // 17.
		ps3.luckySum(8, 1, 0); // 9.
		ps3.luckySum(8, 1, 1); // 10.
		ps3.luckySum(8, 1, 2); // 11.
		ps3.luckySum(8, 1, 3); // 12.
		ps3.luckySum(8, 1, 4); // 13.
		ps3.luckySum(8, 1, 5); // 14.
		ps3.luckySum(8, 1, 6); // 15.
		ps3.luckySum(8, 1, 7); // 16.
		ps3.luckySum(8, 1, 8); // 17.
		ps3.luckySum(8, 1, 9); // 18.
		ps3.luckySum(8, 2, 0); // 10.
		ps3.luckySum(8, 2, 1); // 11.
		ps3.luckySum(8, 2, 2); // 12.
		ps3.luckySum(8, 2, 3); // 13.
		ps3.luckySum(8, 2, 4); // 14.
		ps3.luckySum(8, 2, 5); // 15.
		ps3.luckySum(8, 2, 6); // 16.
		ps3.luckySum(8, 2, 7); // 17.
		ps3.luckySum(8, 2, 8); // 18.
		ps3.luckySum(8, 2, 9); // 19.
		ps3.luckySum(8, 3, 0); // 11.
		ps3.luckySum(8, 3, 1); // 12.
		ps3.luckySum(8, 3, 2); // 13.
		ps3.luckySum(8, 3, 3); // 14.
		ps3.luckySum(8, 3, 4); // 15.
		ps3.luckySum(8, 3, 5); // 16.
		ps3.luckySum(8, 3, 6); // 17.
		ps3.luckySum(8, 3, 7); // 18.
		ps3.luckySum(8, 3, 8); // 19.
		ps3.luckySum(8, 3, 9); // 20.
		ps3.luckySum(8, 4, 0); // 12.
		ps3.luckySum(8, 4, 1); // 13.
		ps3.luckySum(8, 4, 2); // 14.
		ps3.luckySum(8, 4, 3); // 15.
		ps3.luckySum(8, 4, 4); // 16.
		ps3.luckySum(8, 4, 5); // 17.
		ps3.luckySum(8, 4, 6); // 18.
		ps3.luckySum(8, 4, 7); // 19.
		ps3.luckySum(8, 4, 8); // 20.
		ps3.luckySum(8, 4, 9); // 21.
		ps3.luckySum(8, 5, 0); // 13.
		ps3.luckySum(8, 5, 1); // 14.
		ps3.luckySum(8, 5, 2); // 15.
		ps3.luckySum(8, 5, 3); // 16.
		ps3.luckySum(8, 5, 4); // 17.
		ps3.luckySum(8, 5, 5); // 18.
		ps3.luckySum(8, 5, 6); // 19.
		ps3.luckySum(8, 5, 7); // 20.
		ps3.luckySum(8, 5, 8); // 21.
		ps3.luckySum(8, 5, 9); // 22.
		ps3.luckySum(8, 6, 0); // 14.
		ps3.luckySum(8, 6, 1); // 15.
		ps3.luckySum(8, 6, 2); // 16.
		ps3.luckySum(8, 6, 3); // 17.
		ps3.luckySum(8, 6, 4); // 18.
		ps3.luckySum(8, 6, 5); // 19.
		ps3.luckySum(8, 6, 6); // 20.
		ps3.luckySum(8, 6, 7); // 21.
		ps3.luckySum(8, 6, 8); // 22.
		ps3.luckySum(8, 6, 9); // 23.
		ps3.luckySum(8, 7, 0); // 15.
		ps3.luckySum(8, 7, 1); // 16.
		ps3.luckySum(8, 7, 2); // 17.
		ps3.luckySum(8, 7, 3); // 18.
		ps3.luckySum(8, 7, 4); // 19.
		ps3.luckySum(8, 7, 5); // 20.
		ps3.luckySum(8, 7, 6); // 21.
		ps3.luckySum(8, 7, 7); // 22.
		ps3.luckySum(8, 7, 8); // 23.
		ps3.luckySum(8, 7, 9); // 24.
		ps3.luckySum(8, 8, 0); // 16.
		ps3.luckySum(8, 8, 1); // 17.
		ps3.luckySum(8, 8, 2); // 18.
		ps3.luckySum(8, 8, 3); // 19.
		ps3.luckySum(8, 8, 4); // 20.
		ps3.luckySum(8, 8, 5); // 21.
		ps3.luckySum(8, 8, 6); // 22.
		ps3.luckySum(8, 8, 7); // 23.
		ps3.luckySum(8, 8, 8); // 24.
		ps3.luckySum(8, 8, 9); // 25.
		ps3.luckySum(8, 9, 0); // 17.
		ps3.luckySum(8, 9, 1); // 18.
		ps3.luckySum(8, 9, 2); // 19.
		ps3.luckySum(8, 9, 3); // 20.
		ps3.luckySum(8, 9, 4); // 21.
		ps3.luckySum(8, 9, 5); // 22.
		ps3.luckySum(8, 9, 6); // 23.
		ps3.luckySum(8, 9, 7); // 24.
		ps3.luckySum(8, 9, 8); // 25.
		ps3.luckySum(8, 9, 9); // 26.
		ps3.luckySum(9, 0, 0); // 9.
		ps3.luckySum(9, 0, 1); // 10.
		ps3.luckySum(9, 0, 2); // 11.
		ps3.luckySum(9, 0, 3); // 12.
		ps3.luckySum(9, 0, 4); // 13.
		ps3.luckySum(9, 0, 5); // 14.
		ps3.luckySum(9, 0, 6); // 15.
		ps3.luckySum(9, 0, 7); // 16.
		ps3.luckySum(9, 0, 8); // 17.
		ps3.luckySum(9, 0, 9); // 18.
		ps3.luckySum(9, 1, 0); // 10.
		ps3.luckySum(9, 1, 1); // 11.
		ps3.luckySum(9, 1, 2); // 12.
		ps3.luckySum(9, 1, 3); // 13.
		ps3.luckySum(9, 1, 4); // 14.
		ps3.luckySum(9, 1, 5); // 15.
		ps3.luckySum(9, 1, 6); // 16.
		ps3.luckySum(9, 1, 7); // 17.
		ps3.luckySum(9, 1, 8); // 18.
		ps3.luckySum(9, 1, 9); // 19.
		ps3.luckySum(9, 2, 0); // 11.
		ps3.luckySum(9, 2, 1); // 12.
		ps3.luckySum(9, 2, 2); // 13.
		ps3.luckySum(9, 2, 3); // 14.
		ps3.luckySum(9, 2, 4); // 15.
		ps3.luckySum(9, 2, 5); // 16.
		ps3.luckySum(9, 2, 6); // 17.
		ps3.luckySum(9, 2, 7); // 18.
		ps3.luckySum(9, 2, 8); // 19.
		ps3.luckySum(9, 2, 9); // 20.
		ps3.luckySum(9, 3, 0); // 12.
		ps3.luckySum(9, 3, 1); // 13.
		ps3.luckySum(9, 3, 2); // 14.
		ps3.luckySum(9, 3, 3); // 15.
		ps3.luckySum(9, 3, 4); // 16.
		ps3.luckySum(9, 3, 5); // 17.
		ps3.luckySum(9, 3, 6); // 18.
		ps3.luckySum(9, 3, 7); // 19.
		ps3.luckySum(9, 3, 8); // 20.
		ps3.luckySum(9, 3, 9); // 21.
		ps3.luckySum(9, 4, 0); // 13.
		ps3.luckySum(9, 4, 1); // 14.
		ps3.luckySum(9, 4, 2); // 15.
		ps3.luckySum(9, 4, 3); // 16.
		ps3.luckySum(9, 4, 4); // 17.
		ps3.luckySum(9, 4, 5); // 18.
		ps3.luckySum(9, 4, 6); // 19.
		ps3.luckySum(9, 4, 7); // 20.
		ps3.luckySum(9, 4, 8); // 21.
		ps3.luckySum(9, 4, 9); // 22.
		ps3.luckySum(9, 5, 0); // 14.
		ps3.luckySum(9, 5, 1); // 15.
		ps3.luckySum(9, 5, 2); // 16.
		ps3.luckySum(9, 5, 3); // 17.
		ps3.luckySum(9, 5, 4); // 18.
		ps3.luckySum(9, 5, 5); // 19.
		ps3.luckySum(9, 5, 6); // 20.
		ps3.luckySum(9, 5, 7); // 21.
		ps3.luckySum(9, 5, 8); // 22.
		ps3.luckySum(9, 5, 9); // 23.
		ps3.luckySum(9, 6, 0); // 15.
		ps3.luckySum(9, 6, 1); // 16.
		ps3.luckySum(9, 6, 2); // 17.
		ps3.luckySum(9, 6, 3); // 18.
		ps3.luckySum(9, 6, 4); // 19.
		ps3.luckySum(9, 6, 5); // 20.
		ps3.luckySum(9, 6, 6); // 21.
		ps3.luckySum(9, 6, 7); // 22.
		ps3.luckySum(9, 6, 8); // 23.
		ps3.luckySum(9, 6, 9); // 24.
		ps3.luckySum(9, 7, 0); // 16.
		ps3.luckySum(9, 7, 1); // 17.
		ps3.luckySum(9, 7, 2); // 18.
		ps3.luckySum(9, 7, 3); // 19.
		ps3.luckySum(9, 7, 4); // 20.
		ps3.luckySum(9, 7, 5); // 21.
		ps3.luckySum(9, 7, 6); // 22.
		ps3.luckySum(9, 7, 7); // 23.
		ps3.luckySum(9, 7, 8); // 24.
		ps3.luckySum(9, 7, 9); // 25.
		ps3.luckySum(9, 8, 0); // 17.
		ps3.luckySum(9, 8, 1); // 18.
		ps3.luckySum(9, 8, 2); // 19.
		ps3.luckySum(9, 8, 3); // 20.
		ps3.luckySum(9, 8, 4); // 21.
		ps3.luckySum(9, 8, 5); // 22.
		ps3.luckySum(9, 8, 6); // 23.
		ps3.luckySum(9, 8, 7); // 24.
		ps3.luckySum(9, 8, 8); // 25.
		ps3.luckySum(9, 8, 9); // 26.
		ps3.luckySum(9, 9, 0); // 18.
		ps3.luckySum(9, 9, 1); // 19.
		ps3.luckySum(9, 9, 2); // 20.
		ps3.luckySum(9, 9, 3); // 21.
		ps3.luckySum(9, 9, 4); // 22.
		ps3.luckySum(9, 9, 5); // 23.
		ps3.luckySum(9, 9, 6); // 24.
		ps3.luckySum(9, 9, 7); // 25.
		ps3.luckySum(9, 9, 8); // 26.
		ps3.luckySum(9, 9, 9); // 27.

		// factorialWithFor(n) Test Cases

		ps3.factorialFor(1); // 1! = 1.
		ps3.factorialFor(2); // 2! = 2.
		ps3.factorialFor(3); // 3! = 6.
		ps3.factorialFor(4); // 4! = 24.
		ps3.factorialFor(5); // 5! = 120.
		ps3.factorialFor(6); // 6! = 720.
		ps3.factorialFor(7); // 7! = 5040.
		ps3.factorialFor(8); // 8! = 40320.
		ps3.factorialFor(9); // 9! = 362880.
		ps3.factorialFor(10); // 10! = 3628800.

		// factorialWithWhile(n) Test Cases

		ps3.factorialWhile(1); // 1! = 1.
		ps3.factorialWhile(2); // 2! = 2.
		ps3.factorialWhile(3); // 3! = 6.
		ps3.factorialWhile(4); // 4! = 24.
		ps3.factorialWhile(5); // 5! = 120.
		ps3.factorialWhile(6); // 6! = 720.
		ps3.factorialWhile(7); // 7! = 5040.
		ps3.factorialWhile(8); // 8! = 40320.
		ps3.factorialWhile(9); // 9! = 362880.
		ps3.factorialWhile(10); // 10! = 3628800.

		// isPrime(n) Test Cases

		ps3.isPrime(0); // NOT PRIME.
		ps3.isPrime(1); // NOT PRIME.
		ps3.isPrime(2); // PRIME.
		ps3.isPrime(3); // PRIME.
		ps3.isPrime(4); // NOT PRIME.
		ps3.isPrime(5); // PRIME.
		ps3.isPrime(6); // NOT PRIME.
		ps3.isPrime(7); // PRIME.
		ps3.isPrime(8); // NOT PRIME.
		ps3.isPrime(9); // NOT PRIME.
		ps3.isPrime(10); // NOT PRIME.
		ps3.isPrime(11); // PRIME.
		ps3.isPrime(12); // NOT PRIME.
		ps3.isPrime(13); // PRIME.
		ps3.isPrime(14); // NOT PRIME.
		ps3.isPrime(15); // NOT PRIME.
		ps3.isPrime(16); // NOT PRIME.
		ps3.isPrime(17); // PRIME.
		ps3.isPrime(18); // NOT PRIME.
		ps3.isPrime(19); // PRIME.
		ps3.isPrime(20); // NOT PRIME.
		ps3.isPrime(21); // NOT PRIME.
		ps3.isPrime(22); // NOT PRIME.
		ps3.isPrime(23); // PRIME.
		ps3.isPrime(24); // NOT PRIME.
		ps3.isPrime(25); // NOT PRIME.
		ps3.isPrime(26); // NOT PRIME.
		ps3.isPrime(27); // NOT PRIME.
		ps3.isPrime(28); // NOT PRIME.
		ps3.isPrime(29); // PRIME.
		ps3.isPrime(30); // NOT PRIME.
		ps3.isPrime(31); // PRIME.
		ps3.isPrime(32); // NOT PRIME.
		ps3.isPrime(33); // NOT PRIME.
		ps3.isPrime(34); // NOT PRIME.
		ps3.isPrime(35); // NOT PRIME.
		ps3.isPrime(36); // NOT PRIME.
		ps3.isPrime(37); // PRIME.
		ps3.isPrime(38); // NOT PRIME.
		ps3.isPrime(39); // NOT PRIME.
		ps3.isPrime(40); // NOT PRIME.
		ps3.isPrime(41); // PRIME.
		ps3.isPrime(42); // NOT PRIME.
		ps3.isPrime(43); // PRIME.
		ps3.isPrime(44); // NOT PRIME.
		ps3.isPrime(45); // NOT PRIME.
		ps3.isPrime(46); // NOT PRIME.
		ps3.isPrime(47); // PRIME.
		ps3.isPrime(48); // NOT PRIME.
		ps3.isPrime(49); // NOT PRIME.
		ps3.isPrime(50); // NOT PRIME.
		ps3.isPrime(51); // NOT PRIME.
		ps3.isPrime(52); // NOT PRIME.
		ps3.isPrime(53); // PRIME.
		ps3.isPrime(54); // NOT PRIME.
		ps3.isPrime(55); // NOT PRIME.
		ps3.isPrime(56); // NOT PRIME.
		ps3.isPrime(57); // NOT PRIME.
		ps3.isPrime(58); // NOT PRIME.
		ps3.isPrime(59); // PRIME.
		ps3.isPrime(60); // NOT PRIME.
		ps3.isPrime(61); // PRIME.
		ps3.isPrime(62); // NOT PRIME.
		ps3.isPrime(63); // NOT PRIME.
		ps3.isPrime(64); // NOT PRIME.
		ps3.isPrime(65); // NOT PRIME.
		ps3.isPrime(66); // NOT PRIME.
		ps3.isPrime(67); // PRIME.
		ps3.isPrime(68); // NOT PRIME.
		ps3.isPrime(69); // NOT PRIME.
		ps3.isPrime(70); // NOT PRIME.
		ps3.isPrime(71); // PRIME.
		ps3.isPrime(72); // NOT PRIME.
		ps3.isPrime(73); // PRIME.
		ps3.isPrime(74); // NOT PRIME.
		ps3.isPrime(75); // NOT PRIME.
		ps3.isPrime(76); // NOT PRIME.
		ps3.isPrime(77); // NOT PRIME.
		ps3.isPrime(78); // NOT PRIME.
		ps3.isPrime(79); // PRIME.
		ps3.isPrime(80); // NOT PRIME.
		ps3.isPrime(81); // NOT PRIME.
		ps3.isPrime(82); // NOT PRIME.
		ps3.isPrime(83); // PRIME.
		ps3.isPrime(84); // NOT PRIME.
		ps3.isPrime(85); // NOT PRIME.
		ps3.isPrime(86); // NOT PRIME.
		ps3.isPrime(87); // NOT PRIME.
		ps3.isPrime(88); // NOT PRIME.
		ps3.isPrime(89); // PRIME.
		ps3.isPrime(90); // NOT PRIME.
		ps3.isPrime(91); // NOT PRIME.
		ps3.isPrime(92); // NOT PRIME.
		ps3.isPrime(93); // NOT PRIME.
		ps3.isPrime(94); // NOT PRIME.
		ps3.isPrime(95); // NOT PRIME.
		ps3.isPrime(96); // NOT PRIME.
		ps3.isPrime(97); // PRIME.
		ps3.isPrime(98); // NOT PRIME.
		ps3.isPrime(99); // NOT PRIME.
		ps3.isPrime(100); // NOT PRIME.
		ps3.isPrime(101); // PRIME.
		ps3.isPrime(102); // NOT PRIME.
		ps3.isPrime(103); // PRIME.
		ps3.isPrime(104); // NOT PRIME.
		ps3.isPrime(105); // NOT PRIME.
		ps3.isPrime(106); // NOT PRIME.
		ps3.isPrime(107); // PRIME.
		ps3.isPrime(108); // NOT PRIME.
		ps3.isPrime(109); // PRIME.
		ps3.isPrime(110); // NOT PRIME.
		ps3.isPrime(111); // NOT PRIME.
		ps3.isPrime(112); // NOT PRIME.
		ps3.isPrime(113); // PRIME.
		ps3.isPrime(114); // NOT PRIME.
		ps3.isPrime(115); // NOT PRIME.
		ps3.isPrime(116); // NOT PRIME.
		ps3.isPrime(117); // NOT PRIME.
		ps3.isPrime(118); // NOT PRIME.
		ps3.isPrime(119); // NOT PRIME.
		ps3.isPrime(120); // NOT PRIME.
		ps3.isPrime(121); // NOT PRIME.
		ps3.isPrime(122); // NOT PRIME.
		ps3.isPrime(123); // NOT PRIME.
		ps3.isPrime(124); // NOT PRIME.
		ps3.isPrime(125); // NOT PRIME.
		ps3.isPrime(126); // NOT PRIME.
		ps3.isPrime(127); // PRIME.
		ps3.isPrime(128); // NOT PRIME.
		ps3.isPrime(129); // NOT PRIME.
		ps3.isPrime(130); // NOT PRIME.
		ps3.isPrime(131); // PRIME.
		ps3.isPrime(132); // NOT PRIME.
		ps3.isPrime(133); // NOT PRIME.
		ps3.isPrime(134); // NOT PRIME.
		ps3.isPrime(135); // NOT PRIME.
		ps3.isPrime(136); // NOT PRIME.
		ps3.isPrime(137); // PRIME.
		ps3.isPrime(138); // NOT PRIME.
		ps3.isPrime(139); // PRIME.
		ps3.isPrime(140); // NOT PRIME.
		ps3.isPrime(141); // NOT PRIME.
		ps3.isPrime(142); // NOT PRIME.
		ps3.isPrime(143); // NOT PRIME.
		ps3.isPrime(144); // NOT PRIME.
		ps3.isPrime(145); // NOT PRIME.
		ps3.isPrime(146); // NOT PRIME.
		ps3.isPrime(147); // NOT PRIME.
		ps3.isPrime(148); // NOT PRIME.
		ps3.isPrime(149); // PRIME.
		ps3.isPrime(150); // NOT PRIME.
		ps3.isPrime(151); // PRIME.
		ps3.isPrime(152); // NOT PRIME.
		ps3.isPrime(153); // NOT PRIME.
		ps3.isPrime(154); // NOT PRIME.
		ps3.isPrime(155); // NOT PRIME.
		ps3.isPrime(156); // NOT PRIME.
		ps3.isPrime(157); // PRIME.
		ps3.isPrime(158); // NOT PRIME.
		ps3.isPrime(159); // NOT PRIME.
		ps3.isPrime(160); // NOT PRIME.
		ps3.isPrime(161); // NOT PRIME.
		ps3.isPrime(162); // NOT PRIME.
		ps3.isPrime(163); // PRIME.
		ps3.isPrime(164); // NOT PRIME.
		ps3.isPrime(165); // NOT PRIME.
		ps3.isPrime(166); // NOT PRIME.
		ps3.isPrime(167); // PRIME.
		ps3.isPrime(168); // NOT PRIME.
		ps3.isPrime(169); // NOT PRIME.
		ps3.isPrime(170); // NOT PRIME.
		ps3.isPrime(171); // NOT PRIME.
		ps3.isPrime(172); // NOT PRIME.
		ps3.isPrime(173); // PRIME.
		ps3.isPrime(174); // NOT PRIME.
		ps3.isPrime(175); // NOT PRIME.
		ps3.isPrime(176); // NOT PRIME.
		ps3.isPrime(177); // NOT PRIME.
		ps3.isPrime(178); // NOT PRIME.
		ps3.isPrime(179); // PRIME.
		ps3.isPrime(180); // NOT PRIME.
		ps3.isPrime(181); // PRIME.
		ps3.isPrime(182); // NOT PRIME.
		ps3.isPrime(183); // NOT PRIME.
		ps3.isPrime(184); // NOT PRIME.
		ps3.isPrime(185); // NOT PRIME.
		ps3.isPrime(186); // NOT PRIME.
		ps3.isPrime(187); // NOT PRIME.
		ps3.isPrime(188); // NOT PRIME.
		ps3.isPrime(189); // NOT PRIME.
		ps3.isPrime(190); // NOT PRIME.
		ps3.isPrime(191); // PRIME.
		ps3.isPrime(192); // NOT PRIME.
		ps3.isPrime(193); // PRIME.
		ps3.isPrime(194); // NOT PRIME.
		ps3.isPrime(195); // NOT PRIME.
		ps3.isPrime(196); // NOT PRIME.
		ps3.isPrime(197); // PRIME.
		ps3.isPrime(198); // NOT PRIME.
		ps3.isPrime(199); // PRIME.
		ps3.isPrime(200); // NOT PRIME.
		ps3.isPrime(201); // NOT PRIME.
		ps3.isPrime(202); // NOT PRIME.
		ps3.isPrime(203); // NOT PRIME.
		ps3.isPrime(204); // NOT PRIME.
		ps3.isPrime(205); // NOT PRIME.
		ps3.isPrime(206); // NOT PRIME.
		ps3.isPrime(207); // NOT PRIME.
		ps3.isPrime(208); // NOT PRIME.
		ps3.isPrime(209); // NOT PRIME.
		ps3.isPrime(210); // NOT PRIME.
		ps3.isPrime(211); // PRIME.
		ps3.isPrime(212); // NOT PRIME.
		ps3.isPrime(213); // NOT PRIME.
		ps3.isPrime(214); // NOT PRIME.
		ps3.isPrime(215); // NOT PRIME.
		ps3.isPrime(216); // NOT PRIME.
		ps3.isPrime(217); // NOT PRIME.
		ps3.isPrime(218); // NOT PRIME.
		ps3.isPrime(219); // NOT PRIME.
		ps3.isPrime(220); // NOT PRIME.
		ps3.isPrime(221); // NOT PRIME.
		ps3.isPrime(222); // NOT PRIME.
		ps3.isPrime(223); // PRIME.
		ps3.isPrime(224); // NOT PRIME.
		ps3.isPrime(225); // NOT PRIME.
		ps3.isPrime(226); // NOT PRIME.
		ps3.isPrime(227); // PRIME.
		ps3.isPrime(228); // NOT PRIME.
		ps3.isPrime(229); // PRIME.
		ps3.isPrime(230); // NOT PRIME.
		ps3.isPrime(231); // NOT PRIME.
		ps3.isPrime(232); // NOT PRIME.
		ps3.isPrime(233); // PRIME.
		ps3.isPrime(234); // NOT PRIME.
		ps3.isPrime(235); // NOT PRIME.
		ps3.isPrime(236); // NOT PRIME.
		ps3.isPrime(237); // NOT PRIME.
		ps3.isPrime(238); // NOT PRIME.
		ps3.isPrime(239); // PRIME.
		ps3.isPrime(240); // NOT PRIME.
		ps3.isPrime(241); // PRIME.
		ps3.isPrime(242); // NOT PRIME.
		ps3.isPrime(243); // NOT PRIME.
		ps3.isPrime(244); // NOT PRIME.
		ps3.isPrime(245); // NOT PRIME.
		ps3.isPrime(246); // NOT PRIME.
		ps3.isPrime(247); // NOT PRIME.
		ps3.isPrime(248); // NOT PRIME.
		ps3.isPrime(249); // NOT PRIME.
		ps3.isPrime(250); // NOT PRIME.
		ps3.isPrime(251); // PRIME.
		ps3.isPrime(252); // NOT PRIME.
		ps3.isPrime(253); // NOT PRIME.
		ps3.isPrime(254); // NOT PRIME.
		ps3.isPrime(255); // NOT PRIME.
		ps3.isPrime(256); // NOT PRIME.
		ps3.isPrime(257); // PRIME.
		ps3.isPrime(258); // NOT PRIME.
		ps3.isPrime(259); // NOT PRIME.
		ps3.isPrime(260); // NOT PRIME.
		ps3.isPrime(261); // NOT PRIME.
		ps3.isPrime(262); // NOT PRIME.
		ps3.isPrime(263); // PRIME.
		ps3.isPrime(264); // NOT PRIME.
		ps3.isPrime(265); // NOT PRIME.
		ps3.isPrime(266); // NOT PRIME.
		ps3.isPrime(267); // NOT PRIME.
		ps3.isPrime(268); // NOT PRIME.
		ps3.isPrime(269); // PRIME.
		ps3.isPrime(270); // NOT PRIME.
		ps3.isPrime(271); // PRIME.
		ps3.isPrime(272); // NOT PRIME.
		ps3.isPrime(273); // NOT PRIME.
		ps3.isPrime(274); // NOT PRIME.
		ps3.isPrime(275); // NOT PRIME.
		ps3.isPrime(276); // NOT PRIME.
		ps3.isPrime(277); // PRIME.
		ps3.isPrime(278); // NOT PRIME.
		ps3.isPrime(279); // NOT PRIME.
		ps3.isPrime(280); // NOT PRIME.
		ps3.isPrime(281); // PRIME.
		ps3.isPrime(282); // NOT PRIME.
		ps3.isPrime(283); // PRIME.
		ps3.isPrime(284); // NOT PRIME.
		ps3.isPrime(285); // NOT PRIME.
		ps3.isPrime(286); // NOT PRIME.
		ps3.isPrime(287); // NOT PRIME.
		ps3.isPrime(288); // NOT PRIME.
		ps3.isPrime(289); // NOT PRIME.
		ps3.isPrime(290); // NOT PRIME.
		ps3.isPrime(291); // NOT PRIME.
		ps3.isPrime(292); // NOT PRIME.
		ps3.isPrime(293); // PRIME.
		ps3.isPrime(294); // NOT PRIME.
		ps3.isPrime(295); // NOT PRIME.
		ps3.isPrime(296); // NOT PRIME.
		ps3.isPrime(297); // NOT PRIME.
		ps3.isPrime(298); // NOT PRIME.
		ps3.isPrime(299); // NOT PRIME.
		ps3.isPrime(300); // NOT PRIME.
		ps3.isPrime(301); // NOT PRIME.
		ps3.isPrime(302); // NOT PRIME.
		ps3.isPrime(303); // NOT PRIME.
		ps3.isPrime(304); // NOT PRIME.
		ps3.isPrime(305); // NOT PRIME.
		ps3.isPrime(306); // NOT PRIME.
		ps3.isPrime(307); // PRIME.
		ps3.isPrime(308); // NOT PRIME.
		ps3.isPrime(309); // NOT PRIME.
		ps3.isPrime(310); // NOT PRIME.
		ps3.isPrime(311); // PRIME.
		ps3.isPrime(312); // NOT PRIME.
		ps3.isPrime(313); // PRIME.
		ps3.isPrime(314); // NOT PRIME.
		ps3.isPrime(315); // NOT PRIME.
		ps3.isPrime(316); // NOT PRIME.
		ps3.isPrime(317); // PRIME.
		ps3.isPrime(318); // NOT PRIME.
		ps3.isPrime(319); // NOT PRIME.
		ps3.isPrime(320); // NOT PRIME.
		ps3.isPrime(321); // NOT PRIME.
		ps3.isPrime(322); // NOT PRIME.
		ps3.isPrime(323); // NOT PRIME.
		ps3.isPrime(324); // NOT PRIME.
		ps3.isPrime(325); // NOT PRIME.
		ps3.isPrime(326); // NOT PRIME.
		ps3.isPrime(327); // NOT PRIME.
		ps3.isPrime(328); // NOT PRIME.
		ps3.isPrime(329); // NOT PRIME.
		ps3.isPrime(330); // NOT PRIME.
		ps3.isPrime(331); // PRIME.
		ps3.isPrime(332); // NOT PRIME.
		ps3.isPrime(333); // NOT PRIME.
		ps3.isPrime(334); // NOT PRIME.
		ps3.isPrime(335); // NOT PRIME.
		ps3.isPrime(336); // NOT PRIME.
		ps3.isPrime(337); // PRIME.
		ps3.isPrime(338); // NOT PRIME.
		ps3.isPrime(339); // NOT PRIME.
		ps3.isPrime(340); // NOT PRIME.
		ps3.isPrime(341); // NOT PRIME.
		ps3.isPrime(342); // NOT PRIME.
		ps3.isPrime(343); // NOT PRIME.
		ps3.isPrime(344); // NOT PRIME.
		ps3.isPrime(345); // NOT PRIME.
		ps3.isPrime(346); // NOT PRIME.
		ps3.isPrime(347); // PRIME.
		ps3.isPrime(348); // NOT PRIME.
		ps3.isPrime(349); // PRIME.
		ps3.isPrime(350); // NOT PRIME.
		ps3.isPrime(351); // NOT PRIME.
		ps3.isPrime(352); // NOT PRIME.
		ps3.isPrime(353); // PRIME.
		ps3.isPrime(354); // NOT PRIME.
		ps3.isPrime(355); // NOT PRIME.
		ps3.isPrime(356); // NOT PRIME.
		ps3.isPrime(357); // NOT PRIME.
		ps3.isPrime(358); // NOT PRIME.
		ps3.isPrime(359); // PRIME.
		ps3.isPrime(360); // NOT PRIME.
		ps3.isPrime(361); // NOT PRIME.
		ps3.isPrime(362); // NOT PRIME.
		ps3.isPrime(363); // NOT PRIME.
		ps3.isPrime(364); // NOT PRIME.
		ps3.isPrime(365); // NOT PRIME.
		ps3.isPrime(366); // NOT PRIME.
		ps3.isPrime(367); // PRIME.
		ps3.isPrime(368); // NOT PRIME.
		ps3.isPrime(369); // NOT PRIME.
		ps3.isPrime(370); // NOT PRIME.
		ps3.isPrime(371); // NOT PRIME.
		ps3.isPrime(372); // NOT PRIME.
		ps3.isPrime(373); // PRIME.
		ps3.isPrime(374); // NOT PRIME.
		ps3.isPrime(375); // NOT PRIME.
		ps3.isPrime(376); // NOT PRIME.
		ps3.isPrime(377); // NOT PRIME.
		ps3.isPrime(378); // NOT PRIME.
		ps3.isPrime(379); // PRIME.
		ps3.isPrime(380); // NOT PRIME.
		ps3.isPrime(381); // NOT PRIME.
		ps3.isPrime(382); // NOT PRIME.
		ps3.isPrime(383); // PRIME.
		ps3.isPrime(384); // NOT PRIME.
		ps3.isPrime(385); // NOT PRIME.
		ps3.isPrime(386); // NOT PRIME.
		ps3.isPrime(387); // NOT PRIME.
		ps3.isPrime(388); // NOT PRIME.
		ps3.isPrime(389); // PRIME.
		ps3.isPrime(390); // NOT PRIME.
		ps3.isPrime(391); // NOT PRIME.
		ps3.isPrime(392); // NOT PRIME.
		ps3.isPrime(393); // NOT PRIME.
		ps3.isPrime(394); // NOT PRIME.
		ps3.isPrime(395); // NOT PRIME.
		ps3.isPrime(396); // NOT PRIME.
		ps3.isPrime(397); // PRIME.
		ps3.isPrime(398); // NOT PRIME.
		ps3.isPrime(399); // NOT PRIME.
		ps3.isPrime(400); // NOT PRIME.
		ps3.isPrime(401); // PRIME.
		ps3.isPrime(402); // NOT PRIME.
		ps3.isPrime(403); // NOT PRIME.
		ps3.isPrime(404); // NOT PRIME.
		ps3.isPrime(405); // NOT PRIME.
		ps3.isPrime(406); // NOT PRIME.
		ps3.isPrime(407); // NOT PRIME.
		ps3.isPrime(408); // NOT PRIME.
		ps3.isPrime(409); // PRIME.
		ps3.isPrime(410); // NOT PRIME.
		ps3.isPrime(411); // NOT PRIME.
		ps3.isPrime(412); // NOT PRIME.
		ps3.isPrime(413); // NOT PRIME.
		ps3.isPrime(414); // NOT PRIME.
		ps3.isPrime(415); // NOT PRIME.
		ps3.isPrime(416); // NOT PRIME.
		ps3.isPrime(417); // NOT PRIME.
		ps3.isPrime(418); // NOT PRIME.
		ps3.isPrime(419); // PRIME.
		ps3.isPrime(420); // NOT PRIME.
		ps3.isPrime(421); // PRIME.
		ps3.isPrime(422); // NOT PRIME.
		ps3.isPrime(423); // NOT PRIME.
		ps3.isPrime(424); // NOT PRIME.
		ps3.isPrime(425); // NOT PRIME.
		ps3.isPrime(426); // NOT PRIME.
		ps3.isPrime(427); // NOT PRIME.
		ps3.isPrime(428); // NOT PRIME.
		ps3.isPrime(429); // NOT PRIME.
		ps3.isPrime(430); // NOT PRIME.
		ps3.isPrime(431); // PRIME.
		ps3.isPrime(432); // NOT PRIME.
		ps3.isPrime(433); // PRIME.
		ps3.isPrime(434); // NOT PRIME.
		ps3.isPrime(435); // NOT PRIME.
		ps3.isPrime(436); // NOT PRIME.
		ps3.isPrime(437); // NOT PRIME.
		ps3.isPrime(438); // NOT PRIME.
		ps3.isPrime(439); // PRIME.
		ps3.isPrime(440); // NOT PRIME.
		ps3.isPrime(441); // NOT PRIME.
		ps3.isPrime(442); // NOT PRIME.
		ps3.isPrime(443); // PRIME.
		ps3.isPrime(444); // NOT PRIME.
		ps3.isPrime(445); // NOT PRIME.
		ps3.isPrime(446); // NOT PRIME.
		ps3.isPrime(447); // NOT PRIME.
		ps3.isPrime(448); // NOT PRIME.
		ps3.isPrime(449); // PRIME.
		ps3.isPrime(450); // NOT PRIME.
		ps3.isPrime(451); // NOT PRIME.
		ps3.isPrime(452); // NOT PRIME.
		ps3.isPrime(453); // NOT PRIME.
		ps3.isPrime(454); // NOT PRIME.
		ps3.isPrime(455); // NOT PRIME.
		ps3.isPrime(456); // NOT PRIME.
		ps3.isPrime(457); // PRIME.
		ps3.isPrime(458); // NOT PRIME.
		ps3.isPrime(459); // NOT PRIME.
		ps3.isPrime(460); // NOT PRIME.
		ps3.isPrime(461); // PRIME.
		ps3.isPrime(462); // NOT PRIME.
		ps3.isPrime(463); // PRIME.
		ps3.isPrime(464); // NOT PRIME.
		ps3.isPrime(465); // NOT PRIME.
		ps3.isPrime(466); // NOT PRIME.
		ps3.isPrime(467); // PRIME.
		ps3.isPrime(468); // NOT PRIME.
		ps3.isPrime(469); // NOT PRIME.
		ps3.isPrime(470); // NOT PRIME.
		ps3.isPrime(471); // NOT PRIME.
		ps3.isPrime(472); // NOT PRIME.
		ps3.isPrime(473); // NOT PRIME.
		ps3.isPrime(474); // NOT PRIME.
		ps3.isPrime(475); // NOT PRIME.
		ps3.isPrime(476); // NOT PRIME.
		ps3.isPrime(477); // NOT PRIME.
		ps3.isPrime(478); // NOT PRIME.
		ps3.isPrime(479); // PRIME.
		ps3.isPrime(480); // NOT PRIME.
		ps3.isPrime(481); // NOT PRIME.
		ps3.isPrime(482); // NOT PRIME.
		ps3.isPrime(483); // NOT PRIME.
		ps3.isPrime(484); // NOT PRIME.
		ps3.isPrime(485); // NOT PRIME.
		ps3.isPrime(486); // NOT PRIME.
		ps3.isPrime(487); // PRIME.
		ps3.isPrime(488); // NOT PRIME.
		ps3.isPrime(489); // NOT PRIME.
		ps3.isPrime(490); // NOT PRIME.
		ps3.isPrime(491); // PRIME.
		ps3.isPrime(492); // NOT PRIME.
		ps3.isPrime(493); // NOT PRIME.
		ps3.isPrime(494); // NOT PRIME.
		ps3.isPrime(495); // NOT PRIME.
		ps3.isPrime(496); // NOT PRIME.
		ps3.isPrime(497); // NOT PRIME.
		ps3.isPrime(498); // NOT PRIME.
		ps3.isPrime(499); // PRIME.
		ps3.isPrime(500); // NOT PRIME.
		ps3.isPrime(501); // NOT PRIME.
		ps3.isPrime(502); // NOT PRIME.
		ps3.isPrime(503); // PRIME.
		ps3.isPrime(504); // NOT PRIME.
		ps3.isPrime(505); // NOT PRIME.
		ps3.isPrime(506); // NOT PRIME.
		ps3.isPrime(507); // NOT PRIME.
		ps3.isPrime(508); // NOT PRIME.
		ps3.isPrime(509); // PRIME.
		ps3.isPrime(510); // NOT PRIME.
		ps3.isPrime(511); // NOT PRIME.
		ps3.isPrime(512); // NOT PRIME.
		ps3.isPrime(513); // NOT PRIME.
		ps3.isPrime(514); // NOT PRIME.
		ps3.isPrime(515); // NOT PRIME.
		ps3.isPrime(516); // NOT PRIME.
		ps3.isPrime(517); // NOT PRIME.
		ps3.isPrime(518); // NOT PRIME.
		ps3.isPrime(519); // NOT PRIME.
		ps3.isPrime(520); // NOT PRIME.
		ps3.isPrime(521); // PRIME.
		ps3.isPrime(522); // NOT PRIME.
		ps3.isPrime(523); // PRIME.
		ps3.isPrime(524); // NOT PRIME.
		ps3.isPrime(525); // NOT PRIME.
		ps3.isPrime(526); // NOT PRIME.
		ps3.isPrime(527); // NOT PRIME.
		ps3.isPrime(528); // NOT PRIME.
		ps3.isPrime(529); // NOT PRIME.
		ps3.isPrime(530); // NOT PRIME.
		ps3.isPrime(531); // NOT PRIME.
		ps3.isPrime(532); // NOT PRIME.
		ps3.isPrime(533); // NOT PRIME.
		ps3.isPrime(534); // NOT PRIME.
		ps3.isPrime(535); // NOT PRIME.
		ps3.isPrime(536); // NOT PRIME.
		ps3.isPrime(537); // NOT PRIME.
		ps3.isPrime(538); // NOT PRIME.
		ps3.isPrime(539); // NOT PRIME.
		ps3.isPrime(540); // NOT PRIME.
		ps3.isPrime(541); // PRIME.
		ps3.isPrime(542); // NOT PRIME.
		ps3.isPrime(543); // NOT PRIME.
		ps3.isPrime(544); // NOT PRIME.
		ps3.isPrime(545); // NOT PRIME.
		ps3.isPrime(546); // NOT PRIME.
		ps3.isPrime(547); // PRIME.
		ps3.isPrime(548); // NOT PRIME.
		ps3.isPrime(549); // NOT PRIME.
		ps3.isPrime(550); // NOT PRIME.
		ps3.isPrime(551); // NOT PRIME.
		ps3.isPrime(552); // NOT PRIME.
		ps3.isPrime(553); // NOT PRIME.
		ps3.isPrime(554); // NOT PRIME.
		ps3.isPrime(555); // NOT PRIME.
		ps3.isPrime(556); // NOT PRIME.
		ps3.isPrime(557); // PRIME.
		ps3.isPrime(558); // NOT PRIME.
		ps3.isPrime(559); // NOT PRIME.
		ps3.isPrime(560); // NOT PRIME.
		ps3.isPrime(561); // NOT PRIME.
		ps3.isPrime(562); // NOT PRIME.
		ps3.isPrime(563); // PRIME.
		ps3.isPrime(564); // NOT PRIME.
		ps3.isPrime(565); // NOT PRIME.
		ps3.isPrime(566); // NOT PRIME.
		ps3.isPrime(567); // NOT PRIME.
		ps3.isPrime(568); // NOT PRIME.
		ps3.isPrime(569); // PRIME.
		ps3.isPrime(570); // NOT PRIME.
		ps3.isPrime(571); // PRIME.
		ps3.isPrime(572); // NOT PRIME.
		ps3.isPrime(573); // NOT PRIME.
		ps3.isPrime(574); // NOT PRIME.
		ps3.isPrime(575); // NOT PRIME.
		ps3.isPrime(576); // NOT PRIME.
		ps3.isPrime(577); // PRIME.
		ps3.isPrime(578); // NOT PRIME.
		ps3.isPrime(579); // NOT PRIME.
		ps3.isPrime(580); // NOT PRIME.
		ps3.isPrime(581); // NOT PRIME.
		ps3.isPrime(582); // NOT PRIME.
		ps3.isPrime(583); // NOT PRIME.
		ps3.isPrime(584); // NOT PRIME.
		ps3.isPrime(585); // NOT PRIME.
		ps3.isPrime(586); // NOT PRIME.
		ps3.isPrime(587); // PRIME.
		ps3.isPrime(588); // NOT PRIME.
		ps3.isPrime(589); // NOT PRIME.
		ps3.isPrime(590); // NOT PRIME.
		ps3.isPrime(591); // NOT PRIME.
		ps3.isPrime(592); // NOT PRIME.
		ps3.isPrime(593); // PRIME.
		ps3.isPrime(594); // NOT PRIME.
		ps3.isPrime(595); // NOT PRIME.
		ps3.isPrime(596); // NOT PRIME.
		ps3.isPrime(597); // NOT PRIME.
		ps3.isPrime(598); // NOT PRIME.
		ps3.isPrime(599); // PRIME.
		ps3.isPrime(600); // NOT PRIME.
		ps3.isPrime(601); // PRIME.
		ps3.isPrime(602); // NOT PRIME.
		ps3.isPrime(603); // NOT PRIME.
		ps3.isPrime(604); // NOT PRIME.
		ps3.isPrime(605); // NOT PRIME.
		ps3.isPrime(606); // NOT PRIME.
		ps3.isPrime(607); // PRIME.
		ps3.isPrime(608); // NOT PRIME.
		ps3.isPrime(609); // NOT PRIME.
		ps3.isPrime(610); // NOT PRIME.
		ps3.isPrime(611); // NOT PRIME.
		ps3.isPrime(612); // NOT PRIME.
		ps3.isPrime(613); // PRIME.
		ps3.isPrime(614); // NOT PRIME.
		ps3.isPrime(615); // NOT PRIME.
		ps3.isPrime(616); // NOT PRIME.
		ps3.isPrime(617); // PRIME.
		ps3.isPrime(618); // NOT PRIME.
		ps3.isPrime(619); // PRIME.
		ps3.isPrime(620); // NOT PRIME.
		ps3.isPrime(621); // NOT PRIME.
		ps3.isPrime(622); // NOT PRIME.
		ps3.isPrime(623); // NOT PRIME.
		ps3.isPrime(624); // NOT PRIME.
		ps3.isPrime(625); // NOT PRIME.
		ps3.isPrime(626); // NOT PRIME.
		ps3.isPrime(627); // NOT PRIME.
		ps3.isPrime(628); // NOT PRIME.
		ps3.isPrime(629); // NOT PRIME.
		ps3.isPrime(630); // NOT PRIME.
		ps3.isPrime(631); // PRIME.
		ps3.isPrime(632); // NOT PRIME.
		ps3.isPrime(633); // NOT PRIME.
		ps3.isPrime(634); // NOT PRIME.
		ps3.isPrime(635); // NOT PRIME.
		ps3.isPrime(636); // NOT PRIME.
		ps3.isPrime(637); // NOT PRIME.
		ps3.isPrime(638); // NOT PRIME.
		ps3.isPrime(639); // NOT PRIME.
		ps3.isPrime(640); // NOT PRIME.
		ps3.isPrime(641); // PRIME.
		ps3.isPrime(642); // NOT PRIME.
		ps3.isPrime(643); // PRIME.
		ps3.isPrime(644); // NOT PRIME.
		ps3.isPrime(645); // NOT PRIME.
		ps3.isPrime(646); // NOT PRIME.
		ps3.isPrime(647); // PRIME.
		ps3.isPrime(648); // NOT PRIME.
		ps3.isPrime(649); // NOT PRIME.
		ps3.isPrime(650); // NOT PRIME.
		ps3.isPrime(651); // NOT PRIME.
		ps3.isPrime(652); // NOT PRIME.
		ps3.isPrime(653); // PRIME.
		ps3.isPrime(654); // NOT PRIME.
		ps3.isPrime(655); // NOT PRIME.
		ps3.isPrime(656); // NOT PRIME.
		ps3.isPrime(657); // NOT PRIME.
		ps3.isPrime(658); // NOT PRIME.
		ps3.isPrime(659); // PRIME.
		ps3.isPrime(660); // NOT PRIME.
		ps3.isPrime(661); // PRIME.
		ps3.isPrime(662); // NOT PRIME.
		ps3.isPrime(663); // NOT PRIME.
		ps3.isPrime(664); // NOT PRIME.
		ps3.isPrime(665); // NOT PRIME.
		ps3.isPrime(666); // NOT PRIME.
		ps3.isPrime(667); // NOT PRIME.
		ps3.isPrime(668); // NOT PRIME.
		ps3.isPrime(669); // NOT PRIME.
		ps3.isPrime(670); // NOT PRIME.
		ps3.isPrime(671); // NOT PRIME.
		ps3.isPrime(672); // NOT PRIME.
		ps3.isPrime(673); // PRIME.
		ps3.isPrime(674); // NOT PRIME.
		ps3.isPrime(675); // NOT PRIME.
		ps3.isPrime(676); // NOT PRIME.
		ps3.isPrime(677); // PRIME.
		ps3.isPrime(678); // NOT PRIME.
		ps3.isPrime(679); // NOT PRIME.
		ps3.isPrime(680); // NOT PRIME.
		ps3.isPrime(681); // NOT PRIME.
		ps3.isPrime(682); // NOT PRIME.
		ps3.isPrime(683); // PRIME.
		ps3.isPrime(684); // NOT PRIME.
		ps3.isPrime(685); // NOT PRIME.
		ps3.isPrime(686); // NOT PRIME.
		ps3.isPrime(687); // NOT PRIME.
		ps3.isPrime(688); // NOT PRIME.
		ps3.isPrime(689); // NOT PRIME.
		ps3.isPrime(690); // NOT PRIME.
		ps3.isPrime(691); // PRIME.
		ps3.isPrime(692); // NOT PRIME.
		ps3.isPrime(693); // NOT PRIME.
		ps3.isPrime(694); // NOT PRIME.
		ps3.isPrime(695); // NOT PRIME.
		ps3.isPrime(696); // NOT PRIME.
		ps3.isPrime(697); // NOT PRIME.
		ps3.isPrime(698); // NOT PRIME.
		ps3.isPrime(699); // NOT PRIME.
		ps3.isPrime(700); // NOT PRIME.
		ps3.isPrime(701); // PRIME.
		ps3.isPrime(702); // NOT PRIME.
		ps3.isPrime(703); // NOT PRIME.
		ps3.isPrime(704); // NOT PRIME.
		ps3.isPrime(705); // NOT PRIME.
		ps3.isPrime(706); // NOT PRIME.
		ps3.isPrime(707); // NOT PRIME.
		ps3.isPrime(708); // NOT PRIME.
		ps3.isPrime(709); // PRIME.
		ps3.isPrime(710); // NOT PRIME.
		ps3.isPrime(711); // NOT PRIME.
		ps3.isPrime(712); // NOT PRIME.
		ps3.isPrime(713); // NOT PRIME.
		ps3.isPrime(714); // NOT PRIME.
		ps3.isPrime(715); // NOT PRIME.
		ps3.isPrime(716); // NOT PRIME.
		ps3.isPrime(717); // NOT PRIME.
		ps3.isPrime(718); // NOT PRIME.
		ps3.isPrime(719); // PRIME.
		ps3.isPrime(720); // NOT PRIME.
		ps3.isPrime(721); // NOT PRIME.
		ps3.isPrime(722); // NOT PRIME.
		ps3.isPrime(723); // NOT PRIME.
		ps3.isPrime(724); // NOT PRIME.
		ps3.isPrime(725); // NOT PRIME.
		ps3.isPrime(726); // NOT PRIME.
		ps3.isPrime(727); // PRIME.
		ps3.isPrime(728); // NOT PRIME.
		ps3.isPrime(729); // NOT PRIME.
		ps3.isPrime(730); // NOT PRIME.
		ps3.isPrime(731); // NOT PRIME.
		ps3.isPrime(732); // NOT PRIME.
		ps3.isPrime(733); // PRIME.
		ps3.isPrime(734); // NOT PRIME.
		ps3.isPrime(735); // NOT PRIME.
		ps3.isPrime(736); // NOT PRIME.
		ps3.isPrime(737); // NOT PRIME.
		ps3.isPrime(738); // NOT PRIME.
		ps3.isPrime(739); // PRIME.
		ps3.isPrime(740); // NOT PRIME.
		ps3.isPrime(741); // NOT PRIME.
		ps3.isPrime(742); // NOT PRIME.
		ps3.isPrime(743); // PRIME.
		ps3.isPrime(744); // NOT PRIME.
		ps3.isPrime(745); // NOT PRIME.
		ps3.isPrime(746); // NOT PRIME.
		ps3.isPrime(747); // NOT PRIME.
		ps3.isPrime(748); // NOT PRIME.
		ps3.isPrime(749); // NOT PRIME.
		ps3.isPrime(750); // NOT PRIME.
		ps3.isPrime(751); // PRIME.
		ps3.isPrime(752); // NOT PRIME.
		ps3.isPrime(753); // NOT PRIME.
		ps3.isPrime(754); // NOT PRIME.
		ps3.isPrime(755); // NOT PRIME.
		ps3.isPrime(756); // NOT PRIME.
		ps3.isPrime(757); // PRIME.
		ps3.isPrime(758); // NOT PRIME.
		ps3.isPrime(759); // NOT PRIME.
		ps3.isPrime(760); // NOT PRIME.
		ps3.isPrime(761); // PRIME.
		ps3.isPrime(762); // NOT PRIME.
		ps3.isPrime(763); // NOT PRIME.
		ps3.isPrime(764); // NOT PRIME.
		ps3.isPrime(765); // NOT PRIME.
		ps3.isPrime(766); // NOT PRIME.
		ps3.isPrime(767); // NOT PRIME.
		ps3.isPrime(768); // NOT PRIME.
		ps3.isPrime(769); // PRIME.
		ps3.isPrime(770); // NOT PRIME.
		ps3.isPrime(771); // NOT PRIME.
		ps3.isPrime(772); // NOT PRIME.
		ps3.isPrime(773); // PRIME.
		ps3.isPrime(774); // NOT PRIME.
		ps3.isPrime(775); // NOT PRIME.
		ps3.isPrime(776); // NOT PRIME.
		ps3.isPrime(777); // NOT PRIME.
		ps3.isPrime(778); // NOT PRIME.
		ps3.isPrime(779); // NOT PRIME.
		ps3.isPrime(780); // NOT PRIME.
		ps3.isPrime(781); // NOT PRIME.
		ps3.isPrime(782); // NOT PRIME.
		ps3.isPrime(783); // NOT PRIME.
		ps3.isPrime(784); // NOT PRIME.
		ps3.isPrime(785); // NOT PRIME.
		ps3.isPrime(786); // NOT PRIME.
		ps3.isPrime(787); // PRIME.
		ps3.isPrime(788); // NOT PRIME.
		ps3.isPrime(789); // NOT PRIME.
		ps3.isPrime(790); // NOT PRIME.
		ps3.isPrime(791); // NOT PRIME.
		ps3.isPrime(792); // NOT PRIME.
		ps3.isPrime(793); // NOT PRIME.
		ps3.isPrime(794); // NOT PRIME.
		ps3.isPrime(795); // NOT PRIME.
		ps3.isPrime(796); // NOT PRIME.
		ps3.isPrime(797); // PRIME.
		ps3.isPrime(798); // NOT PRIME.
		ps3.isPrime(799); // NOT PRIME.
		ps3.isPrime(800); // NOT PRIME.
		ps3.isPrime(801); // NOT PRIME.
		ps3.isPrime(802); // NOT PRIME.
		ps3.isPrime(803); // NOT PRIME.
		ps3.isPrime(804); // NOT PRIME.
		ps3.isPrime(805); // NOT PRIME.
		ps3.isPrime(806); // NOT PRIME.
		ps3.isPrime(807); // NOT PRIME.
		ps3.isPrime(808); // NOT PRIME.
		ps3.isPrime(809); // PRIME.
		ps3.isPrime(810); // NOT PRIME.
		ps3.isPrime(811); // PRIME.
		ps3.isPrime(812); // NOT PRIME.
		ps3.isPrime(813); // NOT PRIME.
		ps3.isPrime(814); // NOT PRIME.
		ps3.isPrime(815); // NOT PRIME.
		ps3.isPrime(816); // NOT PRIME.
		ps3.isPrime(817); // NOT PRIME.
		ps3.isPrime(818); // NOT PRIME.
		ps3.isPrime(819); // NOT PRIME.
		ps3.isPrime(820); // NOT PRIME.
		ps3.isPrime(821); // PRIME.
		ps3.isPrime(822); // NOT PRIME.
		ps3.isPrime(823); // PRIME.
		ps3.isPrime(824); // NOT PRIME.
		ps3.isPrime(825); // NOT PRIME.
		ps3.isPrime(826); // NOT PRIME.
		ps3.isPrime(827); // PRIME.
		ps3.isPrime(828); // NOT PRIME.
		ps3.isPrime(829); // PRIME.
		ps3.isPrime(830); // NOT PRIME.
		ps3.isPrime(831); // NOT PRIME.
		ps3.isPrime(832); // NOT PRIME.
		ps3.isPrime(833); // NOT PRIME.
		ps3.isPrime(834); // NOT PRIME.
		ps3.isPrime(835); // NOT PRIME.
		ps3.isPrime(836); // NOT PRIME.
		ps3.isPrime(837); // NOT PRIME.
		ps3.isPrime(838); // NOT PRIME.
		ps3.isPrime(839); // PRIME.
		ps3.isPrime(840); // NOT PRIME.
		ps3.isPrime(841); // NOT PRIME.
		ps3.isPrime(842); // NOT PRIME.
		ps3.isPrime(843); // NOT PRIME.
		ps3.isPrime(844); // NOT PRIME.
		ps3.isPrime(845); // NOT PRIME.
		ps3.isPrime(846); // NOT PRIME.
		ps3.isPrime(847); // NOT PRIME.
		ps3.isPrime(848); // NOT PRIME.
		ps3.isPrime(849); // NOT PRIME.
		ps3.isPrime(850); // NOT PRIME.
		ps3.isPrime(851); // NOT PRIME.
		ps3.isPrime(852); // NOT PRIME.
		ps3.isPrime(853); // PRIME.
		ps3.isPrime(854); // NOT PRIME.
		ps3.isPrime(855); // NOT PRIME.
		ps3.isPrime(856); // NOT PRIME.
		ps3.isPrime(857); // PRIME.
		ps3.isPrime(858); // NOT PRIME.
		ps3.isPrime(859); // PRIME.
		ps3.isPrime(860); // NOT PRIME.
		ps3.isPrime(861); // NOT PRIME.
		ps3.isPrime(862); // NOT PRIME.
		ps3.isPrime(863); // PRIME.
		ps3.isPrime(864); // NOT PRIME.
		ps3.isPrime(865); // NOT PRIME.
		ps3.isPrime(866); // NOT PRIME.
		ps3.isPrime(867); // NOT PRIME.
		ps3.isPrime(868); // NOT PRIME.
		ps3.isPrime(869); // NOT PRIME.
		ps3.isPrime(870); // NOT PRIME.
		ps3.isPrime(871); // NOT PRIME.
		ps3.isPrime(872); // NOT PRIME.
		ps3.isPrime(873); // NOT PRIME.
		ps3.isPrime(874); // NOT PRIME.
		ps3.isPrime(875); // NOT PRIME.
		ps3.isPrime(876); // NOT PRIME.
		ps3.isPrime(877); // PRIME.
		ps3.isPrime(878); // NOT PRIME.
		ps3.isPrime(879); // NOT PRIME.
		ps3.isPrime(880); // NOT PRIME.
		ps3.isPrime(881); // PRIME.
		ps3.isPrime(882); // NOT PRIME.
		ps3.isPrime(883); // PRIME.
		ps3.isPrime(884); // NOT PRIME.
		ps3.isPrime(885); // NOT PRIME.
		ps3.isPrime(886); // NOT PRIME.
		ps3.isPrime(887); // PRIME.
		ps3.isPrime(888); // NOT PRIME.
		ps3.isPrime(889); // NOT PRIME.
		ps3.isPrime(890); // NOT PRIME.
		ps3.isPrime(891); // NOT PRIME.
		ps3.isPrime(892); // NOT PRIME.
		ps3.isPrime(893); // NOT PRIME.
		ps3.isPrime(894); // NOT PRIME.
		ps3.isPrime(895); // NOT PRIME.
		ps3.isPrime(896); // NOT PRIME.
		ps3.isPrime(897); // NOT PRIME.
		ps3.isPrime(898); // NOT PRIME.
		ps3.isPrime(899); // NOT PRIME.
		ps3.isPrime(900); // NOT PRIME.
		ps3.isPrime(901); // NOT PRIME.
		ps3.isPrime(902); // NOT PRIME.
		ps3.isPrime(903); // NOT PRIME.
		ps3.isPrime(904); // NOT PRIME.
		ps3.isPrime(905); // NOT PRIME.
		ps3.isPrime(906); // NOT PRIME.
		ps3.isPrime(907); // PRIME.
		ps3.isPrime(908); // NOT PRIME.
		ps3.isPrime(909); // NOT PRIME.
		ps3.isPrime(910); // NOT PRIME.
		ps3.isPrime(911); // PRIME.
		ps3.isPrime(912); // NOT PRIME.
		ps3.isPrime(913); // NOT PRIME.
		ps3.isPrime(914); // NOT PRIME.
		ps3.isPrime(915); // NOT PRIME.
		ps3.isPrime(916); // NOT PRIME.
		ps3.isPrime(917); // NOT PRIME.
		ps3.isPrime(918); // NOT PRIME.
		ps3.isPrime(919); // PRIME.
		ps3.isPrime(920); // NOT PRIME.
		ps3.isPrime(921); // NOT PRIME.
		ps3.isPrime(922); // NOT PRIME.
		ps3.isPrime(923); // NOT PRIME.
		ps3.isPrime(924); // NOT PRIME.
		ps3.isPrime(925); // NOT PRIME.
		ps3.isPrime(926); // NOT PRIME.
		ps3.isPrime(927); // NOT PRIME.
		ps3.isPrime(928); // NOT PRIME.
		ps3.isPrime(929); // PRIME.
		ps3.isPrime(930); // NOT PRIME.
		ps3.isPrime(931); // NOT PRIME.
		ps3.isPrime(932); // NOT PRIME.
		ps3.isPrime(933); // NOT PRIME.
		ps3.isPrime(934); // NOT PRIME.
		ps3.isPrime(935); // NOT PRIME.
		ps3.isPrime(936); // NOT PRIME.
		ps3.isPrime(937); // PRIME.
		ps3.isPrime(938); // NOT PRIME.
		ps3.isPrime(939); // NOT PRIME.
		ps3.isPrime(940); // NOT PRIME.
		ps3.isPrime(941); // PRIME.
		ps3.isPrime(942); // NOT PRIME.
		ps3.isPrime(943); // NOT PRIME.
		ps3.isPrime(944); // NOT PRIME.
		ps3.isPrime(945); // NOT PRIME.
		ps3.isPrime(946); // NOT PRIME.
		ps3.isPrime(947); // PRIME.
		ps3.isPrime(948); // NOT PRIME.
		ps3.isPrime(949); // NOT PRIME.
		ps3.isPrime(950); // NOT PRIME.
		ps3.isPrime(951); // NOT PRIME.
		ps3.isPrime(952); // NOT PRIME.
		ps3.isPrime(953); // PRIME.
		ps3.isPrime(954); // NOT PRIME.
		ps3.isPrime(955); // NOT PRIME.
		ps3.isPrime(956); // NOT PRIME.
		ps3.isPrime(957); // NOT PRIME.
		ps3.isPrime(958); // NOT PRIME.
		ps3.isPrime(959); // NOT PRIME.
		ps3.isPrime(960); // NOT PRIME.
		ps3.isPrime(961); // NOT PRIME.
		ps3.isPrime(962); // NOT PRIME.
		ps3.isPrime(963); // NOT PRIME.
		ps3.isPrime(964); // NOT PRIME.
		ps3.isPrime(965); // NOT PRIME.
		ps3.isPrime(966); // NOT PRIME.
		ps3.isPrime(967); // PRIME.
		ps3.isPrime(968); // NOT PRIME.
		ps3.isPrime(969); // NOT PRIME.
		ps3.isPrime(970); // NOT PRIME.
		ps3.isPrime(971); // PRIME.
		ps3.isPrime(972); // NOT PRIME.
		ps3.isPrime(973); // NOT PRIME.
		ps3.isPrime(974); // NOT PRIME.
		ps3.isPrime(975); // NOT PRIME.
		ps3.isPrime(976); // NOT PRIME.
		ps3.isPrime(977); // PRIME.
		ps3.isPrime(978); // NOT PRIME.
		ps3.isPrime(979); // NOT PRIME.
		ps3.isPrime(980); // NOT PRIME.
		ps3.isPrime(981); // NOT PRIME.
		ps3.isPrime(982); // NOT PRIME.
		ps3.isPrime(983); // PRIME.
		ps3.isPrime(984); // NOT PRIME.
		ps3.isPrime(985); // NOT PRIME.
		ps3.isPrime(986); // NOT PRIME.
		ps3.isPrime(987); // NOT PRIME.
		ps3.isPrime(988); // NOT PRIME.
		ps3.isPrime(989); // NOT PRIME.
		ps3.isPrime(990); // NOT PRIME.
		ps3.isPrime(991); // PRIME.
		ps3.isPrime(992); // NOT PRIME.
		ps3.isPrime(993); // NOT PRIME.
		ps3.isPrime(994); // NOT PRIME.
		ps3.isPrime(995); // NOT PRIME.
		ps3.isPrime(996); // NOT PRIME.
		ps3.isPrime(997); // PRIME.
		ps3.isPrime(998); // NOT PRIME.
		ps3.isPrime(999); // NOT PRIME.
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
			System.out.println("NO.");
		} else if(you >= 8 || date >= 8) {
			System.out.println("YES.");
		} else {
			System.out.println("MAYBE.");
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
		if (str.startsWith("f") && !str.endsWith("b")) {
			System.out.println("FIZZ");
		} else if(str.endsWith("b") && !str.startsWith("f")) {
			System.out.println("BUZZ");
		} else if(str.startsWith("f") && str.endsWith("b")) {
			System.out.println("FIZZBUZZ");
		} else {
			System.out.println(str);
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
		if (big >= goal / 5) {
            big -= goal / 5;
            goal %= 5;
        }
        else {
            goal -= big * 5;
        }
        if (small >= goal) {
            System.out.println("YES.");
        }
        else {
            System.out.println("NO.");
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
		long fact = 1;
		for(int i = 1;i<=n;i++) {
			fact=fact*i;
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
		long fact = 1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println(n + "! = " + fact);
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
		if (n == 0 || n == 1) {
			check = false;
		}
		
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) { 
				check = true;
			}
		}

		if(!check && n >= 2) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}
	}
}

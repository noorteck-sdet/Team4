package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HWDemo {

	// Instruction: Each team member pushes at least once by adding 1 method
	// Practice Cloning, Pulling, Pushing, Stashing

	
	public static void main(String[] args) {
		System.out.println("Hello from Yasmine to Team 4...at 9:30PM");

		// test for listDouble() Ivan
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(6);
		list1.add(8);
		list1.add(6);
		list1.add(8);
		list1.add(-1);
		System.out.println(listDouble(list1));

		String s1 = "abc hi ho";
		String s2 = "ABChi hi";

		HWDemo obj = new HWDemo();
		int r1 = obj.countHi(s1);
		int r2 = obj.countHi(s2);

		System.out.println(s1 + " = " + r1);
		System.out.println(s2 + " = " + r2);

		System.out.println(" I like the group discusion");
		// let make fun of it

		int r3 = obj.factorial(5);
		System.out.println("factoral (5)= " + r3);
		// Ivan 1/7 5pm
		ListIterator<Integer> iterator = list1.listIterator();

		while (iterator.hasNext()) {
			Integer currentEl = iterator.next();
			Integer newEl = currentEl * 2;

			iterator.set(newEl);
			
		}
		
		System.out.println(list1);

	}

	public void print() {
		System.out.println("This is Sinan");

		// Good job Team4
		// Good morning Team4 1/7/2024
	}


	//new method from Mebrat....at 11:54AM
	public void practice() {

		System.out.println("Team4 is  practicing the clon, push, pull, stash");
	}

	//another method from Mebrat at 4:12pm..
	public String weekDays(String name) {
		name = "saturday";
		return name;
	}

	// this method is from Mebrat..Sunday at 2:02pm
	public void city() {
		System.out.println("columbus....");
	}

	// method from MEbrat at 8:30pm.....
	public void WhichMonth() {
		System.out.println("January...");
	}

	public void abcd() {
		System.out.println(" YHB ... at 2:45PM");
	}

	public static ArrayList<String> studentsName() {
		ArrayList<String> studentName = new ArrayList<>();
		studentName.add("Ivan Samoilenko");
		studentName.add("Yasmine");
		studentName.add("Sinan");
		studentName.add("Mebrat");
		studentName.add("Jeremy");
		// add yourself to the list

		return studentName;
	}

	// another method from YHB at 10:15AM
	public void print2() {
		System.out.println("YHB...");
	}

	// Practice pushing process .. YHB

	// math() from Ivan 11:30
	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int c, int d) {
		return c - d;
	}

	// Good afternoon GitHub

	// Dear Team I will add a question from codingbat.com to work on together
	// this is from Functional-1 > doubling .. Yasmine

	/*
	 * //this is the question--> Yasmine Given a list of integers, return a list
	 * where each integer is multiplied by 2.
	 * 
	 * doubling([1, 2, 3]) → [2, 4, 6] doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16,
	 * -2] doubling([]) → []
	 * 
	 */

	// You can choose your question and add your solution and label it with your
	// name YHB

	public static List<Integer> doubling(List<Integer> nums) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {

			int n = nums.get(i);
			list.add(n * 2);
		}
		System.out.println("Yasmine @ 3:00PM");
		return list;
	}

	/*
	 * Yasmine @ 9:35PM String-2 > countHi Return the number of times that the
	 * string "hi" appears anywhere in the given string. countHi("abc hi ho") → 1
	 * countHi("ABChi hi") → 2 countHi("hihi") → 2
	 * 
	 */
	public int countHi(String str) {

		int result = 0;

		for (int i = 0; i < str.length() - 1; i++) {

			char s = str.charAt(i);
			String c = "";
			c += s;

			char s2 = str.charAt(i + 1);
			String c2 = "";
			c2 += s2;
			if (c.equals("h") && c2.equals("i")) {
				result++;

			}

		}
		return result;
	}

	// Adding code from codingBat

	/**
	 * Given an array of ints, return the number of 9's in the array.
	 * 
	 * 
	 * 
	 * arrayCount9([1, 2, 9]) → 1 arrayCount9([1, 9, 9]) → 2 arrayCount9([1, 9, 9,
	 * 3, 9]) → 3
	 */
	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;
	}

	public HWDemo() {
		// hello this is Cristian
		// Time is 6am PT
	}

	/*
	 * public static void main(String args []) {
	 * 
	 * // call the isNumEqual () isNumEqual (5, 10); isNumEqual (255, -888);
	 * isNumEqual (765, 123); isNumEqual (22, 999); }
	 */

	public static void isNumEqual(int n1, int n2) {

		if (n1 == n2) {
			System.out.println("EQUALS");
		} else {
			System.out.println("NOT EQUALS");
		}
	}

	// Lana //
	public void add1(int n3, int n4) {
		System.out.println(n3 + n4);
	}

	/*
	 * Given a list of integers, return a list where each integer is multiplied by
	 * 2.
	 * 
	 * doubling([1, 2, 3]) → [2, 4, 6] doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16,
	 * -2] doubling([]) → []
	 * 
	 */

	// Ivan 1/7/2024
	public static List<Integer> listDouble(List<Integer> list) {

		List<Integer> doubledList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			doubledList.add(list.get(i) * 2);
		}

		return doubledList;
	}

	// removed String from ----> public void String HomeWork(String HW)
	// added String to the variable homeWork ----> HomeWork=HW;
	// printed the variable homeWork ---> System.out.println(HW);
	// added close curley bracket

	public void homeWork(String hW) {
		String homeWork = hW;
		System.out.println(homeWork);
	}

	// Recursion - 1 > factorial
	/*
	 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2)
	 * ... 1. Compute the result recursively (without loops).
	 * 
	 * factorial(1) → 1 factorial(2) → 2 factorial(3) → 6
	 */
	public int factorial(int n) {

		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
		//normal country of array
	 //ahmed test 
		
		
		
	}
		
}

package hw;

import java.util.ArrayList;
import java.util.List;

public class HWDemo {
	
	public void print() {
		System.out.println("This is Sinan");
		
		// Good job Team4
	}

//}
//new method from Mebrat....at 11:54AM
	public void practice() {

		System.out.println("Team4 is  practicing the clon, push, pull, stash");
	}

//another method from Mebrat at 4:12pm..
	public String weekDays(String name) {
		name = "saturday";
		return name;
	}
	//method from MEbrat at 8:30pm.....
	public void WhichMonth() {
		System.out.println("January...");
	}
	//Instruction: Each team member pushes at least once by adding 1 method
	//Practice Cloning, Pulling, Pushing, Stashing
	

	
	public static void main(String[] args) {
		System.out.println("Hello from Yasmine to Team 4...at 9:30PM");

	}
	
	public void abcd() {
		System.out.println(" YHB ... at 2:45PM");
	}
	
	public static ArrayList<String> studentsName(){
		ArrayList<String> studentName = new ArrayList<>();
		studentName.add("Ivan Samoilenko");
		studentName.add("Yasmine");
		studentName.add("Sinan");
		studentName.add("Mebrat");
		studentName.add("Jeremy");
		//add yourself to the list
		
		
		return studentName;
	}
	
	//another method from YHB at 10:15AM
		public void print2() {
			System.out.println("YHB...");
		}
	
	//Practice pushing process .. YHB
		
		//math() from Ivan 11:30
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int subtract(int c, int d) {
		return c - d;
	}

	//Good afternoon GitHub
	
	
	//Dear Team I will add a question from codingbat.com to work on together
	// this is from Functional-1 > doubling .. Yasmine 
	
	/*//this is the question--> Yasmine
	 * Given a list of integers, return a list where each integer is multiplied by 2.
	 
			doubling([1, 2, 3]) → [2, 4, 6]
			doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
			doubling([]) → []
			
	*/
	
	// You can choose your question and add your solution and lable it with your name YHB 
	
	public static List<Integer> doubling(List<Integer> nums){
		 ArrayList<Integer> list = new ArrayList<Integer>();
		  
		 for(int i = 0 ; i < nums.size() ;i++){
		   
		   int n = nums.get(i);
		   list.add(n*2);
		 }
		  System.out.println("Yasmine @ 3:00PM");
		  return list;
	}
		  // Adding code from codingBat

/**Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
*/
	public int arrayCount9(int[] nums) {
		  int count = 0;
		  for (int i=0; i<nums.length; i++) {
		    if (nums[i] == 9) {
		      count++;
		    }
		  }
		  return count;
		}
	
}
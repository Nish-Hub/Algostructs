
/*
Problem Statement : 
https://practice.geeksforgeeks.org/problems/next-happy-number/0#ExpectOP

The Best part of this problem is how you decide what base case to take if the number is not happy .
PS : This isnt an easy question but very interesting . please first try to think how you will check if a number is unhappy. 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class UnHappyNumbers {
	public static void main(String[] args) {
		// code
		 Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		for (int i = 0; i < t; i++) {
			int num =sc.nextInt();
			System.out.println(new GFG().nextHappyNumber(num));
		}

	}

	int nextHappyNumber(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(num + 1);
		while (!isHappyNumber(++num, al)) {
			al = new ArrayList<Integer>();
		}
		return num;
	}

	boolean isHappyNumber(int num, ArrayList<Integer> al) {
		if(num == 0)
			return false;
		if (num == 1)
			return true;

		int sum = 0; 
		// find sum of squares of digits , sum has to be sent to recursion,
		// so we can play with num .
		while (num != 0) {
			int digit = (num % 10);
			sum += digit * digit;
			num = num / 10;
		}
  //Checking in the arraylist to detect if some cycle is being created .
		if (al.contains(sum))
			return false;
  If no cycle found i.e cycle or periodic repetition of numbers , then add the sum in the list.     
		al.add(sum);

		// done with sum . We dnt need to check here . recursion will do it
		return isHappyNumber(sum, al);

	}
}

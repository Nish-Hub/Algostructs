/*
Problem Statement :: https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
        { 
            computeGCDRecursive(n2,n1);
        }
        else
        computeGCDRecursive(n1,n2);
        
            
    }
static  void computeGCDRecursive(int n1,int n2)
  {
    if(n2%n1 == 0)
    {
        System.out.println(n1); 
        return;
    }
     computeGCD(n2%n1,n1);
  }    
static  void computeGCDIterative(int n1,int n2)
  {
      int rem=n2%n1;
      while(rem != 0)
      {
          n2=n1;
          n1=rem;
          rem=n2%n1;
      }
     
    System.out.println(n1); 
  }
}

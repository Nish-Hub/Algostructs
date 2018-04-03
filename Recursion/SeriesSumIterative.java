/*
Problem Statement : https://www.hackerrank.com/challenges/java-loops/problem
This is a simple iterative problem which is a bit hard to do with recursion . The key to learn here was passing "sum" down the function
calls and then processing it . This is tail recursion.
*/

import java.util.*;
import java.io.*;

public class SeriesSumIterative{
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            findSumTailRecurDispatcher(a,b,n,0,a);
            System.out.println();
        }
        
        in.close();
    }
      static void findSumTailRecurDispatcher(int a,int b,int n,int i,int sum)
    {
    	if(i==n)
    		return;
    	sum+=(1<<i)*b;
     	System.out.print(sum+" ");
    	findSumTailRecurDispatcher(a,b,n,i+1,sum);
    }
// below functions are not used but they were used to reach this code . So you must have an idea as to how this end product was made	
    static int findSumTailRecurDispatcher2(int a,int b,int n,int i,int sum) 
    {
    	
      	sum+=(1<<i)*b;
    	if(i==0)
    		sum+=a;
    	
    	System.out.print(sum);
    	return sum;
    	
    }
    static int findSumIterative(int a,int b,int n)
    {
    	 int sum=a;
         for(int j=0;j<n-1;j++)
         {
             sum+=(1<<j) * b;
             System.out.print(sum+" "); 
         }
    
             return sum;
         }
}

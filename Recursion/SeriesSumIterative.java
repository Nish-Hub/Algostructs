/*
Problem Statement : https://www.hackerrank.com/challenges/java-loops/problem
This is a simple iterative problem which is a bit hard to do with recursion . The key to learn here was passing "sum" down the function
calls and then processing it . This is tail recursion.

If you dont want to pass data, then a way of avoiding is by using head recursion where you ask others to calculate the rest and send the 
result to you and then you will add it to your result . Like here , we have the last element as 
sum(n-1 to 1)+nth element . Thus nth element will ask the rest to sum themselves up and send him the result . The same division occurs
till you reach 1 element where the obvios answer is a+b . Then we start sending this result up using return value and keep on adding 
till we reach the nth element . 

For output : https://goo.gl/8VPdoj
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
            findSumTailRecurDispatcher(a,b,n,0,a); // we need more data to send down the line in tail
            findSumHeadRecurDispatcher(a,b,n);	// same as the number of parameters needed in iterative function
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
	static int findSumHeadRecurDispatcher(int a,int b,int n)
    {
		int sum=0;
		if(n==1)
		{
			sum=(a+b);
			System.out.print(sum+" ");
			return sum;
		}
		sum=findSumHeadRecurDispatcher(a,b,n-1);
		sum+=(1<<(n-1))*b;
		System.out.print(sum+" ");
		return sum;
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

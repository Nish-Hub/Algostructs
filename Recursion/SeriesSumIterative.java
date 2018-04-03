package com.code.recursion;

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
            findSumHeadRecurDispatcher(a,b,n,0,a);
            System.out.println();
        }
        
        in.close();
    }
      static void findSumHeadRecurDispatcher(int a,int b,int n,int i,int sum)
    {
    	if(i==n)
    		return;
    	sum+=(1<<i)*b;
     	System.out.print(sum+" ");
    	findSumHeadRecurDispatcher(a,b,n,i+1,sum);
    }
    static int findSumHeadRecurDispatcher2(int a,int b,int n,int i,int sum)
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

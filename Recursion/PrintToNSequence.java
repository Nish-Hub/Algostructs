/*Print 1 To N Ascending
Given a positive number N, write a function to
1>  print 1 to N (space-separated) using Recursion.
		the dataset can be reduced to : print 1 and rest print 2 to N i.e start from larger
2>  print N to 1 (space-separated) using Recursion.
		the dataset can be reduced to : print N and rest print N to 2 i.e start from larger
N can be any value 0 to 1000
the dataset can be reduced to : print 1 and rest print 2 to N


Note:  Do not print Newline in your code, anywhere.*/

public class PrintToNSequence{
public static void main(String[] args) {
	int N=10;
	print1ToN(N);
	System.out.println();
	printNTo1(N);
}
static void printNTo1(int num)
{
	if(num==0)
		return;
	System.out.print(num+" ");
	printNTo1(num-1);
//	printNto1Iterative(num--);
//	printNto1Iterative(num-1);
	
}
static void printNto1Iterative(int num) // this iterative function tells us we do not need any extra arguments
{
	while(num !=0)
	System.out.print(num-- +" ");
}


static void print1ToN(int num)
{
	if(num==0)
		return;
	print1ToNHelper(1, num);
	
}
// Extra index is required here as we have to start from i=1 to num
static void print1ToNHelper(int i,int num)
{
	if(i>=num)  // the base case i.e where i should stop calling the function copy
		return;
	System.out.print(i+" ");
	print1ToNHelper(i+1,num);
	
}

static void print1ToNIterative(int i,int num)
{
	while(i<=num)
	System.out.print(i++ +" ");
}
}

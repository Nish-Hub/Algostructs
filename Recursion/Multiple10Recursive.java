/*
Points to keep in mind: 

The process of making a code recursive is think of an iterative approach < Sometimes only thinking can help , a pseudo code of design
 then try and break this iterative into smaller dataset like in the above code , we are taking out the last multiplier i.e at size=10 and 
running a loop from 9 to 1 backwards and invoking the function for each ( head recursion )

We can process before making a call to other function which will be head recursion i.e processing after the function (recursive) call 

As you will see in the index , head is more better here as tail includes additional parameter

Here we have a pattern i.e for a multiplication of number and multiple , answer is straightforward , here we divide our work into these units
*/
//To see the code in action :  https://goo.gl/RrrXmA

public class Multiple10Recursive {
public static void main(String[] args) {
	multiple10HeadRecursiveDispatcher(2,10);  // Using a head approach
	multiple10TailRecursiveDispatcher(2, 10,1);  // Using a tail approach , We need an extra index here as we start printing from index 1
												 // and we need to start from index 1 to the size 10 .
}
static void multiple10(int N,int size)  // An iterative approach
{


	for (int i = 1; i <= size; i++) {
		System.out.println(N + " x " + i + " = " + N * i);
	}
// as we see here the problem is finding 10 multiples . Here size of data or size =10 . I can break this problem into small 
// datasize( size 1 to 9) and size 10 and divide and conquer the problem .
//	 datasize( size 1 to 8) , size 9 and size 10
}
static void multiple10HeadRecursiveDispatcher(int num,int size)
{
	if(size==1)
	{
		System.out.println(num + " x " + 1 + " = " + num * 1);
		return;
	}
	multiple10HeadRecursiveDispatcher(num,size-1);
	System.out.println(num + " x " + (size) + " = " + num * (size));
}
static void multiple10TailRecursiveDispatcher(int num,int size,int index) // without size ,  we will not be able to start with 1 index
									// and so we have taken a new variable .
{
	if(size==index)
	{
		System.out.println(num + " x " + index + " = " + num * index);
		return;
	}
	System.out.println(num + " x " + (index) + " = " + num * (index));
	multiple10TailRecursiveDispatcher(num,size,index+1);
	
}
}


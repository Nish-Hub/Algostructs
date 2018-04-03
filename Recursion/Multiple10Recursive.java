
public class Multiple10Recursive {
public static void main(String[] args) {
	multiple10Dispatcher(2,10);
}
static void multiple10(int N,int size)
{


	for (int i = 1; i <= size; i++) {
		System.out.println(N + " x " + i + " = " + N * i);
	}
// as we see here the problem is finding 10 multiple . Here N =10 . I can break this problem into small 
// datasize and divide and conquer the problem . 
}
static void multiple10Dispatcher(int num,int size)
{
	if(size==1)
	{
		System.out.println(num + " x " + 1 + " = " + num * 1);
		return;
	}
	multiple10Dispatcher(num,size-1);
	System.out.println(num + " x " + (size) + " = " + num * (size));
}
}

// points to learn : 
// The process of making a code recursive is think of an iterative approach < Sometimes only thinking can help , a pseudo code
//>

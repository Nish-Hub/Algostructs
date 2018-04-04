/*
Given an array of integers, determine whether elements are arranged in palindromic way or not.

Expected Time Complexity: N/2
Allowed Space Complexity: O(1)

If we try to see this problem , we have an array and we have to compare its indexes from left and right i.e
index 0 with index size-1 . 
index 1 with index size-2 
and so on ... so imagine we break the array in the middle and put the index size-1 box on the index 0 and similarly for others. 
Now this first pair of index size-1,0 says to other pairs that you guys tell us whats your value and we will sort ourselves
 */
public class ArrayPallindrome {
public static void main(String[] args) {
	
	int[] a={1,2,3,3,2,1};
	System.out.println(isPalindromic(a));
}
static boolean isPalindromic(int[] a){
	int start=0;
	int end=a.length-1;
	boolean res=false;
	if((a[start]==a[end]))
		res=isPalindromicHelper(a,start+1,end-1);
    return  res ;
}

/*
We need a start and end index to be supplied as our approach needs both. We could have used local variables but they will be initialised
at every call 
*/
static boolean isPalindromicHelper(int[] a,int start,int end){
	if(start>=end)
		return true;
	boolean res=false;
	if((a[start]==a[end]))
		res=isPalindromicHelper(a,start+1,end-1);
    return  res ;
}

//This method is not used but it was used to understand how recursive flow was to be permormed.
static boolean isPalindromicIterative(int[] a,int start,int end){
  //  int start=0,end=a.length-1;
    while(start<end)
    {
    	if(a[start]==a[end])
    	{
    		start++;
    		end--;
    		continue;
    	}
    	else 
    		return false;
    }
    return true;
}
}


/*
Selection sort technique using recursive approach 
The key algorithm parts are : 
1. Select the range start_index to end_index
2. Now select the min element in this range
3. Swap this with the starting element 
4. Repeat the above steps with start_index moving towards end_index

If you see here , the recursive conversation goes here like this : 
the first index says , i will only worry about getting the sorted element for me , rest of the list has to sort itself.
and i dont care how. 

So your data size is size of array with a slight change of perspective 

Point to note : Here we are passing the array as a reference and we are not changing its reference's address anywhere so we dont 
need to record the return values . 

 For output :  https://goo.gl/VpJLKy
 */
public class SelectionSortRecursive {
	public static void main(String[] args) {
		int[] arr={3,11,1,90,23};
		sort(arr);
	}
	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
	sort(arr,0,arr.length);	
	}
	static void sort(int arr[], int start_index, int end_index)  // step 1 select the range
	{
	  if(start_index >= end_index)  // base case   
	     return;
	  int min_index; 
	  int temp; 
	 //step 2 finding the minimum element in the range
	  min_index = minIndex(arr, start_index, end_index);
	 
	  // step 3 swapping the element
	  temp = arr[start_index];
	  arr[start_index] = arr[min_index];
	  arr[min_index] = temp;        
	 
	  // i dont care how this is done but it will get me the solution
	  sort(arr, start_index + 1, end_index);
	}

	private static int minIndex(int[] arr, int start_index, int end_index) {
		// TODO Auto-generated method stub
		int min_index=start_index;
		for(int i=start_index+1;i<end_index;i++)
		{
			if(arr[min_index]>arr[i])
				min_index=i;
		}
		return min_index;
	} 
	
}

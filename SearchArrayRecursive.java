/* 
Return Index of element in Array

Given an array of integers and an element K,  return index of K in the array (location where it is found);  
If K is not there in array, return -1.

Points to learn here : 
We started first with an iterative approach . Then we saw , i am repeatedly comparing the element with the array
indices . So i can break the test data as first element and the rest of the array . I will only process the first index 0 in my method
and will say that the iteration will take care. Now i if i want the iterative to start with some index other than 0 , i will have to tell 
it somehow i.e through method parameters , so i added a start index. 

This helped me in thinking of a recursive function which is now : 
Call a helper function having extra index parameter and then invoke it using your function 
*/

int findingIdx(int a[], int k) {
    // TODO:  Return Index of unique element
  if(a[0]==k)
    return 0;
  return findingIdxH(a,k,0);
 //return findingIdxIterative(a,k,1);
}
int findingIdxH(int a[], int k,int start) {
    // TODO:  Return Index of unique element
  if(start==a.length)  // base case , same as the end condition of for loop
    return -1;
  if(a[start]==k)  
    return start;
 return findingIdxH(a,k,start+1);   // let the recursion take care of the rest of the array .
}
int findingIdxIterative(int a[],int k,int start){
for(int i=start;i<a.length;i++)
{
  if(a[i]==k)
    return i;
}
  return -1;
}

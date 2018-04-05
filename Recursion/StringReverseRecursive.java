/*
Reverse a given string
Given a string - Reverse it (in-place) without using additional array or any library function.

The commentted part is there to show how the solution was finally produced
*/
void reverse(char arr[]) {
if(arr == null)
  return;
   
  /*int i=0;
  
  arr[i]^=arr[arr.length-1-i];
  arr[arr.length-1-i]^=arr[i];
  arr[i]^=arr[arr.length-1-i];
  */
//  reverseIterative(arr,1);
  reverseH(arr,0);
}
//helper function which will behave recursively
void reverseH(char arr[],int start) {
if(arr == null)
  return;
 if(start==(arr.length/2))
  return;
  
  int i=start;
  if(arr[i] != arr[arr.length-1-i])
    {
  arr[i]^=arr[arr.length-1-i];
  arr[arr.length-1-i]^=arr[i];
  arr[i]^=arr[arr.length-1-i];
  }
  reverseH(arr,start+1);
}



// the data here is the middle substrings which can be controlled by sending the starting 
// index of the string , so the substring will be (start,length-1-start)
void reverseIterative(char arr[],int start) {
    // Your Logic Here
  for(int i=start;i<arr.length/2;i++)
  {
    if(arr[i] != arr[arr.length-1-i])
    {
      arr[i]^=arr[arr.length-1-i];
      arr[arr.length-1-i]^=arr[i];
      arr[i]^=arr[arr.length-1-i];
    }
  }
}

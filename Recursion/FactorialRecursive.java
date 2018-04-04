/*
Find factorial of a number . This logic multiplies value of x , x-1 , x-2 , x-3 to 1 by y which is set as 1 here . This is a
way of finding factorial via recursive approach .

The point of confusion here when u look at the code is : the recursive function must be doing three things : 
1. base case
2. performing some process like it is working on a single solvable data size 
3. making a recursive call 

The 2nd point is missing here and is merged with the base case. Note here the parameters are the one doing the processing part . 
The first variable i.e x is reducing itself and at the same time multiplying its value and making the second parameter i.e x*1 . 
So at the last function copy call we get x*x-1*x-2*...*1 . 

Point to learn here : The parameters can be used to process the inputs and be returned at the end as an output . Note we are not actually 
dealing with the intermediate returns . We are only using the final return . 
*/
public class FactorialRecursive {
    public static void main(String[] args) {
    	int  num=5;
        System.out.println(factorial(5,1));
    }
    static int factorial(int x, int y) 
    {
      if(x == 0)
        return y;
      else
        return factorial(x - 1,  x * y);
    }
}

package com.Trees;
class BTNode{
	int data;
	BTNode left;
	BTNode right;
	BTNode(int data)
	{
		this.data=data;
	}
}
public class TreeDemo {
public static void main(String[] args) {
	BTNode root=null;
	int[] input={4,5,2,3,7,8};
	int j=0;
	String pos="";
	BTNode head=root;
	while(j<input.length)
	{
		if(root==null)
		{
			root=new BTNode(input[j]);
			System.out.println("data inserted at "+j+"th input is "+input[j]+" at pos = "+ pos);
			j++;
		}
		else if(root.data>input[j])
		{
			if(root.left==null)
				root.left=new BTNode(input[j]);
			else 
			root=root.left;
			pos="left";
		}
		else if(root.data<input[j])
		{
			if(root.right==null)
				root.right=new BTNode(input[j]);
			else 
				root=root.right;
			pos="right";
		}
	}
	
}
}

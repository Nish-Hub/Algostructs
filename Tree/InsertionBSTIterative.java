class BTNode {

	int data;
	BTNode left;
	BTNode right;

	BTNode(int data) {
		this.data = data;
	}
}

public class InsertionBSTIterative {

	public static void main(String[] args) {

		BTNode root = null;

		int[] input = { 4, 5, 2, 3, 7, 8 };

		int j = 0;

		root = new BTNode(input[0]); // root node created .
		BTNode temp = root;
		for (int i = 1; i < input.length; ) {
			if (temp.data > input[i])
			// right
			{
				if (temp.left == null)
				{
					temp.left = new BTNode(input[i]);
					i++;
				}

				temp = temp.left;

			} else if (temp.data < input[i]) {
				if (temp.right == null)
				{
					temp.right = new BTNode(input[i]);
					i++;
				}
				else 
				temp = temp.right;

			}
		}
	}

}

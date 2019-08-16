/** Sarah Wagner Week Seven Assignments
   Problem 32 and 48 Extended Class **/

import ch07.trees.*;
import java.util.*; // Iterator, Comparator
import ch04.queues.*;
import ch02.stacks.*;
import support.BSTNode;
public class MyExtendedBinarySearchTree < T > extends BinarySearchTree < T >
{

	// This is the height method that finds the height of the tree not using recursion
	public int height(BSTNode < T > root)
	{
		// If the tree is empty
		int count = 0;
		if (root == null)
		{
			return 0;
		} // End of if
		// Otherwise find the height of the tree
		else
		{
			int depth = 0;
			Stack < BSTNode > extra = new Stack < > ();
			Stack < BSTNode > path = new Stack < > ();
			extra.push(root);

			// This creates stacks the stores the values of the tree
			// One stack will hold the longest path possible in the tree
			// When the stacks hit the end of the tree it returns the count of the path stack as the depth/height
			while (!extra.empty())
			{
				root = extra.peek();
				if (!path.empty() && root == path.peek())
				{
					if (path.size() > depth) depth = path.size();
					path.pop();
					extra.pop();
				} // End of if 
				else
				{
					path.push(root);
					if (root.getRight() != null) extra.push(root.getRight());
					if (root.getLeft() != null) extra.push(root.getLeft());
				} // End of else 
			} // End of while loop
			return depth;
		} // End of else
	} // End of height method

	// This is the recursive height method
	public int recursiveHeight(BSTNode < T > root)
	{
		// If the tree is empty
		if (root == null)
			return 0;

		// Otherwise look between the left and right of each node and return the longest path
		else
		{
			int lDepth = recursiveHeight(root.getLeft());
			int rDepth = recursiveHeight(root.getRight());

			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		} // End of else
	} // End of recursiveHeight method

	// This find the minimum height of the tree
	public int minHeight(BSTNode < T > root)
	{
		// If the tree is empty
		if (root == null)
		{
			return 0;
		} // end of if 
		// Otherwise find the minimum height
		else
		{
			if (root.getRight() == null && root.getLeft() == null)
			{
				return 1;
			} // End of if
			else
			{

				if (root.getRight() == null)
				{
					return minHeight(root.getRight());
				} // End of if

				if (root.getLeft() == null)
				{
					return minHeight(root.getLeft());
				} // End of if
			} // End of else
			return Math.min(minHeight(root.getRight()), minHeight(root.getLeft())) + 1;
		} // End of else
	} // End of minHeight method

	// Finds the fullness ratio
	public double fRatio(BSTNode < T > root)
	{
		return (double) minHeight(root) / height(root);

	} // End of fRatio method


} // End of program
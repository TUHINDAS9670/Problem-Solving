// Java program to check if all leaves are at same level

// A binary tree node
class Node 
{
	int data;
	Node left, right;

	Node(int item) 
	{
		data = item;
		left = right = null;
	}
}

class Leaf 
{
	int leaflevel=0;
}

class BinaryTree 
{
	Node root;
	Leaf mylevel = new Leaf();
	
	/* Recursive function which checks whether all leaves are at same 
	level */
	boolean checkUtil(Node node, int level, Leaf leafLevel) 
	{
		// Base case
		if (node == null)
			return true;
			
		// If a leaf node is encountered
		if (node.left == null && node.right == null) 
		{
			// When a leaf node is found first time
			if (leafLevel.leaflevel == 0) 
			{
				// Set first found leaf's level
				leafLevel.leaflevel = level; 
				return true;
			}

			// If this is not first leaf node, compare its level with
			// first leaf's level
			return (level == leafLevel.leaflevel);
		}

		// If this node is not leaf, recursively check left and right 
		// subtrees
		return checkUtil(node.left, level + 1, leafLevel)
				&& checkUtil(node.right, level + 1, leafLevel);
	}

	/* The main function to check if all leafs are at same level.
	It mainly uses checkUtil() */
	boolean check(Node node) 
	{
		int level = 0;
		return checkUtil(node, level, mylevel);
	}

	public static void main(String args[]) 
	{
		// Let us create the tree as shown in the example
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(12);
		tree.root.left = new Node(5);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(9);
		tree.root.left.left.left = new Node(1);
		tree.root.left.right.left = new Node(1);
		if (tree.check(tree.root))
			System.out.println("Leaves are at same level");
		else
			System.out.println("Leaves are not at same level");
	}
}

// This code has been contributed by Mayank Jaiswal

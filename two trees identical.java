class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	     if (root1 == null && root2 == null) {
            return true;
        }

        // If one of the roots is null and the other is not, they are not identical
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check if the current nodes have the same value
        if (root1.data != root2.data) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);         
	}
	
}

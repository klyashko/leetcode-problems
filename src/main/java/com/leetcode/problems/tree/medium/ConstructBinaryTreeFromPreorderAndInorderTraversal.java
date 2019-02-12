package com.leetcode.problems.tree.medium;

import com.leetcode.problems.tree.TreeNode;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return build(preorder, inorder, new int[2], null);
		}

		private TreeNode build(int[] preorder, int[] inorder, int[] indexes, TreeNode stop) {
			if (indexes[0] >= preorder.length || (stop != null && stop.val == inorder[indexes[1]])) {
				return null;
			}
			TreeNode node = new TreeNode(preorder[indexes[0]++]);
			node.left = build(preorder, inorder, indexes, node);
			indexes[1]++;
			node.right = build(preorder, inorder, indexes, stop);
			return node;
		}
	}

}

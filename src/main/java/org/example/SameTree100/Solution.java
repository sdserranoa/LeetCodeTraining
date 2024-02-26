package org.example.SameTree100;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> treeQueue = new LinkedList<>();

        treeQueue.add(p);
        treeQueue.add(q);

        while (!treeQueue.isEmpty()) {
            TreeNode tree1 = treeQueue.poll();
            TreeNode tree2 = treeQueue.poll();
            if (tree1 != null && tree2 != null) {
                if (tree1.val != tree2.val) {
                    return false;
                }
                treeQueue.add(tree1.left);
                treeQueue.add(tree2.left);

                treeQueue.add(tree1.right);
                treeQueue.add(tree2.right);

            } else if (tree1 != tree2) {
                return false;
            }

        }

        return true;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}



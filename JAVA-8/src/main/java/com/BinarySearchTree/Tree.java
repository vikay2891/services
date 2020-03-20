package com.BinarySearchTree;

/**
 * @author vikas.bhardwaj3
 * 3/13/20207:52 PM2020
 */
public class Tree {

    private TreeNode root;

    public void insert(int data) {
        if (root == null) {
            root = new TreeNode(data);

        } else {
            root.insert(data);
        }
    }

    public void traverseInRoot() {
        if (root != null) {
            root.traverseInRoot();
        }
    }

    public TreeNode get(int i) {
        if (root != null) {
            return root.get(i);
        }
        return null;
    }

    public void delete(int i) {
        root = delete(root, i);


    }

    private TreeNode delete(TreeNode subTreeRoot, int i) {
        if (subTreeRoot == null) {
            return subTreeRoot;
        }
        if (i < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), i));

        } else if (i > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), i));
        } else {
            //case 1 and 2 :node to delete has 0 or 1 children
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getRightChild();
            }
        }
        return subTreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {

            return Integer.MAX_VALUE;
        } else
            return root.max();
    }
}

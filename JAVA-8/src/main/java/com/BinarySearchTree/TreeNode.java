package com.BinarySearchTree;

/**
 * @author vikas.bhardwaj3
 * 3/13/20207:49 PM2020
 */
public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }


    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void traverseInRoot() {

        if
        (leftChild != null) {
            leftChild.traverseInRoot();
        }
        System.out.print("data " + data + ",");
        if (rightChild != null) {
            rightChild.traverseInRoot();
        }
    }

    public TreeNode get(int i) {
        if (data == i) {
            return this;
        }
        if (i < data) {
            if (leftChild != null) {
                return leftChild.get(i);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(i);
            }
        }
        return null;
    }

    public int min() {

        if (leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return data;
        } else
            return rightChild.max();
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }


}

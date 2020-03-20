package com.BinarySearchTree;

/**
 * @author vikas.bhardwaj3
 * 3/13/20208:26 PM2020
 */
public class InsertTree {
    public static void main(String[] args) {

        Tree insertTree = new Tree();
        insertTree.insert(20);
        insertTree.insert(15);
        insertTree.insert(17);
        insertTree.insert(27);
        insertTree.insert(30);
        insertTree.insert(29);
        insertTree.insert(26);
        insertTree.insert(22);
        insertTree.insert(32);
        insertTree.traverseInRoot();
        System.out.println();
        System.out.println(insertTree.get(20));
        System.out.println(insertTree.get(32));
        System.out.println(insertTree.get(23));
        System.out.println(insertTree.min());
        System.out.println(insertTree.max());
        insertTree.delete(22);
        System.out.println("after deleting element");
        insertTree.traverseInRoot();
    }
}

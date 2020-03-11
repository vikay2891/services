package com.stack;

import java.util.Stack;

/**
 * @author vikas.bhardwaj3
 * 2/28/202012:15 PM2020
 */
public class CompressString {

    public static void main(String[] args) {

        System.out.println(compresseMessage("wewufhhhhhwwwop"));
    }

    public static String compresseMessage(String message) {
        char[] arr = message.toCharArray();

        Stack<Character> stack = new Stack<>();

        StringBuilder compressedMessage = new StringBuilder();

        for (Character word : arr) {
            if (stack.size() == 0) {
                stack.add(word);
            } else {
                Character topChar = stack.peek();
                if (topChar.equals(word)) {
                    stack.add(word);
                } else {
                    int count = stack.size();
                    if (count > 1) {
                        compressedMessage.append(topChar).append(count);
                        stack.clear();
                        stack.add(word);
                    } else {
                        compressedMessage.append(topChar);
                        stack.clear();
                        stack.add(word);
                    }
                }
            }
        }
        if(stack.size()>0){
            compressedMessage.append(stack.peek());
        }
        return compressedMessage.toString();
    }
    }
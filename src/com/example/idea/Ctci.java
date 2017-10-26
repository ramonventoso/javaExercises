package com.example.idea;

import java.util.HashMap;

/**
 * Created by rventoso on 23/10/2017.
 */
public class Ctci {

    public boolean UniqueChars(String input){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                map.remove(input.charAt(i));
            }
            else {
                map.put(input.charAt(i), i);
            }
        }
        return map.size() == input.length() ? true : false;
    }

    public boolean UniqueChars2(String input){
        boolean[] charSet = new boolean[256];
        for(int i = 0; i < input.length(); i++) {
            int index = input.charAt(i);
            if (charSet[index]) {
                return false;
            }
            else {
                charSet[index] = true;
            }
        }
        return true;
    }

    public String ReverseC(String input){
        char[] result = input.substring(0, input.length() - 1).toCharArray();
        int maxIndex = result.length - 1;
        int i = 0;
        while (i < maxIndex - i) {
            char temp = result[i];
            result[i] = result[maxIndex - i];
            result[maxIndex -i] = temp;
            i++;
        }
        // result[maxIndex] = '\u0000';
        return new String(result) +'\u0000';
    }

    // Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
    // NOTE: One or two additional variables are fine. An extra copy of the array is not.
    public char[] removeDuplicates(char[] str) {
        if (str == null) return null;
        int len = str.length;
        if (len < 2) return null;
        int finalTail = 1;
        for (int i = 1; i < len; i++){
            int j = 0;
            for (j = 0; j < finalTail; j++){
                if (str[i] == str[j]) {
                    break;
                }
            }
            // copy non-repeated char in final pos.
            if (j == finalTail) {
                str[finalTail] = str[i];
                ++finalTail;
            }
        }
        str[finalTail] = '\0';
        return str;
    }

    // does not meet requirement: does not include repeated characters analysis
    public boolean anagram(String s, String t){
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        HashMap<Character, Boolean> map = new HashMap<>();
        for (int j = 0 ; j < t.length() ; j++ ) {
            map.put(t.charAt(j), true);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean anagram2(String s, String t){
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        int len = s.length();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();


        for (int i = 0; i < len; i++){ // traversing s
            int j = i; // j to traverse t from current s pos on
            for (j = i; j < len; j++) {
                if (sChars[i] == tChars[j]) {
                    // swap chars in t to mirror s order and advance to next i
                    char temp = tChars[i];
                    tChars[i] = tChars[j];
                    tChars[j] = temp;
                    break;
                }
            }
            // matching t char is not found. no anagram
            if (j == len) return false;
        }
        return true;
    }

    // Ex 1.5 Replacing ' ' with %20
    public char[] ReplaceFun(char[] str) {

        // counting spaces because there will be a new length
        int spaces = 0;
        for (Character c : str){
            if (c == ' ') spaces++;
        }
        int finalLen = str.length + spaces * 2;
        char[] finalChars = new char[finalLen];
        int tail = 0;
        for (int i = 0; i < str.length; i++){
            if(str[i] == ' ') {
                finalChars[tail] = '%';
                finalChars[tail + 1] = '2';
                finalChars[tail + 2] = '0';
                tail += 3;
            }
            else{
                finalChars[tail] = str[i];
                tail++;
            }
        }
        return finalChars;
    }


    // 1.6 - Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
    // to rotate the image by 90 degrees. Can you do this in place?
    public void rotate(int[][] matrix, int n) {
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n ; j++){
                int temp = matrix[j][i] ;
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
             }

        }
    }

    public Node getSubLinkedList(Node list, int index){
        int i = 1;
        Node node = list;
        while(i < index){
            i++;
            node = node.next;
        }
        return node;
    }

    public Node nthToLast(Node list, int n) {
        if (list == null || n < 1) return null;
        Node head = list;
        Node node = list;
        for (int i = 0; i < n - 1; i++){
            if (node == null){
                return null;
            }
            else {
                node = node.next;
            }
        }

        while(node.next != null){
            head = head.next;
            node = node.next;
        }

        return head;
    }

    //
    public boolean deleteMiddleNode(Node n) {
        if ( n == null) return false;
        // count the nodes
        Node node = n;
        int i = 0;
        while(node != null){
            i++;
            node = node.next;
        }
        if (i < 1) return false;
        int middleNodePos = i / 2;

        if (middleNodePos == 0) {
            // delete head
            n = n.next;
            return true;
        }
        // getting prev and next nodes
        Node previousNode = n;
        for (int j = 0; j < middleNodePos - 1; j++){
            previousNode = previousNode.next;
        }
        Node nextNode = previousNode.next.next;

        // deleting middle node
        previousNode.next = nextNode;
        return true;
    }


    public boolean deleteNode(Node n){
        if (n == null) return false;
        if (n.next == null) {
            n.data = 0; // making it dummy. depends on what data value means dummy. -1?
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}

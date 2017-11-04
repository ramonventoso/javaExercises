package com.example.idea;

import java.util.HashMap;

/**
 * Created by rventoso on 23/10/2017.
 */
public class Ctci {

    public boolean UniqueChars(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                map.remove(input.charAt(i));
            } else {
                map.put(input.charAt(i), i);
            }
        }
        return map.size() == input.length() ? true : false;
    }

    public boolean UniqueChars2(String input) {
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i);
            if (charSet[index]) {
                return false;
            } else {
                charSet[index] = true;
            }
        }
        return true;
    }

    public String ReverseC(String input) {
        char[] result = input.substring(0, input.length() - 1).toCharArray();
        int maxIndex = result.length - 1;
        int i = 0;
        while (i < maxIndex - i) {
            char temp = result[i];
            result[i] = result[maxIndex - i];
            result[maxIndex - i] = temp;
            i++;
        }
        // result[maxIndex] = '\u0000';
        return new String(result) + '\u0000';
    }

    // Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
    // NOTE: One or two additional variables are fine. An extra copy of the array is not.
    public char[] removeDuplicates(char[] str) {
        if (str == null) return null;
        int len = str.length;
        if (len < 2) return null;
        int finalTail = 1;
        for (int i = 1; i < len; i++) {
            int j = 0;
            for (j = 0; j < finalTail; j++) {
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
    public boolean anagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        HashMap<Character, Boolean> map = new HashMap<>();
        for (int j = 0; j < t.length(); j++) {
            map.put(t.charAt(j), true);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean anagram2(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        int len = s.length();
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();


        for (int i = 0; i < len; i++) { // traversing s
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
        for (Character c : str) {
            if (c == ' ') spaces++;
        }
        int finalLen = str.length + spaces * 2;
        char[] finalChars = new char[finalLen];
        int tail = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                finalChars[tail] = '%';
                finalChars[tail + 1] = '2';
                finalChars[tail + 2] = '0';
                tail += 3;
            } else {
                finalChars[tail] = str[i];
                tail++;
            }
        }
        return finalChars;
    }


    // 1.6 - Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
    // to rotate the image by 90 degrees. Can you do this in place?
    public int[][] rotate(int[][] matrix, int n) {
        int ring = 0;
        int rows = matrix.length;
        int cols = 0;
        if (rows > 0) {
            cols = matrix[0].length;
        }
        if (rows != cols) return null;
        int rank = rows;


        int[] temp = new int[rank];
        while (((rank - 1 - ring) - (ring)) > 0) {
            // saving current ring first row
            for (int j = ring; j < rank - ring; j++) {
                temp[j] = matrix[ring][j];
            }
            //west - north
            for (int j = ring; j < rank - ring; j++) {
                matrix[ring][j] = matrix[rank - 1 - j][ring];
            }
            // south to west
            for (int j = ring; j < rank - ring; j++) {
                matrix[j][ring] = matrix[rank - 1 - ring][j];
            }
            // east to south
            for (int j = ring; j < rank - ring; j++) {
                matrix[rank - 1 - ring][j] = matrix[rank - 1 - j][rank - 1 - ring];
            }
            // saved north to east
            for (int j = ring; j < rank - ring; j++) {
                matrix[j][rank - 1 - ring] = temp[j];
            }
            ring++;
        }
        return matrix;
    }

    public void rotate2(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                int top = matrix[first][i]; // save top
                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }
    }

    // Ex 1.7 - Write an algorithm such that if an element in an MxN matrix is 0,
    // its entire row and column is set to 0.
    public int[][] setZeros(int[][] m) {
        //
        int[] rows = new int[m.length];
        int[] cols = new int[m[0].length];
        // getting the zeros
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j< m[0].length; j++){
                if (m[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        // making m[i][j] = 0 if either row or col is tagged.
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                if (rows[i] == 1 || cols[j] == 1) {
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }

    //Ex 1.8 - Assume you have a method isSubstring which checks if one word is a substring of another.
    // Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring
    // (i.e., “waterbottle” is a rotation of “erbottlewat”).
    public boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0){
            for (int i = 0; i < len; i  ++){
                if (s2.charAt(0) == s1.charAt(i)) {
                    // check second part of s1
                    int l = 0;
                    for (l = 0; l < len - i; l++){
                        if (s2.charAt(l) != s1.charAt(l + i)) break;
                    }
                    if (l == len - i) {
                        // check first part of s1
                        int f = 0;
                        for (f = 0; f < i; f++){
                            if (s1.charAt(f) != s2.charAt(l + f)) break;
                        }
                        if (f == i) return true;
                    }
                }
            }
        }
        return false;

    }

    /**
     *  Ex 2.1 - Write code to remove duplicates from an unsorted linked list
     * @param
     * @param
     * @return
     */
    public  void deleteDups(ListNode n){

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


    /**
     * 2.3
     * @param n
     * @return
     */
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

    /**
     * 2.4
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers24(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            // create sum node
            ListNode current = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            current.val = sum % 10;
            carry = sum / 10;

            // assign it as tail of final res
            if (tail == null) {
                head = current;
            }
            else {
                tail.next = current;
            }
            tail = current;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head;
    }
}

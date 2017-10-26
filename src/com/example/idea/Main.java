package com.example.idea;

import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // PROBLEM 1 LC
        System.out.println("\n\nPROBLEM 1 LC");
        int res[] = getIndices(new int[]{3,3}, 6);
        System.out.printf("indices for target %d are [%d,%d]", 9, res[0], res[1]);


        // PROBLEM 2 LC
        System.out.println("\n\nPROBLEM 2 LC");
        ListNode lnode = new ListNode(9);
        ListNode lnode2 = new ListNode(1);
        ListNode nod = lnode2;
        for (int i = 0; i < 9; i++){
            nod.next = new ListNode( 9 );
            nod = nod.next;
        }

        ListNode suma = addTwoNumbers(lnode, lnode2);
        ListNode n = suma;
        while (n != null){
            System.out.printf("%d", n.val);
            n = n.next;
        }


        // PROBLEM 3 LC
        System.out.println("\n\nPROBLEM 3 LC");
        System.out.printf("Longest substring for %s is %d\n" , "abababcdab", lengthOfLongestSubstring("abababcdab"));
        System.out.printf("Longest substring for %s is %d\n" , "abcdeabcdef", lengthOfLongestSubstring("abcdeabcdef"));
        System.out.printf("Longest substring for %s is %d\n" , "bbbb", lengthOfLongestSubstring("bbbb"));
        System.out.printf("Longest substring for %s is %d\n" , "abcd", lengthOfLongestSubstring("abcd"));
        System.out.printf("Longest substring for %s is %d\n" , "abcabcbb", lengthOfLongestSubstring("abcabcbb"));
        System.out.printf("Longest substring for %s is %d\n" , "pwwkew", lengthOfLongestSubstring("pwwkew"));


        // PROBLEM Reverse LC
        System.out.println("\nPROBLEM Reverse LC");
        System.out.printf("number %d reverse %d\n" , -1234, reverse(-1234));


        // PROBLEM 136 LC
        System.out.println("\nPROBLEM 136 LC");
        HashMap<Integer, String> map = new HashMap();
        String res1 = encode1("https://leetcode.com/problems/design-tinyurl", map);
        System.out.printf("encoded " + res1);

        String res2 = decode1(res1, map);
        System.out.printf("\ndecoded " + res2);

        // PROBLEM 535 LC
        System.out.println("\n\nPROBLEM 535 LC");
        System.out.printf("hashmap exercise single number is %d\n" , singleNumber2(new int[] {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5}));





        // ***********************************************************************************************************************
        //  **********************************************************************************************************************
        // cracking the code interview


        Ctci exercise = new Ctci();

        // 1 - Arrays n Strings   *****************************************************************************************
        System.out.println("\n\n******************Exercises from book CTCI Chapter: Arrays and Strings");

        // 1.1
        // Implement an algorithm to determine if a string has all unique characters.
        // What if you can not use additional data structures
        System.out.println("\nEx 1.1");
        System.out.printf("Result = " + exercise.UniqueChars2("abcd"));
        String test = "what about this" + "\u0000";


        // 1.2
        // Write code to reverse a C-Style String.
        System.out.println("\n\nEx 1.2");
        String res3 = exercise.ReverseC(test);
        System.out.printf("reverse c string = " + res3);

        // 1.3
        //Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer.
        // NOTE: One or two additional variables are fine. An extra copy of the array is not.
        System.out.println("\n\nEx 1.3");
        String input = "abccaab";
        System.out.printf("input string : %s\n" , input);
        char[] nonDupStr = exercise.removeDuplicates(input.toCharArray());
        String res13 = new String(nonDupStr);
        System.out.printf("non-repeated-char string : %s\n" , res13);


        // 1.4
        // Write a method to decide if two strings are anagrams or not.
        System.out.println("\nEx 1.4 - Write a method to decide if two strings are anagrams or not - SEE WHAT THE BOOK DOES WITH JOSE");
        // 1
        String s = null;
        String t = "kgitaabkri";
        System.out.printf("null string anagram ? " + exercise.anagram2(s, t));
        // 2
        s = "abrik";
        t = "abrikabrik";
        System.out.printf("\ndiff len anagram ? " + exercise.anagram2(s, t));

        // test case 3 they are anagrams (no repeated characters)
        s = "abrigote";
        t = "gotaibre";
        System.out.printf("\nyes but no rep anagram ? " + exercise.anagram2(s, t));

        // test case 4 they are anagrams (with repeated characters)
        s = "abrikkgita";
        t = "kgitaabkri";
        System.out.printf("\nyes but rep anagram ? " + exercise.anagram2(s, t));

        // test case 5 they are not anagrams
        s = "abrigo";
        t = "zapatos";
        System.out.printf("\nno anagram ? " + exercise.anagram2(s, t));

        // 1.5
        // Write a method to replace all spaces in a string with ‘%20’.
        System.out.println("\n\nEx 1.5 - replace all spaces in a string with ‘%20’ - SEE WHAT THE BOOK DOES WITH JOSE");
        char[] sentence = "what a wonderful world".toCharArray();
        char[] modified = exercise.ReplaceFun(sentence);
        System.out.println(modified);

        // 1.6 - Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
        // to rotate the image by 90 degrees. Can you do this in place?
        // public static void rotate(int[][] matrix, int n) {


        // 2 - Linked Lists   *************************************************************************************************
        System.out.println("\n\n ****************Exercises from book CTCI Chapter: Linked Lists");
        // 2.1
        // System.out.println("Ex 2.1");



        // 2.2
        // Implement an algorithm to find the nth to last element of a singly linked list.
        System.out.println("\n\nEx 2.2");

        // arrange
        Node list = new Node(1);
        for (int i = 2;i < 11; i++){
            list.appendToTail(i);
        }
        System.out.printf("original list is\n");
        Node node = list;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);

        // act
        System.out.println("sub list is");
        Node subList = exercise.nthToLast(list, 6);
        node = subList;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);


        // 2.3
        // Implement an algorithm to delete a node in the middle of a single linked list (this means an intermediate node),
        // given only access to that node. (this means the argument is the node you want to delete, not the head of the list.

        System.out.println("\nEx 2.3");
        Node delList = new Node(1);
        for (int i = 2;i < 11; i++){
            delList.appendToTail(i);
        }
        Node delNode = delList.next.next.next.next.next;  // node 6 index 5
        boolean res23 = exercise.deleteNode(delNode);
        node = delList;
        System.out.println("list with node 6 deleted");
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }



        // test
        System.out.println("\nTesting str[3] = 0; ");
        char[] str = "people".toCharArray();
        System.out.printf("initial size = %d", str.length);
        str[3] = 0;
        System.out.printf("\nfinal size = %d", str.length);
        String res111 = new String(str);
        System.out.printf("\nthis string is}" + res111);
        System.out.printf("final size = %d", res111.length());

        int[] integers = new int[5];
        for (int i = 0; i < 5; i++) {
            integers[i] = i;
        }
        integers[4] = 5;
        System.out.println();
        System.out.println(integers[4]);











        // ***************************************************************************************************

        //boolean[] pisos = new boolean[] {
                //false, false, false, false, false,
                //false, false, false, false, false,
                //false, false, false, false, false,
                //false, false, false, false, false,
                //false, false, false, false, false,
                //false, false, false, false, false,
                //false, false};

                //true, true, true, true, true,
                //false, false, false, false, false,
                //true, true};
        // System.out.printf("Highest safe floor for the egg is %d", getBHighestFloor(pisos));


    }








    // PROBLEM 1 LC My solution ACCEPTED
    public static int[] getIndices(int[] nums, int target)
    {
        int[] res = new int[]{ -1, -1};
        for (int i =0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }

        return res;
    }


    // PROBLEM 2 LC Passes some test cases but not with big numbers. I am adding integers.
    public static ListNode addTwoNumbersBF(ListNode l1, ListNode l2) {

        int n1 = getNumber(l1);
        int n2 = getNumber(l2);
        int total = n1 + n2;

        ListNode res = new ListNode(total % 10);
        ListNode node = res;
        while (total != 0){
            total = total / 10;
            if (total > 0) {
                node.next = new ListNode(total % 10);
                node = node.next;
            }
        }

        return res;
    }

    public static int getNumber(ListNode ln){
        int res = 0;
        int i = 0;
        ListNode node = ln;
        while (node != null)
        {
            res += node.val * java.lang.Math.pow(10, i) ;
            i++;
            node = node.next;
        }
        return res;
    }

    // PROBLEM 2 LC ACCEPTED
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            // create sum node
            ListNode tailNode = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            tailNode.val = sum % 10;
            carry = sum / 10;

            // assign it as tail of final res
            res.next = tailNode;
            // final list points to curr
            res = tailNode;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;  // first node excluded
    }

    // PROBLEM 3 LC  ->  my solution unaccepted. it works but timeout with last testcase
    public static int lengthOfLongestSubstringSlow(String s) {
        String maxSubStr = "";
        for (int i = 0; i < s.length(); i++ )
        {
            String maxLocalSubStr = String.valueOf(s.charAt(i));
            for (int j = i + 1; j < s.length(); j++)
            {
                if ( maxLocalSubStr.indexOf(s.charAt(j)) >= 0) break;
                maxLocalSubStr += String.valueOf(s.charAt(j));
            }
            if (maxLocalSubStr.length() > maxSubStr.length()) maxSubStr = maxLocalSubStr;
        }
        return maxSubStr.length();
    }

    // PROBLEM 3 LC  ->  cheated solution
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

    public static int reverse(int x) {
        int res = 0;
        boolean neg = false;
        if (x < 0)  {
            neg = true;
        }
        char[] chars = ("" + Math.abs(x)).toCharArray();
        // if (chars[0] == '-') chars.
        int lastIndex = chars.length - 1;
        for (int i = 0; i < lastIndex - i; i++) {
            char l = chars[i];
            char r = chars[lastIndex - i];
            chars[i]= r;
            chars[lastIndex - i]= l;

        }

        try {
            res = Integer.parseInt(new String(chars));
        }
        catch (NumberFormatException e) {
            return 0;
        }

        return neg ? -res : res;
    }



    // PROBLEM 136 LC
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> singles = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (!singles.containsKey(nums[i])) {
                singles.put(nums[i],i);
            }
            else {
                singles.remove(nums[i]);
            }
        }
        Object[] resArray = singles.values().toArray();
        int targetIndex = (Integer)resArray[0];
        return nums[targetIndex];

    }

    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i<nums.length; i++)
        {
            result ^=nums[i];
        }
        return result;

    }

    // PROBLEM 535 LC  ACCEPTED

    // Encodes a URL to a shortened URL.
    public static String encode1(String longUrl, HashMap<Integer, String> map) {
        int code = longUrl.hashCode();
        map.put(code, longUrl );
        return "http://tinyurl.com/" + code;
    }

    // Decodes a shortened URL to its original URL.
    public static String decode1(String shortUrl, HashMap<Integer, String> map) {
        return map.get(Integer.parseInt(shortUrl.replaceAll("http://tinyurl.com/","")));
    }





























    // **************OTHER STUFF NOT COMPLETED  ***********************************************************************

    public static LinkedList<Integer> CreateLinkedList() {
        List<Integer> numbersList = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            numbersList.add(i + 1);
        }
        System.out.println("Before revering");
        for (Integer num : numbersList){
            System.out.printf("element in LinkedList %d \n",num);
        }
        // reverse
        int lastIndex = numbersList.size() - 1;
        for (int i = 0; i < lastIndex - i; i++){
            int l = numbersList.get(i);
            int r = numbersList.get(lastIndex - i);
            numbersList.set(i, r);
            numbersList.set(lastIndex - i, l);
        }

        System.out.println("After revering");
        for (Integer num : numbersList){
            System.out.printf("element in LinkedList %d \n",num);
        }
        return (LinkedList<Integer>)numbersList  ;
    }

    public static int getHighestFloor(boolean[] floors)
    {
        int n = floors.length;
        int first = 0;
        int i = 1;

        while ( !floors[first])
            if (first < n - 1) {
                i *= 2;
                first = first + n / i;
            }
            else return first;

        int second = first;
        while(!floors[second])
        {
            second += 1;
        }

        return second;
    }

    public static int getBHighestFloor(boolean[] floors)
    {
        int floorIndex = -1;
        int ceilingIndex = floors.length;
        int guessIndex = 0;

        while (floorIndex + 1 < ceilingIndex) {
            int distance = ceilingIndex - floorIndex;
            int halfDistance = distance / 2;
            guessIndex = floorIndex + halfDistance;
            if (floors[guessIndex]) {
                ceilingIndex = guessIndex;
                break;
            }
            else {
                floorIndex = guessIndex;

            }
        }
        if (floorIndex + 1 == ceilingIndex) return ceilingIndex - 1;

        guessIndex = floorIndex + 1;
        while(!floors[guessIndex])
        {
            guessIndex += 1;
        }

        return guessIndex;
    }

    public static boolean binarySearch(int target, int[] nums) {
        // see if target appears in nums

        // we think of floorIndex and ceilingIndex as "walls" around
        // the possible positions of our target, so by -1 below we mean
        // to start our wall "to the left" of the 0th index
        // (we *don't* mean "the last index")
        int floorIndex = -1;
        int ceilingIndex = nums.length;

        // if there isn't at least 1 index between floor and ceiling,
        // we've run out of guesses and the number must not be present
        while (floorIndex + 1 < ceilingIndex) {

            // find the index ~halfway between the floor and ceiling
            // we use integer division, so we'll never get a "half index"
            int distance = ceilingIndex - floorIndex;
            int halfDistance = distance / 2;
            int guessIndex = floorIndex + halfDistance;

            int guessValue = nums[guessIndex];

            if (guessValue == target) {
                return true;
            }

            if (guessValue > target) {

                // target is to the left, so move ceiling to the left
                ceilingIndex = guessIndex;

            } else {

                // target is to the right, so move floor to the right
                floorIndex = guessIndex;
            }
        }

        return false;
    }



}





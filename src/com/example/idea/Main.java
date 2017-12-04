package com.example.idea;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        /*
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        */


        // ***********************************************************************************************************************
        //  ************************************************** Stephen Grider *********************************************************
        // ***********************************************************************************************************************
        //  **********************************************************************************************************************
        // Stephen Grider
        SGrider exerciseSG = new SGrider();

        // 3 - String Reversal
        System.out.println("Reversing String - Grider");
        String input1 = "pelotero";
        System.out.printf("%s reverses to %s", input1, exerciseSG.reversingString(input1));


        // 6 - MaxChars
        System.out.println("MaxChars - SGrider" );


        // 7 - FizzBuzz
        System.out.println("FIZZ BUZZ - SGrider" );
        exerciseSG.FizzBuzz();


        // 8 - Array Chunking
        System.out.println("Array Chunk - Grider");
        int[] arr = { 1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[][] result111 = exerciseSG.chunkArray(arr, 24);
        System.out.println("Result");
        for (int[] row : result111) {
            for (int data : row){
                System.out.printf("%d ", data);
            }
            System.out.println();
        }

        // 9 - anagrams - do it again

        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();



        // ***********************************************************************************************************************
        //  ************************************************** Leet Code *********************************************************
        // ***********************************************************************************************************************
        //  **********************************************************************************************************************
        // Leet Code

        LeetCode exerciseLC = new LeetCode();
        // PROBLEM 1 LC
        System.out.println("\n\nPROBLEM 1 LC");
        int res[] = exerciseLC.getIndices(new int[]{3,3}, 6);
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

        ListNode suma = exerciseLC.addTwoNumbers(lnode, lnode2);
        ListNode n = suma;
        while (n != null){
            System.out.printf("%d", n.val);
            n = n.next;
        }


        // PROBLEM 3 LC
        System.out.println("\n\nPROBLEM 3 LC");
        System.out.printf("Longest substring for %s is %d\n" , "abababcdab", exerciseLC.lengthOfLongestSubstring("abababcdab"));
        System.out.printf("Longest substring for %s is %d\n" , "abcdeabcdef", exerciseLC.lengthOfLongestSubstring("abcdeabcdef"));
        System.out.printf("Longest substring for %s is %d\n" , "bbbb", exerciseLC.lengthOfLongestSubstring("bbbb"));
        System.out.printf("Longest substring for %s is %d\n" , "abcd", exerciseLC.lengthOfLongestSubstring("abcd"));
        System.out.printf("Longest substring for %s is %d\n" , "abcabcbb", exerciseLC.lengthOfLongestSubstring("abcabcbb"));
        System.out.printf("Longest substring for %s is %d\n" , "pwwkew", exerciseLC.lengthOfLongestSubstring("pwwkew"));


        // PROBLEM Reverse LC
        System.out.println("\nPROBLEM Reverse LC");
        System.out.printf("number %d reverse %d\n" , -1234, exerciseLC.reverse(-1234));


        // PROBLEM 136 LC
        System.out.println("\nPROBLEM 136 LC");
        HashMap<Integer, String> map = new HashMap();
        String res1 = exerciseLC.encode1("https://leetcode.com/problems/design-tinyurl", map);
        System.out.printf("encoded " + res1);

        String res2 = exerciseLC.decode1(res1, map);
        System.out.printf("\ndecoded " + res2);

        // PROBLEM 535 LC
        System.out.println("\n\nPROBLEM 535 LC");
        System.out.printf("hashmap exercise single number is %d\n\n" , exerciseLC.singleNumber2(new int[] {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5}));

        // PROBLEM

        String roman = "MCMLXV";
        System.out.println("CHANGE ROMAN NUMBER TO ARABIC");
        System.out.printf("%s in arabic system is %d\n\n", roman, exerciseLC.romanToInt2(roman));


        // LC

        // String candidate = "abaaabcd";
        String candidate = "comabacc";
        System.out.printf("\nlongest palindrome of %s is %s\n", candidate, exerciseLC.longestPalindrome2(candidate));


        // Is Palindrome number

        int num = 1233216;
        boolean res444 = exerciseLC.IsPalindromeNumber(num);
        System.out.printf("%d is palindrome? %b" , num, res444);






        // ***********************************************************************************************************************
        //  *********************************************  cracking the code interview  ******************************************
        // ***********************************************************************************************************************
        //  **********************************************************************************************************************
        // cracking the code interview


        Ctci exercise = new Ctci();

        // Example YouTube - Given 2 arrays, find common elements

        System.out.println("Example YouTube - Given 2 arrays, find common elements");
        int[] a1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a2 = new int[] {1, 3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        ArrayList<Integer> resSample = exercise.commonElements(a1 , a2);

        for(Integer c : resSample){
            System.out.printf(c +" ");
        }
        System.out.println();

        // 1 - Arrays n Strings   -----------------------------------------------------------------------------------------------
        System.out.println("\n\n---------------  Exercises from book CTCI Chapter: Arrays and Strings");

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

        System.out.println("\n\nEx 1.6 - Rotate a matrix ");

        // odd rows
        int[][] m = new int[5][5];
        // fill m
        int count = 1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                m[i][j] = count++;
            }
        }
        // print initial m
        System.out.println("Initial Rows Odd");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.printf(m[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // print final m
        System.out.println("Rotated");
        int[][] fm = exercise.rotate(m, 5);
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.printf(fm[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // no rows
        int[][] m1 = new int[0][0];
        int[][] fm1 = exercise.rotate(m1, 5);
        // print final m
        System.out.println("Rotated Empty");
        for (int i = 0; i < fm1.length; i++){
            for (int j = 0; j < fm1.length; j++){
                System.out.printf(fm1[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // 1 row
        int[][] m2 = new int[1][1];
        // fill m
        int count2 = 1;
        for (int i = 0; i < m2.length; i++){
            for (int j = 0; j < m2.length; j++){
                m2[i][j] = count2++;
            }
        }
        // print initial m
        System.out.println("Initial 1 row");
        for (int i = 0; i < m2.length; i++){
            for (int j = 0; j < m2.length; j++){
                System.out.printf(m2[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // print final m
        System.out.println("Rotated");
        int[][] fm2 = exercise.rotate(m2, 1);
        for (int i = 0; i < fm2.length; i++){
            for (int j = 0; j < fm2.length; j++){
                System.out.printf(fm2[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // 2 rows
        int[][] m3 = new int[2][2];
        // fill m
        int count3 = 1;
        for (int i = 0; i < m3.length; i++){
            for (int j = 0; j < m3.length; j++){
                m3[i][j] = count3++;
            }
        }
        // print initial m
        System.out.println("Initial 2 rows");
        for (int i = 0; i < m3.length; i++){
            for (int j = 0; j < m3.length; j++){
                System.out.printf(m3[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // print final m
        System.out.println("Rotated");
        int[][] fm3 = exercise.rotate(m3, 5);
        for (int i = 0; i < fm3.length; i++){
            for (int j = 0; j < fm3.length; j++){
                System.out.printf(fm3[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // even rows
        int[][] m4 = new int[6][6];
        // fill m
        int count4 = 1;
        for (int i = 0; i < m4.length; i++){
            for (int j = 0; j < m4.length; j++){
                m4[i][j] = count4++;
            }
        }
        // print initial m
        System.out.println("Initial even rows");
        for (int i = 0; i < m4.length; i++){
            for (int j = 0; j < m4.length; j++){
                System.out.printf(m4[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // print final m
        System.out.println("Rotated");
        int[][] fm4 = exercise.rotate(m4, 5);
        for (int i = 0; i < fm4.length; i++){
            for (int j = 0; j < fm4.length; j++){
                System.out.printf(fm4[i][j] + " ");
            }
            System.out.printf("\n");
        }
        // rows != cols
        int[][] m5 = new int[4][6];
        System.out.println("rows != cols");
        int[][] fm5 = exercise.rotate(m5, 10);
        if (fm5 == null) System.out.println("null");
           else System.out.println("Not null");




        // Ex 1.7 - Write an algorithm such that if an element in an MxN matrix is 0,
        // its entire row and column is set to 0.

        int[][] m7 = new int[5][5];
        // fill m
        int count7 = 1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                m7[i][j] = count7++;
            }
        }

        m7[2][3] = 0;
        System.out.println("Ex 1.7 ");
        int[][] res7 = exercise.setZeros(m7);
        for (int i = 0; i < res7.length; i++){
            for (int j = 0; j < res7[0].length; j++){
                System.out.printf(res7[i][j] + " ");
            }
            System.out.println();
        }

        //Ex 1.8 - Assume you have a method isSubstring which checks if one word is a substring of another.
        // Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring
        // (i.e., “waterbottle” is a rotation of “erbottlewat”).
        System.out.println("Ex 1.8 - Write code to check if s2 is a rotation of s1");

        System.out.println("Is pleap a rotation of apple ? : " + exercise.isRotation( "apple", "pleap"));
        System.out.println("Is erbottlewat a rotation of waterbottle ? : " + exercise.isRotation( "waterbottle", "erbottlewat"));
        System.out.println("Is trbottlewat a rotation of waterbottle ? : " + exercise.isRotation( "waterbottle", "trbottlewat"));
        System.out.println("Is a a rotation of a ? : " + exercise.isRotation( "a", "a"));
        System.out.println("Is ab a rotation of ba ? : " + exercise.isRotation( "ba", "ab"));
        System.out.println("Is ab a rotation of ab ? : " + exercise.isRotation( "ab", "ab"));
        System.out.println("Is  a rotation of  ? : " + exercise.isRotation( "", ""));
        System.out.println("Is pepe a rotation of pepep ? : " + exercise.isRotation("pepep", "pepe"));


        //
        // 2 - Linked Lists  -------------------------------------------------------------------------------------------

        System.out.println("\n\n --------------------------------------------------------------");
        System.out.println(" --------------------------------------------------------------");
        System.out.println(" ---------------- Exercises from book CTCI Chapter: Linked Lists");
        System.out.println(" --------------------------------------------------------------");
        System.out.println(" --------------------------------------------------------------");


        // 2.1
        System.out.println("Ex 2.1 - Write code to remove duplicates from an unsorted linked list.");



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

        /**
         *     2.4 - Add two numbers (coming as linked lists) and returns the sum as a linked list.
         */

        System.out.println("\n\nPROBLEM 2.4 ");
        ListNode lnode24 = new ListNode(9);
        ListNode lnode242 = new ListNode(1);
        ListNode nod24 = lnode242;
        for (int i = 0; i < 9; i++){
            nod24.next = new ListNode( 9 );
            nod24 = nod24.next;
        }

        ListNode suma24 = exercise.addTwoNumbers24(lnode, lnode2);
        ListNode n24 = suma;
        while (n24 != null){
            System.out.printf("%d", n24.val);
            n24 = n24.next;
        }


        /**
         *      test
         */

        System.out.println("\n\n\nTesting str[3] = 0; ");
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


        // ************************************************************************************************************
        // ************************************************************************************************************
        //  ******************************************      ALgorythm           ***************************************
        // ************************************************************************************************************
        //  ***********************************************************************************************************


        Algo exerciseAL = new Algo();

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(7);
        numberList.add(8);
        numberList.add(2);
        numberList.add(6);
        numberList.add(5);
        numberList.add(1);
        numberList.add(9);
        numberList.add(3);

        System.out.println("\n\nQUICK SORT ALGORYTHM - NON REPEATED NUMS - TEST\n");
        ArrayList<Integer> sortedNumberList = exerciseAL.QuickSort(numberList);
        for (Integer number : sortedNumberList){
            System.out.printf(number + " ");
        }

        // QuickSortRepeated
        ArrayList<Integer> numberList1 = new ArrayList<>();
        numberList1.add(4);
        numberList1.add(7);
        numberList1.add(8);
        numberList1.add(2);
        numberList1.add(6);
        numberList1.add(6);
        numberList1.add(5);
        numberList1.add(1);
        numberList1.add(9);
        numberList1.add(3);

        System.out.println("\n\nQUICK SORT ALGORYTHM - REPEATED NUMS - TEST\n");
        ArrayList<Integer> sortedNumberList1 = exerciseAL.QuickSortRepeated(numberList1);
        for (Integer number : sortedNumberList1){
            System.out.printf(number + " ");
        }



        // ************************************************************************************************************
        // ************************************************************************************************************
        //  ******************************************OTHER STUFF NOT COMPLETED ***************************************
        // ************************************************************************************************************
        //  ***********************************************************************************************************



        // -------------------------------------------------------------------------------------------------------------


        /*
        boolean[] pisos = new boolean[] {
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false, false, false, false,
                false, false};

                true, true, true, true, true,
                false, false, false, false, false,
                true, true};
         System.out.printf("Highest safe floor for the egg is %d", getBHighestFloor(pisos));
         */

    }

























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





}





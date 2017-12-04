package com.example.idea;

/**
 * Created by rventoso on 30/11/2017.
 */
public class SGrider {

    public void FizzBuzz() {

        for (int i = 1 ; i <= 100; i++){
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }
    }

    public String reversingString(String input) {
        int len = input.length();
        int maxIdx = len - 1;
        char[] chars = input.toCharArray();
        for (int i = 0; i < len /2 ; i++) {
            char temp = chars[i];
            chars[i] = chars[maxIdx - i];
            chars[maxIdx - i] = temp;
        }
        return new String(chars);
    }

    public int[][] chunkArray(int[] src, int size){
        int chunks = src.length % size == 0 ? src.length / size : src.length / size + 1;
        int[][] arr = new int[chunks][size];
        int row = 0;
        for (int i = 0; i < src.length; i++) {
            int m = i % size;
            arr[row][ m] = src[i];
            if (m == size - 1) row++;
        }
        return arr;
    }
}

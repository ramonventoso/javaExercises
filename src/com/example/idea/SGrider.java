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

    public Boolean anagrams(String s1, String s2) {
        s1 = s1.replaceAll("[^\\w\\s]", "").toLowerCase();
        s2 = s2.replaceAll("[^\\w\\s]", "").toLowerCase();
        int[] map = new int[256];
        for (int i = 0; i < s1.length(); i++){
            map[(int)s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++){
            map[(int)s2.charAt(i)]--;
        }
        for (int i = 0 ; i < 256; i++){
            if (map[i] != 0) return false;
        }
        return true;
    }

    public Boolean anagrams2(String s1, String s2) {
        s1 = s1.replaceAll("[^\\w\\s]", "").toLowerCase();
        s2 = s2.replaceAll("[^\\w\\s]", "").toLowerCase();
        if (s1.length() != s2.length()) return false;
        int[] map = new int[256];
        for (int i = 0; i < s1.length(); i++){
            map[(int)s1.charAt(i)]++;
            map[(int)s2.charAt(i)]--;
        }

        for (int i = 0 ; i < 256; i++){
            if (map[i] != 0) return false;
        }
        return true;
    }

    public String capitalize(String str) {
        char[] arr = str.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == ' ') {
                arr[i + 1] = Character.toUpperCase(arr[i + 1]);
            }
        }
        return new String(arr);
    }

    public void steps(int n) {
        for (int i = 1; i <= n; i++){
            //System.out.println(new String(new char[i]).replace("\0", "#"));
            char[] fmt = new char[n];
            for (int j = 0; j < i; j++) {
                fmt[j] = '#';
            }
            System.out.println(new String(fmt));
        }
    }

    public void stepsR(int n, int w) {
        if (n == 0) return;
        stepsR(n - 1, w);
        char[] fmt = new char[w];
        for (int j = 0; j < w; j++) {
            fmt[j] = (j < n) ? '#' : ' ';
        }
        System.out.println(new String(fmt));

    }

    public void pyramid(int n, int width ){
        if (n == 0) return;
        pyramid(n -1, width);
        char[] arr = new char[width];
        int center = width / 2;
        for (int j = 0; j < width ; j++){
            arr[j] = (j >= center - n + 1 && j <= center + n - 1) ? '#' : ' ';
        }
        System.out.println(new String(arr));
    }

    public int vowels(String str) {
        int orig = str.length();
        int consonants = str.toLowerCase().replaceAll("[aeiou]", "").length();
        return orig - consonants;
    }

}

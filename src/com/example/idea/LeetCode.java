package com.example.idea;

import java.util.HashMap;

/**
 * Created by rventoso on 04/11/2017.
 */
public class LeetCode {

    // PROBLEM 1 LC My solution ACCEPTED
    public int[] getIndices(int[] nums, int target)
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
    public ListNode addTwoNumbersBF(ListNode l1, ListNode l2) {

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

    public int getNumber(ListNode ln){
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
    public int lengthOfLongestSubstringSlow(String s) {
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
    public int lengthOfLongestSubstring(String s) {
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

    public int reverse(int x) {
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
    public int singleNumber(int[] nums) {
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

    public int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i<nums.length; i++)
        {
            result ^=nums[i];
        }
        return result;

    }

    // PROBLEM 535 LC  ACCEPTED

    // Encodes a URL to a shortened URL.
    public String encode1(String longUrl, HashMap<Integer, String> map) {
        int code = longUrl.hashCode();
        map.put(code, longUrl );
        return "http://tinyurl.com/" + code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode1(String shortUrl, HashMap<Integer, String> map) {
        return map.get(Integer.parseInt(shortUrl.replaceAll("http://tinyurl.com/","")));
    }

    // PROBLEM 535 LC  ACCEPTED   roman to int
    public int romanToInt(String roman) {
        HashMap<Character, Integer> romans = new HashMap<>();

        int c;
        int n;
        int result = 0;

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int i = 0;
        while(i < roman.length() -1) {
            c = romans.get(roman.charAt(i));
            n = romans.get(roman.charAt(i + 1));
            if (c < n) {
                result += n - c;
                i = i + 2;
            }
            else {
                result += c;
                i++;
            }
        }
        if (i == roman.length() - 1) {
            result += romans.get(roman.charAt(i));
        }
        return result;
    }

    public int romanToInt2(String roman) {
        HashMap<Character, Integer> romans = new HashMap<>();

        int c;
        int n;
        int result = 0;

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        for (int i = 0; i < roman.length() -1; i++) {
            c = romans.get(roman.charAt(i));
            n = romans.get(roman.charAt(i + 1));
            if (c < n) {
                result -= c;
            }
            else {
                result += c;
            }
        }
        result += romans.get(roman.charAt(roman.length() -1));

        return result;
    }















}

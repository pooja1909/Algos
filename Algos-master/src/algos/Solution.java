/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string:");

        String str = new String(br.readLine());
        int red_val = reduceStr(str);
        System.out.println(red_val);

        //replace d with c
        // reduce the letter until it becomes a.
        // every reduction counted as a single operation
        // min of operations 
    }

    public static boolean Is_palindrome(String s) {
        boolean found = false;
        for (int i = 0, j = s.length() - 1; j >= i; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {   //checks whether the generated string is a palindrome
                return found;
            }
        }

        return true;
    }

    public static int reduceStr(String str) {
        boolean flag1 = false;
        int index = 1;

        if (str.length() == 1) {
            return 0;
        }
        flag1 = Is_palindrome(str); // checks the generated string is a palindrome or not
        if (flag1 == true) {
            return 0; //add the generated string into the hashset
        }

        for (int i = 0, j = str.length() - 1; j >= i; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                int count = check_char(str);
                return count;
            }
        }
        return -1;
    }

    public static int check_char(String str) {
        int count_of_op = 0;
        int i = str.length()-1;

        
        return count_of_op;

    }
}

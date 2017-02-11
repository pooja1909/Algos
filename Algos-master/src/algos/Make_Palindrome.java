/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

/**
 *
 * @author pooja
 */
import java.io.*;

public class Make_Palindrome {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the given string:");
        String s = br.readLine();
        int index = Remove(s);
        System.out.println(index);
        /*
         boolean flag = Is_palindrome(s);
         if(flag==true)
         System.out.println(-1);
         else
         System.out.println("not found");
         */
    }

    public static boolean Is_palindrome(String s) {
        boolean found = false;
        for (int i = 0, j = s.length() - 1; i < s.length() / 2 && j > i; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return found;
            }
        }

        return true;
    }

    public static int Remove(String s) {
        int index1 = 0;
        boolean flag1 = false;
        flag1 = Is_palindrome(s);
        if (flag1 == true) {
            return -1;
        }

        for (int i = 0, j = s.length() - 1; i < s.length() / 2 && j > i; i++, j--) {
           if(s.charAt(i)!=s.charAt(j))
           {
               if(s.charAt(i)==s.charAt(j-1))
               {
                   return j;
                   
               }
                if(s.charAt(j)==s.charAt(i+1))
               {
                   return i;
                   
               }
           }
        }
        return index1;
    }

}

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
import java.util.HashSet;


public class Pal {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the given string:");
        HashSet<String> hs = new HashSet<String>();
        String s = br.readLine();
        HashSet h = checkPal(s, hs);
        System.out.println(h);
        
    }

    public static boolean Is_palindrome(String s) {
        boolean found = false;
        for (int i = 0, j = s.length() - 1;  j >= i; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {   //checks whether the generated string is a palindrome
                return found;
            }
        }

        return true;
    }

    public static HashSet checkPal(String s, HashSet hs) {
        boolean flag1 = false;
        
         if(s.length()==1)
         {
          hs.add(s);  
          return hs;
         }
         if(s.length()<=0)
             return hs;
         flag1 = Is_palindrome(s); // checks the generated string is a palindrome or not
                if (flag1 == true) { 
                  hs.add(s); //add the generated string into the hashset
                }
               
                int i=0, j=s.length()-1;
                checkPal(s.substring(i, j),hs); //generating substrings;
                checkPal(s.substring(i + 1),hs); //generating substrings;
                
               
    
return hs;

}
}
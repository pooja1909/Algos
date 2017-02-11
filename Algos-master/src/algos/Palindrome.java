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
public class Palindrome {
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the given string:");
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        cal_palindrome("",s,k);
        
    }     
    
    public static void cal_palindrome(String prefix, String s, int k)
    {
        if(k==0)
        {
            System.out.println(prefix);
        return;
        }
        if(s.length()==0)
            return;
        cal_palindrome(prefix + s.charAt(0),s.substring(1),k-1);
        cal_palindrome(prefix ,s.substring(1),k);
        
    }
}

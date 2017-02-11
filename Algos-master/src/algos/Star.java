/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algos;

import java.io.*;

/**
 *
 * @author pooja
 */
public class Star {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of stars..");
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (4-i); j++)
                System.out.print(" ");
            
            for (int j = 1; j <= i ; j++) 
                System.out.print("*");
               System.out.println();
        }
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (4-i); j++)
                System.out.print("*");
            
            for (int j = 1; j <= i ; j++) 
                System.out.print(" ");
               System.out.println();
        }
    }
}

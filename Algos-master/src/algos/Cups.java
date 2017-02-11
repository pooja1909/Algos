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
public class Cups {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c1[]= new int[100];
     int prev_sum = 0;
        System.out.println("enter the capacty of the first cup:");
        for(int i=0 ; i <100 ; i++)
        {
            c1[i]= Integer.parseInt(br.readLine());
            prev_sum+= c1[i];
            c1[i+1]=c1[i+1]+prev_sum;
        }
      for(int i=0; i<100; i++)
      {
          System.out.println(c1);
      }
        
    }   
}

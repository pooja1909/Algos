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
public class sortBasedOnLength {
    public static void main(String args[])
    {
       String UnsortedString[] = {"aaaaaaaa","bbbbbbbbbbbbb","cccc","dd","e"};
       for(int i = 0 ; i < UnsortedString.length-1;i++)
       {
           for(int j= 0 ; j < UnsortedString.length-1; j++)
           {
           String temp;
           if(UnsortedString[j].length() > UnsortedString[j+1].length())
           {
               temp = UnsortedString[j];
               UnsortedString[j] = UnsortedString[j+1];
               UnsortedString[j+1]= temp;
           }
               
       }
       }
       
        for (String UnsortedString1 : UnsortedString) {
            System.out.print(UnsortedString1);
        }
    }
}

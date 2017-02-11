/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pooja
 */
import java.io.*;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
public class HashMapPrac {
    public static void main(String args[]) throws IOException
    {
        HashMap<Integer, String> hmap = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        HashSet<String> hset = new HashSet<>();
        HashSet<Character> hset2 = new HashSet<>();
        HashMap<Character,Integer> hmap2 = new HashMap<>();
        String str1[]= {"hello","hi","bye","hi"};
        String str2 = "abbbbcddddeeeee";
        for(int i = 0 ; i < str1.length ; i++)
        {
            hset.add(str1[i]);
        }
        
        
        
        char str_char[] = str2.toCharArray();
        
        for(int j = 0 ; j < str_char.length ; j++)
        {
           hset2.add(str_char[j]);
        }
        
    //    System.out.println(hset2);
        
        char str_char1[] = str2.toCharArray();
        for(int i=0 ; i <str_char1.length ; i++)
        {
            char ch = str_char1[i];
            if(hmap2.containsKey(ch))
           {
               hmap2.put(ch, hmap2.get(ch)+1);
           }
           else
                hmap2.put(ch,1); 
        }
            for(Map.Entry<Character,Integer> mp2 : hmap2.entrySet())
            {
                if(mp2.getValue()==1)
                {
                   System.out.println(mp2.getKey());
            }
        
            }
      
        
        arr.add("HELLO");
        arr.add("bye");
        
      //  System.out.println(arr);
        
        hmap.put(1,"pooja");
        hmap.put(2,"preeti");
        hmap.put(3,"sanjana");
        
       Set set = hmap.entrySet();
       Iterator itr = set.iterator();
       
       while(itr.hasNext())
       {
           Map.Entry mp = (Map.Entry)itr.next();
          //System.out.println("key:" + mp.getKey() + "value:" + mp.getValue());
       }
        for(Map.Entry mp1 : hmap.entrySet())   
        {
         // System.out.println(mp1.getKey());
         // System.out.println(mp1.getValue());
        }
       // System.out.println(hmap);
    }
}
}
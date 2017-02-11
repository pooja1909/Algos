/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution1 {
    
   
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        int _a;
        _a = Integer.parseInt(in.nextLine());
        
        int _b;
        _b = Integer.parseInt(in.nextLine());
        
        int _c;
        _c = Integer.parseInt(in.nextLine());
        
        int _d;
        _d = Integer.parseInt(in.nextLine());
        
        res = isitpossible(_a, _b, _c, _d);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }
    
    static String isitpossible(int a, int b, int c, int d) {
       
        String YES="Yes";
        String NO="No";
        if(a==c && b==d)
        return YES;
        if(a>c && b>d)
            return NO;
        isitpossible(a+b,b,c,d);
        isitpossible(a,a+b,c,d);
        
       

     return NO;
    }

    }
}
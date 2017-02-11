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
public class Frog_Time {
    
    public static void main(String args[])
    {
        int A[]={1,3,1,4,2,5};
        A.
        int D = 3,X = 7;
        int ct = check_time(A,X,D);
        System.out.println("ct" +ct);
    }
    
    public static int check_time(int A[],int X, int D)
    {
        int frog_pos = -1;
        if(D>=X)
            {
                return 0;
            }
        boolean leaf[] = new boolean[X-1];
        for(int i =0; i < A.length ; i++)
        {
            int frog_jump = 1;
            
            if((A[0]+D)>=X && A[0]<=D)
            return 0;
            
            
            leaf[A[i]-1] = true;
            while(frog_jump<=D)
            {
            if(leaf[frog_pos+frog_jump]==true)
            {
                frog_pos = frog_pos + frog_jump;
                if((frog_pos + D + 1) >= X)
                {
                    return i ;
                }
                frog_jump = 0;
            }
            frog_jump++;
            }
        }
        
        
        return -1;
    }
    
}

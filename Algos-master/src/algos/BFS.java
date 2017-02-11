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
import java.util.LinkedList;
import java.util.Iterator;
public class BFS {
  
  private int v1; // no of vertices;
  private LinkedList<Integer> adj[]; //Adjacency Lists
    // constructor
    BFS(int v)
    {
       v1 = v ;
       adj = new LinkedList[v];
       for(int i = 0 ; i < v ; i++)
           adj[i] = new LinkedList();
        
    }
    
    
    void addEdge(int u , int v)
    {
        adj[u].add(v);
}
    void bfs(int s)
    {
        boolean visited[] = new boolean[v1]; // all vertices are not visited;
        
        LinkedList<Integer> queue  = new LinkedList<Integer>();
        
        // start with the first node
        visited[s]=true;
        queue.add(s);
        
        while(queue.size()!=0)
        {
         // deque avertex and print it
            s = queue.poll();
            System.out.print(s+" ");
            
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                {
                    visited[n]= true;
                    queue.add(n);
                }
            }
        }
           
    }
    public static void main(String args[])throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("enter the number of nodes in the graph:");
        
        BFS b = new BFS(4);
        b.addEdge(0,1);
        b.addEdge(1,2);
        b.addEdge(2,1);

        
       b.bfs(2);
        
    }
}

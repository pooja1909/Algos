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
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hash {

    public static void main(String args[]) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(4, "hello");
        hmap.put(2, "hi");
        hmap.put(3, "bye");

        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {

            Map.Entry mp = (Map.Entry) iterator.next();
            System.out.println("key:" + mp.getKey() + "value:" + mp.getValue());

        }

        /*
         for (Map.Entry mp : hmap.entrySet())
         {
         System.out.println("key"+ mp.getKey()+"value:"+ mp.getValue());
         }
         */
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);

        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {

            Map.Entry mp1 = (Map.Entry) iterator2.next();
            System.out.println(mp1.getKey());
            System.out.println(mp1.getValue());
        }

        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        hm1.put("abc", 1);
        hm1.put("bcd", 2);
        System.out.println(hm1);

        Set set12 = hm1.entrySet();
        Iterator itr12 = set12.iterator();
        while (itr12.hasNext()) {
            Map.Entry m = (Map.Entry) itr12.next();
            System.out.println(m.getValue());
            System.out.println(m.getKey());

        }

        for (Map.Entry me : hm1.entrySet()) {
            System.out.println(me.getKey() + "the value:" + me.getValue());
        }

        Iterator itr123 = hm1.entrySet().iterator();
        while (itr123.hasNext()) {
            Map.Entry me123 = (Map.Entry) itr123.next();
            System.out.println(me123);
        }
    

    TreeSet<String> ts1 = new TreeSet<String>();

    ts1.add("bcd");
    ts1.add("xyz");
    System.out.println(ts1);
    
    }
    
}

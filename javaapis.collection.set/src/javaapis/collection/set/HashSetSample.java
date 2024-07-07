package javaapis.collection.set;

import java.util.HashSet;

import java.util.Iterator;

public class HashSetSample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("東京都");
        set.add("大阪府");
        set.add("北海道");
        set.add("広島県");
        set.add("北海道");

        for (String str : set) {
            System.out.println(str);
        }

        if (set.contains("広島県")) {
            System.out.println("広島県に行ったことがある");
        } else {
            System.out.println("広島県に行ったことがない");

            if (set.contains("群馬県")) {
                System.out.println("群馬県に行ったことがある");
            } else {
                System.out.println("群馬県に行ったことがない");
            }



            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                String item = (String) iterator.next();
                System.out.println(item);
            }

        }

    }

}

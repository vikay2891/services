package com.geekforgeek;

import java.util.*;

/**
 * @author vikas.bhardwaj3
 * 3/10/20201:23 PM2020
 */
class MyDataStructure {
    ArrayList<Integer> arrayList;
    HashMap<Integer, Integer> hashMap;

    MyDataStructure() {
        arrayList = new ArrayList<>();
        hashMap = new HashMap<>();
    }

    void add(int x) {
        if (hashMap.get(x) != null) {
            return;
        }
        int s = arrayList.size();
        arrayList.add(x);

        hashMap.put(x, s);
    }

    public Integer search(int i) {
        return hashMap.get(i);
    }

    void remove(int x) {
        Integer index = hashMap.get(x);
        if (index == null) {
            return;
        }
        hashMap.remove(x);
        int size = arrayList.size();
        Integer last = arrayList.get(size - 1);
        Collections.swap(arrayList, index, size - 1);
        arrayList.remove(size - 1);
        hashMap.put(last, index);
    }

    int randomElement() {
        Random random = new Random();
        int ele = random.nextInt(arrayList.size());
        return arrayList.get(ele);
    }
}

public class Main {


    public static void main(String[] args) {
        MyDataStructure myDataStructure = new MyDataStructure();
        myDataStructure.add(10);
        myDataStructure.add(20);
        myDataStructure.add(30);
        myDataStructure.add(40);
        System.out.println("my myDataStructure " + myDataStructure.search(30));
        myDataStructure.remove(40);
        myDataStructure.randomElement();
        System.out.println(myDataStructure);


    }
}

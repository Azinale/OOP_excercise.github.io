package com.oop.collections.mymap;

public class TestMyMap {
    public static void main(String[] args) {
        MyMap m = new MyHashMap();
        m.put(11, "nicola");
        m.put(11, "nicola");
        m.put(22, "marzia");
        m.put(77, "agata");
        m.put(177, "quy");
        System.out.println(m);
        System.out.println(m.size());

        System.out.println(m);

        System.out.println(m.contains(77));
        m.remove(22);
        m.remove(11);
        System.out.println(m);
        System.out.println(m.contains(77));
        System.out.println(m.size());

    }
}

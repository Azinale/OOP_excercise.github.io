package ex1;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;


public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            list.add(value);
        }
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            list.add(0, value);
        }
    }

    public static void replace(ArrayList<Integer> list, int value) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.remove(2);
        list.add(2, value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        list.removeAll(List.of(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            newList.add((int) Math.pow(i, 2));
        }
        return newList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        if (list == null) {
            return false;
        }
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if (source == null) {
            return;
        }
        target.clear();
        System.out.println(target);
        for (int i = 0; i < source.size(); i++) {
            target.add(i, source.get(i));
        }
        System.out.println(target);
    }


    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        int j = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            list.set(i, j);
            j--;
        }
    }

    public static void insertBeginEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }


}

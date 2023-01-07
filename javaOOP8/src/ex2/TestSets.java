package ex2;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> second = new HashSet<>(List.of(3, 4, 5, 6));
        System.out.println(lab8.ex2.Sets.intersectionManual(first, second));
        System.out.println(lab8.ex2.Sets.unionManual(first, second));
        System.out.println(lab8.ex2.Sets.intersection(first, second));
        System.out.println(lab8.ex2.Sets.union(first, second));
        List<Integer> list = lab8.ex2.Sets.toList(first);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        System.out.println(lab8.ex2.Sets.removeDuplicates(list));
        System.out.println(lab8.ex2.Sets.removeDuplicatesManual(list));
        System.out.println(lab8.ex2.Sets.firstRecurringCharacter("abacb"));
        System.out.println(lab8.ex2.Sets.allRecurringChars("mamma"));
        Integer[] arr = lab8.ex2.Sets.toArray(first);
        System.out.println(Arrays.toString(arr));
        TreeSet<Integer> treeSet = new TreeSet<>(first);
        System.out.println(lab8.ex2.Sets.getFirst(treeSet));
        System.out.println(lab8.ex2.Sets.getLast(treeSet));
        System.out.println(lab8.ex2.Sets.getGreater(treeSet, 2));
    }
}

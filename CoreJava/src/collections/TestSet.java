package collections;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    static void add(Set<? super String> set) {
        set.add("null");
        set.add("null");
        set.add("null");
        System.out.println(set.size());
    }
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        add(set);
    }
}
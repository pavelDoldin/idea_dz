package dz_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class task_1 {
    public static void main(String[] args) {
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
         */
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(9);
        ll.add(4);
        ll.add(7);
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
    }
}










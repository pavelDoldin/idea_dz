package dz_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task_5 {
    public static void main(String[] args) {
        ex2();
    }
    static void ex0(){
                /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
         */
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(9);
        list.add(8);
        list.add(11);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
    static void ex1(){
        /*Реализуйте очередь с помощью LinkedList со следующими методами:
        • enqueue() — помещает элемент в конец очереди,
        • dequeue() — возвращает первый элемент из очереди и удаляет его,
        • first() — возвращает первый элемент из очереди, не удаляя.
        */
        Method method = new Method();
        for (int i = 0; i < 5; i++) {
            method.enqueue(i);
        }
        System.out.println(method.list);
        System.out.println(method.dequeue());
        System.out.println(method.first());
    }
    static void ex2(){
        // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        int sum = 0;
        Random random = new Random();
        LinkedList <Integer> list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0,9));
            sum += list.get(i);
        }
        System.out.println(list);
        System.out.println(sum);
    }
}

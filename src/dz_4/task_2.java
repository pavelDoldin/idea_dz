package dz_4;

import java.util.Queue;

public class task_2 {
    public static void main(String[] args) {
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() — помещает элемент в конец очереди,
        dequeue() — возвращает первый элемент из очереди и удаляет его,
        first() — возвращает первый элемент из очереди, не удаляя.
         */
        Que queue = new Que();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            System.out.println(queue.list);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.list);
        System.out.println(queue.first());
        System.out.println(queue.list);
    }
}

package dz_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Method {
    LinkedList<Integer> list = new LinkedList<>();
    public void enqueue (int item){
        list.addLast(item);         // enqueue() — помещает элемент в конец очереди
    }
    public int dequeue() {
       return list.pollFirst();     // dequeue() — возвращает первый элемент из очереди и удаляет его
    }
    public int first(){
        return list.peekFirst();       //  first() — возвращает первый элемент из очереди, не удаляя
    }
}

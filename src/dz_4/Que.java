package dz_4;

import java.util.LinkedList;

public class Que {
    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int item){
        list.addLast(item);     // add.Last добовляет в конец списка
    }
    public int dequeue(){
        return list.pollFirst(); // возвращает первый элемент из очереди и удаляет его
    }
    public int first(){
        return list.peekFirst(); // возвращает первый элемент из очереди, не удаляя

    }
}













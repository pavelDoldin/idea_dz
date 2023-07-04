package dz_3;

import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList. Найти минимальное, максимальное и  арифметическое из этого списка.
        Collections.max()
         */
        int average = 0;
        List<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            list.add(rnd.nextInt(0,101));
        }
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i) ;
            average /= list.size();
        }
        

        System.out.println(list);
        System.out.println("Max " + Collections.max(list));
        System.out.println("Min " + Collections.min(list));
        System.out.println("average " + average);
        System.out.println(list.size());
    }

}




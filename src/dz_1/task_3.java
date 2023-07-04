package dz_1;

public class task_3 {
    public static void main(String[] args) {
        /*
        Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
         */
        int number = 1000;
        int k = 0;
        for(int j = 1; j < 1000; j ++){
            k = 0;
            for(int i = 1; i < j+1; i++){
                if (j % i == 0){
                    k++;
                }
            }
            if (k == 2){
                System.out.println(j);
            }
        }

    }
}

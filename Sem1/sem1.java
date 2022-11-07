package Java_Project.Sem1;

// + На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд


        // путь 1  2   3  4 
        // рез  0  1   0  1
        // опер 2  4    2 6  

public class sem1 {

    public static void main(String[] args) {
        int a = 1, b = 7;
        int c = 2,  d = 1;

        //Путь 1 - команда умножения
        int count_operation_1 = 0;
        boolean flag_to_continue = true, way_is_good_1 = false;
        int temp_val = a;
        System.out.println("Путь 1 - команда умножения"); 
        while (flag_to_continue){
            temp_val = command_mult(temp_val, c);
            if (temp_val > b){
                flag_to_continue = false;
            }
            else if (temp_val == b){
                way_is_good_1 = true;
                flag_to_continue = false;
            }
            ++count_operation_1;
            String res = String.format("%d - %d  - %d - %b - %b", temp_val, b, count_operation_1, flag_to_continue, way_is_good_1);
            System.out.println(res); 
        }

        //Путь 2 - команда сложения
        // System.out.println("\nПуть 2 - команда сложения"); 
        // int count_operation_2 = 0;
        // boolean  way_is_good_2 = false;
        // flag_to_continue = true;
        // temp_val = a;
        // while (flag_to_continue){
        //     temp_val = command_add(temp_val, d);
        //     if (temp_val > b){
        //         flag_to_continue = false;
        //     }
        //     else if (temp_val == b){
        //         way_is_good_2 = true;
        //         flag_to_continue = false;
        //     }
        //     ++count_operation_2;
        //     String res = String.format("%d - %d  - %d - %b - %b", temp_val, b, count_operation_1, flag_to_continue, way_is_good_2);
        //     System.out.println(res); 
        // }

        /*
        //Путь 3
        int count_operation_3 = 0;
        for команда 1
            if 
            for  команда 2
                if
        //Путь 4
        int count_operation_4 = 0;
        for команда 2
            if 
            for  команда 1
                if
        */       
    }
    public static int command_mult(int value, int additinal){
        return value * additinal;

    }
    public static int command_add(int value, int additinal){
        return value + additinal;
    }
}
        
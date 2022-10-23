// Написать программу, показывающую последовательность
//  действий для игры “Ханойская башня”

package Java_Project.HomeWork_2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Введите количество дисков: ");
        Scanner disk = new Scanner(System.in);
        int count = disk.nextInt();
        moveDisc('A', 'B', 'C', count);
    }

    public static void moveDisc(char a, char b, char c, int count) {

        if (count == 1) {
            System.out.printf("%s %d %s %c %s %c%n" , "кольцо", count, "со столбика",a, "на столбик", b);
            // System.out.println(String.format("С башни %s на башню %s", a, b));
        } else {
            moveDisc(a, c, b, count - 1);
            System.out.printf("%s %d %s %c %s %c%n" , "кольцо", count, "со столбика", a, "на столбик", b);
            // System.out.println(String.format("С башни %s на башню %s", a, b));
            moveDisc(c, b, a, count - 1);
        }

    }
}

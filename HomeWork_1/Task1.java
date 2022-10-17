// Написать программу вычисления n-ого треугольного числа.


package Java_Project.HomeWork_1;
import java.util.Scanner;
public class Task1{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число n, для вычисления n-ого треугольного числа:");

        int n = number.nextInt();

        if (n < 0) {
            System.out.println("Нужно целое положительное число.");
        } else {
            System.out.println("Для n = " + n + " треугольное число = " + triangularNumber(n));
        }
    }

    public static int triangularNumber(int n) {

        return ((n * (n + 1)) / 2);
    }
}
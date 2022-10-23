// Реализовать алгоритм сортировки вставками

package Java_Project.HomeWork_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public Task2() {
    }

    public void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current; 
        }

    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)        
            System.out.print(arr[i] + " " );
            
    }

    public static void main(String args[]) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int g = number.nextInt();
        int[] array = new int[g];
        int minRandom;
        int maxRandom;

        Scanner min = new Scanner(System.in);
        System.out.println("Введите минимальное число в массиве:");
        minRandom = min.nextInt();

        Scanner max = new Scanner(System.in);
        System.out.println("Введите максимальное число в массиве:");
        maxRandom = max.nextInt();

        Random random = new Random(System.currentTimeMillis());
        System.out.print("Не отсортированно:");
        System.out.println();
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            array[i] = minRandom + random.nextInt(maxRandom - minRandom + 1);

            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        final Task2 ob = new Task2();
        ob.insertionSort(array);
        System.out.println();
        System.out.println("Отсортированно:");
        System.out.print("[ ");
        printArray(array);
        System.out.print("]");
    }

    public static List<Integer> intsInRange(int size, int lowerBound, int upperBound) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(ThreadLocalRandom.current().nextInt(lowerBound, upperBound));
        }
        return result;
    }

    public class intsInRange {
    }
}
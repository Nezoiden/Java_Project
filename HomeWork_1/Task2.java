// Реализовать алгоритм пирамидальной сортировки (HeapSort)

package Java_Project.HomeWork_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public Task2() {
    }

    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int g = number.nextInt();
        int[] array = new int[g];
        int minRandom = 1;
        int maxRandom;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное число в массиве:");
        maxRandom = scanner.nextInt();

        Random random = new Random(System.currentTimeMillis());
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            array[i] = minRandom + random.nextInt(maxRandom - minRandom + 1);

            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        final Task2 ob = new Task2();
        ob.sort(array);
        System.out.println();
        System.out.println("отсортированно:");
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

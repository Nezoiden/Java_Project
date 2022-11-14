package Java_Project.HomeWork_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class quick {
    public quick() {
    }
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить, если длина массива равна 0

        if (low >= high)
            return;//завершить если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
    }

    // вызов рекурсии для сортировки левой и правой части
        if (low < j)
        quickSort(array, low, j);

    if (high > i)
            quickSort(array, i, high);
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
            final quick ob = new quick();
            int low = 0;
            int high = array.length - 1;
            ob.quickSort(array, low, high);
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


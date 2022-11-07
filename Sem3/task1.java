// Описать структуру такую, что:
// Есть хранилище, можно добавить извлечь.
// 0 0 0 0 0 0 0 0 0 0
// void myadd (int item)
// int myremove (void)
// myadd(2)
// 2 0 0 0 0 0 0 0 0 0
// myadd(12)
// 2 12 0 0 0 0 0 0 0 0
// myadd(1)
// 2 12 1 0 0 0 0 0 0 0
// el = myremove()
// 12 1 0 0 0 0 0 0 0 0
// el = myremove()
// 1 0 0 0 0 0 0 0 0 0
// myadd(14)
// 1 14 0 0 0 0 0 0 0 0


package Java_Project.Sem3;

public class task1 {
    

        public static void main(String[] args) {
      
          Lib.print();
          Lib.add(1);
          Lib.print();
          Lib.add(2);
          Lib.print();
          Lib.add(3);
          Lib.print();
          System.out.println(Lib.remove());
          Lib.print();
          System.out.println(Lib.remove());
          Lib.print();
          System.out.println(Lib.remove());
      
          Lib.print();
          Lib.add(1);
          Lib.print();
          Lib.add(2);
          Lib.print();
          Lib.add(3);
          Lib.print();
      
          System.out.println(Lib.remove());
          Lib.print();
      
        }
      
        static int getWays(int s, int e, int p, int m) {
          int[] ways = new int[e + 1];
      
          ways[s] = 1;
      
          for (int i = s + 1; i <= e; i++) {
            if (i % m == 0)
              ways[i] = ways[i - p] + ways[i / m];
            else
              ways[i] = ways[i - p];
          }
      
          for (int i : ways) {
            System.out.printf("%d ", i);
          }
          System.out.println();
          return ways[e];
        }
      
      }
      
      class Lib {
      
        static int position = 0;
        static int[] storage = new int[11];
      
        static void clear() {
          position = 0;
          int size = storage.length;
          for (int i = 0; i < size; i++) {
            storage[i] = 0;
          }
        }
      
        static void print() {
          for (int i = 0; i < storage.length; i++) {
            System.out.printf(storage[i] + " ");
          }
          System.out.println();
        }
      
        static void shift() {
          for (int i = 0; i <= position; i++) {
            storage[i] = storage[i + 1];
          }
          storage[position] = 0;
          position--;
        }
      
        static void add(int item) {
          if (position >= storage.length)
            return;
          storage[position++] = item;
        }
      
        static int remove() {
          int el = storage[0];
          shift();
          return el;
        }
      
      }
      
 
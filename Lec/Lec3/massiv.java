package Java_Project.Lec.Lec3;

public class massiv {
    // public static void main(String[] args) {
    //     int[] a = new int[] { 1, 9,};
    //     int[] b = new int[3];
    //     System.arraycopy(a, 0, b, 0, a.length);
 
    //     for (int i : a) { System.out.printf("%d ", i);} // 1 9
 
    //     for (int j : b) { System.out.printf("%d ", j);} 
    //     // 0 9 0 0 0 0 0 0 0 0
    // }
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 };
        for (int i : a) { System.out.printf("%d ", i); }
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        for (int j : a) { System.out.printf("%d ", j); }
    }
 


 }
//  Удобный массив»
// Разные способы создания
// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3


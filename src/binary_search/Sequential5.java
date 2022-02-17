package binary_search;

public class Sequential5 {
    public static void main(String[] args) {
        SequentialSearch(new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37}, 5);
    }
    public static void SequentialSearch(int[] array, int x) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println(-1);
        } else {
            System.out.println(index);
        }
    }
}

package binary_search;

public class Hailstone {
    public static void main(String[] args) {
        hailhitler(17);
    }
    public static void hailhitler(int x) {
        for (int i = 0; i < 10; i++) {
            if (x % 2 == 0) {
                x = x / 2;
                System.out.println(x);
            } else {
                x = x * 3 + 1;
                System.out.println(x);
            }
        }
    }

}

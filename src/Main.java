import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[6];
        for (int i = 0; i < 6; i++){
            a[i] = random.nextInt();
            System.out.println(a[i]);
        }
    }
}
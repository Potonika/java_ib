import java.util.*;

public class Jan05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int b;

        for (int i = 0; i < n-2; i++){
            b = a.get(i);
            a.set(i, a.get(i+2));
            a.set(i+2, b);
        }

        for (int i = 0; i < n; i++){
            System.out.println(a.get(i));
        }
    }
}


package Jan08;
import java.util.ArrayList;
import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] a = scanner.nextLine().split(" ");
        int n = Integer.parseInt(a[0]);
        int d = Integer.parseInt(a[1]);
        String s[] = scanner.nextLine().split(" ");


        ArrayList<String> b = new ArrayList<>(n);

        for (int i = 0; i < s.length; i++) {
            b.add(i, s[i]);
        }

        for (int i = 0; i < d; i++){
            b.add(b.size()-1, b.get(0));
            b.remove(0);
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i)+ " ");
        }

    }
}

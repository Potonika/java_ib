package blah_blah;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    static void zeroend (int a[],int n){
        int zero = 0;
        for (int i = 0; i < n; i++){
            if (a[i] != 0){
                a[zero] = a[i];
                zero++;
            }
        }
        while (zero < n) {
            a[zero] = 0;
            zero++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        int [] a = new int [number];
        String s[] = scanner.nextLine().split(" ");
        for(int i = 0; i < s.length; i++) {
            a[i] = Integer.valueOf(s[i]);
        }

        zeroend(a, number);

        for (int i=0; i<number; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

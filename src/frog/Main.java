package frog;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int one = 1;
        for (int i = 1; i <= a; i++){
            one = one*i;
        }
        System.out.println(one);
    }
}

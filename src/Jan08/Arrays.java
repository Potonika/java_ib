package Jan08;
import java.util.Scanner;
import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split(" ");
        int [] array = new int [s.length];
        for (int i = 0; i < s.length; i++){
            array[i] = Integer.parseInt(s[i]);
        }
        int [] a = new int[array.length/2];
        int [] b = new int[array.length - array.length/2];
        int d = 0;
        for (int i = 0; i < array.length; i++){
            if (i <= ((array.length/2)-1)){
                a[i] = array[i];
            } else {
                b[d] = array[i];
                d++;
            }
        }
        int multiple = 1;
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            multiple = multiple * a[i];
            sum = sum + a[i];
        }
        System.out.println("Product of the first array: "+ multiple + ". Sum: "+sum+".");
        int multiple1 = 1;
        int sum1 = 0;
        for (int i = 0; i < b.length; i++){
            multiple1 = multiple1 * b[i];
            sum1 = sum1 + b[i];
        }
        System.out.println("Product of the second array: "+ multiple1 + ". Sum: "+sum1+".");
    }
}

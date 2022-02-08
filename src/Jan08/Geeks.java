package Jan08;
import java.util.Scanner;

public class Geeks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split(" ");
        String a = "";
        for (int i = 0; i < s.length-1; i++){
            if (s[i].length() > s[i+1].length()){
                a = s[i];
            }
        }
        System.out.println(a);
    }
}

package HWFeb22;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s[] = scanner.nextLine().split(" ");
        for (int i = 0; i < s.length; i++){
            if (i == 0){
                System.out.print(s[i]+ " is first,");

            }
            else if (i == s.length-1){
                System.out.print(" "+s[i]+ " is last.");

            }
            else{
                System.out.print(" "+s[i]+" is after "+s[i-1]+" and below "+s[i+1]+ ",");
            }
        }
    }
}

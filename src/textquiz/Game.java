package textquiz;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        System.out.println("Howdy! You want to marry the princess but the king wishes to challenge you before that.");
        System.out.println("So you go and find a dragon! 2 options: forest or fields. What do you chose?");

        Scanner scanner = new Scanner(System.in);
        String answer1 = scanner.nextLine();

        if (answer1.equals("forest")){
            Forest forest = new Forest();
            forest.arrive();
            String answer2 = scanner.nextLine();
            if (answer2.equals("bushes")){
                forest.bushes();
            }
            else if (answer2.equals("trees")){
                forest.trees();
            }
        } else if (answer1.equals("fields")){
            Fields fields = new Fields();
            fields.arrive();
            String answer2 = scanner.nextLine();
            if (answer2.equals("bushes")){
                fields.bushes();
            }
            else if (answer2.equals("birch")){
                fields.birch();
            }
        }
    }
}

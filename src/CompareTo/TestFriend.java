package CompareTo;

public class TestFriend {

    public static void main(String args[]) {

        Friend friend1 = new Friend("Liana","Marty", "8987", "31/12");
        Friend friend2 = new Friend("Boris","Greed", "4865", "21/01");

        int compared = friend2.compareTo(friend1);
        System.out.println(compared);
        if (compared == 0){
            System.out.println(friend1.firstName+" "+ friend1.lastName+" "+"goes first");
        } else if (compared == 1){
            System.out.println(friend2.firstName+" "+ friend2.lastName+" "+"goes first");
        } else {
            System.out.println("Two friends' names are the same");
        }
    }
}
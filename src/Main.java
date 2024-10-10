import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ofAge = 21;
        int userAge = 0;

        System.out.print("How old are you?");
        userAge = in.nextInt();
        if (userAge >= ofAge) {
            System.out.println("You are of age and get a wristband!!");
        }
    }
}
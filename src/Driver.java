import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Good day what is your name");
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Welcome " + name);
        input.close();

    }
}

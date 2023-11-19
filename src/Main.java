
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number;
        do {
            System.out.print("Input a number: ");
            number = scanner.nextInt();
            if (number != 1) {
                System.out.println("didnt guess");
            }
        }
        while (number == 1);
        scanner.close();
        System.out.println("Hi");
    }

}
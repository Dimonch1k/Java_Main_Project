package Claswork_1.ua;

import java.util.Scanner;
public class Question {
    Scanner scanner = new Scanner(System.in);
    public int reOrder(Scanner scanner)
    {
        System.out.println("Do you want to order something else?");
        String answer = scanner.next();
        answer.toLowerCase();
        if (answer.equals("yes")) {
            return 1;
        }
        return 0;
    }
    public void leaveRestaurant()
    {
        System.out.println("Do you want to leave the restaurant?");
        String answer = scanner.next();
        if (answer.equals("yes")) System.exit(0);
    }
}

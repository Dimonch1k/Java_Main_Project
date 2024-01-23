package ua.Classwork_1;

import java.util.Scanner;

public class Questions {

    public boolean reOrder() {
        System.out.println("Do you want to order something else?");
        String answer = ScannerManager.getInstance().next();
        return (answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"));
    }

    public boolean leaveRestaurant() {
        System.out.println("Do you want to leave the restaurant?");
        String answer = ScannerManager.getInstance().next();
        return answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n");
    }
}

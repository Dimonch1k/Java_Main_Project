package org.itstep.mystat;

import java.util.ArrayList; // Import for ArrayList
import java.util.List;      // Import for List
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        int array[] = {1, 5, 7, 10 };
        /*
        for (int i = 0; i < 10; i++)
        {
            System.out.println("It's me!!!");
        }*/

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        }

        List<Integer> ints = new ArrayList<>();


        List<Integer> ints2 = new ArrayList<>();
        ints.forEach(i -> { System.out.println(i); System.out.println(" "); } );



        Vechicle vechicle = new Car(50, "Car");
        vechicle.drive();


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(a);
    }
}

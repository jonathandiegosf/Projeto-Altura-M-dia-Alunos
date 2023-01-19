package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Height;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with number of people: ");
        int n = sc.nextInt();
        Height[] vect = new Height[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("People number " + (i + 1) + ": ");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Age: ");
            Integer age = sc.nextInt();
            System.out.print("Height: ");
            Double height = sc.nextDouble();
            vect[i] = new Height(name, age, height);
        }

        System.out.println();

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum = sum + vect[i].getHeight();
        }

        double avg = sum / vect.length;
        System.out.println("Average Height: " + String.format("%.2f", avg));

        int minorOf16 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                minorOf16 += 1;
            }
        }
        double percentage = minorOf16 * 100.0 / vect.length;
        System.out.println("People under 16 years old: " + String.format("%.2f", percentage) + "% ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }

        }

        sc.close();

    }
}

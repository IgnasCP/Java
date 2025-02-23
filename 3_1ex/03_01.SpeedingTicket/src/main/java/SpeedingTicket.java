package src.main.java;

import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner checkSpeed = new Scanner(System.in);
        System.out.println("Give speed: ");
        int speed = checkSpeed.nextInt();
        System.out.println("Give speed: " + speed);

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
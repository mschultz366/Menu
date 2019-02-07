package com.company;

import java.util.Scanner;

    public class Main {



        public static void main(String[] args) {

            int choice = 0;
            Scanner sc = new Scanner(System.in);
            do {

                System.out.println("Pet services: ");
                System.out.println("1\tFeed");
                System.out.println("2\tWash");
                System.out.println("3\tWash and walk");
                System.out.println("4\tWalk");
                System.out.println("5\tGroom toes\n");

                System.out.print("Which service would you like: ");

                switch (choice = sc.nextInt()) {
                    case 1: System.out.print("You chose: Feed");
                        break;
                    case 2: System.out.print("You chose: Wash");
                        break;
                    case 3: System.out.print("You chose: Wash and walk");
                        break;
                    case 4: System.out.print("You chose: Walk");
                        break;
                    case 5: System.out.print("You chose: Groom toes");
                        break;
                    default: System.out.print("You chose: an invalid option...\n\n");
                        break;
                }
            } while (choice > 5);


        }
}

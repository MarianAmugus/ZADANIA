package pl.marianklosinski;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                System.out.println("Hej ! Jestem Programem Generujacym Klepsydry!");
                System.out.println("Jaka Klepsydre chcesz zobaczyc?");
                System.out.println("Ze wzlgedu na krzsztalt klepsydry jesli podasz liczbe parzysta - powiekszymy ja o 1");
                System.out.println("Podaj wysokosc Klepsydry ");


                int wys = scanner.nextInt();
                wys = wys /2 ;
                if (wys % 2 == 0 || wys % 2 == 1 ){wys++;}


                for (int i = 1; i <= wys; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }

                    for (int k = i; k <= wys; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                for (int i = wys - 1; i >= 1; i--) {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }

                    for (int k = i; k <= wys; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                scanner.close();
            }
        }



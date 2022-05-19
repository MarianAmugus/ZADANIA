import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            System.out.println("Tester libcz superPierwszych");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczby do przetestowania:");
            int x = scanner.nextInt();

            if (getSuperPierwsza(x)) {
                System.out.println(x + " jest liczba superPierwsza");
            } else {
                System.out.println(x + " nie jest liczba superPierwsza");
            }
        }

        public static boolean getSuperPierwsza(int liczby) {
            if (liczby <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(liczby); i++) {
                if (liczby % i == 0) {
                    return false;
                }
            }
            return true;

        }
    }


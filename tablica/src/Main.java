public class Main {

        public static void main(String[] args) {


            int[] tablica = {1, 2, 3, 4, 5, 6, 7};
            System.out.println("Czy tablica jest posortowana?");
            System.out.println(czyPosortowana(tablica));


        }

        private static boolean czyPosortowana(int[] tablica) {

            for (int i = 0; i < tablica.length; i++)

                for (int j = i + 1; j < tablica.length; j++)

                    if (tablica[j] < tablica[i]) {
                        return false;
                    }
            return true;
        }
    }










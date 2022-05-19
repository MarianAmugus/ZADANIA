public class alama {

    public static void main(String[] args) {
        // String n1 = "ala";
        //String n2 = "ala";
        //sout(n1 == n2); //da true
        //ale juz
        //String n3 = "ala ma kota".substring(0,3);
        //sout(n1 == n3); // da false?
        String n1 = "ala";
        String n2 = "ala";
        System.out.println(n1 == n2);

        String n3 = "ala ma kota".substring(0, 3);
        System.out.println(n1 == n3);

        // Wynik jest fasle dlatego, ze "ala" to 3 znaki a "ala ma kota".substrin(0.3);
        // to 4 znaki, tylko ze pierwsze 3 sa widoczne a 4 jest ukryty.
        //  Jaki i Dlugosc nie jest rowna indexowi
        System.out.println(n3);
        System.out.println(n1);

        String n4 = "ala ma kota".substring(0, 3);

        boolean results = n4.equals(n2);
        System.out.println(results);

        //Wobec tego nie porownujemy za pomoca == tylko za pomoca metodyka equals


    }
}

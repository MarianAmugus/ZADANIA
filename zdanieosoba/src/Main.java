
import javax.naming.directory.SearchResult;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Osoba> osobaList = new ArrayList<>();

        osobaList.add(new Osoba("Andrzej", "Sapkowski", 55));
        osobaList.add(new Osoba("Andrzej", "Lepper", 66));
        osobaList.add(new Osoba("Krzysztof", "Krawczyk", 21));
        osobaList.add(new Osoba("Ania", "Zgorksa", 88));


        Optional<Osoba> optional = osobaList.stream()
                .max((a1, a2) -> a1.getAge() - a2.getAge());
        Optional<Osoba> optional1 = osobaList.stream()
                .min((a1, a2) -> a1.getAge() - a2.getAge());
        Osoba najmlodasza = optional1.get();

        Osoba najstarsza = optional.get();
        System.out.println("Najstarsza Osoba to;" + najstarsza.getName() + " " + najstarsza.getAge());
        System.out.println("A osoba najmlodsza to:" + najmlodasza.getName() + " " + najmlodasza.getAge());


    }
}
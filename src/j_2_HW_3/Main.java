package j_2_HW_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] set1 = {"Barsik", "Murzik", "Turbo", "Kinya", "Barsik", "Murzik", "Murka",
                "Kanye", "Persik", "Bulba", "Bazuka", "Kucher", "Tuna", "Kanye", "Persik",
                "Barsik", "Murzik", "Turbo"};
        System.out.println(Arrays.toString(set1));


        Map<String, Integer> mm = new HashMap<>();
        for (String s : set1) {
            mm.put(s, mm.getOrDefault(s, 0) + 1);
        }
        System.out.println(mm);

        PhoneBook phBook = new PhoneBook();
        phBook.add("Petrov","89115423885");
        phBook.add("Vasilev","89995522668");
        phBook.add("Petrov","89445322658");
        phBook.add("Kurbanov","81589965321");
        phBook.add("Petrov","89998753214");
        phBook.add("Vasilev","89223456852");
        phBook.add("Ivannikov","89663785422");
        phBook.add("Petrov","98765432155");

        System.out.println("Тел: " + phBook.get("Petrov"));
        System.out.println("Тел: " + phBook.get("Kurbanov"));

    }
}



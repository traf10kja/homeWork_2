package j_2_HW_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private HashMap<String, Set<String>> pBook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        Set<String> phoneN = pBook.getOrDefault(name, new HashSet<>());
        phoneN.add(phoneNumber);
        pBook.put(name, phoneN);
    }

    public Set<String> get(String name) {
        return pBook.get(name);
    }

}



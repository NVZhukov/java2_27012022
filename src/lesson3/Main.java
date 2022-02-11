package lesson3;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] color = new String[]{"Red", "Blue", "Yellow", "White", "Black", "White",
                "Orange", "Red", "Blue", "Red", "Black", "Blue", "Yellow", "White",};
        System.out.println(Arrays.toString(color));

        Map<String, Integer> map = new HashMap<>();
        for (String x : color) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        System.out.println(map + " ");

    PhoneNumber phoneNumber = new PhoneNumber();
    phoneNumber.add("Petrov", 880010020);
    phoneNumber.add("Ivanov", 836710520);
    phoneNumber.add("Petrov", 880010125);
    phoneNumber.add("Sidorov", 23446876);
    phoneNumber.add("Repin", 876812631);
    phoneNumber.add("Repin", 435367472);

        System.out.println(phoneNumber.get("Repin"));
        System.out.println(phoneNumber.get("Petrov"));
        System.out.println(phoneNumber.get("Ivanov"));
    }
}

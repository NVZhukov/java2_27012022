package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneNumber {
    private Map<String, Set<Integer>> phoneNum = new HashMap<>();

    public void add(String name, Integer num){
        Set<Integer> tell = phoneNum.getOrDefault(name, new HashSet<>());
        tell.add(num);
        phoneNum.put(name,tell);
    }

    public Set<Integer> get(String name){
        return phoneNum.get(name);
    }
}

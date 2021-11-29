package lect02;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        Map<String, Integer> converter = new HashMap<String, Integer>(){{
            put("I",1);
            put("II",2);
            put("III",3);
        }};

        System.out.println(converter.keySet());
        System.out.println(converter.values());

        for (String key : converter.keySet()){
            System.out.printf("ROMAN: %5s ARABIC %10d\n", key, converter.get(key));
        }

        System.out.println("If IV is in my converter: " + converter.containsKey("IV"));


    }
}

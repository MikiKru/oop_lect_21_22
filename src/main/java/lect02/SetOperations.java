package lect02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> numbers1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> numbers2 = new HashSet<>(Arrays.asList(3,4,4,5));
        System.out.println(numbers1);
        System.out.println(numbers2);
        // numbers1 union numbers2
        Set<Integer> resultSet = new HashSet<>(numbers1);
        resultSet.addAll(numbers2);
        System.out.println(numbers1);
        System.out.println(numbers2);
        System.out.println(resultSet);




    }
}

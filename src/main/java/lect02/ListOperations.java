package lect02;

import lect01.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "a", "a", false, LocalDateTime.now(), 'M'));
        users.add(new User(2, "b", "b", false, LocalDateTime.now(), 'M'));
        users.add(new User(3, "c", "c", false, LocalDateTime.now(), 'M'));
        users.set(1, new User());
        users.remove(1);
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println(users.get(1));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(11,2,3,2,12,4,5));
        for(int i = 0; i < numbers.size() - 1; i++){
            boolean isChanged = false;
            for (int j = 0; j < numbers.size() - 1; j++) {
                if(numbers.get(j) > numbers.get(j + 1)){
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j+1, temp);
                    isChanged = true;
                }
            }
            System.out.println(numbers);
            if (!isChanged){
                break;
            }
        }
        System.out.println("FINALLY: " + numbers);


        List<List<Integer>> matrix = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1,2,3)),
                        new ArrayList<>(Arrays.asList(4,5,6)),
                        new ArrayList<>(Arrays.asList(7,8,9))
                )
        );
        for (List<Integer> row : matrix) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }





    }
}

package lect02;

import lect01.User;

import java.time.LocalDateTime;

public class ArraysOperations {
    public static void main(String[] args) {
        User [] users = new User[10];
        users[1] = new User(1, "a","a",false, LocalDateTime.now(), 'M');
        for (User user : users){
            System.out.println(user);
        }
        System.out.println(users[1]);
    }
}

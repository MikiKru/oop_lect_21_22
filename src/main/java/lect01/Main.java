package lect01;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User(1,"mk","mk",true,
                LocalDateTime.now(), 'M');
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}

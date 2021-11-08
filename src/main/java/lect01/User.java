package lect01;

import lombok.*;

import java.time.LocalDateTime;

// model Java Beans
// 1. private fields
// 2. public getters/setters methods
// 3. toString()
//@Getter
//@Setter
//@ToString
@Data               // generate getters & setters & toString
@NoArgsConstructor  // default contructor
@AllArgsConstructor // constructor with all fields in args
public class User {
    // fields
    private int userId;
    private String userName;
    private String password;
    private boolean status;
    private LocalDateTime registrationDateTime;
    private char gender;
}

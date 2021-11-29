package lect03;

import lect01.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// CTRL + Space
public class LambdaExpression {
    private List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, -4, 2, 1, -7, 8, 100));
    private List<String> names = new ArrayList<>(Arrays.asList("John", "Michael", "Samuel", "Sami"));
    private List<User> users = new ArrayList<>(Arrays.asList(
            new User(1, "a@a.pl", "a", true, LocalDateTime.of(2020,2,10,10,10), 'M'),
            new User(2, "b@b.pl", "b", true, LocalDateTime.of(2021,5,2,10,10), 'F'),
            new User(3, "c@c.pl", "c", false, LocalDateTime.of(2020,12,12,10,10), 'M'),
            new User(4, "d@d.pl", "d", true, LocalDateTime.of(2021,3,20,10,10), 'F'),
            new User(5, "e@e.pl", "e", true, LocalDateTime.of(2020,5,20,10,10), 'M')
    ));
    public void filterAndOrderUsers(){
        System.out.println(users.stream().filter(user -> user.isStatus())
                .sorted(Comparator.comparing(user -> user.getRegistrationDateTime()))
                .map(user -> String.valueOf(user.getUserName() + " : " + user.getRegistrationDateTime()))
                .collect(Collectors.toList()));
    }
    public void findUserByUserName(String userName){
        if(users.stream().filter(user -> user.getUserName().equals(userName)).findFirst().isPresent()){
            System.out.println("Find: "+userName + "\nResult: " + users.stream()
                    .filter(user -> user.getUserName().equals(userName)).findFirst().get());
        } else {
            System.out.println("There is no user called " + userName);
        }

    }
    public void printAllElements(){
//        numbers                 // List<Integer.
//                .stream()       // Stream<Integer>
//                .forEach(number -> System.out.println(number));     // void
        numbers.forEach(System.out::print);
        System.out.println();
        names.forEach(name -> System.out.print(name + " "));
        System.out.println();
    }
    public void getStatistics(){
        System.out.println("MIN: " + numbers.stream().mapToInt(Integer::intValue).min().getAsInt());
        System.out.println("MAX: " + numbers.stream().mapToInt(Integer::intValue).max().getAsInt());
        System.out.println("AVG: " + numbers.stream().mapToInt(Integer::intValue).average().getAsDouble());
        System.out.println("SUM: " + numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println("COUNT: " + numbers.stream().mapToInt(Integer::intValue).count());
    }
    public void getElementsWithFilteringAndSorting(){
        List<String> filteredAndOrderedNames = names.stream()
                .filter(name -> name.length() > 4)
                .sorted(Comparator.comparing(String::toString).reversed())
                .collect(Collectors.toList());
        System.out.println(filteredAndOrderedNames);
        List<Integer> filteredAndOrderedNumbers = numbers.stream()
                .filter(number -> number > 0)
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList());
        System.out.println(filteredAndOrderedNumbers);
    }

    public static void main(String[] args) {
        LambdaExpression le = new LambdaExpression();
        le.printAllElements();
        le.getStatistics();
        le.getElementsWithFilteringAndSorting();
        le.filterAndOrderUsers();
        le.findUserByUserName("b@b.pl");
        le.findUserByUserName("b111@b.pl");

    }
}

package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person ruben = new Person("Ruben", LocalDate.of(2003, 2, 11));
        System.out.println(ruben);
    }
}

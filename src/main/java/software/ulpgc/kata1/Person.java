package software.ulpgc.kata1;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {
    private int age(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYears(long days) {
        return (int) days/365;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age() +
                '}';
    }
}

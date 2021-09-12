package de.seism0saurus.design.pattern.prototype.before;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        long start = new Date().getTime();

        Config config = new Config();

        //Create each student with the constructor
        Student mara = new Student("Mara", "Smith", config);
        System.out.println(mara);

        Student paul = new Student("Paul", "Doe", config);
        System.out.println(paul);

        Student abbey = new Student("Abbey", "Parker", config);
        System.out.println(abbey);

        Student john = new Student("John", "Adams", config);
        System.out.println(john);

        long end = new Date().getTime();
        System.out.println("Duration: "+ (end-start) + " ms");
    }
}

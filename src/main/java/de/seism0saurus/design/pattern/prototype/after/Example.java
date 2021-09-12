package de.seism0saurus.design.pattern.prototype.after;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        long start = new Date().getTime();

        Config config = new Config();

        //Create the prototype. This is the only usage of the slow constructor
        Student prototypeStudent = new Student("", "", config);

        //Use the prototype to clone the student and change the needed state
        Student mara = prototypeStudent.clone();
        mara.setName("Mara");
        mara.setSurname("Smith");
        System.out.println(mara);

        Student paul = prototypeStudent.clone();
        paul.setName("Paul");
        paul.setSurname("Doe");
        System.out.println(paul);

        Student abbey = prototypeStudent.clone();
        abbey.setName("Abbey");
        abbey.setSurname("Parker");
        System.out.println(abbey);

        Student john = prototypeStudent.clone();
        john.setName("John");
        john.setSurname("Adams");
        System.out.println(john);

        long end = new Date().getTime();
        System.out.println("Duration: "+ (end-start) + " ms");
    }
}

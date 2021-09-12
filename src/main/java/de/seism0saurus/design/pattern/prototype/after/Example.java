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
        mara.setName("Paul");
        mara.setSurname("Doe");
        System.out.println(paul);

        Student abbey = prototypeStudent.clone();
        mara.setName("Abbey");
        mara.setSurname("Parker");
        System.out.println(abbey);

        Student john = prototypeStudent.clone();
        mara.setName("John");
        mara.setSurname("Adams");
        System.out.println(john);

        long end = new Date().getTime();
        System.out.println("Duration: "+ (end-start) + " ms");
    }
}

package de.seism0saurus.design.pattern.prototype.optimized;

import java.util.Date;

public class Example {

    public static void main(String[] args) {
        long start = new Date().getTime();

        Config config = new Config();

        //Create the prototype. This is the only usage of the slow constructor
        Student prototypeStudent = new Student("", "", config);

        //Use the prototype to clone the student.
        //The correct change of the name and surname is handled in the clone method
        Student mara = prototypeStudent.clone("Mara", "Smith");
        System.out.println(mara);

        Student paul = prototypeStudent.clone("Paul", "Doe");
        System.out.println(paul);

        Student abbey = prototypeStudent.clone("Abbey", "Parker");
        System.out.println(abbey);

        Student john = prototypeStudent.clone("John","Adams");
        System.out.println(john);

        long end = new Date().getTime();
        System.out.println("Duration: "+ (end-start) + " ms");
    }
}

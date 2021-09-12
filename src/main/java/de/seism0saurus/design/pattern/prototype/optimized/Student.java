package de.seism0saurus.design.pattern.prototype.optimized;

public class Student implements Cloneable {

    private String name;
    private String surname;
    private String semester;

    public Student(String name, String surname, Config config) {
        this.name = name;
        this.surname = surname;
        this.semester = config.getSemester();
    }

    @Override
    public String toString() {
        return "Student " + name +
                ", " + surname +
                " in semester " + semester;
    }

    public Student clone(String name, String surname) {
        Student clone = null;
        try {
            clone = (Student) super.clone();
            clone.name = name;
            clone.surname = surname;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

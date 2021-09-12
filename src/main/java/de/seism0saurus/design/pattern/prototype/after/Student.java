package de.seism0saurus.design.pattern.prototype.after;

public class Student implements Cloneable {

    private String name;
    private String surname;
    private String semester;

    public Student(String name, String surname, Config config) {
        this.name = name;
        this.surname = surname;
        this.semester = config.getSemester();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student " + name +
                ", " + surname +
                " in semester " + semester;
    }

    public Student clone() {
        Student clone = null;
        try {
            clone = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

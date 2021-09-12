package de.seism0saurus.design.pattern.prototype.before;

public class Student {

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
}

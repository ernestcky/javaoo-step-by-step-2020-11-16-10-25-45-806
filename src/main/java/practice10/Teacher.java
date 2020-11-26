package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new ArrayList<>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        for (Klass klass : classes) {
            klass.setClassTeacher(this);
        }
        this.setClasses(classes);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        for (Klass klass : classes) {
            klass.setClassTeacher(this);
        }
        this.classes = classes;
    }

    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            StringBuilder str = new StringBuilder();
            classes.stream().forEach(
                    item -> {
                        if (classes.indexOf(item) < classes.size() - 1)
                            str.append(item.getNumber()).append(", ");
                        else
                            str.append(item.getNumber());
                    }
            );

            return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", str);
        }
    }

    public String introduceWith(Student student) {
        boolean isInClass = false;
        if (this.classes.stream().map(item -> item.getNumber()).collect(Collectors.toList()).contains(student.getKlass().getNumber())) {
            isInClass = true;
        } else {
            isInClass = false;
        }
        if (isInClass)
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }

    public boolean isTeaching(Student student) {
        if (this.classes.stream().map(item -> item.getNumber()).collect(Collectors.toList()).contains(student.getKlass().getNumber()))
            return true;
        return false;
    }

    public void assignedLeader(Student student, int classNumber) {
        System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n", this.getName(), student.getName(), classNumber));
    }

    public void addedStudent(Student student, int classNumber) {
        System.out.print(String.format("I am %s. I know %s has joined Class %d.\n", this.getName(), student.getName(), classNumber));
    }
}

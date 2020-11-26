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
        for (Klass klass: classes) {
            klass.setClassTeacher(this);
        }
        this.setClasses(classes);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        for(Klass klass : classes) {
            klass.setClassTeacher(this);
        }
        this.classes = classes;
    }

    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            StringBuilder str = new StringBuilder();
            for (Klass klass : classes) {
                if (classes.indexOf(klass) < classes.size() - 1)
                    str.append(klass.getNumber()).append(", ");
                else
                    str.append(klass.getNumber());
            }
            return super.introduce() + " I am a Teacher. I teach Class " + str + ".";
        }
    }

    public String introduceWith(Student student) {
        boolean isInClass = false;
        if (this.classes.stream().map(item -> item.getNumber()).collect(Collectors.toList()).contains(student.getKlass().getNumber()))
            isInClass = true;
        else
            isInClass = false;

        if (isInClass)
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        if (this.classes.stream().map(item -> item.getNumber()).collect(Collectors.toList()).contains(student.getKlass().getNumber()))
            return true;
        return false;
    }

    public void assignedLeader(Student student, int classNumber) {
        System.out.print("I am " + this.getName() + ". I know " + student.getName() + " become Leader of Class " + classNumber + ".\n");
    }

    public void addedStudent(Student student, int classNumber) {
        System.out.print("I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + classNumber + ".\n");
    }
}

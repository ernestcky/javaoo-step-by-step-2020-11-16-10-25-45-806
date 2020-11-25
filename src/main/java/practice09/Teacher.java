package practice09;

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
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    public String introduce() {
        if (this.classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String str = "";
            for (Klass klass : classes) {
                if (classes.indexOf(klass) < classes.size() - 1)
                    str += klass.getNumber() + ", ";
                else
                    str += klass.getNumber();
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
        else
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return (this.classes.stream().map(item -> item.getNumber()).collect(Collectors.toList()).contains(student.getKlass().getNumber()));

    }
}

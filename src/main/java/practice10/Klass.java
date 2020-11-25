package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    List<Student> studentList;
    Student leader;
    Teacher classTeacher;

    public Teacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(Teacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public Klass(int number) {
        this.number = number;
        this.leader = null;
        this.studentList = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student student) {
        if (this.studentList.contains(student)) {
            this.leader = student;
            if (this.classTeacher != null)
                System.out.print("I am " + this.classTeacher.getName() + ". I know " + student.getName() + " become Leader of Class " + this.number + ".\n");
        } else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        if (!studentList.contains(student)) {
            System.out.print("I am " + classTeacher.getName() + ". I know " + student.getName() + " has joined Class 2.\n");
            this.studentList.add(student);
        }

    }
}

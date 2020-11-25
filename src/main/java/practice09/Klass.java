package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    List<Student> studentList;
    Student leader;

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
        if (student.klass.getNumber() == this.getNumber())
            this.leader = student;
        else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        if(!studentList.contains(student))
            this.studentList.add(student);
    }
}

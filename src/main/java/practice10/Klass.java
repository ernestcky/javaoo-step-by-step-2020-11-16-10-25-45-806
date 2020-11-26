package practice10;

import java.util.ArrayList;
import java.util.List;

// TODO: change to private
public class Klass {
    int number;
    List<Student> studentList;
    Student leader;
    Teacher classTeacher;


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
                this.classTeacher.assignedLeader(student, this.getNumber());
        } else
            System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        if (!studentList.contains(student)) {
            if (classTeacher != null)
                this.classTeacher.addedStudent(student, this.getNumber());
            this.studentList.add(student);
        }

    }
}

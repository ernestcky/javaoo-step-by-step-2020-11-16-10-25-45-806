package practice07;

public class Klass {
    int number;
    Student leader;

    public Klass(int number) {
        this.number = number;
        this.leader = null;
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
        this.leader = student;
    }
}

package practice10;

public class Student extends Person {
    Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.klass.getLeader() != null && this.klass.getLeader().equals(this))
            return super.introduce() + " I am a Student. I am Leader of Class " + this.klass.getNumber() + ".";
        else
            return super.introduce() + " I am a Student. I am at Class " + this.klass.getNumber() + ".";
    }
}
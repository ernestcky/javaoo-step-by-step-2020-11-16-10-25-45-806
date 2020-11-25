package practice08;

public class Teacher extends Person {
    Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.klass = null;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce() {
        if (this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach " + this.klass.getDisplayName() + ".";
        }
    }

    public String introduceWith(Student student) {
        if (this.klass.getNumber() == student.getKlass().getNumber())
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        else
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}

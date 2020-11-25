package practice05;

public class Teacher extends Person {
    Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce() {
        if (this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        else {
            return super.introduce() + " I am a Teacher. I teach Class " + getKlass() + ".";
        }
    }
}

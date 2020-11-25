package practice01;

//To write a Person class, it must have name and age attributes, and an introduce method. The introduce method returns a string like
//        My name is Tom. I am 21 years old.

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }
}

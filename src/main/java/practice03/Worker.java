package practice03;

// Write another Worker class which inherit from the Person class,
// But it only has name and age attributes.
// There is also an introduce method, The introduce method returns a string like:
//
//        I am a Worker. I have a job.

public class Worker extends Person {
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}

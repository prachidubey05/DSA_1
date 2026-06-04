package Lec30;

public class StudentClient {
    static void main(String[] args) {
        System.out.println("hello");
        Student s = new Student();
        s.name = "Kaju";
        s.age = 20;
        s.Intro_yourself();
        Student s1 = new Student();
        s1.name = "raju";
        s1.age = 19;
        s1.Intro_yourself();
    }
}


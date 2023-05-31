package Advanced.Lesson_6_Defining_Classes.Exercise_6.OpinionPoll_01;

public class Person {
    private String name;
    private int age;

    public
    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public
    int getAge () {
        return this.age;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public
    String toString () {
        return String.format ("%s - %d",this.name,this.age);
    }
}

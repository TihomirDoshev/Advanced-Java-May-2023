package Advanced.Lesson_6_Defining_Classes.Exercise_6.Google_07;

public class Parent {
    private String parentName;
    private String parentBirthday;

    public Parent(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString() {
        return parentName + " " + parentBirthday;
    }
}

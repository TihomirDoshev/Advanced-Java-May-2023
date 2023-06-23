package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getStudentCount() {
        return this.students.size();
    }


    public String registerStudent(Student student) {
        if (this.students.contains(student)) {
            return "Student is already in the university";
        } else if (this.students.size() >= this.capacity) {
            return "No seats in the university";
        } else {
            this.students.add(student);
            return "Added student " + student.getFirstName() + " " + student.getLastName();
        }
    }

    public String dismissStudent(Student student) {
        if (this.students.contains(student)) {
            this.students.remove(student);
            return "Removed student " + student.getFirstName()+" "+student.getLastName();
        } else {
            return "Student not found";
        }
    }

    public Student getStudent(String firstName, String lastName) {
        for (Student student : this.students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return student;
            }
        }

        return null;
    }
    public String getStatistics() {
        StringBuilder result = new StringBuilder();
        for (Student student : students) {
            result.append("==Student: First Name = ")
                    .append(student.getFirstName())
                    .append(", Last Name = ")
                    .append(student.getLastName())
                    .append(", Best Subject = ")
                    .append(student.getBestSubject())
                    .append(System.lineSeparator());
        }
        return result.toString().trim();
    }

}

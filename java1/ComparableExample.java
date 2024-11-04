import java.util.*;
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Implementing compareTo method to compare by roll number
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo; // Ascending order by roll number
    }

    // toString() for easy printing
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sorting the list using Comparable (natural order by roll number)
        Collections.sort(students);

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

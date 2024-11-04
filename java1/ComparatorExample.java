import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // toString() for easy printing
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }

    // Implementing compareTo() method for natural ordering by roll number
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo); // Sorting by rollNo (ascending)
    }
}

// Comparator to compare students by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Ascending order by name
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sorting the list by roll number (natural order defined in Comparable)
        Collections.sort(students);  // Now this works as Student implements Comparable
        System.out.println("Sorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting the list by name using Comparator
        Collections.sort(students, new NameComparator()); // Uses NameComparator
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

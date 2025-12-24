//57: Design a Course class.
/*    Instance Variables: courseName, enrolledStudents
      Static Variable: maxCapacity - the maximum number of students for any course
      Instance Methods: enrollStudent(String studentName),
                        unenrollStudent(String studentName)
      Static Method: setMaxCapacity(int capacity) - to set the maximum capacity for courses.
 */

package AdvanceProblems;

// Course class
class Course {

    // Static Variable
    static int maxCapacity = 100;

    // Instance Variables
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    // Constructor
    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    // Static Method
    static void setMaxCapacity(int capacity) {
        Course.maxCapacity = capacity;
    }

    // Instance Method
    void enrollStudent(String studentName) {

        // Capacity check
        if (enrollments >= maxCapacity) {
            System.out.println("Cannot enroll " + studentName + ". Course is full.");
            return;
        }

        // Duplicate check
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                System.out.println(studentName + " is already enrolled.");
                return;
            }
        }

        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " enrolled in " + courseName);
    }

    // Instance Method
    void unenrollStudent(String studentName) {

        int index = -1;

        // Search student
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                index = i;
                break;
            }
        }

        // Student not found
        if (index == -1) {
            System.out.println(studentName + " is not enrolled in " + courseName);
            return;
        }

        // Shift left to remove student
        for (int i = index; i < enrollments - 1; i++) {
            enrolledStudents[i] = enrolledStudents[i + 1];
        }

        enrolledStudents[enrollments - 1] = null;
        enrollments--;

        System.out.println(studentName + " unenrolled from " + courseName);
    }
}

// Main class (just like q056_LibrarySystem)
public class q057_CourseSystem {
    public static void main(String[] args) {

        // Setting max capacity (static)
        Course.setMaxCapacity(3);

        Course javaCourse = new Course("Java Programming");

        javaCourse.enrollStudent("Karan");
        javaCourse.enrollStudent("Aman");
        javaCourse.enrollStudent("Rohit");
        javaCourse.enrollStudent("Neha");   // Should fail (capacity full)

        javaCourse.unenrollStudent("Aman");
        javaCourse.unenrollStudent("Aman"); // Should fail (already removed)

        javaCourse.enrollStudent("Neha");   // Now possible
    }
}

//Judy Marie Delos Reyes
//11-29-2023
//Application that displays student details.
public class StudentDemo {
    public static void main(String[] args) {
        //array of students
        Students[] studentsArray_DR = new Students[4];
        // student objects
        studentsArray_DR[0] = new Students("a", "b", 22, "Male", "Computer Science", 1500);
        studentsArray_DR[1] = new Students("c", "d", 25, "Female", "Engineering", 1800);
        studentsArray_DR[2] = new Students("e", "f", 18, "Male", "Mathematics", 1200);
        studentsArray_DR[3] = new Students("g", "h", 30, "Female", "Physics", 2200);
        // method to display student details
        displayStudentDetails_DR(studentsArray_DR);
    }
    // display student details
    public static void displayStudentDetails_DR(Students[] students) {
        System.out.printf("%-15s%-15s%-10s%-15s%-15s%-10s\n", "First Name", "Last Name", "Age", "Gender", "Major", "\tTuition");
        for (Students student : students) {
            System.out.printf("%-15s%-15s%-10d%-15s%-15s\t$%-10d\n", 
            		student.getFirstName(), student.getLastName(), student.getAge(), 
            		student.getGender(), student.getMajor(), student.getTuition());
        }
    }
}

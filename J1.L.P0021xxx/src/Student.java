
public class Student {

    private String id;
    private String studentName;
    private String semester;
    private String courseName;
    private int courseNum;
    Validation val = new Validation();

    public Student() {
    }

    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }
    
    
    public void inputCourse() {
        System.out.print("1.Java  2.Net   3.C/C++\nYour choice: ");
        int choice = val.inputIntLimit(1, 3);
        switch (choice) {
            case 1:
                courseName = "Java";
                break;
            case 2:
                courseName = ".Net";
                break;
            case 3:
                courseName = "C/C++";
                break;
        }
        System.out.print("Total of course: ");
        courseNum = val.inputIntLimit(1, Integer.MAX_VALUE);
    }

    public void inputInfo() {
        System.out.print("Student name: ");
        studentName = val.inputString();
        System.out.print("Semester: ");
        semester = val.inputString();
        System.out.print("Course name: ");
        inputCourse();
    }


    public void print() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15d\n", id, studentName,
                semester, courseName, courseNum);
    }

}

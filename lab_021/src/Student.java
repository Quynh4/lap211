
public class Student {

    private String id;
    private String studentName;
    private String semester;
    private String courseName;
    private int courseNum;
    Validation val = new Validation();

    public Student() {
    }

    public Student(String id, String studentName, String semester, String courseName, int courseNum) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
        this.courseNum = courseNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (id.isEmpty()) {
            throw new Exception();
        }
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) throws Exception {
        if (studentName.isEmpty()) {
            throw new Exception();
        }
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) throws Exception {
        if (semester.isEmpty()) {
            throw new Exception();
        }
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) throws Exception {
        if (courseName.equalsIgnoreCase("Java")
                || courseName.equalsIgnoreCase(".Net")
                || courseName.equalsIgnoreCase("C/C++")) {
            this.courseName = courseName;
        } else {
            throw new Exception();
        }
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) throws Exception {
            if (courseNum <= 0) {
                throw new Exception();
            }
            this.courseNum = courseNum;
    }

    public void inputCourse() {
        System.out.println("1.Java, 2.Net, 3.C/C++");
        System.out.print("Your choice:");
        switch (val.inputInt(1, 3)) {
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
        courseNum = val.inputInt(1, Integer.MAX_VALUE);
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
        System.out.printf("%-15s%-15s%-15s%-15s%-15d",
                id, studentName, semester, courseName, courseNum);
    }

}

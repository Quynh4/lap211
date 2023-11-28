
import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {

    private ArrayList<Student> ls;
    private Validation val = new Validation();

    public StudentList() {
        this.ls = new ArrayList();
    }

    public ArrayList<Student> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Student> ls) {
        this.ls = ls;
    }

    public void createStudent() {

        if (ls.size() > 10) {
            System.out.print("Do you want to continue (Y/N): ");
            if (!val.inputYN()) {
                return;
            }
        }
        while (true) {
            System.out.print("Id: ");
            String id = val.inputString();
            if (!isIdExist(id)) {
                Student s = new Student();
                s.setId(id);
                s.inputInfo();
                ls.add(s);
                System.out.println("Added!");
                return;
            }
            System.out.println("Id existed!");
        }

    }

    public void findSortStudent(String str) {
        ArrayList<Student> studentByName = new ArrayList<>();
        for (Student student : ls) {
            if (student.getStudentName().contains(str)) {
                studentByName.add(student);
            }
        }
        if (studentByName.isEmpty()) {
            System.out.println("Not found!");
            return;
        }
        studentByName.sort(Comparator.comparing(Student::getStudentName));
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",
                    "id", "studentName",
                    "semester", "courseName", "total of course");
        for (Student student : studentByName) {
            student.print();
        }
        studentByName.clear();
    }

    public void updateDeleteStudent(String id) {
        if (isIdExist(id)) {
            System.out.println("This is not exist!");
            return;
        }

        System.out.println("You want to update or delete?");
        if (val.inputUD()) {
            Student s = getStudentById(id);
            s.inputInfo();
            System.out.println("Update success!");
        } else {
            ls.remove(getStudentById(id));
        }
    }

    public void reportStudent() {
        if (ls.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",
                    "id", "studentName",
                    "semester", "courseName", "total of course");
        for (Student s : ls) {
            s.print();
        }
    }

    public boolean isIdExist(String id) {
        for (Student student : ls) {
            if (student.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public Student getStudentById(String id) {
        Student s = null;
        for (Student student : ls) {
            if (student.getId().equalsIgnoreCase(id)) {
                s = student;
            }
        }
        return s;
    }

}

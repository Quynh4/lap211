
import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {

    private ArrayList<Student> ls;
    Validation val = new Validation();

    public StudentList() {
        this.ls = new ArrayList<>();
    }

    public ArrayList<Student> getLs() {
        return ls;
    }

    public void setLs(ArrayList<Student> ls) {
        this.ls = ls;
    }

    public void add(Student s) {
        ls.add(s);
    }
    
//    public ArrayList<Student> findSortByName(String str) {
//        ArrayList<Student> studentByName = new ArrayList<>();
//        for (Student s : ls) {
//            if (s.getStudentName().contains(str)) {
//                studentByName.add(s);
//            }
//        }
//        studentByName.sort(Comparator.comparing(Student::getStudentName));
//        return studentByName;
//    }

    public StudentList findByName(String str) {
        StudentList studentByName = new StudentList();
        for (Student s : ls) {
            if (s.getStudentName().contains(str)) {
                studentByName.add(s);
            }
        }

        return studentByName;
    }
    
    public void sortByName(){
        ls.sort(Comparator.comparing(Student::getStudentName));
    }
    

    public void update(String id) {
        Student s = getStudentById(id);
        s.inputInfo();
        System.out.println("Updated!");
    }

    public void delete(String id) {
        ls.remove(getStudentById(id));
        System.out.println("Deleted!");
    }

    public void print() {
        if (ls.isEmpty()) {
            System.out.println("Empty!");
            return;
        }
        System.out.printf("%-15s%-15s%-15s%-15s%-15s",
                "id", "studentName", "semester",
                "courseName", "total of course");
        for (Student s : ls) {
            s.print();
        }
    }

    public boolean isIdExist(String id) {
        for (Student s : ls) {
            if (s.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

    public Student getStudentById(String id) {
        Student student = null;
        for (Student s : ls) {
            if (s.getId().equalsIgnoreCase(id)) {
                student = s;
            }
        }
        return student;
    }

    public boolean isEmpty() {
        return ls.isEmpty();
    }

}

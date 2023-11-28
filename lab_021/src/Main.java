
import java.util.ArrayList;

public class Main {

    // 3/10 -- co bao tach update va delete
    // 3/10 -- tach find & sort
    // 6/10 -- sua sortByName
    // 10/10 -- ham set phai co dieu kien -- setCourseName in Student.java
    public static void main(String[] args) {
        StudentList ls = new StudentList();
        Validation val = new Validation();
        while (true) {
            menu();
            switch (val.inputInt(1, 5)) {
                case 1:
                    if (ls.getLs().size() > 10) {
                        System.out.print("Do you want to continue(Y/N): ");
                        if (!val.inputYN()) {
                            break;
                        }
                    }
                    while (true) {
                        System.out.print("Id: ");
                        String id = val.inputString();
                        if (!ls.isIdExist(id)) {
                            Student s = new Student();
                            try {
                                s.setId(id);
                            } catch (Exception e) {
                                System.out.println("id Khong hop le");
                            }
                            s.inputInfo();
                            ls.add(s);
                            System.out.println("Added!");
                            break;
                        }
                        System.out.println("Id existed!");
                    }
                    break;
                case 2:
                    if (ls.isEmpty()) {
                        System.out.println("Empty!");
                    } else {
                        System.out.print("Name for search: ");
                        StudentList listByName = ls.findByName(val.inputString());
                        if (listByName.isEmpty()) {
                            System.out.println("Not found!");
                            break;
                        }
                        listByName.sortByName();
                        System.out.println("----------------------- SORTED LIST -----------------------");
                        listByName.print();
                    }

                    break;
                case 3:
                    if (ls.isEmpty()) {
                        System.out.println("Empty!");
                    } else {
                        System.out.print("Id to update/delete: ");
                        String id = val.inputString();
                        if (!ls.isIdExist(id)) {
                            System.out.println("Not found!");
                            break;
                        }
                        System.out.print("Do you want to update(U) or delete(D): ");
                        if (val.inputUD()) {
                            ls.update(id);
                        } else {
                            ls.delete(id);
                        }
                    }
                    break;
                case 4:
                    ls.print();
                    break;
                case 5:
                    return;
            }
        }
    }

    public static void menu() {
        System.out.println("\n1. Create");
        System.out.println("2. Find and Sort");
        System.out.println("3. Update/Delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("---> Your choice: ");
    }
}

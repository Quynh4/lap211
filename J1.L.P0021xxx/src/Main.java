
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StudentList ls = new StudentList();
        Validation val = new Validation();
        while (true) {
            menu();
            int choice = val.inputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    ls.createStudent();
                    break;
                case 2:
                    if (ls.getLs().isEmpty()) {
                        System.out.println("Your list is empty!");
                    } else {
                        System.out.print("Enter name for search: ");
                        ls.findSortStudent(val.inputString());
                    }
                    break;
                case 3:
                    if (ls.getLs().isEmpty()) {
                        System.out.println("Your list is empty!");
                    } else {
                        System.out.println("Enter id: ");
                        ls.updateDeleteStudent(val.inputString());
                    }
                    break;
                case 4:
                    ls.reportStudent();
                    break;
                case 5:
                    return;
            }

        }
    }

    public static void menu() {
        System.out.println("\n1. Create");
        System.out.println("2. Find/sort");
        System.out.println("3. Update/delete");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }
}

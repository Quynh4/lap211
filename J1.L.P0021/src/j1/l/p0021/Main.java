
package j1.l.p0021;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        ls.add(new Student("1", "Pham Ngoc Hoa", "Spring", "java"));
        ls.add(new Student("2", "Do Quang Hiep", "Summer", ".net"));
        ls.add(new Student("3", "Nguyen Xuan Cuong", "Spring", "c/c++"));
        ls.add(new Student("4", "Pham Ngoc Hoa", "Spring", "java"));
        ls.add(new Student("5", "Do Quang Hiep", "Summer", ".net"));
        ls.add(new Student("6", "Pham Ngoc Hoa", "Spring", "java"));
        ls.add(new Student("7", "Do Quang Hiep", "Summer", ".net"));
        ls.add(new Student("8", "Pham Ngoc Hoa", "Spring", "java"));
        ls.add(new Student("9", "Do Quang Hiep", "Summer", ".net"));
        ls.add(new Student("10", "Pham Ngoc Hoa", "Spring", "java"));
        
        int count = 10;
        //loop until user want to exit program
        while (true) {
            //Show menu option
            Manager.menu();
            int choice = Validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count, ls);
                    break;
                case 2:
                    Manager.findAndSort(ls);
                    break;
                case 3:
                    Manager.updateOrDelete(count, ls);
                    break;
                case 4:
                    Manager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }

}
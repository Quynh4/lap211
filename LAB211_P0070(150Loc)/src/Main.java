
public class Main {

    public static void main(String[] args) {
        Validation val = new Validation();
        LoginSystem system = new LoginSystem();
        do {
            displayMenu();
            int choice = val.inputInt("Please choice one option:", 1, 3);
            switch (choice) {
                case 1:
                    system.setLocale("vn");
                    system.login();
                    break;
                case 2:
                    system.setLocale("en");
                    system.login();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }

    public static void displayMenu() {
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
    }
}

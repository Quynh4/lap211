//6/10 - them check account
//10/10 - them check password
//10/10 -- then dieu kien vao set, gop pass&account
public class Main {

    public static void main(String[] args) {
        LoginSystem system = new LoginSystem();
        Validation val = new Validation();
        AccountList list = new AccountList();
        list.addAccount(new Account("1234567890","12345678a"));
        while (true) {
            System.out.println("\n1.Vietnamese   2.English    3.Exit");
            switch(val.inputInt("--> Your choice: ", 1, 3)){
                case 1:
                    system.setLocalse("vi");
                    system.login();
                    break;
                case 2:
                    system.setLocalse("en");
                    system.login();
                    break;
                case 3: return;
            }
        }

    }
}

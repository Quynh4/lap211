
import java.util.ResourceBundle;

//co bao gop account voi password vao voi nhau
public class Account {
    Validation val = new Validation();
    private String account;
    private String password;

    public Account() {
    }

    
    public Account(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        if(account.matches("^[0-9]{10}$"))
            this.account = account;
        else System.out.println("Account must match ^[0-9]{10}$");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.matches("^[0-9]{10}$"))
            this.password = password;
        else System.out.println("Password must match ^(?=.*[0-9])^(?=.*[a-zA-Z])[0-9a-zA-Z]{8,31}$");
    }
    
    
    public void inputAccount(ResourceBundle lang){
        account = val.inputString(
                lang.getString("account"),
                "^[0-9]{10}$",
                lang.getString("accountError"));
        
        password = val.inputString(
                lang.getString("password"),
                "^(?=.*[0-9])^(?=.*[a-zA-Z])[0-9a-zA-Z]{8,31}$",
                lang.getString("passwordError"));}

    }
 
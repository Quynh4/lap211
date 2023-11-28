
import java.util.ResourceBundle;

public class LoginSystem {

    private String localse;
    private ResourceBundle lang;
    private Captcha captcha = new Captcha();
    private Validation val = new Validation();
    private AccountList list = new AccountList();

    public void setLocalse(String localse) {
        this.localse = localse;
    }

    public void login() {
        lang = ResourceBundle.getBundle(localse);
        Account account = new Account();
        account.inputAccount(lang);

        if (list.checkAccount(account.getAccount())) {
            if (list.checkPassword(account.getAccount(), account.getPassword())) {
                int fault = 0;
                while (fault < 3) {
                    if (captcha.runCaptcha(lang)) {
                        System.out.println(lang.getString("ok"));
                        return;
                    } else {
                        fault++;
                    }
                }
            }
        }

        System.out.println(lang.getString("fail"));
    }
}


import Account.Account;
import Account.AcountList;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

class LoginSystem {
    private ResourceBundle bundle;
    private Validation val = new Validation();
    
    public void setLocale(String locale) {
        bundle = ResourceBundle.getBundle(locale);
    }
    
    public void login(){
        handleCapcha captcha = new handleCapcha();
        String account = val.inputAcountNumber(
                bundle.getString("accountNumber"), 
                bundle.getString("inputAcountError"));
        String password = val.inputPassword(
                bundle.getString("Password"), 
                bundle.getString("inputPasswordError"));
        captcha.handleCapcha(
                bundle.getString("Capcha"), 
                bundle.getString("CapchaError"), 
                bundle.getString("inputCapcha"));
        
        boolean checkAcount = checkAccount(account);
        boolean checkPassword = checkPassword(account, password);
      
        
        if(checkAcount && checkPassword){
            System.out.println(bundle.getString("loginSuccess"));
        }else{
            System.out.println(bundle.getString("loginFail"));
        }
    }
    
    public boolean checkAccount(String AccountNumber){
        AcountList listAcount = new AcountList();
        ArrayList<Account> accountList = listAcount.database();
        if(accountList.isEmpty()){
            return false;
        }else{
            for (Account account : accountList) {
                //check accountNumber is exist in list acount or not
                if(account.getAcount().equals(AccountNumber)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean checkPassword(String AccountNumber, String password){
        AcountList listAcount = new AcountList();
        ArrayList<Account> accountList = listAcount.database();
        if(accountList.isEmpty()){
            return false;
        }else{
            //loop use to access each element of arraylist from begining to the end
            for (Account account : accountList) {
                //check AccountNumber is exist or not in list and 
                //password of AccountNumber input is equal with password of acount 
                //have number account same with AccountNumber or not
                if(account.getAcount().equals(AccountNumber) && account.getPasswords().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}


import java.util.Random;
import java.util.ResourceBundle;


public class Captcha {
    private Validation val = new Validation();
    private String kitu ="abcdefghijklmnopqrstuvwxyzBCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    
    public boolean runCaptcha(ResourceBundle lang){
        String captcha = rand(6);
        System.out.println(lang.getString("captcha")+ captcha);
        String inputCaptcha = val.inputString(
                lang.getString("inputCaptcha"),
                "[A-Za-z0-9\\s]+", 
                lang.getString("inputCaptchaError"));
        if(captcha.equals(inputCaptcha)) return true;
        return false;
    }
    
    private String rand(int length){
        Random rand = new Random();
        String captcha="";
        int cnt=0;
        while(cnt<length){
            captcha+= kitu.charAt(rand.nextInt(61));
            cnt++;
        }
        return captcha;
    }
}

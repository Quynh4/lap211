
import java.util.Random;

public class handleCapcha {

    String finalCapcha = "";

    String createCapcha() {
        String string = "";

        for (char c = 'a'; c <= 'z'; c++) {
            string += c;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            string += c;
        }

        for (char c = '0'; c <= '9'; c++) {
            string += c;
        }

        do {
            String capcha = "";
            boolean haveLowerChar = false;
            boolean haveUpperChar = false;
            boolean haveDigit = false;
            //loop use to generate 5 charater into capcha
            for (int i = 0; i < 5; i++) {
                Random random = new Random();
                int index = random.nextInt(string.length());
                char newChar = string.charAt(index);
                //check newchar must be in range from character a to z
                if (newChar >= 'a' && newChar <= 'z') {
                    haveLowerChar = true;
                } else //check newchar must be in range from character A to Z
                    if (newChar >= 'A' && newChar <= 'Z') {
                    haveUpperChar = true;
                } else {
                    haveDigit = true;
                }
                capcha += newChar;
            }
            //check value of boolean variable haveDigit, haveLowerChar, and haveUpperChar
            if (haveDigit && haveLowerChar && haveUpperChar) {
                finalCapcha = capcha;
                break;
            } else {
                continue;
            }
        } while (true);
        return finalCapcha;
    }

    void handleCapcha(String capcha, String capchaFail, String input) {
        Validation val = new Validation();
        do {
            String newCapcha = createCapcha();
            System.out.println(capcha + createCapcha());
            String capchaInput = val.inputString();
            if (newCapcha.equals(capchaInput)) {
                return;
            } else {
                System.out.println(capchaFail);
            }
        } while (true);
    }
}

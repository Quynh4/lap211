
import java.util.Scanner;

public class Validation {

    Scanner sc = new Scanner(System.in);

    public int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            try {
                int x = Integer.parseInt(sc.nextLine().trim());
                if (x > max || x < min) {
                    throw new NumberFormatException();
                }
                return x;
            } catch (NumberFormatException e) {
                System.err.println("Integer must in range of " + min + " - " + max);
                System.out.print("Enter again: ");
            }
        }
    }

    
    public String inputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Your string is empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    public String inputAcountNumber(String msg, String err) {
        System.out.print(msg);
        do {
            try {
                String input = sc.nextLine();
                if (input.matches("[0-9]{10}"))
                return input;
            } catch (Exception ex) {
                System.out.println();
            }
            
        } while (true);
    }

    public String inputPassword(String msg, String err) {
        String input;
        do {
            System.out.print(msg);
            try {
                input = sc.nextLine();
                //check length must larger than 8 and smaller than 31
                if (input.length() >= 8 && input.length() <= 31) {
                    //^[a-zA-Z0-9]*: check password start with character a-z 
                    //lower, upper, and digit in range 0 to 9
                    //([a-zA-Z]+[0-9]+): check password must contain character first
                    // and follow by digit from 0-9
                    // | : OR
                    //[0-9]+[a-zA-Z]+: check password must contain first
                    //follow by character
                    //[a-zA-Z0-9]*$: check password end with character a-z 
                    //lower, upper, and digit in range 0 to 9
                    if (input.matches("^[a-zA-Z0-9]*(([a-zA-Z]+[0-9]+)|[0-9]+[a-zA-Z]+)[a-zA-Z0-9]*$")) {
                        break;
                    } else {
                        throw new Exception();
                    }
                } else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println(err);
            }
        } while (true);

        return input;
    }

    
}

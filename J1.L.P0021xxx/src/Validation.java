
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
    private final static Scanner sc = new Scanner(System.in);
    
    public int inputIntLimit(int min, int max){
        while(true){
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max) throw new NumberFormatException();
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number in range of ["+min + ", " + max+ "]");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public String inputString(){
        while(true){
            String result = sc.nextLine().trim();
            if (result.isEmpty()){
                System.err.println("Your string is empty");
                System.out.print("Enter again: ");
            }
            else return result;
        }
    }
    
    public boolean inputYN(){
        while(true){
            String result = inputString();
            if (result.equalsIgnoreCase("y")) return true;
            else if (result.equalsIgnoreCase("n")) return false;
            else{
                System.err.println("please enter y/Y or n/N");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public boolean inputUD(){
       while(true){
           String result = inputString();
           if(result.equalsIgnoreCase("u")) return true;
           else if(result.equalsIgnoreCase("d")) return false;
           else{
               System.err.println("Please enter u/U or d/D!");
               System.out.print("Enter again: ");
           }
        }
    }
}

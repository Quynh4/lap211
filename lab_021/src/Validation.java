
import java.util.Scanner;


public class Validation {
    Scanner sc = new Scanner(System.in);
    public int inputInt(int min, int max){
        while(true){
            try{
                int n = Integer.parseInt(sc.nextLine().trim());
                if(n<min || n> max) throw new Exception();
                return n;
            }catch(Exception e){
                System.out.print("Please enter a number in range of "+min+" - "+ max+": ");
            }
        }
    }
    
    public String inputString(){
        while(true){
            String s = sc.nextLine().trim();
            if(s.isEmpty()){
                System.out.print("Your string is empty! Enter again: ");
            }
            else return s;
        }
    }
    
    public boolean inputYN(){
        while(true){
            if(inputString().equalsIgnoreCase("y")) return true;
            else if(inputString().equalsIgnoreCase("n")) return false;
            else System.out.print("Please enter y/Y or n/N!: ");
        }
    }
    
    public boolean inputUD(){
        while(true){
            if(inputString().equalsIgnoreCase("u")) return true;
            else if(inputString().equalsIgnoreCase("d")) return false;
            else System.out.print("Please enter u/U or d/: ");
        }
    }
    
}

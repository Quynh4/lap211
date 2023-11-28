
import java.util.Scanner;

public class Validation {
    private Scanner sc = new Scanner(System.in);
    
    public String inputString(String mess, String regex, String err){
        while(true){
            System.out.print(mess);
            String s = sc.nextLine().trim();
            if(!s.matches(regex)){
                System.out.println(err);
            } else return s;
        }
    }
    public int inputInt(String mess, int min, int max){
        System.out.print(mess);
        while(true){
            try{
                int x = Integer.parseInt(sc.nextLine().trim());
                if(x>max || x<min) throw  new NumberFormatException();
                return x;
            }catch(NumberFormatException e){
                System.out.print("Please input number in range of "+min+" - "+max+": ");
            }
                
        }
    }
}

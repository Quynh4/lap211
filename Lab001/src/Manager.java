
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quynh
 */
public class Manager {
        public static final Scanner sc = new Scanner(System.in);

    public static int inputInt(){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            }
            catch(NumberFormatException e){
                System.err.println("Please input a number");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}

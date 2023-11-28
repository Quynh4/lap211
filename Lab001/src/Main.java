
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quynh
 */
public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        //input size of element in array
        System.out.println("Enter size of element in array: ");
        int size = Manager.inputInt();
        //input array
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i] = rd.nextInt(size);
        }
        //print array
        System.out.print("Unsorted array: ");
            Manager.printArray(arr);
        //sort
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    int tempt = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tempt;
                }
            }
        }
        //print array
        System.out.print("\nSorted Array: ");
            Manager.printArray(arr);
    }
    
}



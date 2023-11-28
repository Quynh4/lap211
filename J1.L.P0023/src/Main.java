/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quynh
 */

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author THAYCACAC
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> lf = new ArrayList<>();
        Hashtable<String, ArrayList<Order>> ht = new Hashtable<>();
//loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createFruit(lf);
                    break;
                case 2:
                    Manager.viewOrder(ht);
                    break;
                case 3:
                    Manager.shopping(lf, ht);
                    break;
                case 4:
                    return;
            }
        }
    }

}


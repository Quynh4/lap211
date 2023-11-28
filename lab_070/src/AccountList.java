/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */

import java.util.ArrayList;
public class AccountList {
    ArrayList<Account> list;

    public AccountList() {
        list = new ArrayList<>();
    }

    public AccountList(ArrayList<Account> list) {
        this.list = list;
    }
    
    public void addAccount(Account a){
        list.add(a);
    }
    
    public boolean checkAccount(String account){
        for(Account acc: list){
            if(account.equals(acc.getAccount()))
                    return true;
        }
        return false;
    }
    
    public boolean checkPassword(String account, String pass){
        for(Account acc: list){
            if(account.equals(acc.getAccount())
                    && pass.equals(acc.getPassword()))
                    return true;
        }
        return false;
    }
    
}

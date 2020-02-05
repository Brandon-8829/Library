/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Brand
 */
public class Users {
    public String user;
    public String pass;
    public double fees;
    public int id;
    public boolean reserved = false;

    public Users(String user, String pass, double fees, int id){
        
        this.user = user;
        this.pass = pass;
        this.fees = fees;
        this.id = id;
    }
    
    public String getUser(){
        return user;
    }
    
    public double getFees(){
        return fees;
    }
    
    public int getId(){
        return id;
    }
    
    public boolean isReserved(){
        return reserved;
    }
    
    public void setReserved(boolean reserved){
        this.reserved = true;
    }
}



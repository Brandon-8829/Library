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
public class UserData {
    public static Users[] logins = new Users[20];
    public static int loginId = 0;
    public static int userSize = 3;
    
    static{
                   logins[0] = new Users("admin","password",0,0);
                   logins[1] = new Users("Jeff","library",5.55,1);
                   logins[2] = new Users("Mindy","books",0,2);
    }
    
    public static void addUser(String username, String password){

    }
    
}

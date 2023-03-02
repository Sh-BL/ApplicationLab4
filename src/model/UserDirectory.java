/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class UserDirectory {
    ArrayList<User> allUsers;

    public UserDirectory() {
        this.allUsers = new ArrayList<>();
    }
    
    

    public  ArrayList<User> getAllUser() {
        return allUsers;
    }

    public void setAllUser( ArrayList<User> allUsers) {
        this.allUsers = allUsers;
    }
    
    public void adduser(User newUser){
    this.allUsers.add(newUser);
    }
     public void removeuser(User user){
    this.allUsers.remove(user);
    }

    @Override
    public String toString() {
        return "UserDirectory{" + "allUsers=" + allUsers + '}';
    }
    
}

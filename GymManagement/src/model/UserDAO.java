/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Hindu
 */
public class UserDAO {

    ArrayList<User> ls = new ArrayList<>();

    public UserDAO() {
        ls.add(new User("gym", "123456", true));
        ls.add(new User("admin", "admin", true));
    }

    public boolean checkLogin(String username, String password) {
        for (User u : ls) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

package com.foodorder.foodorderapp.Model;

/**
 * Created by Dell-7000 on 11/12/2018.
 */

public class User {
    private String Name;
    private String Email;
    private String AccountType;
    private String Password;

    public User() {

    }

    public User(String name, String email, String accountType, String password) {
        Name = name;
        Email = email;
        AccountType = accountType;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}

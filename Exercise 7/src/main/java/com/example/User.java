package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private String username;
    private String password;
    private String accountcreated;
    private String accountstatus;

    public User(String username, String password, String accountcreated, String accountstatus) {
        this.username = username;
        this.password = password;
        this.accountcreated = accountcreated;
        this.accountstatus = accountstatus;
    }
    
    public String getUsername() {
        return this.username;
    }
   public String getPassword() {
    return this.password;
    }
    public String getAccountcreated() {
    return this.accountcreated;
    }
    public String getAccountstatus() {
    return this.accountstatus;
    }
}


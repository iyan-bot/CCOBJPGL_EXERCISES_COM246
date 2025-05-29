package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private SimpleStringProperty username;
    private SimpleStringProperty password;
    private SimpleStringProperty accountcreated;
    private SimpleStringProperty accountstatus;

    public User(String username, String password, String accountcreated, String accountstatus) {
        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.accountcreated = new SimpleStringProperty(accountcreated);
        this.accountstatus = new SimpleStringProperty(accountstatus);
    }
    
   public String getUsername() {
        return username.get();
    }

    public String getPassword() {
        return password.get();
    }

    public String getAccountcreated() {
        return accountcreated.get();
    }

    public String getAccountstatus() {
        return accountstatus.get();
    }
}


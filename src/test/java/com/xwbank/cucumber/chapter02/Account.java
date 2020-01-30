package com.xwbank.cucumber.chapter02;

public class Account {
    private  String user;
    private  String email;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "user='" + user + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

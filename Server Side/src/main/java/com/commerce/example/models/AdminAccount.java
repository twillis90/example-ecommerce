package com.commerce.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AdminAccount {

    @Id
    @GeneratedValue
    private Long id;
    private String adminFirstName;
    private String adminLastname;
    private String adminLogin;
    private String adminPassword;
    private String adminEmail;


    public AdminAccount(){

    }

    public AdminAccount(String adminFirstName, String adminLastname, String adminLogin, String adminPassword, String adminEmail) {
        this.adminFirstName = adminFirstName;
        this.adminLastname = adminLastname;
        this.adminLogin = adminLogin;
        this.adminPassword = adminPassword;
        this.adminEmail = adminEmail;
    }

    public Long getId() {
        return id;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public String getAdminLastname() {
        return adminLastname;
    }

    public String getAdminLogin() {
        return adminLogin;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getAdminEmail() {
        return adminEmail;
    }
}

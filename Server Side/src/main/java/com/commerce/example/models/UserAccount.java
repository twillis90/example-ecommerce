package com.commerce.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue
    private Long id;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userPassword;
    private String userAddress;
    private String userCity;
    private String userZipCode;
    private String userState;
    private String userCountry;

    public UserAccount(){

    }

    public UserAccount(String userFirstName, String userLastName, String userEmail, String userPassword, String userAddress, String userCity, String userZipCode, String userState, String userCountry) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userAddress = userAddress;
        this.userCity = userCity;
        this.userZipCode = userZipCode;
        this.userState = userState;
        this.userCountry = userCountry;
    }

    public Long getId() {
        return id;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserZipCode() {
        return userZipCode;
    }

    public String getUserState() {
        return userState;
    }

    public String getUserCountry() {
        return userCountry;
    }
}

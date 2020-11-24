package com.example.myapplication;

public class UserClassHelper {
    String surname, name, thirdName, userClass;
    public UserClassHelper(){
    }

    public UserClassHelper(String surname, String name, String thirdName, String userClass) {
        this.name = name;
        this.surname = surname;
        this.thirdName = thirdName;
        this.userClass = userClass;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }
}

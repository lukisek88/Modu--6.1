package com.kodilla.good.patterns.allegro;

public class UserData {
    private String realName;
    private String userName;

    public UserData(String realName, String userName) {
        this.realName = realName;
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserName() {
        return userName;
    }
}

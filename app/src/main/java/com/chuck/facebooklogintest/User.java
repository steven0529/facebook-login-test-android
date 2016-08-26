package com.chuck.facebooklogintest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by chuck on 23/08/2016.
 */
public class User implements Serializable {

    @Expose
    private String name;

    @Expose
    private String birthday;

    @Expose
    private String email;

    public static User createUserFromJson(String json) {
        Gson gsonBuilder = new GsonBuilder().create();
        return gsonBuilder.fromJson(json, User.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

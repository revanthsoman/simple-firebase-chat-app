package com.chatt.demo.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The Class ChatUse is a Java Bean class that represents a single user.
 */
@IgnoreExtraProperties
public class ChatUser implements Serializable {

    public String id;
    public String username;
    public String email;
    public Boolean online;
    public ArrayList<String> room;

    public ChatUser() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public ChatUser(String id, String username, String email, Boolean online, ArrayList<String> room) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.online = online;
        this.room = room;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean isOnline() {
        return online;
    }

    public ArrayList<String> getRoom() {
        return room;
    }

    public void setRoom(ArrayList<String> room) {
        this.room = room;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

}
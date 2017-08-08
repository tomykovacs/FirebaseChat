package com.example.tomy.firebasechat.Model;

import java.util.Date;

/**
 * Created by tomy on 08/08/17.
 */

public class Message {
    private String text;
    private String user;
    private Long time;

    public Message(){
    }

    public Message(String text, String user) {
        this.text = text;
        this.user = user;
        time = new Date().getTime();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}

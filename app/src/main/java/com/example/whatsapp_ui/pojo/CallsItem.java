package com.example.whatsapp_ui.pojo;

public class CallsItem {

    private String chatName;
    private String date;


    public CallsItem(String chatName, String date) {
        this.chatName = chatName;
        this.date = date;

    }

    public String getChatName() {
        return chatName;
    }

    public String getDate() {
        return date;
    }


}

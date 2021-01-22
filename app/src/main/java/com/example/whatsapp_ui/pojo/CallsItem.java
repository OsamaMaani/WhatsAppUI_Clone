package com.example.whatsapp_ui.pojo;

public class CallsItem {

    private String chatName;
    private String date;
    private String image;

    public CallsItem(String chatName, String date, String image) {
        this.chatName = chatName;
        this.date = date;
        this.image = image;
    }

    public String getChatName() {
        return chatName;
    }

    public String getDate() {
        return date;
    }

    public String getImage() {
        return image;
    }
}

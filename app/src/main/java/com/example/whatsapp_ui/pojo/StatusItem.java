package com.example.whatsapp_ui.pojo;

public class StatusItem {

    private String chatName;
    private String date;
    private String image;

    public StatusItem(String chatName, String date) {
        this.chatName = chatName;
        this.date = date;
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

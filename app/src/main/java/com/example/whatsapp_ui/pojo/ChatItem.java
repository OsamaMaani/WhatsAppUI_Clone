package com.example.whatsapp_ui.pojo;

public class ChatItem {
    private String chatName;
    private String details;
    private String date;

    public ChatItem(String chatName, String details, String date) {
        this.chatName = chatName;
        this.details = details;
        this.date = date;
    }

    public String getChatName() {
        return chatName;
    }

    public String getDetails() {
        return details;
    }

    public String getDate() {
        return date;
    }
}

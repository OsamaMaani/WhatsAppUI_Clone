package com.example.whatsapp_ui.pojo;

public class ContactsItem {
    private String name;
    private int imgResource;
    public  ContactsItem(String name, int imgResource){
        this.name = name;
        this.imgResource = imgResource;
    }

    public String  getName(){
        return this.name;
    }

    public int getImgResource(){
        return this.imgResource;
    }
}

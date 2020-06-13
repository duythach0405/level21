package com.example.level21.Message;

public class IncomingJoined {
    int avatar;
    String name;
    String inbrand;

    public IncomingJoined(int avatar, String name, String inbrand) {
        this.avatar = avatar;
        this.name = name;
        this.inbrand = inbrand;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInbrand() {
        return inbrand;
    }

    public void setInbrand(String inbrand) {
        this.inbrand = inbrand;
    }

}

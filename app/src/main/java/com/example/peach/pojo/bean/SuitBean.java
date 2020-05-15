package com.example.peach.pojo.bean;

import com.example.peach.ImageItemBean;

public class SuitBean extends ImageItemBean {
    private String suit_name;
    private String thumb_url;
    private String target_url;
    private int level;
    private int type;
    private long id;

    public SuitBean() {
    }

    public SuitBean(int level, int type) {
        this.level = level;
        this.type = type;
    }

    public String getTarget_url() {
        return target_url;
    }

    public void setTarget_url(String target_url) {
        this.target_url = target_url;
    }

    public String getSuit_name() {
        return suit_name;
    }

    public void setSuit_name(String suit_name) {
        this.suit_name = suit_name;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SuitBean{" +
                "suit_name='" + suit_name + '\'' +
                ", thumb_url='" + thumb_url + '\'' +
                ", level=" + level +
                ", type=" + type +
                ", id=" + id +
                '}';
    }
}

package com.example.peach.pojo.bean;

public class ImageBean {
    private String suit_name;
    private String img_url;
    private int level;
    private int type;
    /**
     * 套图标记
     */
    private long suit_id;

    public ImageBean() {
    }

    public ImageBean(int level, int type, String suit_name) {
        this.level = level;
        this.type = type;
        this.suit_name = suit_name;
    }


    public String getSuit_name() {
        return suit_name;
    }

    public void setSuit_name(String suit_name) {
        this.suit_name = suit_name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
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

    public long getSuit_id() {
        return suit_id;
    }

    public void setSuit_id(long suit_id) {
        this.suit_id = suit_id;
    }

    @Override
    public String toString() {
        return "ImageBean{" +
                "name='" + suit_name + '\'' +
                ", url='" + img_url + '\'' +
                ", level=" + level +
                ", type=" + type +
                ", suitSign='" + suit_id + '\'' +
                '}';
    }
}

package com.example.peach;

/**
 * @author Administrator on2019/6/10 15:08
 * @desc
 */
public class ImageItemBean {
    private String imgUrl;
    private String detailUrl;
    private String title;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ImageItemBean{" +
                "imgUrl='" + imgUrl + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

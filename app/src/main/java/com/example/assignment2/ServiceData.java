package com.example.assignment2;

public class ServiceData {
    String Title;
    String SubTitle;
    String Des;

    public ServiceData(String title, String des, String subTitle) {
        Title = title;
        Des = des;
        SubTitle = subTitle;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
    }
}

package edu.itc.gic.m1.assign_001;

import java.io.Serializable;
import java.util.Date;

public class madeMessage implements Serializable {
    private String title;
    private String top;
    private String messate;
    private Date date;

    public madeMessage(String top, String title, String messate, Date date) {
        this.title = title;
        this.top = top;
        this.messate = messate;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getMessate() {
        return messate;
    }

    public void setMessate(String messate) {
        this.messate = messate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

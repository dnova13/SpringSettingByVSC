package com.mycom.app.dto;

import java.sql.*;

public class BoardDTO {

    private int s_num;
	private String s_title;
	private String s_content;
    private String s_password;
    private int s_count;
	private Date s_date;

    public BoardDTO() {}

    public BoardDTO (int s_num, String s_title, String s_content, String s_password) {
        this.s_num = s_num;
        this.s_title = s_title;
        this.s_content = s_content;
        this.s_password = s_password;
    }

    public int getS_num() {
        return s_num;
    }

    public void setS_num(int s_num) {
        this.s_num = s_num;
    }

    public String getS_title() {
        return s_title;
    }

    public void setS_title(String s_title) {
        this.s_title = s_title;
    }

    public String getS_content() {
        return s_content;
    }

    public void setS_content(String s_content) {
        this.s_content = s_content;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public int getS_count() {
        return s_count;
    }

    public void setS_count(int s_count) {
        this.s_count = s_count;
    }

    public Date getS_date() {
        return s_date;
    }

    public void setS_date(Date s_date) {
        this.s_date = s_date;
    }

    @Override
    public String toString() {
        return "BoardDTO [s_content=" + s_content + ", s_count=" + s_count + ", s_date=" + s_date + ", s_num=" + s_num
                + ", s_password=" + s_password + ", s_title=" + s_title + "]";
    }

}
package com.example.duan_pro1211_dungntph08210_lan1.model;

public class truyen {

    private String tentruyen, tacgia, chap, dichgia;

    public truyen() {
    }

    public truyen(String tentruyen, String tacgia, String chap, String dichgia) {
        this.tentruyen = tentruyen;
        this.tacgia = tacgia;
        this.chap = chap;
        this.dichgia = dichgia;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getChap() {
        return chap;
    }

    public void setChap(String chap) {
        this.chap = chap;
    }

    public String getDichgia() {
        return dichgia;
    }

    public void setDichgia(String dichgia) {
        this.dichgia = dichgia;
    }

    @Override
    public String toString() {
        return
                tentruyen + '\n' +
                        "Tác Giả  :     " + tacgia + '\n' +
                        "Chap     :     " + chap + '\n' +
                        "Dịch Giả :     " + dichgia + '\'';
    }
}

package com.example.appbanmaytinh.computer;

public class khachhang {
    public String Gmail , Password , RePassword;

    public khachhang() {
    }

    public khachhang(String gmail, String password, String rePassword) {
        Gmail = gmail;
        Password = password;
        RePassword = rePassword;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRePassword() {
        return RePassword;
    }

    public void setRePassword(String rePassword) {
        RePassword = rePassword;
    }
}

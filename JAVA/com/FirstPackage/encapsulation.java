package com.FirstPackage;
import java.lang.String;
class userdata {
    private String mail;
    private String password;
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        userdata user1 = new userdata();
        user1.setPassword("Test@123");
        user1.setMail("test123@gamil.com");

        System.out.println("user1 mail is " + user1.getMail());
        System.out.println("user1 password is " + user1.getPassword());
    }
}

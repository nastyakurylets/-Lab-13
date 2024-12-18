package ua.ucu.edu.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private String lastActiveTime;

    public String getUserMail() {
        return userMail;
    }

    public String getCountry() {
        return country;
    }

    public String getLastActiveTime() {
        return lastActiveTime;
    }
    
}
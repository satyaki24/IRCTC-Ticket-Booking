package org.example.service;

import org.example.entities.User;

import java.io.File;

public class userBookingService {
    private User user;
    private static final String USERS_PATH="../localDb/users.json"

    public userBookingService(User user){
        this.user=user;
        File users=new File(USERS_PATH);
    }

}

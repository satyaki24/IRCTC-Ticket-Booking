package org.example.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    private String userId;
    private List<Ticket> ticketsBooked;
}

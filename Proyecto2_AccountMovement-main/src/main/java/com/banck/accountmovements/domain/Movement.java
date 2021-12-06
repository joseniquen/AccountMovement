package com.banck.accountmovements.domain;

import lombok.Data;

/**
 *
 * @author jonavcar
 */
@Data
public class Movement {

    public String movement;
    public String movementType;
    public String account;
    public String accountType;
    public String customer;
    public double amount;
    public double cantMovement;
    public String concept;
    public String date;
    public String time;
    public boolean correct;
}

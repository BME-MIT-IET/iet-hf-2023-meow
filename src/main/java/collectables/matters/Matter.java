package main.java.collectables.matters;

import main.java.collectables.Collectable;

import java.io.Serializable;

/**
 * Abstact class, what describes the matter
 */
public abstract class Matter implements Collectable, Serializable {

    private int amount;

    /**
     * Constructors with or without parameter
     * the amount -1 means infinite amount
     */
    public Matter() {
        amount = -1;
    }

    public Matter(int n) {
        amount = n;
    }

    /**
     * Getters and setters for the amount variable
     */
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

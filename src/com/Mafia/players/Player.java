package com.Mafia.players;

public class Player {
    private Role role;
    private String name;
    private int rating;
    private int penalties = 0;

    private int number;
    private boolean isAlive = true;
    private boolean isOnVote = false;

    public Player(String name, int rating, int number) {
        this.name = name;
        this.rating = rating;
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public void addPenalty() {
        penalties++;
    }

    public void deductPenalty() {
        penalties--;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Boolean equals(Player player) {
        return this.name.equals(player.name);
    }

    public Role getRole() {
        return role;
    }

    public void revive() {
        isAlive = true;
    }

    public void kill() {
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void vote() {
        isOnVote = true;
    }

    public void cancelVote() {
        isOnVote = false;
    }

    public boolean isOnVote() {
        return isOnVote;
    }
}
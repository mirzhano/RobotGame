package com.example.myrobots;

public abstract class Transformer {
    public String name;
    public int energy;
    public int victories;

    public Transformer() {
    }

    public Transformer(String name, int energy) {
        this.name = name;
        this.energy = energy;
        this.victories = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void minusEnergy(int sum) {
        energy = energy - sum;
    }
    public  abstract  void  shooting();

    public int getVictories() {
        return victories;
    }

    public void addVictory() {
        this.victories += 1;
    }
}

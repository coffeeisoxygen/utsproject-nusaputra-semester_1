package com.coffeisoxygen.model;

/*
 * class ini : digunakan untuk mengatur player
 */
public class Player {
    private String plName;
    private int plEnergy;
    private int plScore;
    private boolean plIsAlive;
    private boolean plIsWin;
    private int plXPosition;
    private int plYposition;

    // consturctor default hanya memberikan nama player
    public Player(String plName, int plEnergy) {

        this.plName = plName;
        this.plEnergy = plEnergy;
        this.plScore = 0;
        this.plIsAlive = true;
        this.plIsWin = false;

    }

    public String getPlName() {
        return plName;
    }

    public void setPlName(String plName) {
        this.plName = plName;
    }

    public int getPlEnergy() {
        return plEnergy;
    }

    public void setPlEnergy(int plEnergy) {
        this.plEnergy = plEnergy;
    }

    public int getPlScore() {
        return plScore;
    }

    public void setPlScore(int plScore) {
        this.plScore = plScore;
    }

    public boolean isPlIsAlive() {
        return plIsAlive;
    }

    public void setPlIsAlive(boolean plIsAlive) {
        this.plIsAlive = plIsAlive;
    }

    public boolean isPlIsWin() {
        return plIsWin;
    }

    public void setPlIsWin(boolean plIsWin) {
        this.plIsWin = plIsWin;
    }

    public int getPlXPosition() {
        return plXPosition;
    }

    public void setPlXPosition(int plXPosition) {
        this.plXPosition = plXPosition;
    }

    public int getPlYposition() {
        return plYposition;
    }

    public void setPlYposition(int plYposition) {
        this.plYposition = plYposition;
    }
}
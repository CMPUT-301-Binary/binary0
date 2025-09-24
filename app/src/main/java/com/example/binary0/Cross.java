package com.example.binary0;

public class Cross extends Shape {
    private int armLength;
    private int armWidth; // Optional, if arms have thickness

    // Constructor
    public Cross(int armLength, int armWidth) {
        this.armLength = armLength;
        this.armWidth = armWidth;
    }

    // Getters and Setters for armLength and armWidth
    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public int getArmWidth() {
        return armWidth;
    }

    public void setArmWidth(int armWidth) {
        this.armWidth = armWidth;
    }
}

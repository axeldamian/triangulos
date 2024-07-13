package com.triangulos.dtos;

public class Point {

    private int x;

    private int y;

    private int value;

    public Point() {
        super();
        this.x = 0;
        this.y = 0;
        this.value = 0;
    }

    public Point(int axisX , int axisY) {
        super();
        this.x = axisX;
        this.y = axisY;
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue( int v ) {
        this.value = v;
    }
    
}

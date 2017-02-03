package ru.stqa.ptf.sandbox;

/**
 * Created by User on 03.02.2017.
 */
public class Distance {
    public double l;
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public Distance (double l){
        this.l=l;}

    public double l() {
        return Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - this.y1) * (this.y2 - this.y1));
    }

    public Distance (double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    }



package com.sapheworkshop.oopPartOne.point;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return distance(0,0);
    }

    public double distance(int x, int y){
        double distance = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y)*(y - this.y));
        return distance;
    }

    public double distance(Point p){
        double distance = Math.sqrt((p.getX() - this.x)* (p.getX() - this.x) + (p.getY() - this.y)*(p.getY() - this.y));
        return distance;
    }


}

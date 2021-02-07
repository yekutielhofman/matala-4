package com.company;

public class Circle {
    Point center;
    double radius;
    //banai
    public Circle(double radius){
        this.center = new Point(0,0);
        this.radius = radius;
    }
    //method 1
    public void move(Point p){
        this.center = new Point(p.x, p.y);
    }
    //method 2
    public double areaSize(){
        return Math.PI*Math.pow(this.radius,2);
    }
    //method 3
    public double circumference(){
        return 2*Math.PI*this.radius;
    }
    //method 4
    public boolean pointLocation(Point p){
        if(p.distance(this.center)>radius)return false;
        else return true;
    }
}

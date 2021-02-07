package com.company;

public class Triangle {
    Point p1;
    Point p2;
    Point p3;
    //banai
    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = new Point(p1.x,p1.y);
        this.p2 = new Point(p2.x,p2.y);
        this.p3 = new Point(p3.x,p3.y);
    }
    //method 1
    public Point centerPoint(){
        return new Point((p1.x+p2.x+p3.x)/3,(p1.y+p2.y+p3.y)/3);
    }
    //method 2
    public double areaSize(){
        return p1.areaSize(p2,p3);
    }
    //method 3
    public double perimeter(){
        return p1.distance(p2)+p2.distance(p3)+p3.distance(p1);
    }
    //method 4
    public boolean pointLocation(Point p){
        return (p1.areaSize(p2,p3) == (p.areaSize(p2,p3) + p.areaSize(p1,p3) + p.areaSize(p1,p2)));
    }
}

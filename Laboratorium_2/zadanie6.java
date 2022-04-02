package com.company;

public class Main {

    public static void main(String[] args) {
testSegment();
testTriangle();
    }
public static void testSegment(){
        Segment segment = new Segment(new Point(1,2),new Point(4,5));
    System.out.println(segment.toString());
}
    public static void testTriangle(){
        Triangle triangle = new Triangle(new Point(1,2),new Point(4,5),new Point(5,3));
        System.out.println(triangle.toString());
        System.out.println(triangle.getDistances());
        System.out.println(triangle.getType());
    }
}


class Point
{
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }
    public Point(){
        this(320,200);
    }
    int x;
    int y;
    public void setX(int number) {this.x=number;};
    public void setY(int number) {this.y=number;};
    public Point getCoordinates() {
        return new Point(x,y);
    }
    public void setCoordinates(int x, int y){
        setY(y);
        setX(x);
    }
    public void setCoordinates(Point p){
        setX(p.getX());
        setY(p.getY());
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow((p.getX()-this.getX()),2)+Math.pow((p.getY()-this.getY()),2));
    }
    public int getX() {return x;};
    public int getY() {return y;};
}
class Segment
{
    private Point v1;
    private Point v2;

    public Segment(Point v1, Point v2){
        this.v1 = v1;
        this.v2 = v2;
    }
    public Point getV1(){
        return v1;
    }
    public Point getV2(){
        return v2;
    }
    public String toString() {
        return "Segment[v1=(" + getV1().getX()+","+getV1().getY()+"),v2=("+getV2().getX()+","+getV2().getY()+")]";
    }
    public double getLenght() {
        return v1.distance(v2);
    }
}

class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Point getV1(){
        return v1;
    }
    public Point getV2(){
        return v2;
    }
    public Point getV3(){
        return v3;
    }
    public String toString() {
        return "Triangle[v1=(" + getV1().getX()+","+getV1().getY()+"),v2=("+getV2().getX()+","+getV2().getY()+"),v3=("+getV3().getX()+","+getV3().getY()+")]";
    }
    public double getDistances() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }
    public String getType(){
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v1.distance(v3);

        if (a==b&&a==c&&b==c){
            return "Trójkąt jest równoboczny.";
        }
        else if (a==b||a==c||b==c){
            return "Trójkąt jest równoramienny";
        }
        else{
            return "Trójkąt jest różnoboczny";
        }
    }
}

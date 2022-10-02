package src;

public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getA() {
        return a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getB() {
        return b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getC() {
        return c;
    }

    public double getPerimeter(){
        double perimeter = this.a.getDistanceTo(b) + this.a.getDistanceTo(c) + this.b.getDistanceTo(c);

        return perimeter;
    }
}

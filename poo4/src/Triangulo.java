package src;

public class Triangulo extends FormaGeometrica{
    private double ladoA, ladoB, ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public double getPerimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double getArea() {
        // Formula de Heron
        double semiP = this.getPerimetro() / 2.0;
        double area = Math.sqrt( (semiP * (semiP-ladoA) * (semiP-ladoB) * (semiP-ladoC) ) ); 

        return area;
    }

    @Override
    public String toString(){
        return "Triangulo de perimetro: " + getPerimetro() + " e área: " + getArea();
    }
}

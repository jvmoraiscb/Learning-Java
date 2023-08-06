package src;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    @Override
    public double getPerimetro(){
        return 2 * Math.PI * this.raio;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString(){
        return "Circulo de perimetro: " + getPerimetro() + " e área: " + getArea();
    }
}

package src;

public class Retangulo extends FormaGeometrica{
    private double base, altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getPerimetro(){
        return 2*base + 2*altura;
    }

    @Override
    public double getArea(){
        return base*altura;
    }

    @Override
    public String toString(){
        return "Retangulo de perimetro: " + getPerimetro() + " e área: " + getArea();
    }
}

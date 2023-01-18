public class Rectangulo extends Figuras{
    protected int base;
    protected int altura;

    public Rectangulo(int base, int altura){
        super(4);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura);
    }

    @Override
    public double perimetro() {
        return ((this.base * 2) + (this.altura * 2));
    }

    @Override
    public String toString(){
        return "Rectángulo: (base: " + this.base + ", altura: " +this.altura + ")";
    }
}
public abstract class Triangulo extends Figuras{
    protected int base;
    protected int altura;

    public Triangulo(int base, int altura){
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return ((this.base * this.altura) / 2);
    }

    @Override
    public double perimetro(){
        return (this.base + this.base + this.base);
    }

    @Override
    public String toString(){
        return "Triángulo";
    }
}
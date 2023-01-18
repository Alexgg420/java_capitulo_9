public class TrianguloRectangulo extends Triangulo{

    public TrianguloRectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double perimetro(){
        double hipotenusa = Math.sqrt((this.base * this.base) + (this.altura * this.altura));
        return (this.base + this.altura + hipotenusa);
    }

    @Override
    public String toString(){
        return  "Triángulo rectángulo: (base: "+this.base+", altura: "+this.altura+")";
    }   
}
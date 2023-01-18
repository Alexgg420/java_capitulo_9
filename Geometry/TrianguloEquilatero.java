public class TrianguloEquilatero extends Triangulo{

    public TrianguloEquilatero(int base, int altura){
        super(base, altura);
    }

    @Override
    public double perimetro(){
        return (this.base * 3);
    }

    @Override
    public String toString(){
        return "Triángulo equilátero: (base: " + this.base + ", altura: " + this.altura + ")";
    }
}
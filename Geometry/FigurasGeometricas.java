public class FigurasGeometricas{
    public static final int cant = 30;
    public static void main(String[] args){
        Figuras[] figuras = new Figuras [cant];
        for (int i = 0; i < cant; i++){
            int figura = (int)(Math.random() * 4);
            switch(figura){
                case 0:
                    figuras[i] = new Rectangulo((int)(Math.random()*100), (int)(Math.random()*100));
                break;

                case 1:
                    figuras[i] = new Cuadrado((int)(Math.random()*100));
                break;

                case 2:
                    figuras[i] = new TrianguloEquilatero((int)(Math.random()*100), (int)(Math.random()*100));
                break;

                case 3:
                    figuras[i] = new TrianguloRectangulo((int)(Math.random()*100), (int)(Math.random()*100));
                break;
                default:
            }
        }
        for (int i = 0; i < figuras.length; i++){
            System.out.println(figuras[i]);
            System.out.printf("Área: " + "%.2f \n", figuras[i].area());
            System.out.printf("Perímetro: " + "%.2f \n", figuras[i].perimetro());
            System.out.println();
        }
    }
}
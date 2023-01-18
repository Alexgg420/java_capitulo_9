public abstract class Figuras implements Geometria{
    private int lado;

    protected Figuras(int lado){
        this.lado = lado;
    }

    public int getLado(){
        return this.lado;
    }
}
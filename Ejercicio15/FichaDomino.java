public class FichaDomino{

    protected int n1;
    protected int n2;
    protected boolean right;

    public FichaDomino(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    FichaDomino voltea(){
        return new FichaDomino(n2, n1);
    }

    boolean encaja(FichaDomino fichaDominoDestino){
        return ((this.n1 == fichaDominoDestino.n2) || (this.n2 == fichaDominoDestino.n1) || (this.n1 == fichaDominoDestino.n1) || (this.n2 == fichaDominoDestino.n2));
    }

    @Override
    public String toString(){
        return "[ " + (n1 == 0 ? " " : n1) + " | " + (n2 == 0 ? " " : n2) + " ]";
    }
}
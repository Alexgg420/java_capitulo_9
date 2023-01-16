public class Libro{
    private boolean prestado = false;

    public Libro(String isbn, String titulo, int year){
        super(isbn, titulo, year);
    }

    @Override
    public void presta(){
        if (this.prestado){
            System.out.println("Este libro ya ha sido prestado");
        } else {
            this.prestado = true;
        }
    }

    @Override
    public void devuelve(){
        this.prestado = false;
    }

    @Override
    public String toString(){
        return super.toString() + " (prestado)";
    }
}
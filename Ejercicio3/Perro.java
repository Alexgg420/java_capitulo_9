public class Perro extends Mamifero{
    private String raza;

    public Perro(Sexo s, String raza){
        super(s);
        this.raza = r;
    }

    public Perro(Sexo s){
        super(s);
        this.raza = "Golden Retrieger";
    }

    public Perro(String r){
        super(Sexo.HEMBRA);
        this.raza = r;
    }

    public Perro(){
        super(Sexo.HEMBRA);
        this.raza = "Golden Retrieger";
    }

    public void ladra(){
        System.out.println("Guau Guau");
    }

    public void dameLaPata(){
        System.out.println("Toma mi patita");
    }

    public void caza(){
        System.out.println("No me gusta la caza, eso lo hacen otros perros");
    }
}
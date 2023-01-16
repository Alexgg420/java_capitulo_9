public class Gato extends Mamifero{
    private String raza;

    public Gato(Sexo s, String raza){
        super(s);
        this.raza = r;
    }

    public Gato(Sexo s){
        super(s);
        this.raza = "siamés";
    }

    public Gato(String r){
        super(Sexo.HEMBRA);
        this.raza = r;
    }

    public Gato(){
        super(Sexo.HEMBRA);
        this.raza = "siamés";
    }

    public void maulla(){
        System.out.println("Miauuu");
    }

    public void ronronea(){
        System.out.println("Mrrrrr");
    }

    public void come(String comida){
        if(comida.equals("pescado")){
            System.out.println("Mmmmm pescado");
        }
        else {
            System.out.println("Lo siento, solo como pescado");
        }
    }

    public void peleaCon(Gato contrincante){
        if(this.getSexo() == Sexo.HEMBRA){
            System.out.println("Lo siento, no me gusta pelear");
        } else {
            if (contrincante.getSexo() == Sexo.HEMBRA){
                System.out.println("No peleo con gatitas");
            }
            else {
                System.out.println("Ven aquí que te vas a enterar");
            }
        }
    }

    public void limpiarse(){
        System.out.println("Me estoy lamiendo el pelaje");
    }

    public void caza(){
        System.out.println("Estoy cazando ratones");
    }
}
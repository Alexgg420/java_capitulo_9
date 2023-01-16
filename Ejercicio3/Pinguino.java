public class Pinguino extends Ave{
    public Pinguino(){}

    public Pinguino(Sexo s){
        super(s);
    }

    public void vuela(){
        System.out.println("No puedo volar");
    }

    public void nada(){
        System.out.println("Estoy nadando");
    }
}
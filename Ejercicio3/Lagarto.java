public class Lagarto extends Animal{
    public Lagarto() {}

    public Lagarto(Sexo s){
        super(s);
    }

    public void baniate(){
        System.out.println("Me estoy dando un baño");
    }

    public void tomaElSol(){
        System.out.println("Estoy tomando el sol");
    }

    public void escondete(){
        System.out.println("Me he escondido, ya no me puedes ver");
    }
}
public class Canario extends Ave{
    public Canario(){}

    public Canario(Sexo s){
        super(s);
    }

    public void canta(){
        System.out.println("Piriririri");
    }

    public void pia(){
        System.out.println("Pío Pío Pío");
    }

    public void caza(){
        System.out.println("A los canarios no nos gusta cazar");
    }
}
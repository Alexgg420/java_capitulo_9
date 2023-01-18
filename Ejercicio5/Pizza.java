public class Pizza{
    private static int pizzasPedidas = 0;
    private static int pizzasServidas = 0;

    private String tamano;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String tamano){
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        pizzasPedidas++;
    }

    public String toString(){
        return "pizza " + tipo + " " + tamano + ", " + this.estado;
    }

    public static int getPizzasPedidas(){
        return Pizza.pizzasPedidas;
    }

    public static int getPizzasServidas(){
        return Pizza.pizzasServidas;
    }

    public void sirve(){
        if(this.estado.equals("pedida")){
            this.estado = "servida";
            Pizza.pizzasServidas++;
        } else {
            System.out.println("Esta pizza ya se ha servido");
        }
    }
}
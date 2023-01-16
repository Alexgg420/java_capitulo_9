public class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    private int kilometrosRecorridos = 0;

    Vehiculo(){
        vehiculosCreados = 0;
        kilometrosTotales = 0;
        this.kilometrosRecorridos = 0;
    }

    public static int getVehiculosCreados(){
        return vehiculosCreados;
    }

    public static int getKilometrosTotales(){
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }

    protected void setKilometrosRecorridos(int kms){
        this.kilometrosRecorridos = kms;
    }

    public String toString(){
        return "Kilometros recorridos: "+this.kilometrosRecorridos+" (Vehiculos creados: "+vehiculosCreados+", Kilometros Totales: "+kilometrosTotales+")";
    }

    public void recorre(int kms){
        this.setKilometrosRecorridos(kms);
        this.kilometrosRecorridos+=kms;
        System.out.println("Kilometros recorridos: "+this.kilometrosRecorridos+" (Vehiculos creados: "+vehiculosCreados+", Kilometros Totales: "+kilometrosTotales+")");
    }
}

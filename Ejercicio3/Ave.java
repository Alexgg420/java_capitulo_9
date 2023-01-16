public abstract class Ave extends Animal{
    public Ave(){
        super(Sexo.HEMBRA);
    }

    public Ave(Sexo s){
        super(s);
    }

    public void ponHuevo(){
        if (this.getSexo() == Sexo.MACHO){
            System.out.println("Soy macho, no puedo poner huevos");
        } else {
            System.out.println("He puesto un huevo");
        }
    }

    public void limpiarse(){
        System.out.println("Me estoy limpiando las plumas");
    }

    public void vuela(){
        System.put.println("Estoy volando");
    }
}
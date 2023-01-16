public abstract class Mamifero extends Animal{
    public Mamifero(){
        super();
    }

    public Mamifero (Sexo s){
        super(s);
    }

    public void amamanta(){
        if (this.getSexo() == Sexo.MACHO){
            System.out.println("Soy macho, no puedo amamantar");
        } else {
            System.out.println("Toma pecho, hazte grande");
        }
    }

    public void CuidaCrias(){
        System.out.println("Estoy cuidando de mis crías");
    }

    public void anda(){
        System.out.println("Estoy andando");
    }
}
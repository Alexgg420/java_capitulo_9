public class PruebaAnimal{
    public static void main(String[] args){
        Canario piolin = new Canario(Sexo.MACHO);
        piolin.come("pan");
        piolin.canta();
        piolin.pia();
        piolin.caza();
        piolin.duerme();
        piolin.ponHuevo();

        System.out.println();

        Gato jone = new Gato(Sexo.MACHO);
        jone.caza();
        jone.amamanta();

        System.out.println();

        Gato lina = new Gato(Sexo.HEMBRA);
        lina.peleaCon(jone);
        lina.duerme();

        System.out.println();

        Gato tom = new Gato(Sexo.MACHO);
        tom.maulla();
        tom.ronronea();
        tom.come("pescado");
        tom.come("manzana");
        tom.caza();
        tom.peleaCon(lina);
        tom.peleaCon(jone);
        tom.limpiarse();
        tom.anda();

        System.out.println();

        Perro kira = new Perro(Sexo.HEMBRA);
        kira.caza();
        kira.dameLaPata();
        kira.ladra();
        kira.duerme();
        kira.amamanta();
        kira.CuidaCrias();
        kira.anda();
        kira.come("pienso");

        System.out.println();

        Pinguino pingu = new Pinguino(Sexo.MACHO);
        pingu.come("pescado");
        pingu.duerme();
        pingu.nada();
        pingu.vuela();

        System.out.println();

        Pinguino pina = new Pinguino(Sexo.HEMBRA);
        pina.come("salmon");
        pina.ponHuevo();
        pina.vuela();

        System.out.println();

        Lagarto coco = new Lagarto(Sexo.MACHO);
        coco.baniate();
        coco.come("carne");
        coco.duerme();
        coco.tomaElSol();
        coco.escondete();
    }
}
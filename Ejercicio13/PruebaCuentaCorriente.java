public class PruebaCuentaCorriente {
    public static void main(String[] args){
        CuentaCorriente c1 = new CuentaCorriente(0);
        CuentaCorriente c2 = new CuentaCorriente(1500);
        CuentaCorriente c3 = new CuentaCorriente(6000);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c1.ingresa(2000);
        c2.gasta(600);
        c3.ingresa(75);
        c1.gasta(55);
        c2.transfiere(c3, 100);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

public class PruebaFichaDomino{
    public static void main(String[] args){
        FichaDomino f1 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        FichaDomino f2 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        FichaDomino f3 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        FichaDomino f4 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        FichaDomino f5 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        FichaDomino f6 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        FichaDomino f7 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        FichaDomino f8 = new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println(f8);
        System.out.println(f2.voltea());
        System.out.println(f4.voltea());
        System.out.println(f6.voltea());
        System.out.println(f8.voltea());
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f4));
        System.out.println(f2.encaja(f8));
        System.out.println(f2.encaja(f7));
        System.out.println(f3.encaja(f2));
        System.out.println(f3.encaja(f4));
        System.out.println(f4.encaja(f6));
        System.out.println(f4.encaja(f7));
        System.out.println(f5.encaja(f1));
        System.out.println(f5.encaja(f3));
        System.out.println(f6.encaja(f8));
        System.out.println(f6.encaja(f1));
        System.out.println(f7.encaja(f3));
        System.out.println(f7.encaja(f5));
        System.out.println(f8.encaja(f1));
        System.out.println(f8.encaja(f4));
    }
}
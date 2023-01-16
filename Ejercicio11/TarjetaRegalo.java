public class TarjetaRegalo{
    String num;
    int saldo;

    public TarjetaRegalo(int saldo){
        this.saldo = saldo;
        this.num = "";
        for (int i = 0; i < 5; i++){
            this.num = this.num + (int)(Math.random() * 10);
        }
    }

    @Override
    public String toString(){
        return "Tarjeta " + this.num + " | Saldo: " + this.saldo + " euros";
    }

    public void gasta(int cant){
        if (cant > this.saldo){
            System.out.println("Lo sentimos, pero la cantidad introducida es superior a su saldo.");
        } else {
            this.saldo = this.saldo - cant;
        }
    }

    TarjetaRegalo fusionaCon(TarjetaRegalo t){
        int newsaldo = this.getSaldo() + t.getSaldo();
        this.setSaldo(0);
        t.setSaldo(0);
        return new TarjetaRegalo(newsaldo);
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }
}
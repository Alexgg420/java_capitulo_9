public class CuentaCorriente{
    String num;
    double saldo;

    public CuentaCorriente(double saldo){
        this.saldo = saldo;
        this.num = "";
        for (int i = 0; i < 10; i++){
            this.num = this.num + (int)(Math.random() * 10);
        }
    }


    @Override
    public String toString(){
        return "Tarjeta " + this.num + " | Saldo: " + String.format("%.2f", saldo) + " euros";
    }

    public void ingresa(double cant){
        this.saldo = this.saldo + cant;
    }

    public void gasta(double cant){
        if (cant <= this.saldo){
            this.saldo = this.saldo - cant;
        } else {
            System.out.println("Lo sentimos, pero no puede gastar una cantidad mayor a su saldo");
        }
    }

    void transfiere(CuentaCorriente cuentaDestino, double cant){
        this.saldo = this.saldo - cant;
        cuentaDestino.saldo = cuentaDestino.saldo + cant;
    }
}
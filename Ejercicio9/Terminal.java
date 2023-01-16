public class Terminal{
    private String num;
    private int tiempoDeConversacion;

    Terminal(String num){
        this.num = num;
        this.tiempoDeConversacion = 0;
    }

    public String getNum(){
        return num;
    }

    public void setNum(String num){
        this.num = num;
    }

    public int getTiempoDeConversacion(){
        return tiempoDeConversacion;
    }

    public void setTiempoDeConversacion(int tiempoDeConversacion){
        this.tiempoDeConversacion = tiempoDeConversacion;
    }

    @Override
    public String toString(){
        return "Nº " + num + " | Tiempo de Conversación: " + tiempoDeConversacion + " segundos";
    }

    public void llama(Terminal t, int segundosDeLlamada){
        this.tiempoDeConversacion = this.tiempoDeConversacion + segundosDeLlamada;
        t.tiempoDeConversacion = t.tiempoDeConversacion + segundosDeLlamada;
    }
}
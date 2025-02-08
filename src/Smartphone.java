public class Smartphone extends Prodotto{
    private int codiceImei;
    private int memoria;

    public Smartphone(){

    }
    public int getCodiceImei() {
        return codiceImei;
    }

    public void setCodiceImei(int codiceImei) {
        this.codiceImei = codiceImei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "codiceImei=" + codiceImei +
                ", memoria=" + memoria +
                "} " + super.toString();
    }
}

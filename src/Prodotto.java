import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto() {
    }

    public int getCodice(){
        Random ran = new Random();
        return this.codice=ran.nextInt(10,10000);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}

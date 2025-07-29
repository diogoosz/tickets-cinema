import java.text.DecimalFormat;

public class Ingresso {
    DecimalFormat df = new DecimalFormat("#0.00");
    private final String nomeFilme;
    private final boolean dublado;
    private Double valorIngresso;

    public Ingresso(String nomeFilme, boolean dublado, Double valorIngresso) {
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
        this.valorIngresso = valorIngresso;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public double getValor() {
        return valorIngresso;
    }

    public void mostrarInfo() {
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Valor: " + df.format(valorIngresso));
        System.out.println(dublado ? "Dublado" : "Legendado");
    }
}

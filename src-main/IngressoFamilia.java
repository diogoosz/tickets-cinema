import java.text.DecimalFormat;

public class IngressoFamilia extends Ingresso{
    private int totalPessoas;

    public IngressoFamilia(String nomeFilme, boolean dublado, Double valorIngresso, int totalPessoas) {
        super(nomeFilme, dublado, valorIngresso);
        this.totalPessoas = totalPessoas;
    }

    public double calcularValor(int totalPessoas) {
        double total = getValor() * totalPessoas;
        if (totalPessoas > 3 ) {
            total *= 0.95;
            return (total);
        } else {
            return total;
        }
    }
}

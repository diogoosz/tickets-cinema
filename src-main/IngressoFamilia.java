import java.text.DecimalFormat;

public class IngressoFamilia extends Ingresso{
    public IngressoFamilia(String nomeFilme, boolean dublado, Double valorIngresso) {
        super(nomeFilme, dublado, valorIngresso);
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

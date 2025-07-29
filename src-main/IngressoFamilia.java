public class IngressoFamilia extends Ingresso implements Calculavel<Integer> {
    public IngressoFamilia(String nomeFilme, boolean dublado, Double valorIngresso) {
        super(nomeFilme, dublado, valorIngresso);
    }

    @Override
    public double calcularValor(Integer totalPessoas) {
        double total = getValor() * totalPessoas;
        if (totalPessoas > 3 ) {
            total *= 0.95;
            return (total);
        } else {
            return total;
        }
    }
}

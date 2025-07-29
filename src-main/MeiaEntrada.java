public class MeiaEntrada extends Ingresso implements Calculavel<Boolean> {

    public MeiaEntrada(String nomeFilme, boolean dublado, Double valorIngresso) {
        super(nomeFilme, dublado, valorIngresso);
    }

    @Override
    public double calcularValor(Boolean temDireito) {
        if (temDireito) {
            return getValor() / 2;
        } else return getValor();
    }
}
